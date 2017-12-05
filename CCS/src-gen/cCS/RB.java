/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.RB#getRp <em>Rp</em>}</li>
 *   <li>{@link cCS.RB#getRp2 <em>Rp2</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getRB()
 * @model
 * @generated
 */
public interface RB extends Bindings {
	/**
	 * Returns the value of the '<em><b>Rp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RPComp#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rp</em>' reference.
	 * @see #setRp(RPComp)
	 * @see cCS.CCSPackage#getRB_Rp()
	 * @see cCS.RPComp#getRb
	 * @model opposite="rb"
	 * @generated
	 */
	RPComp getRp();

	/**
	 * Sets the value of the '{@link cCS.RB#getRp <em>Rp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp</em>' reference.
	 * @see #getRp()
	 * @generated
	 */
	void setRp(RPComp value);

	/**
	 * Returns the value of the '<em><b>Rp2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.RPConf#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rp2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rp2</em>' reference.
	 * @see #setRp2(RPConf)
	 * @see cCS.CCSPackage#getRB_Rp2()
	 * @see cCS.RPConf#getRb
	 * @model opposite="rb"
	 * @generated
	 */
	RPConf getRp2();

	/**
	 * Sets the value of the '{@link cCS.RB#getRp2 <em>Rp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp2</em>' reference.
	 * @see #getRp2()
	 * @generated
	 */
	void setRp2(RPConf value);

} // RB
