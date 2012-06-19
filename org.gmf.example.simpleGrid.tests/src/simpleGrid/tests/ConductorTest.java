/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleGrid.Conductor;
import simpleGrid.SimpleGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConductorTest extends TestCase {

	/**
	 * The fixture for this Conductor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conductor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConductorTest.class);
	}

	/**
	 * Constructs a new Conductor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Conductor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Conductor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Conductor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conductor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleGridFactory.eINSTANCE.createConductor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConductorTest
