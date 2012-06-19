/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simpleGrid.Node;
import simpleGrid.SimpleGridPackage;
import simpleGrid.Transformer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link simpleGrid.impl.NodeImpl#getTransformer <em>Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected String phases = PHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected String bustype = BUSTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVoltage_A() <em>Voltage A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected EObject voltage_A;

	/**
	 * The cached value of the '{@link #getVoltage_B() <em>Voltage B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected EObject voltage_B;

	/**
	 * The cached value of the '{@link #getVoltage_C() <em>Voltage C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected EObject voltage_C;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer> transformer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases(String newPhases) {
		String oldPhases = phases;
		phases = newPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
		return bustype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBustype(String newBustype) {
		String oldBustype = bustype;
		bustype = newBustype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVoltage_A() {
		return voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltage_A(EObject newVoltage_A, NotificationChain msgs) {
		EObject oldVoltage_A = voltage_A;
		voltage_A = newVoltage_A;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_A, oldVoltage_A, newVoltage_A);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_A(EObject newVoltage_A) {
		if (newVoltage_A != voltage_A) {
			NotificationChain msgs = null;
			if (voltage_A != null)
				msgs = ((InternalEObject)voltage_A).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_A, null, msgs);
			if (newVoltage_A != null)
				msgs = ((InternalEObject)newVoltage_A).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_A, null, msgs);
			msgs = basicSetVoltage_A(newVoltage_A, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_A, newVoltage_A, newVoltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVoltage_B() {
		return voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltage_B(EObject newVoltage_B, NotificationChain msgs) {
		EObject oldVoltage_B = voltage_B;
		voltage_B = newVoltage_B;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_B, oldVoltage_B, newVoltage_B);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_B(EObject newVoltage_B) {
		if (newVoltage_B != voltage_B) {
			NotificationChain msgs = null;
			if (voltage_B != null)
				msgs = ((InternalEObject)voltage_B).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_B, null, msgs);
			if (newVoltage_B != null)
				msgs = ((InternalEObject)newVoltage_B).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_B, null, msgs);
			msgs = basicSetVoltage_B(newVoltage_B, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_B, newVoltage_B, newVoltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVoltage_C() {
		return voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltage_C(EObject newVoltage_C, NotificationChain msgs) {
		EObject oldVoltage_C = voltage_C;
		voltage_C = newVoltage_C;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_C, oldVoltage_C, newVoltage_C);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_C(EObject newVoltage_C) {
		if (newVoltage_C != voltage_C) {
			NotificationChain msgs = null;
			if (voltage_C != null)
				msgs = ((InternalEObject)voltage_C).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_C, null, msgs);
			if (newVoltage_C != null)
				msgs = ((InternalEObject)newVoltage_C).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.NODE__VOLTAGE_C, null, msgs);
			msgs = basicSetVoltage_C(newVoltage_C, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.NODE__VOLTAGE_C, newVoltage_C, newVoltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer> getTransformer() {
		if (transformer == null) {
			transformer = new EObjectResolvingEList<Transformer>(Transformer.class, this, SimpleGridPackage.NODE__TRANSFORMER);
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleGridPackage.NODE__VOLTAGE_A:
				return basicSetVoltage_A(null, msgs);
			case SimpleGridPackage.NODE__VOLTAGE_B:
				return basicSetVoltage_B(null, msgs);
			case SimpleGridPackage.NODE__VOLTAGE_C:
				return basicSetVoltage_C(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.NODE__NAME:
				return getName();
			case SimpleGridPackage.NODE__PHASES:
				return getPhases();
			case SimpleGridPackage.NODE__BUSTYPE:
				return getBustype();
			case SimpleGridPackage.NODE__VOLTAGE_A:
				return getVoltage_A();
			case SimpleGridPackage.NODE__VOLTAGE_B:
				return getVoltage_B();
			case SimpleGridPackage.NODE__VOLTAGE_C:
				return getVoltage_C();
			case SimpleGridPackage.NODE__TRANSFORMER:
				return getTransformer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleGridPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.NODE__PHASES:
				setPhases((String)newValue);
				return;
			case SimpleGridPackage.NODE__BUSTYPE:
				setBustype((String)newValue);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_A:
				setVoltage_A((EObject)newValue);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_B:
				setVoltage_B((EObject)newValue);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_C:
				setVoltage_C((EObject)newValue);
				return;
			case SimpleGridPackage.NODE__TRANSFORMER:
				getTransformer().clear();
				getTransformer().addAll((Collection<? extends Transformer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleGridPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.NODE__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case SimpleGridPackage.NODE__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_A:
				setVoltage_A((EObject)null);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_B:
				setVoltage_B((EObject)null);
				return;
			case SimpleGridPackage.NODE__VOLTAGE_C:
				setVoltage_C((EObject)null);
				return;
			case SimpleGridPackage.NODE__TRANSFORMER:
				getTransformer().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleGridPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.NODE__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case SimpleGridPackage.NODE__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case SimpleGridPackage.NODE__VOLTAGE_A:
				return voltage_A != null;
			case SimpleGridPackage.NODE__VOLTAGE_B:
				return voltage_B != null;
			case SimpleGridPackage.NODE__VOLTAGE_C:
				return voltage_C != null;
			case SimpleGridPackage.NODE__TRANSFORMER:
				return transformer != null && !transformer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", phases: ");
		result.append(phases);
		result.append(", bustype: ");
		result.append(bustype);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
