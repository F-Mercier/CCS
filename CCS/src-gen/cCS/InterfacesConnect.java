/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces Connect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfacesConnect#getPalpha2connect <em>Palpha2connect</em>}</li>
 *   <li>{@link cCS.InterfacesConnect#getPconnect2alpha <em>Pconnect2alpha</em>}</li>
 *   <li>{@link cCS.InterfacesConnect#getPconnect2gamma <em>Pconnect2gamma</em>}</li>
 *   <li>{@link cCS.InterfacesConnect#getPgamma2connect <em>Pgamma2connect</em>}</li>
 *   <li>{@link cCS.InterfacesConnect#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfacesConnect()
 * @model
 * @generated
 */
public interface InterfacesConnect extends InterfaceComponent {
	/**
	 * Returns the value of the '<em><b>Palpha2connect</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PAlpha2Connect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palpha2connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palpha2connect</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesConnect_Palpha2connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<PAlpha2Connect> getPalpha2connect();

	/**
	 * Returns the value of the '<em><b>Pconnect2alpha</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PConnect2Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pconnect2alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pconnect2alpha</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesConnect_Pconnect2alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<PConnect2Alpha> getPconnect2alpha();

	/**
	 * Returns the value of the '<em><b>Pconnect2gamma</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PConnect2Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pconnect2gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pconnect2gamma</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesConnect_Pconnect2gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<PConnect2Gamma> getPconnect2gamma();

	/**
	 * Returns the value of the '<em><b>Pgamma2connect</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PGamma2Connect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgamma2connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgamma2connect</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesConnect_Pgamma2connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<PGamma2Connect> getPgamma2connect();

	/**
	 * Returns the value of the '<em><b>Servconf2connectconnectp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServConf2ConnectConnectP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2connectconnectp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2connectconnectp</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesConnect_Servconf2connectconnectp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServConf2ConnectConnectP> getServconf2connectconnectp();

} // InterfacesConnect
