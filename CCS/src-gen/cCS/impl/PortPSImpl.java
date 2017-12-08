/**
 */
package cCS.impl;

import cCS.AttachementSRPC;
import cCS.CCSPackage;
import cCS.PortPS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port PS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PortPSImpl#getAttachementsrpc <em>Attachementsrpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortPSImpl extends PPCompImpl implements PortPS {
	/**
	 * The cached value of the '{@link #getAttachementsrpc() <em>Attachementsrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementsrpc()
	 * @generated
	 * @ordered
	 */
	protected AttachementSRPC attachementsrpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PORT_PS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementSRPC getAttachementsrpc() {
		if (attachementsrpc != null && attachementsrpc.eIsProxy()) {
			InternalEObject oldAttachementsrpc = (InternalEObject) attachementsrpc;
			attachementsrpc = (AttachementSRPC) eResolveProxy(oldAttachementsrpc);
			if (attachementsrpc != oldAttachementsrpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PORT_PS__ATTACHEMENTSRPC,
							oldAttachementsrpc, attachementsrpc));
			}
		}
		return attachementsrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementSRPC basicGetAttachementsrpc() {
		return attachementsrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachementsrpc(AttachementSRPC newAttachementsrpc) {
		AttachementSRPC oldAttachementsrpc = attachementsrpc;
		attachementsrpc = newAttachementsrpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PORT_PS__ATTACHEMENTSRPC,
					oldAttachementsrpc, attachementsrpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PORT_PS__ATTACHEMENTSRPC:
			if (resolve)
				return getAttachementsrpc();
			return basicGetAttachementsrpc();
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
		case CCSPackage.PORT_PS__ATTACHEMENTSRPC:
			setAttachementsrpc((AttachementSRPC) newValue);
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
		case CCSPackage.PORT_PS__ATTACHEMENTSRPC:
			setAttachementsrpc((AttachementSRPC) null);
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
		case CCSPackage.PORT_PS__ATTACHEMENTSRPC:
			return attachementsrpc != null;
		}
		return super.eIsSet(featureID);
	}

} //PortPSImpl
