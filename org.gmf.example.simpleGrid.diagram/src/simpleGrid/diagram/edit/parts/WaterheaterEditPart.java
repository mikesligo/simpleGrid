package simpleGrid.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class WaterheaterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public WaterheaterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.WaterheaterItemSemanticEditPolicy());
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
		return primaryShape = new WaterheaterFigure();
	}

	/**
	 * @generated
	 */
	public WaterheaterFigure getPrimaryShape() {
		return (WaterheaterFigure) primaryShape;
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
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WaterheaterFigure extends SVGFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_volumeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterThermostat_deadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterLocationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_UAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterSchedule_skewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterDemand_skewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeating_element_capacityFigure;

		/**
		 * @generated
		 */
		public WaterheaterFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setURI("file:///home/mike/src/simpleGrid/org.gmf.example.simpleGrid/images/waterheater.svg");
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWaterheaterNameFigure = new WrappingLabel();
			fFigureWaterheaterNameFigure.setText("<...>");

			this.add(fFigureWaterheaterNameFigure);

			fFigureWaterheaterTank_volumeFigure = new WrappingLabel();
			fFigureWaterheaterTank_volumeFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_volumeFigure);

			fFigureWaterheaterTank_setpointFigure = new WrappingLabel();
			fFigureWaterheaterTank_setpointFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_setpointFigure);

			fFigureWaterheaterTemperatureFigure = new WrappingLabel();
			fFigureWaterheaterTemperatureFigure.setText("<...>");

			this.add(fFigureWaterheaterTemperatureFigure);

			fFigureWaterheaterThermostat_deadbandFigure = new WrappingLabel();
			fFigureWaterheaterThermostat_deadbandFigure.setText("<...>");

			this.add(fFigureWaterheaterThermostat_deadbandFigure);

			fFigureWaterheaterLocationFigure = new WrappingLabel();
			fFigureWaterheaterLocationFigure.setText("<...>");

			this.add(fFigureWaterheaterLocationFigure);

			fFigureWaterheaterTank_UAFigure = new WrappingLabel();
			fFigureWaterheaterTank_UAFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_UAFigure);

			fFigureWaterheaterSchedule_skewFigure = new WrappingLabel();
			fFigureWaterheaterSchedule_skewFigure.setText("<...>");

			this.add(fFigureWaterheaterSchedule_skewFigure);

			fFigureWaterheaterDemand_skewFigure = new WrappingLabel();
			fFigureWaterheaterDemand_skewFigure.setText("<...>");

			this.add(fFigureWaterheaterDemand_skewFigure);

			fFigureWaterheaterHeating_element_capacityFigure = new WrappingLabel();
			fFigureWaterheaterHeating_element_capacityFigure.setText("<...>");

			this.add(fFigureWaterheaterHeating_element_capacityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterNameFigure() {
			return fFigureWaterheaterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_volumeFigure() {
			return fFigureWaterheaterTank_volumeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_setpointFigure() {
			return fFigureWaterheaterTank_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTemperatureFigure() {
			return fFigureWaterheaterTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterThermostat_deadbandFigure() {
			return fFigureWaterheaterThermostat_deadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterLocationFigure() {
			return fFigureWaterheaterLocationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_UAFigure() {
			return fFigureWaterheaterTank_UAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterSchedule_skewFigure() {
			return fFigureWaterheaterSchedule_skewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterDemand_skewFigure() {
			return fFigureWaterheaterDemand_skewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeating_element_capacityFigure() {
			return fFigureWaterheaterHeating_element_capacityFigure;
		}

	}

}
