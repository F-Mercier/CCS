/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Sys2ClientBinding;
import cCS.Sys2ClientCP;
import cCS.Sys2ClientSP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys2 Client Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.Sys2ClientBindingImpl#getSys2clientsp <em>Sys2clientsp</em>}</li>
 *   <li>{@link cCS.impl.Sys2ClientBindingImpl#getSys2clientcp <em>Sys2clientcp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sys2ClientBindingImpl extends PBImpl implements Sys2ClientBinding {
	/**
	 * The cached value of the '{@link #getSys2clientsp() <em>Sys2clientsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientsp()
	 * @generated
	 * @ordered
	 */
	protected Sys2ClientSP sys2clientsp;

	/**
	 * The cached value of the '{@link #getSys2clientcp() <em>Sys2clientcp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientcp()
	 * @generated
	 * @ordered
	 */
	protected Sys2ClientCP sys2clientcp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sys2ClientBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SYS2_CLIENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientSP getSys2clientsp() {
		if (sys2clientsp != null && sys2clientsp.eIsProxy()) {
			InternalEObject oldSys2clientsp = (InternalEObject) sys2clientsp;
			sys2clientsp = (Sys2ClientSP) eResolveProxy(oldSys2clientsp);
			if (sys2clientsp != oldSys2clientsp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP, oldSys2clientsp, sys2clientsp));
			}
		}
		return sys2clientsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientSP basicGetSys2clientsp() {
		return sys2clientsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSys2clientsp(Sys2ClientSP newSys2clientsp, NotificationChain msgs) {
		Sys2ClientSP oldSys2clientsp = sys2clientsp;
		sys2clientsp = newSys2clientsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP, oldSys2clientsp, newSys2clientsp);
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
	public void setSys2clientsp(Sys2ClientSP newSys2clientsp) {
		if (newSys2clientsp != sys2clientsp) {
			NotificationChain msgs = null;
			if (sys2clientsp != null)
				msgs = ((InternalEObject) sys2clientsp).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING, Sys2ClientSP.class, msgs);
			if (newSys2clientsp != null)
				msgs = ((InternalEObject) newSys2clientsp).eInverseAdd(this,
						CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING, Sys2ClientSP.class, msgs);
			msgs = basicSetSys2clientsp(newSys2clientsp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP,
					newSys2clientsp, newSys2clientsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientCP getSys2clientcp() {
		if (sys2clientcp != null && sys2clientcp.eIsProxy()) {
			InternalEObject oldSys2clientcp = (InternalEObject) sys2clientcp;
			sys2clientcp = (Sys2ClientCP) eResolveProxy(oldSys2clientcp);
			if (sys2clientcp != oldSys2clientcp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP, oldSys2clientcp, sys2clientcp));
			}
		}
		return sys2clientcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientCP basicGetSys2clientcp() {
		return sys2clientcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSys2clientcp(Sys2ClientCP newSys2clientcp, NotificationChain msgs) {
		Sys2ClientCP oldSys2clientcp = sys2clientcp;
		sys2clientcp = newSys2clientcp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP, oldSys2clientcp, newSys2clientcp);
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
	public void setSys2clientcp(Sys2ClientCP newSys2clientcp) {
		if (newSys2clientcp != sys2clientcp) {
			NotificationChain msgs = null;
			if (sys2clientcp != null)
				msgs = ((InternalEObject) sys2clientcp).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_CP__SYS2CLIENTBINDING, Sys2ClientCP.class, msgs);
			if (newSys2clientcp != null)
				msgs = ((InternalEObject) newSys2clientcp).eInverseAdd(this,
						CCSPackage.SYS2_CLIENT_CP__SYS2CLIENTBINDING, Sys2ClientCP.class, msgs);
			msgs = basicSetSys2clientcp(newSys2clientcp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP,
					newSys2clientcp, newSys2clientcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			if (sys2clientsp != null)
				msgs = ((InternalEObject) sys2clientsp).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING, Sys2ClientSP.class, msgs);
			return basicSetSys2clientsp((Sys2ClientSP) otherEnd, msgs);
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			if (sys2clientcp != null)
				msgs = ((InternalEObject) sys2clientcp).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_CP__SYS2CLIENTBINDING, Sys2ClientCP.class, msgs);
			return basicSetSys2clientcp((Sys2ClientCP) otherEnd, msgs);
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
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			return basicSetSys2clientsp(null, msgs);
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			return basicSetSys2clientcp(null, msgs);
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
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			if (resolve)
				return getSys2clientsp();
			return basicGetSys2clientsp();
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			if (resolve)
				return getSys2clientcp();
			return basicGetSys2clientcp();
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
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			setSys2clientsp((Sys2ClientSP) newValue);
			return;
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			setSys2clientcp((Sys2ClientCP) newValue);
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
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			setSys2clientsp((Sys2ClientSP) null);
			return;
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			setSys2clientcp((Sys2ClientCP) null);
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
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP:
			return sys2clientsp != null;
		case CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTCP:
			return sys2clientcp != null;
		}
		return super.eIsSet(featureID);
	}

} //Sys2ClientBindingImpl
