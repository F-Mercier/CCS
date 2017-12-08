/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Sys2ClientBinding;
import cCS.Sys2ClientSP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys2 Client SP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.Sys2ClientSPImpl#getSys2clientbinding <em>Sys2clientbinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sys2ClientSPImpl extends PPConfImpl implements Sys2ClientSP {
	/**
	 * The cached value of the '{@link #getSys2clientbinding() <em>Sys2clientbinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientbinding()
	 * @generated
	 * @ordered
	 */
	protected Sys2ClientBinding sys2clientbinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sys2ClientSPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SYS2_CLIENT_SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientBinding getSys2clientbinding() {
		if (sys2clientbinding != null && sys2clientbinding.eIsProxy()) {
			InternalEObject oldSys2clientbinding = (InternalEObject) sys2clientbinding;
			sys2clientbinding = (Sys2ClientBinding) eResolveProxy(oldSys2clientbinding);
			if (sys2clientbinding != oldSys2clientbinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING, oldSys2clientbinding, sys2clientbinding));
			}
		}
		return sys2clientbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientBinding basicGetSys2clientbinding() {
		return sys2clientbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSys2clientbinding(Sys2ClientBinding newSys2clientbinding, NotificationChain msgs) {
		Sys2ClientBinding oldSys2clientbinding = sys2clientbinding;
		sys2clientbinding = newSys2clientbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING, oldSys2clientbinding, newSys2clientbinding);
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
	public void setSys2clientbinding(Sys2ClientBinding newSys2clientbinding) {
		if (newSys2clientbinding != sys2clientbinding) {
			NotificationChain msgs = null;
			if (sys2clientbinding != null)
				msgs = ((InternalEObject) sys2clientbinding).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP, Sys2ClientBinding.class, msgs);
			if (newSys2clientbinding != null)
				msgs = ((InternalEObject) newSys2clientbinding).eInverseAdd(this,
						CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP, Sys2ClientBinding.class, msgs);
			msgs = basicSetSys2clientbinding(newSys2clientbinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING,
					newSys2clientbinding, newSys2clientbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			if (sys2clientbinding != null)
				msgs = ((InternalEObject) sys2clientbinding).eInverseRemove(this,
						CCSPackage.SYS2_CLIENT_BINDING__SYS2CLIENTSP, Sys2ClientBinding.class, msgs);
			return basicSetSys2clientbinding((Sys2ClientBinding) otherEnd, msgs);
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
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			return basicSetSys2clientbinding(null, msgs);
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
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			if (resolve)
				return getSys2clientbinding();
			return basicGetSys2clientbinding();
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
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			setSys2clientbinding((Sys2ClientBinding) newValue);
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
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			setSys2clientbinding((Sys2ClientBinding) null);
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
		case CCSPackage.SYS2_CLIENT_SP__SYS2CLIENTBINDING:
			return sys2clientbinding != null;
		}
		return super.eIsSet(featureID);
	}

} //Sys2ClientSPImpl
