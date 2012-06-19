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
public class Triplex_meterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public Triplex_meterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.Triplex_meterItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_meterFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_meterFigure getPrimaryShape() {
		return (Triplex_meterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterNameEditPart) {
			((simpleGrid.diagram.edit.parts.Triplex_meterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_meterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterNameEditPart) {
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
				.getType(simpleGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007);
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
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
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
	public class Triplex_meterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterNormal_voltagesFigure;

		/**
		 * @generated
		 */
		public Triplex_meterFigure() {

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

			fFigureTriplex_meterNameFigure = new WrappingLabel();
			fFigureTriplex_meterNameFigure.setText("<...>");

			this.add(fFigureTriplex_meterNameFigure);

			fFigureTriplex_meterPhasesFigure = new WrappingLabel();
			fFigureTriplex_meterPhasesFigure.setText("<...>");

			this.add(fFigureTriplex_meterPhasesFigure);

			fFigureTriplex_meterNormal_voltagesFigure = new WrappingLabel();
			fFigureTriplex_meterNormal_voltagesFigure.setText("<...>");

			this.add(fFigureTriplex_meterNormal_voltagesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterNameFigure() {
			return fFigureTriplex_meterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPhasesFigure() {
			return fFigureTriplex_meterPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterNormal_voltagesFigure() {
			return fFigureTriplex_meterNormal_voltagesFigure;
		}

	}

}
