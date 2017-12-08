/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RPC#getInterfacerpc <em>Interfacerpc</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connector {
	/**
	 * Returns the value of the '<em><b>Interfacerpc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfaceRPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacerpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacerpc</em>' containment reference list.
	 * @see cCS.CCSPackage#getRPC_Interfacerpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceRPC> getInterfacerpc();

} // RPC
