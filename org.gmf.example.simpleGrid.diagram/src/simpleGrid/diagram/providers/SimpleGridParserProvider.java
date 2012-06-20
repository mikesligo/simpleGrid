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
	private IParser nodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5007Parser() {
		if (nodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getNode_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			nodeName_5007Parser = parser;
		}
		return nodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_meterName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_meterName_5005Parser() {
		if (triplex_meterName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_meter_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_meterName_5005Parser = parser;
		}
		return triplex_meterName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser transformerName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTransformerName_5009Parser() {
		if (transformerName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTransformer_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			transformerName_5009Parser = parser;
		}
		return transformerName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_nodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_nodeName_5002Parser() {
		if (triplex_nodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_node_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_nodeName_5002Parser = parser;
		}
		return triplex_nodeName_5002Parser;
	}

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
	private IParser houseName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getHouseName_5010Parser() {
		if (houseName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getHouse_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			houseName_5010Parser = parser;
		}
		return houseName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser climateName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getClimateName_5008Parser() {
		if (climateName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getClimate_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			climateName_5008Parser = parser;
		}
		return climateName_5008Parser;
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
	private IParser transformer_configurationName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTransformer_configurationName_5004Parser() {
		if (transformer_configurationName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { simpleGrid.SimpleGridPackage.eINSTANCE
					.getTransformer_configuration_Name() };
			simpleGrid.diagram.parsers.MessageFormatParser parser = new simpleGrid.diagram.parsers.MessageFormatParser(
					features);
			transformer_configurationName_5004Parser = parser;
		}
		return transformer_configurationName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case simpleGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
			return getNodeName_5007Parser();
		case simpleGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID:
			return getTriplex_meterName_5005Parser();
		case simpleGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID:
			return getTransformerName_5009Parser();
		case simpleGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID:
			return getTriplex_nodeName_5002Parser();
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationNameEditPart.VISUAL_ID:
			return getTriplex_Line_configurationName_5001Parser();
		case simpleGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
			return getWaterheaterName_5003Parser();
		case simpleGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID:
			return getHouseName_5010Parser();
		case simpleGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID:
			return getClimateName_5008Parser();
		case simpleGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
			return getTriplex_lineName_5006Parser();
		case simpleGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID:
			return getTransformer_configurationName_5004Parser();
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
