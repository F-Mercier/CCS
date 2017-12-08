/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.ServConf2ConnectBinding;
import cCS.ServConf2ConnectConnectP;
import cCS.ServConf2ConnectServP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serv Conf2 Connect Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServConf2ConnectBindingImpl#getServconf2connectservp <em>Servconf2connectservp</em>}</li>
 *   <li>{@link cCS.impl.ServConf2ConnectBindingImpl#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServConf2ConnectBindingImpl extends PBImpl implements ServConf2ConnectBinding {
	/**
	 * The cached value of the '{@link #getServconf2connectservp() <em>Servconf2connectservp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2connectservp()
	 * @generated
	 * @ordered
	 */
	protected ServConf2ConnectServP servconf2connectservp;

	/**
	 * The cached value of the '{@link #getServconf2connectconnectp() <em>Servconf2connectconnectp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2connectconnectp()
	 * @generated
	 * @ordered
	 */
	protected ServConf2ConnectConnectP servconf2connectconnectp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServConf2ConnectBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERV_CONF2_CONNECT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectServP getServconf2connectservp() {
		if (servconf2connectservp != null && servconf2connectservp.eIsProxy()) {
			InternalEObject oldServconf2connectservp = (InternalEObject) servconf2connectservp;
			servconf2connectservp = (ServConf2ConnectServP) eResolveProxy(oldServconf2connectservp);
			if (servconf2connectservp != oldServconf2connectservp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP, oldServconf2connectservp,
							servconf2connectservp));
			}
		}
		return servconf2connectservp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectServP basicGetServconf2connectservp() {
		return servconf2connectservp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServconf2connectservp(ServConf2ConnectServP newServconf2connectservp,
			NotificationChain msgs) {
		ServConf2ConnectServP oldServconf2connectservp = servconf2connectservp;
		servconf2connectservp = newServconf2connectservp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP, oldServconf2connectservp,
					newServconf2connectservp);
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
	public void setServconf2connectservp(ServConf2ConnectServP newServconf2connectservp) {
		if (newServconf2connectservp != servconf2connectservp) {
			NotificationChain msgs = null;
			if (servconf2connectservp != null)
				msgs = ((InternalEObject) servconf2connectservp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING, ServConf2ConnectServP.class,
						msgs);
			if (newServconf2connectservp != null)
				msgs = ((InternalEObject) newServconf2connectservp).eInverseAdd(this,
						CCSPackage.SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING, ServConf2ConnectServP.class,
						msgs);
			msgs = basicSetServconf2connectservp(newServconf2connectservp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP, newServconf2connectservp,
					newServconf2connectservp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectConnectP getServconf2connectconnectp() {
		if (servconf2connectconnectp != null && servconf2connectconnectp.eIsProxy()) {
			InternalEObject oldServconf2connectconnectp = (InternalEObject) servconf2connectconnectp;
			servconf2connectconnectp = (ServConf2ConnectConnectP) eResolveProxy(oldServconf2connectconnectp);
			if (servconf2connectconnectp != oldServconf2connectconnectp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP,
							oldServconf2connectconnectp, servconf2connectconnectp));
			}
		}
		return servconf2connectconnectp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectConnectP basicGetServconf2connectconnectp() {
		return servconf2connectconnectp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServconf2connectconnectp(ServConf2ConnectConnectP newServconf2connectconnectp,
			NotificationChain msgs) {
		ServConf2ConnectConnectP oldServconf2connectconnectp = servconf2connectconnectp;
		servconf2connectconnectp = newServconf2connectconnectp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP, oldServconf2connectconnectp,
					newServconf2connectconnectp);
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
	public void setServconf2connectconnectp(ServConf2ConnectConnectP newServconf2connectconnectp) {
		if (newServconf2connectconnectp != servconf2connectconnectp) {
			NotificationChain msgs = null;
			if (servconf2connectconnectp != null)
				msgs = ((InternalEObject) servconf2connectconnectp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING,
						ServConf2ConnectConnectP.class, msgs);
			if (newServconf2connectconnectp != null)
				msgs = ((InternalEObject) newServconf2connectconnectp).eInverseAdd(this,
						CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING,
						ServConf2ConnectConnectP.class, msgs);
			msgs = basicSetServconf2connectconnectp(newServconf2connectconnectp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP, newServconf2connectconnectp,
					newServconf2connectconnectp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			if (servconf2connectservp != null)
				msgs = ((InternalEObject) servconf2connectservp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING, ServConf2ConnectServP.class,
						msgs);
			return basicSetServconf2connectservp((ServConf2ConnectServP) otherEnd, msgs);
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			if (servconf2connectconnectp != null)
				msgs = ((InternalEObject) servconf2connectconnectp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING,
						ServConf2ConnectConnectP.class, msgs);
			return basicSetServconf2connectconnectp((ServConf2ConnectConnectP) otherEnd, msgs);
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
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			return basicSetServconf2connectservp(null, msgs);
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			return basicSetServconf2connectconnectp(null, msgs);
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
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			if (resolve)
				return getServconf2connectservp();
			return basicGetServconf2connectservp();
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			if (resolve)
				return getServconf2connectconnectp();
			return basicGetServconf2connectconnectp();
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
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			setServconf2connectservp((ServConf2ConnectServP) newValue);
			return;
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			setServconf2connectconnectp((ServConf2ConnectConnectP) newValue);
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
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			setServconf2connectservp((ServConf2ConnectServP) null);
			return;
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			setServconf2connectconnectp((ServConf2ConnectConnectP) null);
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
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP:
			return servconf2connectservp != null;
		case CCSPackage.SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP:
			return servconf2connectconnectp != null;
		}
		return super.eIsSet(featureID);
	}

} //ServConf2ConnectBindingImpl
