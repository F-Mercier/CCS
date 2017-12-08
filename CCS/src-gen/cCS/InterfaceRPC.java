/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceRPC#getProlerpc2 <em>Prolerpc2</em>}</li>
 *   <li>{@link cCS.InterfaceRPC#getRrolerpc <em>Rrolerpc</em>}</li>
 *   <li>{@link cCS.InterfaceRPC#getRrolerpc2 <em>Rrolerpc2</em>}</li>
 *   <li>{@link cCS.InterfaceRPC#getProlerpc <em>Prolerpc</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceRPC()
 * @model
 * @generated
 */
public interface InterfaceRPC extends InterfaceConnector {
	/**
	 * Returns the value of the '<em><b>Prolerpc2</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PRoleRPCClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prolerpc2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prolerpc2</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceRPC_Prolerpc2()
	 * @model containment="true"
	 * @generated
	 */
	EList<PRoleRPCClient> getProlerpc2();

	/**
	 * Returns the value of the '<em><b>Rrolerpc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RRoleRPCClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rrolerpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrolerpc</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceRPC_Rrolerpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<RRoleRPCClient> getRrolerpc();

	/**
	 * Returns the value of the '<em><b>Rrolerpc2</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RRoleRPCServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rrolerpc2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrolerpc2</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceRPC_Rrolerpc2()
	 * @model containment="true"
	 * @generated
	 */
	EList<RRoleRPCServer> getRrolerpc2();

	/**
	 * Returns the value of the '<em><b>Prolerpc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PRoleRPCSev}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prolerpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prolerpc</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceRPC_Prolerpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PRoleRPCSev> getProlerpc();

} // InterfaceRPC
