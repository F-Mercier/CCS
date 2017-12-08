/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys2 Client SP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Sys2ClientSP#getSys2clientbinding <em>Sys2clientbinding</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSys2ClientSP()
 * @model
 * @generated
 */
public interface Sys2ClientSP extends PPConf {
	/**
	 * Returns the value of the '<em><b>Sys2clientbinding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cCS.Sys2ClientBinding#getSys2clientsp <em>Sys2clientsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys2clientbinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys2clientbinding</em>' reference.
	 * @see #setSys2clientbinding(Sys2ClientBinding)
	 * @see cCS.CCSPackage#getSys2ClientSP_Sys2clientbinding()
	 * @see cCS.Sys2ClientBinding#getSys2clientsp
	 * @model opposite="sys2clientsp"
	 * @generated
	 */
	Sys2ClientBinding getSys2clientbinding();

	/**
	 * Sets the value of the '{@link cCS.Sys2ClientSP#getSys2clientbinding <em>Sys2clientbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys2clientbinding</em>' reference.
	 * @see #getSys2clientbinding()
	 * @generated
	 */
	void setSys2clientbinding(Sys2ClientBinding value);

} // Sys2ClientSP
