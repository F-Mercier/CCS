/**
 */
package cCS.impl;

import cCS.ADB2Gamma;
import cCS.CCSPackage;
import cCS.PDB2Gamma;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDB2 Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PDB2GammaImpl#getAdb2gamma <em>Adb2gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDB2GammaImpl extends PPCompImpl implements PDB2Gamma {
	/**
	 * The cached value of the '{@link #getAdb2gamma() <em>Adb2gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdb2gamma()
	 * @generated
	 * @ordered
	 */
	protected ADB2Gamma adb2gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDB2GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PDB2_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Gamma getAdb2gamma() {
		if (adb2gamma != null && adb2gamma.eIsProxy()) {
			InternalEObject oldAdb2gamma = (InternalEObject) adb2gamma;
			adb2gamma = (ADB2Gamma) eResolveProxy(oldAdb2gamma);
			if (adb2gamma != oldAdb2gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PDB2_GAMMA__ADB2GAMMA,
							oldAdb2gamma, adb2gamma));
			}
		}
		return adb2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Gamma basicGetAdb2gamma() {
		return adb2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdb2gamma(ADB2Gamma newAdb2gamma) {
		ADB2Gamma oldAdb2gamma = adb2gamma;
		adb2gamma = newAdb2gamma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PDB2_GAMMA__ADB2GAMMA, oldAdb2gamma,
					adb2gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PDB2_GAMMA__ADB2GAMMA:
			if (resolve)
				return getAdb2gamma();
			return basicGetAdb2gamma();
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
		case CCSPackage.PDB2_GAMMA__ADB2GAMMA:
			setAdb2gamma((ADB2Gamma) newValue);
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
		case CCSPackage.PDB2_GAMMA__ADB2GAMMA:
			setAdb2gamma((ADB2Gamma) null);
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
		case CCSPackage.PDB2_GAMMA__ADB2GAMMA:
			return adb2gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //PDB2GammaImpl
