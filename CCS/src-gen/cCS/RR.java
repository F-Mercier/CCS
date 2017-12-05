/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RR#getPra <em>Pra</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRR()
 * @model
 * @generated
 */
public interface RR extends Role {
	/**
	 * Returns the value of the '<em><b>Pra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PRA#getRr <em>Rr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pra</em>' reference.
	 * @see #setPra(PRA)
	 * @see cCS.CCSPackage#getRR_Pra()
	 * @see cCS.PRA#getRr
	 * @model opposite="rr"
	 * @generated
	 */
	PRA getPra();

	/**
	 * Sets the value of the '{@link cCS.RR#getPra <em>Pra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pra</em>' reference.
	 * @see #getPra()
	 * @generated
	 */
	void setPra(PRA value);

} // RR
