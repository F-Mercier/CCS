/**
 */
package cCS.impl;

import cCS.ASec2Beta;
import cCS.CCSPackage;
import cCS.PSec2Beta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSec2 Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PSec2BetaImpl#getAsec2beta <em>Asec2beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSec2BetaImpl extends PPCompImpl implements PSec2Beta {
	/**
	 * The cached value of the '{@link #getAsec2beta() <em>Asec2beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsec2beta()
	 * @generated
	 * @ordered
	 */
	protected ASec2Beta asec2beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSec2BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PSEC2_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Beta getAsec2beta() {
		if (asec2beta != null && asec2beta.eIsProxy()) {
			InternalEObject oldAsec2beta = (InternalEObject) asec2beta;
			asec2beta = (ASec2Beta) eResolveProxy(oldAsec2beta);
			if (asec2beta != oldAsec2beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PSEC2_BETA__ASEC2BETA,
							oldAsec2beta, asec2beta));
			}
		}
		return asec2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Beta basicGetAsec2beta() {
		return asec2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsec2beta(ASec2Beta newAsec2beta) {
		ASec2Beta oldAsec2beta = asec2beta;
		asec2beta = newAsec2beta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PSEC2_BETA__ASEC2BETA, oldAsec2beta,
					asec2beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PSEC2_BETA__ASEC2BETA:
			if (resolve)
				return getAsec2beta();
			return basicGetAsec2beta();
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
		case CCSPackage.PSEC2_BETA__ASEC2BETA:
			setAsec2beta((ASec2Beta) newValue);
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
		case CCSPackage.PSEC2_BETA__ASEC2BETA:
			setAsec2beta((ASec2Beta) null);
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
		case CCSPackage.PSEC2_BETA__ASEC2BETA:
			return asec2beta != null;
		}
		return super.eIsSet(featureID);
	}

} //PSec2BetaImpl
