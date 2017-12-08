/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.ServConf2ConnectBinding;
import cCS.ServConf2ConnectConnectP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serv Conf2 Connect Connect P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServConf2ConnectConnectPImpl#getServconf2connectbinding <em>Servconf2connectbinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServConf2ConnectConnectPImpl extends MinimalEObjectImpl.Container implements ServConf2ConnectConnectP {
	/**
	 * The cached value of the '{@link #getServconf2connectbinding() <em>Servconf2connectbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2connectbinding()
	 * @generated
	 * @ordered
	 */
	protected ServConf2ConnectBinding servconf2connectbinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServConf2ConnectConnectPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERV_CONF2_CONNECT_CONNECT_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectBinding getServconf2connectbinding() {
		if (servconf2connectbinding != null && servconf2connectbinding.eIsProxy()) {
			InternalEObject oldServconf2connectbinding = (InternalEObject) servconf2connectbinding;
			servconf2connectbinding = (ServConf2ConnectBinding) eResolveProxy(oldServconf2connectbinding);
			if (servconf2connectbinding != oldServconf2connectbinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING,
							oldServconf2connectbinding, servconf2connectbinding));
			}
		}
		return servconf2connectbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectBinding basicGetServconf2connectbinding() {
		return servconf2connectbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServconf2connectbinding(ServConf2ConnectBinding newServconf2connectbinding,
			NotificationChain msgs) {
		ServConf2ConnectBinding oldServconf2connectbinding = servconf2connectbinding;
		servconf2connectbinding = newServconf2connectbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING, oldServconf2connectbinding,
					newServconf2connectbinding);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServconf2connectbinding(ServConf2ConnectBinding newServconf2connectbinding) {
		if (newServconf2connectbinding != servconf2connectbinding) {
			NotificationChain msgs = null;
			if (servconf2connectbinding != null)
				msgs = ((InternalEObject) servconf2connectbinding).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP, ServConf2ConnectBinding.class,
						msgs);
			if (newServconf2connectbinding != null)
				msgs = ((InternalEObject) newServconf2connectbinding).eInverseAdd(this,
						CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP, ServConf2ConnectBinding.class,
						msgs);
			msgs = basicSetServconf2connectbinding(newServconf2connectbinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING, newServconf2connectbinding,
					newServconf2connectbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			if (servconf2connectbinding != null)
				msgs = ((InternalEObject) servconf2connectbinding).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP, ServConf2ConnectBinding.class,
						msgs);
			return basicSetServconf2connectbinding((ServConf2ConnectBinding) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			return basicSetServconf2connectbinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			if (resolve)
				return getServconf2connectbinding();
			return basicGetServconf2connectbinding();
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
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			setServconf2connectbinding((ServConf2ConnectBinding) newValue);
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
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			setServconf2connectbinding((ServConf2ConnectBinding) null);
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
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING:
			return servconf2connectbinding != null;
		}
		return super.eIsSet(featureID);
	}

} //ServConf2ConnectConnectPImpl
