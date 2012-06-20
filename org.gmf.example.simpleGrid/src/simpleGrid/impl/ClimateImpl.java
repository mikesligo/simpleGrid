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

import simpleGrid.Climate;
import simpleGrid.SimpleGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.ClimateImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.ClimateImpl#getTmyfile <em>Tmyfile</em>}</li>
 *   <li>{@link simpleGrid.impl.ClimateImpl#getInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link simpleGrid.impl.ClimateImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClimateImpl extends EObjectImpl implements Climate {
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
	 * The default value of the '{@link #getTmyfile() <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmyfile()
	 * @generated
	 * @ordered
	 */
	protected static final String TMYFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTmyfile() <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmyfile()
	 * @generated
	 * @ordered
	 */
	protected String tmyfile = TMYFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolate()
	 * @generated
	 * @ordered
	 */
	protected String interpolate = INTERPOLATE_EDEFAULT;

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
	protected ClimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.CLIMATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.CLIMATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTmyfile() {
		return tmyfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmyfile(String newTmyfile) {
		String oldTmyfile = tmyfile;
		tmyfile = newTmyfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.CLIMATE__TMYFILE, oldTmyfile, tmyfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpolate() {
		return interpolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolate(String newInterpolate) {
		String oldInterpolate = interpolate;
		interpolate = newInterpolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.CLIMATE__INTERPOLATE, oldInterpolate, interpolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<EObject>(EObject.class, this, SimpleGridPackage.CLIMATE__OBJECT);
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
			case SimpleGridPackage.CLIMATE__OBJECT:
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
			case SimpleGridPackage.CLIMATE__NAME:
				return getName();
			case SimpleGridPackage.CLIMATE__TMYFILE:
				return getTmyfile();
			case SimpleGridPackage.CLIMATE__INTERPOLATE:
				return getInterpolate();
			case SimpleGridPackage.CLIMATE__OBJECT:
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
			case SimpleGridPackage.CLIMATE__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.CLIMATE__TMYFILE:
				setTmyfile((String)newValue);
				return;
			case SimpleGridPackage.CLIMATE__INTERPOLATE:
				setInterpolate((String)newValue);
				return;
			case SimpleGridPackage.CLIMATE__OBJECT:
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
			case SimpleGridPackage.CLIMATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.CLIMATE__TMYFILE:
				setTmyfile(TMYFILE_EDEFAULT);
				return;
			case SimpleGridPackage.CLIMATE__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
				return;
			case SimpleGridPackage.CLIMATE__OBJECT:
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
			case SimpleGridPackage.CLIMATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.CLIMATE__TMYFILE:
				return TMYFILE_EDEFAULT == null ? tmyfile != null : !TMYFILE_EDEFAULT.equals(tmyfile);
			case SimpleGridPackage.CLIMATE__INTERPOLATE:
				return INTERPOLATE_EDEFAULT == null ? interpolate != null : !INTERPOLATE_EDEFAULT.equals(interpolate);
			case SimpleGridPackage.CLIMATE__OBJECT:
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
		result.append(", tmyfile: ");
		result.append(tmyfile);
		result.append(", interpolate: ");
		result.append(interpolate);
		result.append(')');
		return result.toString();
	}

} //ClimateImpl