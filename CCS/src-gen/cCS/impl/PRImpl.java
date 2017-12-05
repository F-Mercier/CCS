/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PR;
import cCS.RPA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PRImpl#getRpa <em>Rpa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRImpl extends MinimalEObjectImpl.Container implements PR {
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
	protected PRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PR__RPA, oldRpa, rpa));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PR__RPA, oldRpa,
					newRpa);
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
				msgs = ((InternalEObject) rpa).eInverseRemove(this, CCSPackage.RPA__PR, RPA.class, msgs);
			if (newRpa != null)
				msgs = ((InternalEObject) newRpa).eInverseAdd(this, CCSPackage.RPA__PR, RPA.class, msgs);
			msgs = basicSetRpa(newRpa, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PR__RPA, newRpa, newRpa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PR__RPA:
			if (rpa != null)
				msgs = ((InternalEObject) rpa).eInverseRemove(this, CCSPackage.RPA__PR, RPA.class, msgs);
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
		case CCSPackage.PR__RPA:
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
		case CCSPackage.PR__RPA:
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
		case CCSPackage.PR__RPA:
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
		case CCSPackage.PR__RPA:
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
		case CCSPackage.PR__RPA:
			return rpa != null;
		}
		return super.eIsSet(featureID);
	}

} //PRImpl
