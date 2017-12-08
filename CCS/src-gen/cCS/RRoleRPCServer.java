/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RRole RPC Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RRoleRPCServer#getAttachementsrpc <em>Attachementsrpc</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRRoleRPCServer()
 * @model
 * @generated
 */
public interface RRoleRPCServer extends RR {
	/**
	 * Returns the value of the '<em><b>Attachementsrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachementsrpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementsrpc</em>' reference.
	 * @see #setAttachementsrpc(AttachementSRPC)
	 * @see cCS.CCSPackage#getRRoleRPCServer_Attachementsrpc()
	 * @model
	 * @generated
	 */
	AttachementSRPC getAttachementsrpc();

	/**
	 * Sets the value of the '{@link cCS.RRoleRPCServer#getAttachementsrpc <em>Attachementsrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementsrpc</em>' reference.
	 * @see #getAttachementsrpc()
	 * @generated
	 */
	void setAttachementsrpc(AttachementSRPC value);

} // RRoleRPCServer
