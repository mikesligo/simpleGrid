package simpleGrid.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class HouseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public HouseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.HouseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new HouseFigure();
	}

	/**
	 * @generated
	 */
	public HouseFigure getPrimaryShape() {
		return (HouseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.HouseNameEditPart) {
			((simpleGrid.diagram.edit.parts.HouseNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHouseNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.HouseNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getType(simpleGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.NodeEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.WaterheaterHeating_element_capacity_4010);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTo_4012);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerFrom_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.WaterheaterHeating_element_capacity_4010) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTo_4012) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerFrom_4016) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class HouseFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseSchedule_skewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseAir_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseFloor_areaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseCooling_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseHeating_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseThermal_integrity_levelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseMotor_modelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseMotor_efficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseMass_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseHeating_system_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseHeating_COPFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseAuxiliary_strategyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseAuxiliary_system_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouseCooling_COPFigure;

		/**
		 * @generated
		 */
		public HouseFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHouseNameFigure = new WrappingLabel();
			fFigureHouseNameFigure.setText("<...>");

			this.add(fFigureHouseNameFigure);

			fFigureHouseSchedule_skewFigure = new WrappingLabel();
			fFigureHouseSchedule_skewFigure.setText("<...>");

			this.add(fFigureHouseSchedule_skewFigure);

			fFigureHouseAir_temperatureFigure = new WrappingLabel();
			fFigureHouseAir_temperatureFigure.setText("<...>");

			this.add(fFigureHouseAir_temperatureFigure);

			fFigureHouseFloor_areaFigure = new WrappingLabel();
			fFigureHouseFloor_areaFigure.setText("<...>");

			this.add(fFigureHouseFloor_areaFigure);

			fFigureHouseCooling_setpointFigure = new WrappingLabel();
			fFigureHouseCooling_setpointFigure.setText("<...>");

			this.add(fFigureHouseCooling_setpointFigure);

			fFigureHouseHeating_setpointFigure = new WrappingLabel();
			fFigureHouseHeating_setpointFigure.setText("<...>");

			this.add(fFigureHouseHeating_setpointFigure);

			fFigureHouseThermal_integrity_levelFigure = new WrappingLabel();
			fFigureHouseThermal_integrity_levelFigure.setText("<...>");

			this.add(fFigureHouseThermal_integrity_levelFigure);

			fFigureHouseMotor_modelFigure = new WrappingLabel();
			fFigureHouseMotor_modelFigure.setText("<...>");

			this.add(fFigureHouseMotor_modelFigure);

			fFigureHouseMotor_efficiencyFigure = new WrappingLabel();
			fFigureHouseMotor_efficiencyFigure.setText("<...>");

			this.add(fFigureHouseMotor_efficiencyFigure);

			fFigureHouseMass_temperatureFigure = new WrappingLabel();
			fFigureHouseMass_temperatureFigure.setText("<...>");

			this.add(fFigureHouseMass_temperatureFigure);

			fFigureHouseHeating_system_typeFigure = new WrappingLabel();
			fFigureHouseHeating_system_typeFigure.setText("<...>");

			this.add(fFigureHouseHeating_system_typeFigure);

			fFigureHouseHeating_COPFigure = new WrappingLabel();
			fFigureHouseHeating_COPFigure.setText("<...>");

			this.add(fFigureHouseHeating_COPFigure);

			fFigureHouseAuxiliary_strategyFigure = new WrappingLabel();
			fFigureHouseAuxiliary_strategyFigure.setText("<...>");

			this.add(fFigureHouseAuxiliary_strategyFigure);

			fFigureHouseAuxiliary_system_typeFigure = new WrappingLabel();
			fFigureHouseAuxiliary_system_typeFigure.setText("<...>");

			this.add(fFigureHouseAuxiliary_system_typeFigure);

			fFigureHouseCooling_COPFigure = new WrappingLabel();
			fFigureHouseCooling_COPFigure.setText("<...>");

			this.add(fFigureHouseCooling_COPFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseNameFigure() {
			return fFigureHouseNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseSchedule_skewFigure() {
			return fFigureHouseSchedule_skewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseAir_temperatureFigure() {
			return fFigureHouseAir_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseFloor_areaFigure() {
			return fFigureHouseFloor_areaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseCooling_setpointFigure() {
			return fFigureHouseCooling_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseHeating_setpointFigure() {
			return fFigureHouseHeating_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseThermal_integrity_levelFigure() {
			return fFigureHouseThermal_integrity_levelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseMotor_modelFigure() {
			return fFigureHouseMotor_modelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseMotor_efficiencyFigure() {
			return fFigureHouseMotor_efficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseMass_temperatureFigure() {
			return fFigureHouseMass_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseHeating_system_typeFigure() {
			return fFigureHouseHeating_system_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseHeating_COPFigure() {
			return fFigureHouseHeating_COPFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseAuxiliary_strategyFigure() {
			return fFigureHouseAuxiliary_strategyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseAuxiliary_system_typeFigure() {
			return fFigureHouseAuxiliary_system_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouseCooling_COPFigure() {
			return fFigureHouseCooling_COPFigure;
		}

	}

}
