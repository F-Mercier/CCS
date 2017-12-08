/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceRPC;
import cCS.PRoleRPCClient;
import cCS.PRoleRPCSev;
import cCS.RRoleRPCClient;
import cCS.RRoleRPCServer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceRPCImpl#getProlerpc2 <em>Prolerpc2</em>}</li>
 *   <li>{@link cCS.impl.InterfaceRPCImpl#getRrolerpc <em>Rrolerpc</em>}</li>
 *   <li>{@link cCS.impl.InterfaceRPCImpl#getRrolerpc2 <em>Rrolerpc2</em>}</li>
 *   <li>{@link cCS.impl.InterfaceRPCImpl#getProlerpc <em>Prolerpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceRPCImpl extends InterfaceConnectorImpl implements InterfaceRPC {
	/**
	 * The cached value of the '{@link #getProlerpc2() <em>Prolerpc2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProlerpc2()
	 * @generated
	 * @ordered
	 */
	protected EList<PRoleRPCClient> prolerpc2;

	/**
	 * The cached value of the '{@link #getRrolerpc() <em>Rrolerpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrolerpc()
	 * @generated
	 * @ordered
	 */
	protected EList<RRoleRPCClient> rrolerpc;

	/**
	 * The cached value of the '{@link #getRrolerpc2() <em>Rrolerpc2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRrolerpc2()
	 * @generated
	 * @ordered
	 */
	protected EList<RRoleRPCServer> rrolerpc2;

	/**
	 * The cached value of the '{@link #getProlerpc() <em>Prolerpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProlerpc()
	 * @generated
	 * @ordered
	 */
	protected EList<PRoleRPCSev> prolerpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRoleRPCClient> getProlerpc2() {
		if (prolerpc2 == null) {
			prolerpc2 = new EObjectContainmentEList<PRoleRPCClient>(PRoleRPCClient.class, this,
					CCSPackage.INTERFACE_RPC__PROLERPC2);
		}
		return prolerpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RRoleRPCClient> getRrolerpc() {
		if (rrolerpc == null) {
			rrolerpc = new EObjectContainmentEList<RRoleRPCClient>(RRoleRPCClient.class, this,
					CCSPackage.INTERFACE_RPC__RROLERPC);
		}
		return rrolerpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RRoleRPCServer> getRrolerpc2() {
		if (rrolerpc2 == null) {
			rrolerpc2 = new EObjectContainmentEList<RRoleRPCServer>(RRoleRPCServer.class, this,
					CCSPackage.INTERFACE_RPC__RROLERPC2);
		}
		return rrolerpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRoleRPCSev> getProlerpc() {
		if (prolerpc == null) {
			prolerpc = new EObjectContainmentEList<PRoleRPCSev>(PRoleRPCSev.class, this,
					CCSPackage.INTERFACE_RPC__PROLERPC);
		}
		return prolerpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACE_RPC__PROLERPC2:
			return ((InternalEList<?>) getProlerpc2()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_RPC__RROLERPC:
			return ((InternalEList<?>) getRrolerpc()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_RPC__RROLERPC2:
			return ((InternalEList<?>) getRrolerpc2()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_RPC__PROLERPC:
			return ((InternalEList<?>) getProlerpc()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACE_RPC__PROLERPC2:
			return getProlerpc2();
		case CCSPackage.INTERFACE_RPC__RROLERPC:
			return getRrolerpc();
		case CCSPackage.INTERFACE_RPC__RROLERPC2:
			return getRrolerpc2();
		case CCSPackage.INTERFACE_RPC__PROLERPC:
			return getProlerpc();
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
		case CCSPackage.INTERFACE_RPC__PROLERPC2:
			getProlerpc2().clear();
			getProlerpc2().addAll((Collection<? extends PRoleRPCClient>) newValue);
			return;
		case CCSPackage.INTERFACE_RPC__RROLERPC:
			getRrolerpc().clear();
			getRrolerpc().addAll((Collection<? extends RRoleRPCClient>) newValue);
			return;
		case CCSPackage.INTERFACE_RPC__RROLERPC2:
			getRrolerpc2().clear();
			getRrolerpc2().addAll((Collection<? extends RRoleRPCServer>) newValue);
			return;
		case CCSPackage.INTERFACE_RPC__PROLERPC:
			getProlerpc().clear();
			getProlerpc().addAll((Collection<? extends PRoleRPCSev>) newValue);
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
		case CCSPackage.INTERFACE_RPC__PROLERPC2:
			getProlerpc2().clear();
			return;
		case CCSPackage.INTERFACE_RPC__RROLERPC:
			getRrolerpc().clear();
			return;
		case CCSPackage.INTERFACE_RPC__RROLERPC2:
			getRrolerpc2().clear();
			return;
		case CCSPackage.INTERFACE_RPC__PROLERPC:
			getProlerpc().clear();
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
		case CCSPackage.INTERFACE_RPC__PROLERPC2:
			return prolerpc2 != null && !prolerpc2.isEmpty();
		case CCSPackage.INTERFACE_RPC__RROLERPC:
			return rrolerpc != null && !rrolerpc.isEmpty();
		case CCSPackage.INTERFACE_RPC__RROLERPC2:
			return rrolerpc2 != null && !rrolerpc2.isEmpty();
		case CCSPackage.INTERFACE_RPC__PROLERPC:
			return prolerpc != null && !prolerpc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceRPCImpl
