/**
 */
package cCS.impl;

import cCS.AttachmentCR;
import cCS.CCSPackage;
import cCS.PortPC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port PC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PortPCImpl#getAttachmentcr <em>Attachmentcr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortPCImpl extends PPCompImpl implements PortPC {
	/**
	 * The cached value of the '{@link #getAttachmentcr() <em>Attachmentcr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcr()
	 * @generated
	 * @ordered
	 */
	protected AttachmentCR attachmentcr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PORT_PC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentCR getAttachmentcr() {
		if (attachmentcr != null && attachmentcr.eIsProxy()) {
			InternalEObject oldAttachmentcr = (InternalEObject) attachmentcr;
			attachmentcr = (AttachmentCR) eResolveProxy(oldAttachmentcr);
			if (attachmentcr != oldAttachmentcr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PORT_PC__ATTACHMENTCR,
							oldAttachmentcr, attachmentcr));
			}
		}
		return attachmentcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentCR basicGetAttachmentcr() {
		return attachmentcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcr(AttachmentCR newAttachmentcr) {
		AttachmentCR oldAttachmentcr = attachmentcr;
		attachmentcr = newAttachmentcr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PORT_PC__ATTACHMENTCR, oldAttachmentcr,
					attachmentcr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PORT_PC__ATTACHMENTCR:
			if (resolve)
				return getAttachmentcr();
			return basicGetAttachmentcr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CCSPackage.PORT_PC__ATTACHMENTCR:
			setAttachmentcr((AttachmentCR) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CCSPackage.PORT_PC__ATTACHMENTCR:
			setAttachmentcr((AttachmentCR) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CCSPackage.PORT_PC__ATTACHMENTCR:
			return attachmentcr != null;
		}
		return super.eIsSet(featureID);
	}

} //PortPCImpl
