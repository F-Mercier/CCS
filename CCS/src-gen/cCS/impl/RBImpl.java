/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.RB;
import cCS.RPComp;
import cCS.RPConf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RBImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link cCS.impl.RBImpl#getRp2 <em>Rp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBImpl extends MinimalEObjectImpl.Container implements RB {
	/**
	 * The cached value of the '{@link #getRp() <em>Rp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRp()
	 * @generated
	 * @ordered
	 */
	protected RPComp rp;

	/**
	 * The cached value of the '{@link #getRp2() <em>Rp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRp2()
	 * @generated
	 * @ordered
	 */
	protected RPConf rp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPComp getRp() {
		if (rp != null && rp.eIsProxy()) {
			InternalEObject oldRp = (InternalEObject) rp;
			rp = (RPComp) eResolveProxy(oldRp);
			if (rp != oldRp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RB__RP, oldRp, rp));
			}
		}
		return rp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPComp basicGetRp() {
		return rp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp(RPComp newRp, NotificationChain msgs) {
		RPComp oldRp = rp;
		rp = newRp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RB__RP, oldRp,
					newRp);
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
	public void setRp(RPComp newRp) {
		if (newRp != rp) {
			NotificationChain msgs = null;
			if (rp != null)
				msgs = ((InternalEObject) rp).eInverseRemove(this, CCSPackage.RP_COMP__RB, RPComp.class, msgs);
			if (newRp != null)
				msgs = ((InternalEObject) newRp).eInverseAdd(this, CCSPackage.RP_COMP__RB, RPComp.class, msgs);
			msgs = basicSetRp(newRp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RB__RP, newRp, newRp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPConf getRp2() {
		if (rp2 != null && rp2.eIsProxy()) {
			InternalEObject oldRp2 = (InternalEObject) rp2;
			rp2 = (RPConf) eResolveProxy(oldRp2);
			if (rp2 != oldRp2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RB__RP2, oldRp2, rp2));
			}
		}
		return rp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPConf basicGetRp2() {
		return rp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp2(RPConf newRp2, NotificationChain msgs) {
		RPConf oldRp2 = rp2;
		rp2 = newRp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RB__RP2, oldRp2,
					newRp2);
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
	public void setRp2(RPConf newRp2) {
		if (newRp2 != rp2) {
			NotificationChain msgs = null;
			if (rp2 != null)
				msgs = ((InternalEObject) rp2).eInverseRemove(this, CCSPackage.RP_CONF__RB, RPConf.class, msgs);
			if (newRp2 != null)
				msgs = ((InternalEObject) newRp2).eInverseAdd(this, CCSPackage.RP_CONF__RB, RPConf.class, msgs);
			msgs = basicSetRp2(newRp2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RB__RP2, newRp2, newRp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RB__RP:
			if (rp != null)
				msgs = ((InternalEObject) rp).eInverseRemove(this, CCSPackage.RP_COMP__RB, RPComp.class, msgs);
			return basicSetRp((RPComp) otherEnd, msgs);
		case CCSPackage.RB__RP2:
			if (rp2 != null)
				msgs = ((InternalEObject) rp2).eInverseRemove(this, CCSPackage.RP_CONF__RB, RPConf.class, msgs);
			return basicSetRp2((RPConf) otherEnd, msgs);
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
		case CCSPackage.RB__RP:
			return basicSetRp(null, msgs);
		case CCSPackage.RB__RP2:
			return basicSetRp2(null, msgs);
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
		case CCSPackage.RB__RP:
			if (resolve)
				return getRp();
			return basicGetRp();
		case CCSPackage.RB__RP2:
			if (resolve)
				return getRp2();
			return basicGetRp2();
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
		case CCSPackage.RB__RP:
			setRp((RPComp) newValue);
			return;
		case CCSPackage.RB__RP2:
			setRp2((RPConf) newValue);
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
		case CCSPackage.RB__RP:
			setRp((RPComp) null);
			return;
		case CCSPackage.RB__RP2:
			setRp2((RPConf) null);
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
		case CCSPackage.RB__RP:
			return rp != null;
		case CCSPackage.RB__RP2:
			return rp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //RBImpl
