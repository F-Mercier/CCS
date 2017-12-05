/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link cCS.Component#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link cCS.Component#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ElemArchi {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(Properties)
	 * @see cCS.CCSPackage#getComponent_Properties()
	 * @model
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link cCS.Component#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference.
	 * @see #setConstraints(Constraints)
	 * @see cCS.CCSPackage#getComponent_Constraints()
	 * @model
	 * @generated
	 */
	Constraints getConstraints();

	/**
	 * Sets the value of the '{@link cCS.Component#getConstraints <em>Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Constraints value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(InterfaceComponent)
	 * @see cCS.CCSPackage#getComponent_Interface()
	 * @model
	 * @generated
	 */
	InterfaceComponent getInterface();

	/**
	 * Sets the value of the '{@link cCS.Component#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceComponent value);

} // Component
