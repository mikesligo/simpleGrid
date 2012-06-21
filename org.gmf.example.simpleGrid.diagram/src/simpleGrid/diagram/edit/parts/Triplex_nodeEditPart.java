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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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
public class Triplex_nodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public Triplex_nodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.Triplex_nodeItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_nodeFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_nodeFigure getPrimaryShape() {
		return (Triplex_nodeFigure) primaryShape;
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
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Triplex_nodeFigure extends SVGFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeToFigure;

		/**
		 * @generated
		 */
		public Triplex_nodeFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setURI("file:///home/mike/src/simpleGrid/org.gmf.example.simpleGrid/images/triplex_node.svg");
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTriplex_nodeLengthFigure = new WrappingLabel();
			fFigureTriplex_nodeLengthFigure.setText("<...>");

			this.add(fFigureTriplex_nodeLengthFigure);

			fFigureTriplex_nodeNameFigure = new WrappingLabel();
			fFigureTriplex_nodeNameFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNameFigure);

			fFigureTriplex_nodePhasesFigure = new WrappingLabel();
			fFigureTriplex_nodePhasesFigure.setText("<...>");

			this.add(fFigureTriplex_nodePhasesFigure);

			fFigureTriplex_nodeFromFigure = new WrappingLabel();
			fFigureTriplex_nodeFromFigure.setText("<...>");

			this.add(fFigureTriplex_nodeFromFigure);

			fFigureTriplex_nodeToFigure = new WrappingLabel();
			fFigureTriplex_nodeToFigure.setText("<...>");

			this.add(fFigureTriplex_nodeToFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeLengthFigure() {
			return fFigureTriplex_nodeLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNameFigure() {
			return fFigureTriplex_nodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePhasesFigure() {
			return fFigureTriplex_nodePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeFromFigure() {
			return fFigureTriplex_nodeFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeToFigure() {
			return fFigureTriplex_nodeToFigure;
		}

	}

}
