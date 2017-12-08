/**
 */
package cCS.impl;

import cCS.AConnect2Alpha;
import cCS.CCSPackage;
import cCS.PConnect2Alpha;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PConnect2 Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PConnect2AlphaImpl#getAconnect2alpha <em>Aconnect2alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PConnect2AlphaImpl extends PPCompImpl implements PConnect2Alpha {
	/**
	 * The cached value of the '{@link #getAconnect2alpha() <em>Aconnect2alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAconnect2alpha()
	 * @generated
	 * @ordered
	 */
	protected AConnect2Alpha aconnect2alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PConnect2AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PCONNECT2_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Alpha getAconnect2alpha() {
		if (aconnect2alpha != null && aconnect2alpha.eIsProxy()) {
			InternalEObject oldAconnect2alpha = (InternalEObject) aconnect2alpha;
			aconnect2alpha = (AConnect2Alpha) eResolveProxy(oldAconnect2alpha);
			if (aconnect2alpha != oldAconnect2alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA, oldAconnect2alpha, aconnect2alpha));
			}
		}
		return aconnect2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Alpha basicGetAconnect2alpha() {
		return aconnect2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAconnect2alpha(AConnect2Alpha newAconnect2alpha) {
		AConnect2Alpha oldAconnect2alpha = aconnect2alpha;
		aconnect2alpha = newAconnect2alpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA,
					oldAconnect2alpha, aconnect2alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA:
			if (resolve)
				return getAconnect2alpha();
			return basicGetAconnect2alpha();
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
		case CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA:
			setAconnect2alpha((AConnect2Alpha) newValue);
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
		case CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA:
			setAconnect2alpha((AConnect2Alpha) null);
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
		case CCSPackage.PCONNECT2_ALPHA__ACONNECT2ALPHA:
			return aconnect2alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //PConnect2AlphaImpl
