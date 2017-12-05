/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RPA#getRp <em>Rp</em>}</li>
 *   <li>{@link cCS.RPA#getPr <em>Pr</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRPA()
 * @model
 * @generated
 */
public interface RPA extends Attachments {
	/**
	 * Returns the value of the '<em><b>Rp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RPComp#getRpa <em>Rpa</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rp</em>' reference.
	 * @see #setRp(RPComp)
	 * @see cCS.CCSPackage#getRPA_Rp()
	 * @see cCS.RPComp#getRpa
	 * @model opposite="rpa"
	 * @generated
	 */
	RPComp getRp();

	/**
	 * Sets the value of the '{@link cCS.RPA#getRp <em>Rp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp</em>' reference.
	 * @see #getRp()
	 * @generated
	 */
	void setRp(RPComp value);

	/**
	 * Returns the value of the '<em><b>Pr</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PR#getRpa <em>Rpa</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pr</em>' reference.
	 * @see #setPr(PR)
	 * @see cCS.CCSPackage#getRPA_Pr()
	 * @see cCS.PR#getRpa
	 * @model opposite="rpa"
	 * @generated
	 */
	PR getPr();

	/**
	 * Sets the value of the '{@link cCS.RPA#getPr <em>Pr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pr</em>' reference.
	 * @see #getPr()
	 * @generated
	 */
	void setPr(PR value);

} // RPA
