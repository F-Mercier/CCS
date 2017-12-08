/**
 */
package cCS.impl;

import cCS.ADB2Beta;
import cCS.CCSPackage;
import cCS.PDB2Beta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDB2 Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PDB2BetaImpl#getAdb2beta <em>Adb2beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDB2BetaImpl extends PPCompImpl implements PDB2Beta {
	/**
	 * The cached value of the '{@link #getAdb2beta() <em>Adb2beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdb2beta()
	 * @generated
	 * @ordered
	 */
	protected ADB2Beta adb2beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDB2BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PDB2_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Beta getAdb2beta() {
		if (adb2beta != null && adb2beta.eIsProxy()) {
			InternalEObject oldAdb2beta = (InternalEObject) adb2beta;
			adb2beta = (ADB2Beta) eResolveProxy(oldAdb2beta);
			if (adb2beta != oldAdb2beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PDB2_BETA__ADB2BETA,
							oldAdb2beta, adb2beta));
			}
		}
		return adb2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Beta basicGetAdb2beta() {
		return adb2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdb2beta(ADB2Beta newAdb2beta) {
		ADB2Beta oldAdb2beta = adb2beta;
		adb2beta = newAdb2beta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PDB2_BETA__ADB2BETA, oldAdb2beta,
					adb2beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PDB2_BETA__ADB2BETA:
			if (resolve)
				return getAdb2beta();
			return basicGetAdb2beta();
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
		case CCSPackage.PDB2_BETA__ADB2BETA:
			setAdb2beta((ADB2Beta) newValue);
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
		case CCSPackage.PDB2_BETA__ADB2BETA:
			setAdb2beta((ADB2Beta) null);
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
		case CCSPackage.PDB2_BETA__ADB2BETA:
			return adb2beta != null;
		}
		return super.eIsSet(featureID);
	}

} //PDB2BetaImpl
