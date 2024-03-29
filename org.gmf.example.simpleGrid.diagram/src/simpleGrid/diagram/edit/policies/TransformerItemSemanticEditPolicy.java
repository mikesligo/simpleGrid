package simpleGrid.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TransformerItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransformerItemSemanticEditPolicy() {
		super(
				simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(incomingLink) == simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(outgoingLink) == simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(outgoingLink) == simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.TransformerTransformer_configurationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.NodeTransformer_4014 == req
				.getElementType()) {
			return null;
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.TransformerTriplex_nodeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006 == req
				.getElementType()) {
			return null;
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.NodeTransformer_4014 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.NodeTransformerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID:
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.TransformerTransformer_configurationReorientCommand(
					req));
		case simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID:
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.NodeTransformerReorientCommand(
					req));
		case simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID:
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.TransformerTriplex_nodeReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
