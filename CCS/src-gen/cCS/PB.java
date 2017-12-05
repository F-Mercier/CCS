/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PB#getPp <em>Pp</em>}</li>
 *   <li>{@link cCS.PB#getPp2 <em>Pp2</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPB()
 * @model
 * @generated
 */
public interface PB extends Bindings {
	/**
	 * Returns the value of the '<em><b>Pp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PPComp#getPb <em>Pb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp</em>' reference.
	 * @see #setPp(PPComp)
	 * @see cCS.CCSPackage#getPB_Pp()
	 * @see cCS.PPComp#getPb
	 * @model opposite="pb"
	 * @generated
	 */
	PPComp getPp();

	/**
	 * Sets the value of the '{@link cCS.PB#getPp <em>Pp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp</em>' reference.
	 * @see #getPp()
	 * @generated
	 */
	void setPp(PPComp value);

	/**
	 * Returns the value of the '<em><b>Pp2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.PPConf#getPb <em>Pb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pp2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp2</em>' reference.
	 * @see #setPp2(PPConf)
	 * @see cCS.CCSPackage#getPB_Pp2()
	 * @see cCS.PPConf#getPb
	 * @model opposite="pb"
	 * @generated
	 */
	PPConf getPp2();

	/**
	 * Sets the value of the '{@link cCS.PB#getPp2 <em>Pp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp2</em>' reference.
	 * @see #getPp2()
	 * @generated
	 */
	void setPp2(PPConf value);

} // PB
