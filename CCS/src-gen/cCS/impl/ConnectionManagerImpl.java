/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.ConnectionManager;
import cCS.InterfacesConnect;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ConnectionManagerImpl#getInterfacesconnect <em>Interfacesconnect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends ComponentImpl implements ConnectionManager {
	/**
	 * The cached value of the '{@link #getInterfacesconnect() <em>Interfacesconnect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacesconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacesConnect> interfacesconnect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacesConnect> getInterfacesconnect() {
		if (interfacesconnect == null) {
			interfacesconnect = new EObjectContainmentEList<InterfacesConnect>(InterfacesConnect.class, this,
					CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT);
		}
		return interfacesconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT:
			return ((InternalEList<?>) getInterfacesconnect()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT:
			return getInterfacesconnect();
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
		case CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT:
			getInterfacesconnect().clear();
			getInterfacesconnect().addAll((Collection<? extends InterfacesConnect>) newValue);
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
		case CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT:
			getInterfacesconnect().clear();
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
		case CCSPackage.CONNECTION_MANAGER__INTERFACESCONNECT:
			return interfacesconnect != null && !interfacesconnect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
