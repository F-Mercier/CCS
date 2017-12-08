/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.SystemInterface#getSys2clientsp <em>Sys2clientsp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSystemInterface()
 * @model
 * @generated
 */
public interface SystemInterface extends InterfaceConfig {
	/**
	 * Returns the value of the '<em><b>Sys2clientsp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Sys2ClientSP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientsp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientsp</em>' containment reference list.
	 * @see cCS.CCSPackage#getSystemInterface_Sys2clientsp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sys2ClientSP> getSys2clientsp();

} // SystemInterface
