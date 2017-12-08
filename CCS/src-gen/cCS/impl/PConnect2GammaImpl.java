/**
 */
package cCS.impl;

import cCS.AConnect2Gamma;
import cCS.CCSPackage;
import cCS.PConnect2Gamma;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PConnect2 Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PConnect2GammaImpl#getAconnect2gamma <em>Aconnect2gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PConnect2GammaImpl extends PPCompImpl implements PConnect2Gamma {
	/**
	 * The cached value of the '{@link #getAconnect2gamma() <em>Aconnect2gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAconnect2gamma()
	 * @generated
	 * @ordered
	 */
	protected AConnect2Gamma aconnect2gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PConnect2GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PCONNECT2_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Gamma getAconnect2gamma() {
		if (aconnect2gamma != null && aconnect2gamma.eIsProxy()) {
			InternalEObject oldAconnect2gamma = (InternalEObject) aconnect2gamma;
			aconnect2gamma = (AConnect2Gamma) eResolveProxy(oldAconnect2gamma);
			if (aconnect2gamma != oldAconnect2gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA, oldAconnect2gamma, aconnect2gamma));
			}
		}
		return aconnect2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Gamma basicGetAconnect2gamma() {
		return aconnect2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAconnect2gamma(AConnect2Gamma newAconnect2gamma) {
		AConnect2Gamma oldAconnect2gamma = aconnect2gamma;
		aconnect2gamma = newAconnect2gamma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA,
					oldAconnect2gamma, aconnect2gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA:
			if (resolve)
				return getAconnect2gamma();
			return basicGetAconnect2gamma();
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
		case CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA:
			setAconnect2gamma((AConnect2Gamma) newValue);
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
		case CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA:
			setAconnect2gamma((AConnect2Gamma) null);
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
		case CCSPackage.PCONNECT2_GAMMA__ACONNECT2GAMMA:
			return aconnect2gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //PConnect2GammaImpl
