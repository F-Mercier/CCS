/**
 */
package cCS.impl;

import cCS.AttachementsRPCServ;
import cCS.CCSPackage;
import cCS.PortRS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PortRSImpl#getAttachementsrpcserv <em>Attachementsrpcserv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortRSImpl extends RPCompImpl implements PortRS {
	/**
	 * The cached value of the '{@link #getAttachementsrpcserv() <em>Attachementsrpcserv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementsrpcserv()
	 * @generated
	 * @ordered
	 */
	protected AttachementsRPCServ attachementsrpcserv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PORT_RS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementsRPCServ getAttachementsrpcserv() {
		if (attachementsrpcserv != null && attachementsrpcserv.eIsProxy()) {
			InternalEObject oldAttachementsrpcserv = (InternalEObject) attachementsrpcserv;
			attachementsrpcserv = (AttachementsRPCServ) eResolveProxy(oldAttachementsrpcserv);
			if (attachementsrpcserv != oldAttachementsrpcserv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV,
							oldAttachementsrpcserv, attachementsrpcserv));
			}
		}
		return attachementsrpcserv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementsRPCServ basicGetAttachementsrpcserv() {
		return attachementsrpcserv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachementsrpcserv(AttachementsRPCServ newAttachementsrpcserv) {
		AttachementsRPCServ oldAttachementsrpcserv = attachementsrpcserv;
		attachementsrpcserv = newAttachementsrpcserv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV,
					oldAttachementsrpcserv, attachementsrpcserv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV:
			if (resolve)
				return getAttachementsrpcserv();
			return basicGetAttachementsrpcserv();
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
		case CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV:
			setAttachementsrpcserv((AttachementsRPCServ) newValue);
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
		case CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV:
			setAttachementsrpcserv((AttachementsRPCServ) null);
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
		case CCSPackage.PORT_RS__ATTACHEMENTSRPCSERV:
			return attachementsrpcserv != null;
		}
		return super.eIsSet(featureID);
	}

} //PortRSImpl
