/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.System#getServer <em>Server</em>}</li>
 *   <li>{@link cCS.System#getRpc <em>Rpc</em>}</li>
 *   <li>{@link cCS.System#getClient <em>Client</em>}</li>
 *   <li>{@link cCS.System#getSys2clientbinding <em>Sys2clientbinding</em>}</li>
 *   <li>{@link cCS.System#getSysteminterface <em>Systeminterface</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Config {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServerComp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystem_Server()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerComp> getServer();

	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystem_Rpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<RPC> getRpc();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystem_Client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClient();

	/**
	 * Returns the value of the '<em><b>Sys2clientbinding</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Sys2ClientBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientbinding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientbinding</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystem_Sys2clientbinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sys2ClientBinding> getSys2clientbinding();

	/**
	 * Returns the value of the '<em><b>Systeminterface</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.SystemInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systeminterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeminterface</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystem_Systeminterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemInterface> getSysteminterface();

} // System
