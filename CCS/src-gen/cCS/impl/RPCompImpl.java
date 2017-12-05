/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.RB;
import cCS.RPA;
import cCS.RPComp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RP Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RPCompImpl#getRb <em>Rb</em>}</li>
 *   <li>{@link cCS.impl.RPCompImpl#getRpa <em>Rpa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCompImpl extends MinimalEObjectImpl.Container implements RPComp {
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
	 * The cached value of the '{@link #getRpa() <em>Rpa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpa()
	 * @generated
	 * @ordered
	 */
	protected RPA rpa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RP_COMP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RP_COMP__RB, oldRb, rb));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RP_COMP__RB,
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
				msgs = ((InternalEObject) rb).eInverseRemove(this, CCSPackage.RB__RP, RB.class, msgs);
			if (newRb != null)
				msgs = ((InternalEObject) newRb).eInverseAdd(this, CCSPackage.RB__RP, RB.class, msgs);
			msgs = basicSetRb(newRb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RP_COMP__RB, newRb, newRb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPA getRpa() {
		if (rpa != null && rpa.eIsProxy()) {
			InternalEObject oldRpa = (InternalEObject) rpa;
			rpa = (RPA) eResolveProxy(oldRpa);
			if (rpa != oldRpa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RP_COMP__RPA, oldRpa, rpa));
			}
		}
		return rpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPA basicGetRpa() {
		return rpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpa(RPA newRpa, NotificationChain msgs) {
		RPA oldRpa = rpa;
		rpa = newRpa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RP_COMP__RPA,
					oldRpa, newRpa);
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
	public void setRpa(RPA newRpa) {
		if (newRpa != rpa) {
			NotificationChain msgs = null;
			if (rpa != null)
				msgs = ((InternalEObject) rpa).eInverseRemove(this, CCSPackage.RPA__RP, RPA.class, msgs);
			if (newRpa != null)
				msgs = ((InternalEObject) newRpa).eInverseAdd(this, CCSPackage.RPA__RP, RPA.class, msgs);
			msgs = basicSetRpa(newRpa, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RP_COMP__RPA, newRpa, newRpa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RP_COMP__RB:
			if (rb != null)
				msgs = ((InternalEObject) rb).eInverseRemove(this, CCSPackage.RB__RP, RB.class, msgs);
			return basicSetRb((RB) otherEnd, msgs);
		case CCSPackage.RP_COMP__RPA:
			if (rpa != null)
				msgs = ((InternalEObject) rpa).eInverseRemove(this, CCSPackage.RPA__RP, RPA.class, msgs);
			return basicSetRpa((RPA) otherEnd, msgs);
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
		case CCSPackage.RP_COMP__RB:
			return basicSetRb(null, msgs);
		case CCSPackage.RP_COMP__RPA:
			return basicSetRpa(null, msgs);
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
		case CCSPackage.RP_COMP__RB:
			if (resolve)
				return getRb();
			return basicGetRb();
		case CCSPackage.RP_COMP__RPA:
			if (resolve)
				return getRpa();
			return basicGetRpa();
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
		case CCSPackage.RP_COMP__RB:
			setRb((RB) newValue);
			return;
		case CCSPackage.RP_COMP__RPA:
			setRpa((RPA) newValue);
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
		case CCSPackage.RP_COMP__RB:
			setRb((RB) null);
			return;
		case CCSPackage.RP_COMP__RPA:
			setRpa((RPA) null);
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
		case CCSPackage.RP_COMP__RB:
			return rb != null;
		case CCSPackage.RP_COMP__RPA:
			return rpa != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCompImpl
