/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RP Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RPComp#getRb <em>Rb</em>}</li>
 *   <li>{@link cCS.RPComp#getRpa <em>Rpa</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRPComp()
 * @model
 * @generated
 */
public interface RPComp extends PortsComponent {
	/**
	 * Returns the value of the '<em><b>Rb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RB#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rb</em>' reference.
	 * @see #setRb(RB)
	 * @see cCS.CCSPackage#getRPComp_Rb()
	 * @see cCS.RB#getRp
	 * @model opposite="rp"
	 * @generated
	 */
	RB getRb();

	/**
	 * Sets the value of the '{@link cCS.RPComp#getRb <em>Rb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rb</em>' reference.
	 * @see #getRb()
	 * @generated
	 */
	void setRb(RB value);

	/**
	 * Returns the value of the '<em><b>Rpa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RPA#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpa</em>' reference.
	 * @see #setRpa(RPA)
	 * @see cCS.CCSPackage#getRPComp_Rpa()
	 * @see cCS.RPA#getRp
	 * @model opposite="rp"
	 * @generated
	 */
	RPA getRpa();

	/**
	 * Sets the value of the '{@link cCS.RPComp#getRpa <em>Rpa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpa</em>' reference.
	 * @see #getRpa()
	 * @generated
	 */
	void setRpa(RPA value);

} // RPComp
