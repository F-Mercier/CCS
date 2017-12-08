/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceRPC;
import cCS.RPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RPCImpl#getInterfacerpc <em>Interfacerpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends ConnectorImpl implements RPC {
	/**
	 * The cached value of the '{@link #getInterfacerpc() <em>Interfacerpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacerpc()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRPC> interfacerpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRPC> getInterfacerpc() {
		if (interfacerpc == null) {
			interfacerpc = new EObjectContainmentEList<InterfaceRPC>(InterfaceRPC.class, this,
					CCSPackage.RPC__INTERFACERPC);
		}
		return interfacerpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.RPC__INTERFACERPC:
			return ((InternalEList<?>) getInterfacerpc()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.RPC__INTERFACERPC:
			return getInterfacerpc();
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
		case CCSPackage.RPC__INTERFACERPC:
			getInterfacerpc().clear();
			getInterfacerpc().addAll((Collection<? extends InterfaceRPC>) newValue);
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
		case CCSPackage.RPC__INTERFACERPC:
			getInterfacerpc().clear();
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
		case CCSPackage.RPC__INTERFACERPC:
			return interfacerpc != null && !interfacerpc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RPCImpl
