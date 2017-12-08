/**
 */
package cCS.impl;

import cCS.AAlpha2Connect;
import cCS.CCSPackage;
import cCS.PAlpha2Connect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAlpha2 Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PAlpha2ConnectImpl#getAalpha2connect <em>Aalpha2connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PAlpha2ConnectImpl extends RPCompImpl implements PAlpha2Connect {
	/**
	 * The cached value of the '{@link #getAalpha2connect() <em>Aalpha2connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAalpha2connect()
	 * @generated
	 * @ordered
	 */
	protected AAlpha2Connect aalpha2connect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAlpha2ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PALPHA2_CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Connect getAalpha2connect() {
		if (aalpha2connect != null && aalpha2connect.eIsProxy()) {
			InternalEObject oldAalpha2connect = (InternalEObject) aalpha2connect;
			aalpha2connect = (AAlpha2Connect) eResolveProxy(oldAalpha2connect);
			if (aalpha2connect != oldAalpha2connect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT, oldAalpha2connect, aalpha2connect));
			}
		}
		return aalpha2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Connect basicGetAalpha2connect() {
		return aalpha2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAalpha2connect(AAlpha2Connect newAalpha2connect) {
		AAlpha2Connect oldAalpha2connect = aalpha2connect;
		aalpha2connect = newAalpha2connect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT,
					oldAalpha2connect, aalpha2connect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT:
			if (resolve)
				return getAalpha2connect();
			return basicGetAalpha2connect();
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
		case CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT:
			setAalpha2connect((AAlpha2Connect) newValue);
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
		case CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT:
			setAalpha2connect((AAlpha2Connect) null);
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
		case CCSPackage.PALPHA2_CONNECT__AALPHA2CONNECT:
			return aalpha2connect != null;
		}
		return super.eIsSet(featureID);
	}

} //PAlpha2ConnectImpl
