/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interfaces C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.interfacesC#getPortrc <em>Portrc</em>}</li>
 *   <li>{@link cCS.interfacesC#getPortpc <em>Portpc</em>}</li>
 *   <li>{@link cCS.interfacesC#getSys2clientcp <em>Sys2clientcp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getinterfacesC()
 * @model
 * @generated
 */
public interface interfacesC extends InterfaceComponent {
	/**
	 * Returns the value of the '<em><b>Portrc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PortRC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrc</em>' containment reference list.
	 * @see cCS.CCSPackage#getinterfacesC_Portrc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortRC> getPortrc();

	/**
	 * Returns the value of the '<em><b>Portpc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PortPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portpc</em>' containment reference list.
	 * @see cCS.CCSPackage#getinterfacesC_Portpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortPC> getPortpc();

	/**
	 * Returns the value of the '<em><b>Sys2clientcp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Sys2ClientCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientcp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientcp</em>' containment reference list.
	 * @see cCS.CCSPackage#getinterfacesC_Sys2clientcp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sys2ClientCP> getSys2clientcp();

} // interfacesC
