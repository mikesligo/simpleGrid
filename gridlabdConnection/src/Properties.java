import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Properties {

	public static void main(String[] args) {
		printProperties();
	}

	public static void printProperties(){
		try{
			// name of current object
			String currentObj = null;

			FileInputStream fstream = new FileInputStream("/home/mike/src/gridlab-d/core/simple/simpleTestList.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			//get name of current object
			char returnChar = 10;
			currentObj = getNextLine(br);
			while ((strLine = getNextLine(br)) != null)   {
				if (isReturnChar(strLine)){
					currentObj = getNextLine(br);
					System.out.println("\n"+currentObj);
				}
				else {
					System.out.println(getValueOfProperty(currentObj,strLine));
				}
			}
			in.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static boolean isReturnChar(String strLine) {
		if (strLine.length() == 0) return true;
		for (int i=0;i<strLine.length();i++){
			if ((int)strLine.charAt(i) == 10 || strLine.length() <=1){
				return true;
			}
		}
		return false;
	}

	private static String getNextLine(BufferedReader br) throws IOException {
		String tmp = br.readLine();
		// replace isn't working for some reason, I did try
		tmp.replaceAll(" ", "%20");
		return tmp;
	}
	
	private static String getValueOfProperty(String currentObj, String strLine) throws IOException {
		URL url = new URL("http://localhost:10001/" + currentObj + "/" + strLine);
		//System.out.println("Url is " + url.toString());
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			// Returns the value from the XML, also returns null if not there, so check for that
			String val = getValueFromString(inputLine);
			//if (val != null) System.out.println(strLine + ": " + val);
			if (val != null) return val;
		}
		in.close();
		return null;
	}
	
	public static String getValueFromString(String s){
		try {
			if (s.contains("<value>")){
				int startIndex = 8;
				int endIndex = s.indexOf("<",8);
				return s.substring(startIndex, endIndex);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
