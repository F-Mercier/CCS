/**
 */
package cCS.impl;

import cCS.AAlpha2Sec;
import cCS.CCSPackage;
import cCS.RAlpha2Sec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAlpha2 Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RAlpha2SecImpl#getAalpha2sec <em>Aalpha2sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RAlpha2SecImpl extends PRImpl implements RAlpha2Sec {
	/**
	 * The cached value of the '{@link #getAalpha2sec() <em>Aalpha2sec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAalpha2sec()
	 * @generated
	 * @ordered
	 */
	protected AAlpha2Sec aalpha2sec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAlpha2SecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RALPHA2_SEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Sec getAalpha2sec() {
		if (aalpha2sec != null && aalpha2sec.eIsProxy()) {
			InternalEObject oldAalpha2sec = (InternalEObject) aalpha2sec;
			aalpha2sec = (AAlpha2Sec) eResolveProxy(oldAalpha2sec);
			if (aalpha2sec != oldAalpha2sec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RALPHA2_SEC__AALPHA2SEC,
							oldAalpha2sec, aalpha2sec));
			}
		}
		return aalpha2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Sec basicGetAalpha2sec() {
		return aalpha2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAalpha2sec(AAlpha2Sec newAalpha2sec) {
		AAlpha2Sec oldAalpha2sec = aalpha2sec;
		aalpha2sec = newAalpha2sec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RALPHA2_SEC__AALPHA2SEC, oldAalpha2sec,
					aalpha2sec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.RALPHA2_SEC__AALPHA2SEC:
			if (resolve)
				return getAalpha2sec();
			return basicGetAalpha2sec();
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
		case CCSPackage.RALPHA2_SEC__AALPHA2SEC:
			setAalpha2sec((AAlpha2Sec) newValue);
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
		case CCSPackage.RALPHA2_SEC__AALPHA2SEC:
			setAalpha2sec((AAlpha2Sec) null);
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
		case CCSPackage.RALPHA2_SEC__AALPHA2SEC:
			return aalpha2sec != null;
		}
		return super.eIsSet(featureID);
	}

} //RAlpha2SecImpl
