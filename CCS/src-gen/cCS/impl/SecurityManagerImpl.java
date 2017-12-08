/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.SecurityInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.SecurityManagerImpl#getSecurityinterface <em>Securityinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends ComponentImpl implements cCS.SecurityManager {
	/**
	 * The cached value of the '{@link #getSecurityinterface() <em>Securityinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityInterface> securityinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityInterface> getSecurityinterface() {
		if (securityinterface == null) {
			securityinterface = new EObjectContainmentEList<SecurityInterface>(SecurityInterface.class, this,
					CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE);
		}
		return securityinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE:
			return ((InternalEList<?>) getSecurityinterface()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE:
			return getSecurityinterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE:
			getSecurityinterface().clear();
			getSecurityinterface().addAll((Collection<? extends SecurityInterface>) newValue);
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
		case CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE:
			getSecurityinterface().clear();
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
		case CCSPackage.SECURITY_MANAGER__SECURITYINTERFACE:
			return securityinterface != null && !securityinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
