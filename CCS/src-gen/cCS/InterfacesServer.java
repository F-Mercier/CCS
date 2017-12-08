/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfacesServer#getPortps <em>Portps</em>}</li>
 *   <li>{@link cCS.InterfacesServer#getPortrs <em>Portrs</em>}</li>
 *   <li>{@link cCS.InterfacesServer#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfacesServer()
 * @model
 * @generated
 */
public interface InterfacesServer extends InterfaceComponent {
	/**
	 * Returns the value of the '<em><b>Portps</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PortPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portps</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesServer_Portps()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortPS> getPortps();

	/**
	 * Returns the value of the '<em><b>Portrs</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PortRS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrs</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesServer_Portrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortRS> getPortrs();

	/**
	 * Returns the value of the '<em><b>Servconf2servcompcompp</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServConf2ServCompCompP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2servcompcompp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2servcompcompp</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfacesServer_Servconf2servcompcompp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServConf2ServCompCompP> getServconf2servcompcompp();

} // InterfacesServer
