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
public class ClimateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

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
	public ClimateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.ClimateItemSemanticEditPolicy());
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
		return primaryShape = new ClimateFigure();
	}

	/**
	 * @generated
	 */
	public ClimateFigure getPrimaryShape() {
		return (ClimateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.ClimateNameEditPart) {
			((simpleGrid.diagram.edit.parts.ClimateNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureClimateNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof simpleGrid.diagram.edit.parts.ClimateNameEditPart) {
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
				.getType(simpleGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
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
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
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
	public class ClimateFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateTmyfileFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateInterpolateFigure;

		/**
		 * @generated
		 */
		public ClimateFigure() {

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

			fFigureClimateNameFigure = new WrappingLabel();
			fFigureClimateNameFigure.setText("<...>");

			this.add(fFigureClimateNameFigure);

			fFigureClimateTmyfileFigure = new WrappingLabel();
			fFigureClimateTmyfileFigure.setText("<...>");

			this.add(fFigureClimateTmyfileFigure);

			fFigureClimateInterpolateFigure = new WrappingLabel();
			fFigureClimateInterpolateFigure.setText("<...>");

			this.add(fFigureClimateInterpolateFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateNameFigure() {
			return fFigureClimateNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateTmyfileFigure() {
			return fFigureClimateTmyfileFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateInterpolateFigure() {
			return fFigureClimateInterpolateFigure;
		}

	}

}
