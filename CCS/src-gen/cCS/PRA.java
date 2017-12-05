/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PRA#getPp <em>Pp</em>}</li>
 *   <li>{@link cCS.PRA#getRr <em>Rr</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPRA()
 * @model
 * @generated
 */
public interface PRA extends Attachments {
	/**
	 * Returns the value of the '<em><b>Pp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PPComp#getPra <em>Pra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp</em>' reference.
	 * @see #setPp(PPComp)
	 * @see cCS.CCSPackage#getPRA_Pp()
	 * @see cCS.PPComp#getPra
	 * @model opposite="pra"
	 * @generated
	 */
	PPComp getPp();

	/**
	 * Sets the value of the '{@link cCS.PRA#getPp <em>Pp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp</em>' reference.
	 * @see #getPp()
	 * @generated
	 */
	void setPp(PPComp value);

	/**
	 * Returns the value of the '<em><b>Rr</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RR#getPra <em>Pra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rr</em>' reference.
	 * @see #setRr(RR)
	 * @see cCS.CCSPackage#getPRA_Rr()
	 * @see cCS.RR#getPra
	 * @model opposite="pra"
	 * @generated
	 */
	RR getRr();

	/**
	 * Sets the value of the '{@link cCS.PRA#getRr <em>Rr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rr</em>' reference.
	 * @see #getRr()
	 * @generated
	 */
	void setRr(RR value);

} // PRA
