/**
 */
package cCS.impl;

import cCS.AGamma2Connect;
import cCS.CCSPackage;
import cCS.PGamma2Connect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGamma2 Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PGamma2ConnectImpl#getAgamma2connect <em>Agamma2connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGamma2ConnectImpl extends RPCompImpl implements PGamma2Connect {
	/**
	 * The cached value of the '{@link #getAgamma2connect() <em>Agamma2connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgamma2connect()
	 * @generated
	 * @ordered
	 */
	protected AGamma2Connect agamma2connect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGamma2ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PGAMMA2_CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2Connect getAgamma2connect() {
		if (agamma2connect != null && agamma2connect.eIsProxy()) {
			InternalEObject oldAgamma2connect = (InternalEObject) agamma2connect;
			agamma2connect = (AGamma2Connect) eResolveProxy(oldAgamma2connect);
			if (agamma2connect != oldAgamma2connect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT, oldAgamma2connect, agamma2connect));
			}
		}
		return agamma2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2Connect basicGetAgamma2connect() {
		return agamma2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgamma2connect(AGamma2Connect newAgamma2connect) {
		AGamma2Connect oldAgamma2connect = agamma2connect;
		agamma2connect = newAgamma2connect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT,
					oldAgamma2connect, agamma2connect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT:
			if (resolve)
				return getAgamma2connect();
			return basicGetAgamma2connect();
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
		case CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT:
			setAgamma2connect((AGamma2Connect) newValue);
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
		case CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT:
			setAgamma2connect((AGamma2Connect) null);
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
		case CCSPackage.PGAMMA2_CONNECT__AGAMMA2CONNECT:
			return agamma2connect != null;
		}
		return super.eIsSet(featureID);
	}

} //PGamma2ConnectImpl
