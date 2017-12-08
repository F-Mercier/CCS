/**
 */
package cCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serv Conf2 Connect Serv P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServConf2ConnectServP#getServconf2connectbinding <em>Servconf2connectbinding</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServConf2ConnectServP()
 * @model
 * @generated
 */
public interface ServConf2ConnectServP extends EObject {
	/**
	 * Returns the value of the '<em><b>Servconf2connectbinding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.ServConf2ConnectBinding#getServconf2connectservp <em>Servconf2connectservp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2connectbinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2connectbinding</em>' reference.
	 * @see #setServconf2connectbinding(ServConf2ConnectBinding)
	 * @see cCS.CCSPackage#getServConf2ConnectServP_Servconf2connectbinding()
	 * @see cCS.ServConf2ConnectBinding#getServconf2connectservp
	 * @model opposite="servconf2connectservp"
	 * @generated
	 */
	ServConf2ConnectBinding getServconf2connectbinding();

	/**
	 * Sets the value of the '{@link cCS.ServConf2ConnectServP#getServconf2connectbinding <em>Servconf2connectbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servconf2connectbinding</em>' reference.
	 * @see #getServconf2connectbinding()
	 * @generated
	 */
	void setServconf2connectbinding(ServConf2ConnectBinding value);

} // ServConf2ConnectServP
