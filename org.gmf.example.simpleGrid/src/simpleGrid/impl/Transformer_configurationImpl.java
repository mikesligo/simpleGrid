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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleGrid.SimpleGridPackage;
import simpleGrid.Transformer_configuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getConnect_type <em>Connect type</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getInstall_type <em>Install type</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getPower_rating <em>Power rating</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getImpedence <em>Impedence</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getImpedence1 <em>Impedence1</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getImpedence2 <em>Impedence2</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getShunt_impedence <em>Shunt impedence</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getPrimary_voltage <em>Primary voltage</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getSecondary_voltage <em>Secondary voltage</em>}</li>
 *   <li>{@link simpleGrid.impl.Transformer_configurationImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transformer_configurationImpl extends EObjectImpl implements Transformer_configuration {
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
	 * The default value of the '{@link #getConnect_type() <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect_type()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnect_type() <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect_type()
	 * @generated
	 * @ordered
	 */
	protected String connect_type = CONNECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstall_type() <em>Install type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstall_type()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstall_type() <em>Install type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstall_type()
	 * @generated
	 * @ordered
	 */
	protected String install_type = INSTALL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_rating() <em>Power rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_rating()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_RATING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPower_rating() <em>Power rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_rating()
	 * @generated
	 * @ordered
	 */
	protected double power_rating = POWER_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedence() <em>Impedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedence() <em>Impedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence()
	 * @generated
	 * @ordered
	 */
	protected String impedence = IMPEDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedence1() <em>Impedence1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDENCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedence1() <em>Impedence1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence1()
	 * @generated
	 * @ordered
	 */
	protected String impedence1 = IMPEDENCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedence2() <em>Impedence2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence2()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDENCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedence2() <em>Impedence2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedence2()
	 * @generated
	 * @ordered
	 */
	protected String impedence2 = IMPEDENCE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_impedence() <em>Shunt impedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_impedence()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_IMPEDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_impedence() <em>Shunt impedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_impedence()
	 * @generated
	 * @ordered
	 */
	protected String shunt_impedence = SHUNT_IMPEDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimary_voltage() <em>Primary voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_voltage()
	 * @generated
	 * @ordered
	 */
	protected EObject primary_voltage;

	/**
	 * The cached value of the '{@link #getSecondary_voltage() <em>Secondary voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondary_voltage()
	 * @generated
	 * @ordered
	 */
	protected EObject secondary_voltage;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformer_configurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnect_type() {
		return connect_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect_type(String newConnect_type) {
		String oldConnect_type = connect_type;
		connect_type = newConnect_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE, oldConnect_type, connect_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstall_type() {
		return install_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstall_type(String newInstall_type) {
		String oldInstall_type = install_type;
		install_type = newInstall_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE, oldInstall_type, install_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPower_rating() {
		return power_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_rating(double newPower_rating) {
		double oldPower_rating = power_rating;
		power_rating = newPower_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING, oldPower_rating, power_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedence() {
		return impedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedence(String newImpedence) {
		String oldImpedence = impedence;
		impedence = newImpedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE, oldImpedence, impedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedence1() {
		return impedence1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedence1(String newImpedence1) {
		String oldImpedence1 = impedence1;
		impedence1 = newImpedence1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1, oldImpedence1, impedence1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedence2() {
		return impedence2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedence2(String newImpedence2) {
		String oldImpedence2 = impedence2;
		impedence2 = newImpedence2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2, oldImpedence2, impedence2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_impedence() {
		return shunt_impedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_impedence(String newShunt_impedence) {
		String oldShunt_impedence = shunt_impedence;
		shunt_impedence = newShunt_impedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE, oldShunt_impedence, shunt_impedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPrimary_voltage() {
		return primary_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimary_voltage(EObject newPrimary_voltage, NotificationChain msgs) {
		EObject oldPrimary_voltage = primary_voltage;
		primary_voltage = newPrimary_voltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE, oldPrimary_voltage, newPrimary_voltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary_voltage(EObject newPrimary_voltage) {
		if (newPrimary_voltage != primary_voltage) {
			NotificationChain msgs = null;
			if (primary_voltage != null)
				msgs = ((InternalEObject)primary_voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE, null, msgs);
			if (newPrimary_voltage != null)
				msgs = ((InternalEObject)newPrimary_voltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE, null, msgs);
			msgs = basicSetPrimary_voltage(newPrimary_voltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE, newPrimary_voltage, newPrimary_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSecondary_voltage() {
		return secondary_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondary_voltage(EObject newSecondary_voltage, NotificationChain msgs) {
		EObject oldSecondary_voltage = secondary_voltage;
		secondary_voltage = newSecondary_voltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE, oldSecondary_voltage, newSecondary_voltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondary_voltage(EObject newSecondary_voltage) {
		if (newSecondary_voltage != secondary_voltage) {
			NotificationChain msgs = null;
			if (secondary_voltage != null)
				msgs = ((InternalEObject)secondary_voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE, null, msgs);
			if (newSecondary_voltage != null)
				msgs = ((InternalEObject)newSecondary_voltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE, null, msgs);
			msgs = basicSetSecondary_voltage(newSecondary_voltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE, newSecondary_voltage, newSecondary_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<EObject>(EObject.class, this, SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				return basicSetPrimary_voltage(null, msgs);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				return basicSetSecondary_voltage(null, msgs);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				return getName();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				return getConnect_type();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				return getInstall_type();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				return getPower_rating();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE:
				return getImpedence();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1:
				return getImpedence1();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2:
				return getImpedence2();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE:
				return getShunt_impedence();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				return getPrimary_voltage();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				return getSecondary_voltage();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT:
				return getObject();
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
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				setConnect_type((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				setInstall_type((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				setPower_rating((Double)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE:
				setImpedence((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1:
				setImpedence1((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2:
				setImpedence2((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE:
				setShunt_impedence((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				setPrimary_voltage((EObject)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				setSecondary_voltage((EObject)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends EObject>)newValue);
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
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				setConnect_type(CONNECT_TYPE_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				setInstall_type(INSTALL_TYPE_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				setPower_rating(POWER_RATING_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE:
				setImpedence(IMPEDENCE_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1:
				setImpedence1(IMPEDENCE1_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2:
				setImpedence2(IMPEDENCE2_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE:
				setShunt_impedence(SHUNT_IMPEDENCE_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				setPrimary_voltage((EObject)null);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				setSecondary_voltage((EObject)null);
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT:
				getObject().clear();
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
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				return CONNECT_TYPE_EDEFAULT == null ? connect_type != null : !CONNECT_TYPE_EDEFAULT.equals(connect_type);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				return INSTALL_TYPE_EDEFAULT == null ? install_type != null : !INSTALL_TYPE_EDEFAULT.equals(install_type);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				return power_rating != POWER_RATING_EDEFAULT;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE:
				return IMPEDENCE_EDEFAULT == null ? impedence != null : !IMPEDENCE_EDEFAULT.equals(impedence);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1:
				return IMPEDENCE1_EDEFAULT == null ? impedence1 != null : !IMPEDENCE1_EDEFAULT.equals(impedence1);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2:
				return IMPEDENCE2_EDEFAULT == null ? impedence2 != null : !IMPEDENCE2_EDEFAULT.equals(impedence2);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE:
				return SHUNT_IMPEDENCE_EDEFAULT == null ? shunt_impedence != null : !SHUNT_IMPEDENCE_EDEFAULT.equals(shunt_impedence);
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				return primary_voltage != null;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				return secondary_voltage != null;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__OBJECT:
				return object != null && !object.isEmpty();
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
		result.append(", connect_type: ");
		result.append(connect_type);
		result.append(", install_type: ");
		result.append(install_type);
		result.append(", power_rating: ");
		result.append(power_rating);
		result.append(", impedence: ");
		result.append(impedence);
		result.append(", impedence1: ");
		result.append(impedence1);
		result.append(", impedence2: ");
		result.append(impedence2);
		result.append(", shunt_impedence: ");
		result.append(shunt_impedence);
		result.append(')');
		return result.toString();
	}

} //Transformer_configurationImpl
