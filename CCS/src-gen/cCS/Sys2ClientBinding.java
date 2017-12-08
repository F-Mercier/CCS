/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys2 Client Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Sys2ClientBinding#getSys2clientsp <em>Sys2clientsp</em>}</li>
 *   <li>{@link cCS.Sys2ClientBinding#getSys2clientcp <em>Sys2clientcp</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSys2ClientBinding()
 * @model
 * @generated
 */
public interface Sys2ClientBinding extends PB {
	/**
	 * Returns the value of the '<em><b>Sys2clientsp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.Sys2ClientSP#getSys2clientbinding <em>Sys2clientbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientsp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientsp</em>' reference.
	 * @see #setSys2clientsp(Sys2ClientSP)
	 * @see cCS.CCSPackage#getSys2ClientBinding_Sys2clientsp()
	 * @see cCS.Sys2ClientSP#getSys2clientbinding
	 * @model opposite="sys2clientbinding"
	 * @generated
	 */
	Sys2ClientSP getSys2clientsp();

	/**
	 * Sets the value of the '{@link cCS.Sys2ClientBinding#getSys2clientsp <em>Sys2clientsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys2clientsp</em>' reference.
	 * @see #getSys2clientsp()
	 * @generated
	 */
	void setSys2clientsp(Sys2ClientSP value);

	/**
	 * Returns the value of the '<em><b>Sys2clientcp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.Sys2ClientCP#getSys2clientbinding <em>Sys2clientbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientcp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientcp</em>' reference.
	 * @see #setSys2clientcp(Sys2ClientCP)
	 * @see cCS.CCSPackage#getSys2ClientBinding_Sys2clientcp()
	 * @see cCS.Sys2ClientCP#getSys2clientbinding
	 * @model opposite="sys2clientbinding"
	 * @generated
	 */
	Sys2ClientCP getSys2clientcp();

	/**
	 * Sets the value of the '{@link cCS.Sys2ClientBinding#getSys2clientcp <em>Sys2clientcp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys2clientcp</em>' reference.
	 * @see #getSys2clientcp()
	 * @generated
	 */
	void setSys2clientcp(Sys2ClientCP value);

} // Sys2ClientBinding
