/**
 */
package cCS.impl;

import cCS.ABeta2Sec;
import cCS.CCSPackage;
import cCS.PBeta2Sec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PBeta2 Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PBeta2SecImpl#getAbeta2sec <em>Abeta2sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PBeta2SecImpl extends RPCompImpl implements PBeta2Sec {
	/**
	 * The cached value of the '{@link #getAbeta2sec() <em>Abeta2sec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbeta2sec()
	 * @generated
	 * @ordered
	 */
	protected ABeta2Sec abeta2sec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PBeta2SecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PBETA2_SEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2Sec getAbeta2sec() {
		if (abeta2sec != null && abeta2sec.eIsProxy()) {
			InternalEObject oldAbeta2sec = (InternalEObject) abeta2sec;
			abeta2sec = (ABeta2Sec) eResolveProxy(oldAbeta2sec);
			if (abeta2sec != oldAbeta2sec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PBETA2_SEC__ABETA2SEC,
							oldAbeta2sec, abeta2sec));
			}
		}
		return abeta2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2Sec basicGetAbeta2sec() {
		return abeta2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbeta2sec(ABeta2Sec newAbeta2sec) {
		ABeta2Sec oldAbeta2sec = abeta2sec;
		abeta2sec = newAbeta2sec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PBETA2_SEC__ABETA2SEC, oldAbeta2sec,
					abeta2sec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PBETA2_SEC__ABETA2SEC:
			if (resolve)
				return getAbeta2sec();
			return basicGetAbeta2sec();
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
		case CCSPackage.PBETA2_SEC__ABETA2SEC:
			setAbeta2sec((ABeta2Sec) newValue);
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
		case CCSPackage.PBETA2_SEC__ABETA2SEC:
			setAbeta2sec((ABeta2Sec) null);
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
		case CCSPackage.PBETA2_SEC__ABETA2SEC:
			return abeta2sec != null;
		}
		return super.eIsSet(featureID);
	}

} //PBeta2SecImpl
