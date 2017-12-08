/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serv2 Serv Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Serv2ServBinding#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}</li>
 *   <li>{@link cCS.Serv2ServBinding#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServ2ServBinding()
 * @model
 * @generated
 */
public interface Serv2ServBinding extends PB {
	/**
	 * Returns the value of the '<em><b>Servconf2servcompconfp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.ServConf2ServCompConfP#getServ2servbinding <em>Serv2servbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2servcompconfp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2servcompconfp</em>' reference.
	 * @see #setServconf2servcompconfp(ServConf2ServCompConfP)
	 * @see cCS.CCSPackage#getServ2ServBinding_Servconf2servcompconfp()
	 * @see cCS.ServConf2ServCompConfP#getServ2servbinding
	 * @model opposite="serv2servbinding"
	 * @generated
	 */
	ServConf2ServCompConfP getServconf2servcompconfp();

	/**
	 * Sets the value of the '{@link cCS.Serv2ServBinding#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servconf2servcompconfp</em>' reference.
	 * @see #getServconf2servcompconfp()
	 * @generated
	 */
	void setServconf2servcompconfp(ServConf2ServCompConfP value);

	/**
	 * Returns the value of the '<em><b>Servconf2servcompcompp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.ServConf2ServCompCompP#getServ2servbinding <em>Serv2servbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servconf2servcompcompp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servconf2servcompcompp</em>' reference.
	 * @see #setServconf2servcompcompp(ServConf2ServCompCompP)
	 * @see cCS.CCSPackage#getServ2ServBinding_Servconf2servcompcompp()
	 * @see cCS.ServConf2ServCompCompP#getServ2servbinding
	 * @model opposite="serv2servbinding"
	 * @generated
	 */
	ServConf2ServCompCompP getServconf2servcompcompp();

	/**
	 * Sets the value of the '{@link cCS.Serv2ServBinding#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servconf2servcompcompp</em>' reference.
	 * @see #getServconf2servcompcompp()
	 * @generated
	 */
	void setServconf2servcompcompp(ServConf2ServCompCompP value);

} // Serv2ServBinding
