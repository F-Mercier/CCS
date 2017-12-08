/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Serv2ServBinding;
import cCS.ServConf2ServCompCompP;
import cCS.ServConf2ServCompConfP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serv2 Serv Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.Serv2ServBindingImpl#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}</li>
 *   <li>{@link cCS.impl.Serv2ServBindingImpl#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Serv2ServBindingImpl extends PBImpl implements Serv2ServBinding {
	/**
	 * The cached value of the '{@link #getServconf2servcompconfp() <em>Servconf2servcompconfp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2servcompconfp()
	 * @generated
	 * @ordered
	 */
	protected ServConf2ServCompConfP servconf2servcompconfp;

	/**
	 * The cached value of the '{@link #getServconf2servcompcompp() <em>Servconf2servcompcompp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2servcompcompp()
	 * @generated
	 * @ordered
	 */
	protected ServConf2ServCompCompP servconf2servcompcompp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serv2ServBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERV2_SERV_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompConfP getServconf2servcompconfp() {
		if (servconf2servcompconfp != null && servconf2servcompconfp.eIsProxy()) {
			InternalEObject oldServconf2servcompconfp = (InternalEObject) servconf2servcompconfp;
			servconf2servcompconfp = (ServConf2ServCompConfP) eResolveProxy(oldServconf2servcompconfp);
			if (servconf2servcompconfp != oldServconf2servcompconfp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP, oldServconf2servcompconfp,
							servconf2servcompconfp));
			}
		}
		return servconf2servcompconfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompConfP basicGetServconf2servcompconfp() {
		return servconf2servcompconfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServconf2servcompconfp(ServConf2ServCompConfP newServconf2servcompconfp,
			NotificationChain msgs) {
		ServConf2ServCompConfP oldServconf2servcompconfp = servconf2servcompconfp;
		servconf2servcompconfp = newServconf2servcompconfp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP, oldServconf2servcompconfp,
					newServconf2servcompconfp);
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
	public void setServconf2servcompconfp(ServConf2ServCompConfP newServconf2servcompconfp) {
		if (newServconf2servcompconfp != servconf2servcompconfp) {
			NotificationChain msgs = null;
			if (servconf2servcompconfp != null)
				msgs = ((InternalEObject) servconf2servcompconfp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, ServConf2ServCompConfP.class, msgs);
			if (newServconf2servcompconfp != null)
				msgs = ((InternalEObject) newServconf2servcompconfp).eInverseAdd(this,
						CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, ServConf2ServCompConfP.class, msgs);
			msgs = basicSetServconf2servcompconfp(newServconf2servcompconfp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP,
					newServconf2servcompconfp, newServconf2servcompconfp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompCompP getServconf2servcompcompp() {
		if (servconf2servcompcompp != null && servconf2servcompcompp.eIsProxy()) {
			InternalEObject oldServconf2servcompcompp = (InternalEObject) servconf2servcompcompp;
			servconf2servcompcompp = (ServConf2ServCompCompP) eResolveProxy(oldServconf2servcompcompp);
			if (servconf2servcompcompp != oldServconf2servcompcompp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP, oldServconf2servcompcompp,
							servconf2servcompcompp));
			}
		}
		return servconf2servcompcompp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompCompP basicGetServconf2servcompcompp() {
		return servconf2servcompcompp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServconf2servcompcompp(ServConf2ServCompCompP newServconf2servcompcompp,
			NotificationChain msgs) {
		ServConf2ServCompCompP oldServconf2servcompcompp = servconf2servcompcompp;
		servconf2servcompcompp = newServconf2servcompcompp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP, oldServconf2servcompcompp,
					newServconf2servcompcompp);
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
	public void setServconf2servcompcompp(ServConf2ServCompCompP newServconf2servcompcompp) {
		if (newServconf2servcompcompp != servconf2servcompcompp) {
			NotificationChain msgs = null;
			if (servconf2servcompcompp != null)
				msgs = ((InternalEObject) servconf2servcompcompp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING, ServConf2ServCompCompP.class, msgs);
			if (newServconf2servcompcompp != null)
				msgs = ((InternalEObject) newServconf2servcompcompp).eInverseAdd(this,
						CCSPackage.SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING, ServConf2ServCompCompP.class, msgs);
			msgs = basicSetServconf2servcompcompp(newServconf2servcompcompp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP,
					newServconf2servcompcompp, newServconf2servcompcompp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			if (servconf2servcompconfp != null)
				msgs = ((InternalEObject) servconf2servcompconfp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING, ServConf2ServCompConfP.class, msgs);
			return basicSetServconf2servcompconfp((ServConf2ServCompConfP) otherEnd, msgs);
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			if (servconf2servcompcompp != null)
				msgs = ((InternalEObject) servconf2servcompcompp).eInverseRemove(this,
						CCSPackage.SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING, ServConf2ServCompCompP.class, msgs);
			return basicSetServconf2servcompcompp((ServConf2ServCompCompP) otherEnd, msgs);
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
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			return basicSetServconf2servcompconfp(null, msgs);
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			return basicSetServconf2servcompcompp(null, msgs);
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
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			if (resolve)
				return getServconf2servcompconfp();
			return basicGetServconf2servcompconfp();
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			if (resolve)
				return getServconf2servcompcompp();
			return basicGetServconf2servcompcompp();
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
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			setServconf2servcompconfp((ServConf2ServCompConfP) newValue);
			return;
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			setServconf2servcompcompp((ServConf2ServCompCompP) newValue);
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
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			setServconf2servcompconfp((ServConf2ServCompConfP) null);
			return;
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			setServconf2servcompcompp((ServConf2ServCompCompP) null);
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
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP:
			return servconf2servcompconfp != null;
		case CCSPackage.SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP:
			return servconf2servcompcompp != null;
		}
		return super.eIsSet(featureID);
	}

} //Serv2ServBindingImpl
