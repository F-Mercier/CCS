/**
 */
package cCS.impl;

import cCS.AttachmentRC;
import cCS.CCSPackage;
import cCS.PRoleRPCClient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRole RPC Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PRoleRPCClientImpl#getAttachmentrc <em>Attachmentrc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRoleRPCClientImpl extends PRImpl implements PRoleRPCClient {
	/**
	 * The cached value of the '{@link #getAttachmentrc() <em>Attachmentrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentrc()
	 * @generated
	 * @ordered
	 */
	protected AttachmentRC attachmentrc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRoleRPCClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PROLE_RPC_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentRC getAttachmentrc() {
		if (attachmentrc != null && attachmentrc.eIsProxy()) {
			InternalEObject oldAttachmentrc = (InternalEObject) attachmentrc;
			attachmentrc = (AttachmentRC) eResolveProxy(oldAttachmentrc);
			if (attachmentrc != oldAttachmentrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC,
							oldAttachmentrc, attachmentrc));
			}
		}
		return attachmentrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentRC basicGetAttachmentrc() {
		return attachmentrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentrc(AttachmentRC newAttachmentrc) {
		AttachmentRC oldAttachmentrc = attachmentrc;
		attachmentrc = newAttachmentrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC,
					oldAttachmentrc, attachmentrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC:
			if (resolve)
				return getAttachmentrc();
			return basicGetAttachmentrc();
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
		case CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC:
			setAttachmentrc((AttachmentRC) newValue);
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
		case CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC:
			setAttachmentrc((AttachmentRC) null);
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
		case CCSPackage.PROLE_RPC_CLIENT__ATTACHMENTRC:
			return attachmentrc != null;
		}
		return super.eIsSet(featureID);
	}

} //PRoleRPCClientImpl
