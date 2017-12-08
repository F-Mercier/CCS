/**
 */
package cCS.impl;

import cCS.ASec2Alpha;
import cCS.CCSPackage;
import cCS.RSec2Alpha;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RSec2 Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RSec2AlphaImpl#getAsec2alpha <em>Asec2alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSec2AlphaImpl extends RRImpl implements RSec2Alpha {
	/**
	 * The cached value of the '{@link #getAsec2alpha() <em>Asec2alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsec2alpha()
	 * @generated
	 * @ordered
	 */
	protected ASec2Alpha asec2alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSec2AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RSEC2_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Alpha getAsec2alpha() {
		if (asec2alpha != null && asec2alpha.eIsProxy()) {
			InternalEObject oldAsec2alpha = (InternalEObject) asec2alpha;
			asec2alpha = (ASec2Alpha) eResolveProxy(oldAsec2alpha);
			if (asec2alpha != oldAsec2alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RSEC2_ALPHA__ASEC2ALPHA,
							oldAsec2alpha, asec2alpha));
			}
		}
		return asec2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Alpha basicGetAsec2alpha() {
		return asec2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsec2alpha(ASec2Alpha newAsec2alpha) {
		ASec2Alpha oldAsec2alpha = asec2alpha;
		asec2alpha = newAsec2alpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RSEC2_ALPHA__ASEC2ALPHA, oldAsec2alpha,
					asec2alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.RSEC2_ALPHA__ASEC2ALPHA:
			if (resolve)
				return getAsec2alpha();
			return basicGetAsec2alpha();
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
		case CCSPackage.RSEC2_ALPHA__ASEC2ALPHA:
			setAsec2alpha((ASec2Alpha) newValue);
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
		case CCSPackage.RSEC2_ALPHA__ASEC2ALPHA:
			setAsec2alpha((ASec2Alpha) null);
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
		case CCSPackage.RSEC2_ALPHA__ASEC2ALPHA:
			return asec2alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //RSec2AlphaImpl
