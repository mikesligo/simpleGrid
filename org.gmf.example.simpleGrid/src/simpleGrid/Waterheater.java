/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waterheater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Waterheater#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getTank_volume <em>Tank volume</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getHeating_element_capacity <em>Heating element capacity</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getTank_setpoint <em>Tank setpoint</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getLocation <em>Location</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getTank_UA <em>Tank UA</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getSchedule_skew <em>Schedule skew</em>}</li>
 *   <li>{@link simpleGrid.Waterheater#getDemand_skew <em>Demand skew</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getWaterheater()
 * @model
 * @generated
 */
public interface Waterheater extends EObject {
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
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tank volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank volume</em>' attribute.
	 * @see #setTank_volume(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Tank_volume()
	 * @model
	 * @generated
	 */
	double getTank_volume();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getTank_volume <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank volume</em>' attribute.
	 * @see #getTank_volume()
	 * @generated
	 */
	void setTank_volume(double value);

	/**
	 * Returns the value of the '<em><b>Heating element capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating element capacity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating element capacity</em>' reference.
	 * @see #setHeating_element_capacity(EObject)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Heating_element_capacity()
	 * @model
	 * @generated
	 */
	EObject getHeating_element_capacity();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getHeating_element_capacity <em>Heating element capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating element capacity</em>' reference.
	 * @see #getHeating_element_capacity()
	 * @generated
	 */
	void setHeating_element_capacity(EObject value);

	/**
	 * Returns the value of the '<em><b>Tank setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank setpoint</em>' attribute.
	 * @see #setTank_setpoint(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Tank_setpoint()
	 * @model
	 * @generated
	 */
	double getTank_setpoint();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getTank_setpoint <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank setpoint</em>' attribute.
	 * @see #getTank_setpoint()
	 * @generated
	 */
	void setTank_setpoint(double value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Temperature()
	 * @model
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Thermostat deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermostat deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #setThermostat_deadband(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Thermostat_deadband()
	 * @model
	 * @generated
	 */
	double getThermostat_deadband();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getThermostat_deadband <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #getThermostat_deadband()
	 * @generated
	 */
	void setThermostat_deadband(double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Tank UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank UA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank UA</em>' attribute.
	 * @see #setTank_UA(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Tank_UA()
	 * @model
	 * @generated
	 */
	double getTank_UA();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getTank_UA <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank UA</em>' attribute.
	 * @see #getTank_UA()
	 * @generated
	 */
	void setTank_UA(double value);

	/**
	 * Returns the value of the '<em><b>Schedule skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule skew</em>' attribute.
	 * @see #setSchedule_skew(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Schedule_skew()
	 * @model
	 * @generated
	 */
	double getSchedule_skew();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getSchedule_skew <em>Schedule skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule skew</em>' attribute.
	 * @see #getSchedule_skew()
	 * @generated
	 */
	void setSchedule_skew(double value);

	/**
	 * Returns the value of the '<em><b>Demand skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand skew</em>' attribute.
	 * @see #setDemand_skew(double)
	 * @see simpleGrid.SimpleGridPackage#getWaterheater_Demand_skew()
	 * @model
	 * @generated
	 */
	double getDemand_skew();

	/**
	 * Sets the value of the '{@link simpleGrid.Waterheater#getDemand_skew <em>Demand skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand skew</em>' attribute.
	 * @see #getDemand_skew()
	 * @generated
	 */
	void setDemand_skew(double value);

} // Waterheater
