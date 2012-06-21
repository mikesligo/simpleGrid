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
public class Transformer_configurationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public Transformer_configurationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new simpleGrid.diagram.edit.policies.Transformer_configurationItemSemanticEditPolicy());
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
		return primaryShape = new Transformer_configurationFigure();
	}

	/**
	 * @generated
	 */
	public Transformer_configurationFigure getPrimaryShape() {
		return (Transformer_configurationFigure) primaryShape;
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
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Transformer_configurationFigure extends SVGFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationConnect_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationInstall_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPower_ratingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedenceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedence1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedence2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationShunt_impedenceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPrimary_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationSecondary_voltageFigure;

		/**
		 * @generated
		 */
		public Transformer_configurationFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setURI("file:///home/mike/src/simpleGrid/org.gmf.example.simpleGrid/images/config.svg");
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransformer_configurationNameFigure = new WrappingLabel();
			fFigureTransformer_configurationNameFigure.setText("<...>");

			this.add(fFigureTransformer_configurationNameFigure);

			fFigureTransformer_configurationConnect_typeFigure = new WrappingLabel();
			fFigureTransformer_configurationConnect_typeFigure.setText("<...>");

			this.add(fFigureTransformer_configurationConnect_typeFigure);

			fFigureTransformer_configurationInstall_typeFigure = new WrappingLabel();
			fFigureTransformer_configurationInstall_typeFigure.setText("<...>");

			this.add(fFigureTransformer_configurationInstall_typeFigure);

			fFigureTransformer_configurationPower_ratingFigure = new WrappingLabel();
			fFigureTransformer_configurationPower_ratingFigure.setText("<...>");

			this.add(fFigureTransformer_configurationPower_ratingFigure);

			fFigureTransformer_configurationImpedenceFigure = new WrappingLabel();
			fFigureTransformer_configurationImpedenceFigure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedenceFigure);

			fFigureTransformer_configurationImpedence1Figure = new WrappingLabel();
			fFigureTransformer_configurationImpedence1Figure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedence1Figure);

			fFigureTransformer_configurationImpedence2Figure = new WrappingLabel();
			fFigureTransformer_configurationImpedence2Figure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedence2Figure);

			fFigureTransformer_configurationShunt_impedenceFigure = new WrappingLabel();
			fFigureTransformer_configurationShunt_impedenceFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationShunt_impedenceFigure);

			fFigureTransformer_configurationPrimary_voltageFigure = new WrappingLabel();
			fFigureTransformer_configurationPrimary_voltageFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationPrimary_voltageFigure);

			fFigureTransformer_configurationSecondary_voltageFigure = new WrappingLabel();
			fFigureTransformer_configurationSecondary_voltageFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationSecondary_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationNameFigure() {
			return fFigureTransformer_configurationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationConnect_typeFigure() {
			return fFigureTransformer_configurationConnect_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationInstall_typeFigure() {
			return fFigureTransformer_configurationInstall_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPower_ratingFigure() {
			return fFigureTransformer_configurationPower_ratingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedenceFigure() {
			return fFigureTransformer_configurationImpedenceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedence1Figure() {
			return fFigureTransformer_configurationImpedence1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedence2Figure() {
			return fFigureTransformer_configurationImpedence2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationShunt_impedenceFigure() {
			return fFigureTransformer_configurationShunt_impedenceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPrimary_voltageFigure() {
			return fFigureTransformer_configurationPrimary_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationSecondary_voltageFigure() {
			return fFigureTransformer_configurationSecondary_voltageFigure;
		}

	}

}
