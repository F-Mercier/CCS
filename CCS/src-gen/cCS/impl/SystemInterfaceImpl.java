/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Sys2ClientSP;
import cCS.SystemInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.SystemInterfaceImpl#getSys2clientsp <em>Sys2clientsp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInterfaceImpl extends InterfaceConfigImpl implements SystemInterface {
	/**
	 * The cached value of the '{@link #getSys2clientsp() <em>Sys2clientsp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientsp()
	 * @generated
	 * @ordered
	 */
	protected EList<Sys2ClientSP> sys2clientsp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SYSTEM_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sys2ClientSP> getSys2clientsp() {
		if (sys2clientsp == null) {
			sys2clientsp = new EObjectContainmentEList<Sys2ClientSP>(Sys2ClientSP.class, this,
					CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP);
		}
		return sys2clientsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP:
			return ((InternalEList<?>) getSys2clientsp()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP:
			return getSys2clientsp();
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
		case CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP:
			getSys2clientsp().clear();
			getSys2clientsp().addAll((Collection<? extends Sys2ClientSP>) newValue);
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
		case CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP:
			getSys2clientsp().clear();
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
		case CCSPackage.SYSTEM_INTERFACE__SYS2CLIENTSP:
			return sys2clientsp != null && !sys2clientsp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemInterfaceImpl
