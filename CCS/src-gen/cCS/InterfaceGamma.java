/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceGamma#getRconnect2gamma <em>Rconnect2gamma</em>}</li>
 *   <li>{@link cCS.InterfaceGamma#getRgamma2connect <em>Rgamma2connect</em>}</li>
 *   <li>{@link cCS.InterfaceGamma#getRdb2gamma <em>Rdb2gamma</em>}</li>
 *   <li>{@link cCS.InterfaceGamma#getRgamma2db <em>Rgamma2db</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceGamma()
 * @model
 * @generated
 */
public interface InterfaceGamma extends InterfaceConnector {
	/**
	 * Returns the value of the '<em><b>Rconnect2gamma</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RConnect2Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rconnect2gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rconnect2gamma</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceGamma_Rconnect2gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<RConnect2Gamma> getRconnect2gamma();

	/**
	 * Returns the value of the '<em><b>Rgamma2connect</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RGamma2Connect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rgamma2connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rgamma2connect</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceGamma_Rgamma2connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<RGamma2Connect> getRgamma2connect();

	/**
	 * Returns the value of the '<em><b>Rdb2gamma</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RDB2Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdb2gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdb2gamma</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceGamma_Rdb2gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDB2Gamma> getRdb2gamma();

	/**
	 * Returns the value of the '<em><b>Rgamma2db</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RGamma2DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rgamma2db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rgamma2db</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceGamma_Rgamma2db()
	 * @model containment="true"
	 * @generated
	 */
	EList<RGamma2DB> getRgamma2db();

} // InterfaceGamma
