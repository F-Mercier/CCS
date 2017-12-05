/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.RB;
import cCS.RPConf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RP Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RPConfImpl#getRb <em>Rb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPConfImpl extends MinimalEObjectImpl.Container implements RPConf {
	/**
	 * The cached value of the '{@link #getRb() <em>Rb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRb()
	 * @generated
	 * @ordered
	 */
	protected RB rb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RP_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RB getRb() {
		if (rb != null && rb.eIsProxy()) {
			InternalEObject oldRb = (InternalEObject) rb;
			rb = (RB) eResolveProxy(oldRb);
			if (rb != oldRb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RP_CONF__RB, oldRb, rb));
			}
		}
		return rb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RB basicGetRb() {
		return rb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRb(RB newRb, NotificationChain msgs) {
		RB oldRb = rb;
		rb = newRb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RP_CONF__RB,
					oldRb, newRb);
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
	public void setRb(RB newRb) {
		if (newRb != rb) {
			NotificationChain msgs = null;
			if (rb != null)
				msgs = ((InternalEObject) rb).eInverseRemove(this, CCSPackage.RB__RP2, RB.class, msgs);
			if (newRb != null)
				msgs = ((InternalEObject) newRb).eInverseAdd(this, CCSPackage.RB__RP2, RB.class, msgs);
			msgs = basicSetRb(newRb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RP_CONF__RB, newRb, newRb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RP_CONF__RB:
			if (rb != null)
				msgs = ((InternalEObject) rb).eInverseRemove(this, CCSPackage.RB__RP2, RB.class, msgs);
			return basicSetRb((RB) otherEnd, msgs);
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
		case CCSPackage.RP_CONF__RB:
			return basicSetRb(null, msgs);
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
		case CCSPackage.RP_CONF__RB:
			if (resolve)
				return getRb();
			return basicGetRb();
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
		case CCSPackage.RP_CONF__RB:
			setRb((RB) newValue);
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
		case CCSPackage.RP_CONF__RB:
			setRb((RB) null);
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
		case CCSPackage.RP_CONF__RB:
			return rb != null;
		}
		return super.eIsSet(featureID);
	}

} //RPConfImpl
