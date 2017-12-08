/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serv Conf2 Connect Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServConf2ConnectBinding#getServconf2connectservp <em>Servconf2connectservp</em>}</li>
 *   <li>{@link cCS.ServConf2ConnectBinding#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServConf2ConnectBinding()
 * @model
 * @generated
 */
public interface ServConf2ConnectBinding extends PB {
	/**
	 * Returns the value of the '<em><b>Servconf2connectservp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.ServConf2ConnectServP#getServconf2connectbinding <em>Servconf2connectbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2connectservp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2connectservp</em>' reference.
	 * @see #setServconf2connectservp(ServConf2ConnectServP)
	 * @see cCS.CCSPackage#getServConf2ConnectBinding_Servconf2connectservp()
	 * @see cCS.ServConf2ConnectServP#getServconf2connectbinding
	 * @model opposite="servconf2connectbinding"
	 * @generated
	 */
	ServConf2ConnectServP getServconf2connectservp();

	/**
	 * Sets the value of the '{@link cCS.ServConf2ConnectBinding#getServconf2connectservp <em>Servconf2connectservp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servconf2connectservp</em>' reference.
	 * @see #getServconf2connectservp()
	 * @generated
	 */
	void setServconf2connectservp(ServConf2ConnectServP value);

	/**
	 * Returns the value of the '<em><b>Servconf2connectconnectp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.ServConf2ConnectConnectP#getServconf2connectbinding <em>Servconf2connectbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2connectconnectp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2connectconnectp</em>' reference.
	 * @see #setServconf2connectconnectp(ServConf2ConnectConnectP)
	 * @see cCS.CCSPackage#getServConf2ConnectBinding_Servconf2connectconnectp()
	 * @see cCS.ServConf2ConnectConnectP#getServconf2connectbinding
	 * @model opposite="servconf2connectbinding"
	 * @generated
	 */
	ServConf2ConnectConnectP getServconf2connectconnectp();

	/**
	 * Sets the value of the '{@link cCS.ServConf2ConnectBinding#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servconf2connectconnectp</em>' reference.
	 * @see #getServconf2connectconnectp()
	 * @generated
	 */
	void setServconf2connectconnectp(ServConf2ConnectConnectP value);

} // ServConf2ConnectBinding
