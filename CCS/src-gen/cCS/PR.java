/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PR#getRpa <em>Rpa</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPR()
 * @model
 * @generated
 */
public interface PR extends Role {
	/**
	 * Returns the value of the '<em><b>Rpa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RPA#getPr <em>Pr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpa</em>' reference.
	 * @see #setRpa(RPA)
	 * @see cCS.CCSPackage#getPR_Rpa()
	 * @see cCS.RPA#getPr
	 * @model opposite="pr"
	 * @generated
	 */
	RPA getRpa();

	/**
	 * Sets the value of the '{@link cCS.PR#getRpa <em>Rpa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpa</em>' reference.
	 * @see #getRpa()
	 * @generated
	 */
	void setRpa(RPA value);

} // PR
