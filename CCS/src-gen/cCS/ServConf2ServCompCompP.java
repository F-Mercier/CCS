/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serv Conf2 Serv Comp Comp P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServConf2ServCompCompP#getServ2servbinding <em>Serv2servbinding</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServConf2ServCompCompP()
 * @model
 * @generated
 */
public interface ServConf2ServCompCompP extends PPComp {
	/**
	 * Returns the value of the '<em><b>Serv2servbinding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.Serv2ServBinding#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serv2servbinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serv2servbinding</em>' reference.
	 * @see #setServ2servbinding(Serv2ServBinding)
	 * @see cCS.CCSPackage#getServConf2ServCompCompP_Serv2servbinding()
	 * @see cCS.Serv2ServBinding#getServconf2servcompcompp
	 * @model opposite="servconf2servcompcompp"
	 * @generated
	 */
	Serv2ServBinding getServ2servbinding();

	/**
	 * Sets the value of the '{@link cCS.ServConf2ServCompCompP#getServ2servbinding <em>Serv2servbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serv2servbinding</em>' reference.
	 * @see #getServ2servbinding()
	 * @generated
	 */
	void setServ2servbinding(Serv2ServBinding value);

} // ServConf2ServCompCompP
