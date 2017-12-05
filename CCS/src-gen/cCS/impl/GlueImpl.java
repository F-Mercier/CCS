/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Glue;
import cCS.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.GlueImpl#getNeweclass18 <em>Neweclass18</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
	/**
	 * The cached value of the '{@link #getNeweclass18() <em>Neweclass18</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeweclass18()
	 * @generated
	 * @ordered
	 */
	protected Role neweclass18;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getNeweclass18() {
		if (neweclass18 != null && neweclass18.eIsProxy()) {
			InternalEObject oldNeweclass18 = (InternalEObject) neweclass18;
			neweclass18 = (Role) eResolveProxy(oldNeweclass18);
			if (neweclass18 != oldNeweclass18) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.GLUE__NEWECLASS18,
							oldNeweclass18, neweclass18));
			}
		}
		return neweclass18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetNeweclass18() {
		return neweclass18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeweclass18(Role newNeweclass18) {
		Role oldNeweclass18 = neweclass18;
		neweclass18 = newNeweclass18;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.GLUE__NEWECLASS18, oldNeweclass18,
					neweclass18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.GLUE__NEWECLASS18:
			if (resolve)
				return getNeweclass18();
			return basicGetNeweclass18();
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
		case CCSPackage.GLUE__NEWECLASS18:
			setNeweclass18((Role) newValue);
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
		case CCSPackage.GLUE__NEWECLASS18:
			setNeweclass18((Role) null);
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
		case CCSPackage.GLUE__NEWECLASS18:
			return neweclass18 != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueImpl
