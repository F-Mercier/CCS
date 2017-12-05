/**
 */
package cCS.impl;

import cCS.CCSPackage;
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
 * An implementation of the model object '<em><b>RR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RRImpl#getPra <em>Pra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RRImpl extends MinimalEObjectImpl.Container implements RR {
	/**
	 * The cached value of the '{@link #getPra() <em>Pra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPra()
	 * @generated
	 * @ordered
	 */
	protected PRA pra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA getPra() {
		if (pra != null && pra.eIsProxy()) {
			InternalEObject oldPra = (InternalEObject) pra;
			pra = (PRA) eResolveProxy(oldPra);
			if (pra != oldPra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RR__PRA, oldPra, pra));
			}
		}
		return pra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA basicGetPra() {
		return pra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPra(PRA newPra, NotificationChain msgs) {
		PRA oldPra = pra;
		pra = newPra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.RR__PRA, oldPra,
					newPra);
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
	public void setPra(PRA newPra) {
		if (newPra != pra) {
			NotificationChain msgs = null;
			if (pra != null)
				msgs = ((InternalEObject) pra).eInverseRemove(this, CCSPackage.PRA__RR, PRA.class, msgs);
			if (newPra != null)
				msgs = ((InternalEObject) newPra).eInverseAdd(this, CCSPackage.PRA__RR, PRA.class, msgs);
			msgs = basicSetPra(newPra, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RR__PRA, newPra, newPra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RR__PRA:
			if (pra != null)
				msgs = ((InternalEObject) pra).eInverseRemove(this, CCSPackage.PRA__RR, PRA.class, msgs);
			return basicSetPra((PRA) otherEnd, msgs);
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
		case CCSPackage.RR__PRA:
			return basicSetPra(null, msgs);
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
		case CCSPackage.RR__PRA:
			if (resolve)
				return getPra();
			return basicGetPra();
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
		case CCSPackage.RR__PRA:
			setPra((PRA) newValue);
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
		case CCSPackage.RR__PRA:
			setPra((PRA) null);
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
		case CCSPackage.RR__PRA:
			return pra != null;
		}
		return super.eIsSet(featureID);
	}

} //RRImpl
