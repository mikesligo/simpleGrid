package simpleGrid.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleGridPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSimpleGrid1Group());
	}

	/**
	 * Creates "simpleGrid" palette tool group
	 * @generated
	 */
	private PaletteContainer createSimpleGrid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				simpleGrid.diagram.part.Messages.SimpleGrid1Group_title);
		paletteContainer.setId("createSimpleGrid1Group"); //$NON-NLS-1$
		paletteContainer.add(createClimate1CreationTool());
		paletteContainer.add(createTriplex_Line_configuration2CreationTool());
		paletteContainer
				.add(createTriplex_Line_configurationTriplex_line_conductor3CreationTool());
		paletteContainer.add(createTransformer_configuration4CreationTool());
		paletteContainer.add(createNode5CreationTool());
		paletteContainer.add(createNodeTransformer6CreationTool());
		paletteContainer.add(createTransformer7CreationTool());
		paletteContainer.add(createTransformerTriplex_node8CreationTool());
		paletteContainer.add(createTriplex_node9CreationTool());
		paletteContainer.add(createTriplex_meter10CreationTool());
		paletteContainer.add(createTriplex_meterHouse11CreationTool());
		paletteContainer.add(createHouse12CreationTool());
		paletteContainer.add(createHouseWaterheater13CreationTool());
		paletteContainer.add(createWaterheater14CreationTool());
		paletteContainer.add(createTriplex_line15CreationTool());
		paletteContainer
				.add(createTriplex_lineTriplex_line_configuration16CreationTool());
		paletteContainer.add(createTriplex_lineTriplex_meter17CreationTool());
		paletteContainer.add(createTriplex_line_conductor18CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClimate1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Climate1CreationTool_title,
				simpleGrid.diagram.part.Messages.Climate1CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_Line_configuration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_Line_configuration2CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_Line_configuration2CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001));
		entry.setId("createTriplex_Line_configuration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_Line_configurationTriplex_line_conductor3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_Line_configurationTriplex_line_conductor3CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_Line_configurationTriplex_line_conductor3CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007));
		entry.setId("createTriplex_Line_configurationTriplex_line_conductor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configuration4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Transformer_configuration4CreationTool_title,
				simpleGrid.diagram.part.Messages.Transformer_configuration4CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004));
		entry.setId("createTransformer_configuration4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Node5CreationTool_title,
				simpleGrid.diagram.part.Messages.Node5CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007));
		entry.setId("createNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodeTransformer6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.NodeTransformer6CreationTool_title,
				simpleGrid.diagram.part.Messages.NodeTransformer6CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configurationTriplex_line_conductor_4008));
		entry.setId("createNodeTransformer6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configurationTriplex_line_conductor_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Transformer7CreationTool_title,
				simpleGrid.diagram.part.Messages.Transformer7CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010));
		entry.setId("createTransformer7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformerTriplex_node8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.TransformerTriplex_node8CreationTool_title,
				simpleGrid.diagram.part.Messages.TransformerTriplex_node8CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009));
		entry.setId("createTransformerTriplex_node8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_node9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_node9CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_node9CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002));
		entry.setId("createTriplex_node9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meter10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_meter10CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_meter10CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005));
		entry.setId("createTriplex_meter10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meterHouse11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_meterHouse11CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_meterHouse11CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015));
		entry.setId("createTriplex_meterHouse11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.House12CreationTool_title,
				simpleGrid.diagram.part.Messages.House12CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011));
		entry.setId("createHouse12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouseWaterheater13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.HouseWaterheater13CreationTool_title,
				simpleGrid.diagram.part.Messages.HouseWaterheater13CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004));
		entry.setId("createHouseWaterheater13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Waterheater14CreationTool_title,
				simpleGrid.diagram.part.Messages.Waterheater14CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003));
		entry.setId("createWaterheater14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_line15CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_line15CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006));
		entry.setId("createTriplex_line15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_lineTriplex_line_configuration16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_lineTriplex_line_configuration16CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_lineTriplex_line_configuration16CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013));
		entry.setId("createTriplex_lineTriplex_line_configuration16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_lineTriplex_meter17CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_lineTriplex_meter17CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_lineTriplex_meter17CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017));
		entry.setId("createTriplex_lineTriplex_meter17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_conductor18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_line_conductor18CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_line_conductor18CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008));
		entry.setId("createTriplex_line_conductor18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
