/**
 */
package cCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port PC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.PortPC#getAttachmentcr <em>Attachmentcr</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getPortPC()
 * @model
 * @generated
 */
public interface PortPC extends PPComp {
	/**
	 * Returns the value of the '<em><b>Attachmentcr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachmentcr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachmentcr</em>' reference.
	 * @see #setAttachmentcr(AttachmentCR)
	 * @see cCS.CCSPackage#getPortPC_Attachmentcr()
	 * @model
	 * @generated
	 */
	AttachmentCR getAttachmentcr();

	/**
	 * Sets the value of the '{@link cCS.PortPC#getAttachmentcr <em>Attachmentcr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachmentcr</em>' reference.
	 * @see #getAttachmentcr()
	 * @generated
	 */
	void setAttachmentcr(AttachmentCR value);

} // PortPC
