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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.NodeEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.WaterheaterHeating_element_capacity_4010);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerFrom_4016);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009);
		types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTo_4012);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTo_4015) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.WaterheaterHeating_element_capacity_4010) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeFrom_4004) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerFrom_4016) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.HouseParent_4002) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTo_4009) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
		} else if (relationshipType == simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTo_4012) {
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class HouseFigure extends SVGFigure {

		/**
		 * @generated
		 */
		public HouseFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setURI("file:///home/mike/src/simpleGrid/org.gmf.example.simpleGrid/images/house.svg");
		}

	}

}
