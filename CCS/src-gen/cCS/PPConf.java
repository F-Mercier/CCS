/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PP Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PPConf#getPb <em>Pb</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPPConf()
 * @model
 * @generated
 */
public interface PPConf extends PortsConfig {
	/**
	 * Returns the value of the '<em><b>Pb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PB#getPp2 <em>Pp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pb</em>' reference.
	 * @see #setPb(PB)
	 * @see cCS.CCSPackage#getPPConf_Pb()
	 * @see cCS.PB#getPp2
	 * @model opposite="pp2"
	 * @generated
	 */
	PB getPb();

	/**
	 * Sets the value of the '{@link cCS.PPConf#getPb <em>Pb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pb</em>' reference.
	 * @see #getPb()
	 * @generated
	 */
	void setPb(PB value);

} // PPConf
