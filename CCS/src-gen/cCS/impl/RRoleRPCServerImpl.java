/**
 */
package cCS.impl;

import cCS.AttachementSRPC;
import cCS.CCSPackage;
import cCS.RRoleRPCServer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RRole RPC Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RRoleRPCServerImpl#getAttachementsrpc <em>Attachementsrpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RRoleRPCServerImpl extends RRImpl implements RRoleRPCServer {
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
	protected RRoleRPCServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RROLE_RPC_SERVER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC, oldAttachementsrpc, attachementsrpc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC,
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
		case CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC:
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
		case CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC:
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
		case CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC:
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
		case CCSPackage.RROLE_RPC_SERVER__ATTACHEMENTSRPC:
			return attachementsrpc != null;
		}
		return super.eIsSet(featureID);
	}

} //RRoleRPCServerImpl
