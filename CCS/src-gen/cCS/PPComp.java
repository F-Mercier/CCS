/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PP Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PPComp#getPb <em>Pb</em>}</li>
 *   <li>{@link cCS.PPComp#getPra <em>Pra</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPPComp()
 * @model
 * @generated
 */
public interface PPComp extends PortsComponent {
	/**
	 * Returns the value of the '<em><b>Pb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PB#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pb</em>' reference.
	 * @see #setPb(PB)
	 * @see cCS.CCSPackage#getPPComp_Pb()
	 * @see cCS.PB#getPp
	 * @model opposite="pp"
	 * @generated
	 */
	PB getPb();

	/**
	 * Sets the value of the '{@link cCS.PPComp#getPb <em>Pb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pb</em>' reference.
	 * @see #getPb()
	 * @generated
	 */
	void setPb(PB value);

	/**
	 * Returns the value of the '<em><b>Pra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PRA#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pra</em>' reference.
	 * @see #setPra(PRA)
	 * @see cCS.CCSPackage#getPPComp_Pra()
	 * @see cCS.PRA#getPp
	 * @model opposite="pp"
	 * @generated
	 */
	PRA getPra();

	/**
	 * Sets the value of the '{@link cCS.PPComp#getPra <em>Pra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pra</em>' reference.
	 * @see #getPra()
	 * @generated
	 */
	void setPra(PRA value);

} // PPComp
