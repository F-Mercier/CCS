/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys2 Client CP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Sys2ClientCP#getSys2clientbinding <em>Sys2clientbinding</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSys2ClientCP()
 * @model
 * @generated
 */
public interface Sys2ClientCP extends PPComp {
	/**
	 * Returns the value of the '<em><b>Sys2clientbinding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.Sys2ClientBinding#getSys2clientcp <em>Sys2clientcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientbinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientbinding</em>' reference.
	 * @see #setSys2clientbinding(Sys2ClientBinding)
	 * @see cCS.CCSPackage#getSys2ClientCP_Sys2clientbinding()
	 * @see cCS.Sys2ClientBinding#getSys2clientcp
	 * @model opposite="sys2clientcp"
	 * @generated
	 */
	Sys2ClientBinding getSys2clientbinding();

	/**
	 * Sets the value of the '{@link cCS.Sys2ClientCP#getSys2clientbinding <em>Sys2clientbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys2clientbinding</em>' reference.
	 * @see #getSys2clientbinding()
	 * @generated
	 */
	void setSys2clientbinding(Sys2ClientBinding value);

} // Sys2ClientCP
