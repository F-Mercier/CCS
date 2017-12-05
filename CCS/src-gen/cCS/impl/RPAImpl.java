/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PR;
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
 * An implementation of the model object '<em><b>RPA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RPAImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link cCS.impl.RPAImpl#getPr <em>Pr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPAImpl extends MinimalEObjectImpl.Container implements RPA {
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
	 * The cached value of the '{@link #getPr() <em>Pr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPr()
	 * @generated
	 * @ordered
	 */
	protected PR pr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RPA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RPA__RP, oldRp, rp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RPA__RP, oldRp,
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
				msgs = ((InternalEObject) rp).eInverseRemove(this, CCSPackage.RP_COMP__RPA, RPComp.class, msgs);
			if (newRp != null)
				msgs = ((InternalEObject) newRp).eInverseAdd(this, CCSPackage.RP_COMP__RPA, RPComp.class, msgs);
			msgs = basicSetRp(newRp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RPA__RP, newRp, newRp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR getPr() {
		if (pr != null && pr.eIsProxy()) {
			InternalEObject oldPr = (InternalEObject) pr;
			pr = (PR) eResolveProxy(oldPr);
			if (pr != oldPr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RPA__PR, oldPr, pr));
			}
		}
		return pr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR basicGetPr() {
		return pr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPr(PR newPr, NotificationChain msgs) {
		PR oldPr = pr;
		pr = newPr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RPA__PR, oldPr,
					newPr);
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
	public void setPr(PR newPr) {
		if (newPr != pr) {
			NotificationChain msgs = null;
			if (pr != null)
				msgs = ((InternalEObject) pr).eInverseRemove(this, CCSPackage.PR__RPA, PR.class, msgs);
			if (newPr != null)
				msgs = ((InternalEObject) newPr).eInverseAdd(this, CCSPackage.PR__RPA, PR.class, msgs);
			msgs = basicSetPr(newPr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RPA__PR, newPr, newPr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RPA__RP:
			if (rp != null)
				msgs = ((InternalEObject) rp).eInverseRemove(this, CCSPackage.RP_COMP__RPA, RPComp.class, msgs);
			return basicSetRp((RPComp) otherEnd, msgs);
		case CCSPackage.RPA__PR:
			if (pr != null)
				msgs = ((InternalEObject) pr).eInverseRemove(this, CCSPackage.PR__RPA, PR.class, msgs);
			return basicSetPr((PR) otherEnd, msgs);
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
		case CCSPackage.RPA__RP:
			return basicSetRp(null, msgs);
		case CCSPackage.RPA__PR:
			return basicSetPr(null, msgs);
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
		case CCSPackage.RPA__RP:
			if (resolve)
				return getRp();
			return basicGetRp();
		case CCSPackage.RPA__PR:
			if (resolve)
				return getPr();
			return basicGetPr();
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
		case CCSPackage.RPA__RP:
			setRp((RPComp) newValue);
			return;
		case CCSPackage.RPA__PR:
			setPr((PR) newValue);
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
		case CCSPackage.RPA__RP:
			setRp((RPComp) null);
			return;
		case CCSPackage.RPA__PR:
			setPr((PR) null);
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
		case CCSPackage.RPA__RP:
			return rp != null;
		case CCSPackage.RPA__PR:
			return pr != null;
		}
		return super.eIsSet(featureID);
	}

} //RPAImpl
