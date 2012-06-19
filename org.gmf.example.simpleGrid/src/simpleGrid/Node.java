/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Node#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.Node#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.Node#getBustype <em>Bustype</em>}</li>
 *   <li>{@link simpleGrid.Node#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link simpleGrid.Node#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link simpleGrid.Node#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link simpleGrid.Node#getTransformer <em>Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleGrid.SimpleGridPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see #setPhases(String)
	 * @see simpleGrid.SimpleGridPackage#getNode_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

	/**
	 * Returns the value of the '<em><b>Bustype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bustype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bustype</em>' attribute.
	 * @see #setBustype(String)
	 * @see simpleGrid.SimpleGridPackage#getNode_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getBustype <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bustype</em>' attribute.
	 * @see #getBustype()
	 * @generated
	 */
	void setBustype(String value);

	/**
	 * Returns the value of the '<em><b>Voltage A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage A</em>' containment reference.
	 * @see #setVoltage_A(EObject)
	 * @see simpleGrid.SimpleGridPackage#getNode_Voltage_A()
	 * @model containment="true"
	 * @generated
	 */
	EObject getVoltage_A();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getVoltage_A <em>Voltage A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage A</em>' containment reference.
	 * @see #getVoltage_A()
	 * @generated
	 */
	void setVoltage_A(EObject value);

	/**
	 * Returns the value of the '<em><b>Voltage B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage B</em>' containment reference.
	 * @see #setVoltage_B(EObject)
	 * @see simpleGrid.SimpleGridPackage#getNode_Voltage_B()
	 * @model containment="true"
	 * @generated
	 */
	EObject getVoltage_B();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getVoltage_B <em>Voltage B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage B</em>' containment reference.
	 * @see #getVoltage_B()
	 * @generated
	 */
	void setVoltage_B(EObject value);

	/**
	 * Returns the value of the '<em><b>Voltage C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage C</em>' containment reference.
	 * @see #setVoltage_C(EObject)
	 * @see simpleGrid.SimpleGridPackage#getNode_Voltage_C()
	 * @model containment="true"
	 * @generated
	 */
	EObject getVoltage_C();

	/**
	 * Sets the value of the '{@link simpleGrid.Node#getVoltage_C <em>Voltage C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' containment reference.
	 * @see #getVoltage_C()
	 * @generated
	 */
	void setVoltage_C(EObject value);

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference list.
	 * The list contents are of type {@link simpleGrid.Transformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference list.
	 * @see simpleGrid.SimpleGridPackage#getNode_Transformer()
	 * @model
	 * @generated
	 */
	EList<Transformer> getTransformer();

} // Node
