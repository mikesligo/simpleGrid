package simpleGrid.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SimpleGridParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser triplex_Line_configurationName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_Line_configurationName_5001Parser() {
		if (triplex_Line_configurationName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_Line_configuration_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_Line_configurationName_5001Parser = parser;
		}
		return triplex_Line_configurationName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser waterheaterName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getWaterheaterName_5003Parser() {
		if (waterheaterName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getWaterheater_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			waterheaterName_5003Parser = parser;
		}
		return waterheaterName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_lineName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_lineName_5006Parser() {
		if (triplex_lineName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_line_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_lineName_5006Parser = parser;
		}
		return triplex_lineName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationNameEditPart.VISUAL_ID:
			return getTriplex_Line_configurationName_5001Parser();
		case simpleGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
			return getWaterheaterName_5003Parser();
		case simpleGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
			return getTriplex_lineName_5006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (simpleGrid.diagram.providers.SimpleGridElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
