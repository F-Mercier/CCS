/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Config Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServerConfigInterface#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}</li>
 *   <li>{@link cCS.ServerConfigInterface#getServconf2connectservp <em>Servconf2connectservp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServerConfigInterface()
 * @model
 * @generated
 */
public interface ServerConfigInterface extends InterfaceConfig {
	/**
	 * Returns the value of the '<em><b>Servconf2servcompconfp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServConf2ServCompConfP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2servcompconfp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2servcompconfp</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfigInterface_Servconf2servcompconfp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServConf2ServCompConfP> getServconf2servcompconfp();

	/**
	 * Returns the value of the '<em><b>Servconf2connectservp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServConf2ConnectServP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2connectservp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2connectservp</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfigInterface_Servconf2connectservp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServConf2ConnectServP> getServconf2connectservp();

} // ServerConfigInterface
