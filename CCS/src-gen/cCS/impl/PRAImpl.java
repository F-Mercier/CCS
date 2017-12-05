/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PPComp;
import cCS.PRA;
import cCS.RR;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PRAImpl#getPp <em>Pp</em>}</li>
 *   <li>{@link cCS.impl.PRAImpl#getRr <em>Rr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRAImpl extends MinimalEObjectImpl.Container implements PRA {
	/**
	 * The cached value of the '{@link #getPp() <em>Pp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected PPComp pp;

	/**
	 * The cached value of the '{@link #getRr() <em>Rr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRr()
	 * @generated
	 * @ordered
	 */
	protected RR rr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPComp getPp() {
		if (pp != null && pp.eIsProxy()) {
			InternalEObject oldPp = (InternalEObject) pp;
			pp = (PPComp) eResolveProxy(oldPp);
			if (pp != oldPp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PRA__PP, oldPp, pp));
			}
		}
		return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPComp basicGetPp() {
		return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPp(PPComp newPp, NotificationChain msgs) {
		PPComp oldPp = pp;
		pp = newPp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PRA__PP, oldPp,
					newPp);
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
	public void setPp(PPComp newPp) {
		if (newPp != pp) {
			NotificationChain msgs = null;
			if (pp != null)
				msgs = ((InternalEObject) pp).eInverseRemove(this, CCSPackage.PP_COMP__PRA, PPComp.class, msgs);
			if (newPp != null)
				msgs = ((InternalEObject) newPp).eInverseAdd(this, CCSPackage.PP_COMP__PRA, PPComp.class, msgs);
			msgs = basicSetPp(newPp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PRA__PP, newPp, newPp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RR getRr() {
		if (rr != null && rr.eIsProxy()) {
			InternalEObject oldRr = (InternalEObject) rr;
			rr = (RR) eResolveProxy(oldRr);
			if (rr != oldRr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PRA__RR, oldRr, rr));
			}
		}
		return rr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RR basicGetRr() {
		return rr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRr(RR newRr, NotificationChain msgs) {
		RR oldRr = rr;
		rr = newRr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PRA__RR, oldRr,
					newRr);
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
	public void setRr(RR newRr) {
		if (newRr != rr) {
			NotificationChain msgs = null;
			if (rr != null)
				msgs = ((InternalEObject) rr).eInverseRemove(this, CCSPackage.RR__PRA, RR.class, msgs);
			if (newRr != null)
				msgs = ((InternalEObject) newRr).eInverseAdd(this, CCSPackage.RR__PRA, RR.class, msgs);
			msgs = basicSetRr(newRr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PRA__RR, newRr, newRr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PRA__PP:
			if (pp != null)
				msgs = ((InternalEObject) pp).eInverseRemove(this, CCSPackage.PP_COMP__PRA, PPComp.class, msgs);
			return basicSetPp((PPComp) otherEnd, msgs);
		case CCSPackage.PRA__RR:
			if (rr != null)
				msgs = ((InternalEObject) rr).eInverseRemove(this, CCSPackage.RR__PRA, RR.class, msgs);
			return basicSetRr((RR) otherEnd, msgs);
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
		case CCSPackage.PRA__PP:
			return basicSetPp(null, msgs);
		case CCSPackage.PRA__RR:
			return basicSetRr(null, msgs);
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
		case CCSPackage.PRA__PP:
			if (resolve)
				return getPp();
			return basicGetPp();
		case CCSPackage.PRA__RR:
			if (resolve)
				return getRr();
			return basicGetRr();
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
		case CCSPackage.PRA__PP:
			setPp((PPComp) newValue);
			return;
		case CCSPackage.PRA__RR:
			setRr((RR) newValue);
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
		case CCSPackage.PRA__PP:
			setPp((PPComp) null);
			return;
		case CCSPackage.PRA__RR:
			setRr((RR) null);
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
		case CCSPackage.PRA__PP:
			return pp != null;
		case CCSPackage.PRA__RR:
			return rr != null;
		}
		return super.eIsSet(featureID);
	}

} //PRAImpl
