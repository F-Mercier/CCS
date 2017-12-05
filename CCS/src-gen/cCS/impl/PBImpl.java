/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PB;
import cCS.PPComp;
import cCS.PPConf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PBImpl#getPp <em>Pp</em>}</li>
 *   <li>{@link cCS.impl.PBImpl#getPp2 <em>Pp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PBImpl extends MinimalEObjectImpl.Container implements PB {
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
	 * The cached value of the '{@link #getPp2() <em>Pp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp2()
	 * @generated
	 * @ordered
	 */
	protected PPConf pp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PB;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PB__PP, oldPp, pp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PB__PP, oldPp,
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
				msgs = ((InternalEObject) pp).eInverseRemove(this, CCSPackage.PP_COMP__PB, PPComp.class, msgs);
			if (newPp != null)
				msgs = ((InternalEObject) newPp).eInverseAdd(this, CCSPackage.PP_COMP__PB, PPComp.class, msgs);
			msgs = basicSetPp(newPp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PB__PP, newPp, newPp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPConf getPp2() {
		if (pp2 != null && pp2.eIsProxy()) {
			InternalEObject oldPp2 = (InternalEObject) pp2;
			pp2 = (PPConf) eResolveProxy(oldPp2);
			if (pp2 != oldPp2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PB__PP2, oldPp2, pp2));
			}
		}
		return pp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPConf basicGetPp2() {
		return pp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPp2(PPConf newPp2, NotificationChain msgs) {
		PPConf oldPp2 = pp2;
		pp2 = newPp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PB__PP2, oldPp2,
					newPp2);
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
	public void setPp2(PPConf newPp2) {
		if (newPp2 != pp2) {
			NotificationChain msgs = null;
			if (pp2 != null)
				msgs = ((InternalEObject) pp2).eInverseRemove(this, CCSPackage.PP_CONF__PB, PPConf.class, msgs);
			if (newPp2 != null)
				msgs = ((InternalEObject) newPp2).eInverseAdd(this, CCSPackage.PP_CONF__PB, PPConf.class, msgs);
			msgs = basicSetPp2(newPp2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PB__PP2, newPp2, newPp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PB__PP:
			if (pp != null)
				msgs = ((InternalEObject) pp).eInverseRemove(this, CCSPackage.PP_COMP__PB, PPComp.class, msgs);
			return basicSetPp((PPComp) otherEnd, msgs);
		case CCSPackage.PB__PP2:
			if (pp2 != null)
				msgs = ((InternalEObject) pp2).eInverseRemove(this, CCSPackage.PP_CONF__PB, PPConf.class, msgs);
			return basicSetPp2((PPConf) otherEnd, msgs);
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
		case CCSPackage.PB__PP:
			return basicSetPp(null, msgs);
		case CCSPackage.PB__PP2:
			return basicSetPp2(null, msgs);
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
		case CCSPackage.PB__PP:
			if (resolve)
				return getPp();
			return basicGetPp();
		case CCSPackage.PB__PP2:
			if (resolve)
				return getPp2();
			return basicGetPp2();
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
		case CCSPackage.PB__PP:
			setPp((PPComp) newValue);
			return;
		case CCSPackage.PB__PP2:
			setPp2((PPConf) newValue);
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
		case CCSPackage.PB__PP:
			setPp((PPComp) null);
			return;
		case CCSPackage.PB__PP2:
			setPp2((PPConf) null);
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
		case CCSPackage.PB__PP:
			return pp != null;
		case CCSPackage.PB__PP2:
			return pp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //PBImpl
