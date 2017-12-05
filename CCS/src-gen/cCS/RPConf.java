/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RP Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RPConf#getRb <em>Rb</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRPConf()
 * @model
 * @generated
 */
public interface RPConf extends PortsConfig {
	/**
	 * Returns the value of the '<em><b>Rb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RB#getRp2 <em>Rp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rb</em>' reference.
	 * @see #setRb(RB)
	 * @see cCS.CCSPackage#getRPConf_Rb()
	 * @see cCS.RB#getRp2
	 * @model opposite="rp2"
	 * @generated
	 */
	RB getRb();

	/**
	 * Sets the value of the '{@link cCS.RPConf#getRb <em>Rb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rb</em>' reference.
	 * @see #getRb()
	 * @generated
	 */
	void setRb(RB value);

} // RPConf
