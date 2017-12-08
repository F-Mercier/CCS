/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Serv2ServBinding;
import cCS.ServConf2ServCompConfP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serv Conf2 Serv Comp Conf P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServConf2ServCompConfPImpl#getServ2servbinding <em>Serv2servbinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServConf2ServCompConfPImpl extends PPConfImpl implements ServConf2ServCompConfP {
	/**
	 * The cached value of the '{@link #getServ2servbinding() <em>Serv2servbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServ2servbinding()
	 * @generated
	 * @ordered
	 */
	protected Serv2ServBinding serv2servbinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServConf2ServCompConfPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERV_CONF2_SERV_COMP_CONF_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serv2ServBinding getServ2servbinding() {
		if (serv2servbinding != null && serv2servbinding.eIsProxy()) {
			InternalEObject oldServ2servbinding = (InternalEObject) serv2servbinding;
			serv2servbinding = (Serv2ServBinding) eResolveProxy(oldServ2servbinding);
			if (serv2servbinding != oldServ2servbinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, oldServ2servbinding,
							serv2servbinding));
			}
		}
		return serv2servbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serv2ServBinding basicGetServ2servbinding() {
		return serv2servbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServ2servbinding(Serv2ServBinding newServ2servbinding, NotificationChain msgs) {
		Serv2ServBinding oldServ2servbinding = serv2servbinding;
		serv2servbinding = newServ2servbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, oldServ2servbinding, newServ2servbinding);
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
	public void setServ2servbinding(Serv2ServBinding newServ2servbinding) {
		if (newServ2servbinding != serv2servbinding) {
			NotificationChain msgs = null;
			if (serv2servbinding != null)
				msgs = ((InternalEObject) serv2servbinding).eInverseRemove(this,
						CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP, Serv2ServBinding.class, msgs);
			if (newServ2servbinding != null)
				msgs = ((InternalEObject) newServ2servbinding).eInverseAdd(this,
						CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP, Serv2ServBinding.class, msgs);
			msgs = basicSetServ2servbinding(newServ2servbinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, newServ2servbinding,
					newServ2servbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			if (serv2servbinding != null)
				msgs = ((InternalEObject) serv2servbinding).eInverseRemove(this,
						CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP, Serv2ServBinding.class, msgs);
			return basicSetServ2servbinding((Serv2ServBinding) otherEnd, msgs);
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
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			return basicSetServ2servbinding(null, msgs);
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
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			if (resolve)
				return getServ2servbinding();
			return basicGetServ2servbinding();
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
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			setServ2servbinding((Serv2ServBinding) newValue);
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
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			setServ2servbinding((Serv2ServBinding) null);
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
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING:
			return serv2servbinding != null;
		}
		return super.eIsSet(featureID);
	}

} //ServConf2ServCompConfPImpl
