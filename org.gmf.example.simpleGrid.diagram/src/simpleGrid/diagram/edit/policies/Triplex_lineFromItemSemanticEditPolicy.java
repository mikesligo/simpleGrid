package simpleGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class Triplex_lineFromItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Triplex_lineFromItemSemanticEditPolicy() {
		super(
				simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineFrom_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
