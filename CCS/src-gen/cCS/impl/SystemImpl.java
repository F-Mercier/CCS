/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Client;
import cCS.RPC;
import cCS.ServerComp;
import cCS.Sys2ClientBinding;
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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.SystemImpl#getServer <em>Server</em>}</li>
 *   <li>{@link cCS.impl.SystemImpl#getRpc <em>Rpc</em>}</li>
 *   <li>{@link cCS.impl.SystemImpl#getClient <em>Client</em>}</li>
 *   <li>{@link cCS.impl.SystemImpl#getSys2clientbinding <em>Sys2clientbinding</em>}</li>
 *   <li>{@link cCS.impl.SystemImpl#getSysteminterface <em>Systeminterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ConfigImpl implements cCS.System {
	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerComp> server;

	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected EList<RPC> rpc;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> client;

	/**
	 * The cached value of the '{@link #getSys2clientbinding() <em>Sys2clientbinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientbinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Sys2ClientBinding> sys2clientbinding;

	/**
	 * The cached value of the '{@link #getSysteminterface() <em>Systeminterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysteminterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemInterface> systeminterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerComp> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<ServerComp>(ServerComp.class, this, CCSPackage.SYSTEM__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RPC> getRpc() {
		if (rpc == null) {
			rpc = new EObjectContainmentEList<RPC>(RPC.class, this, CCSPackage.SYSTEM__RPC);
		}
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClient() {
		if (client == null) {
			client = new EObjectContainmentEList<Client>(Client.class, this, CCSPackage.SYSTEM__CLIENT);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sys2ClientBinding> getSys2clientbinding() {
		if (sys2clientbinding == null) {
			sys2clientbinding = new EObjectContainmentEList<Sys2ClientBinding>(Sys2ClientBinding.class, this,
					CCSPackage.SYSTEM__SYS2CLIENTBINDING);
		}
		return sys2clientbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemInterface> getSysteminterface() {
		if (systeminterface == null) {
			systeminterface = new EObjectContainmentEList<SystemInterface>(SystemInterface.class, this,
					CCSPackage.SYSTEM__SYSTEMINTERFACE);
		}
		return systeminterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SYSTEM__SERVER:
			return ((InternalEList<?>) getServer()).basicRemove(otherEnd, msgs);
		case CCSPackage.SYSTEM__RPC:
			return ((InternalEList<?>) getRpc()).basicRemove(otherEnd, msgs);
		case CCSPackage.SYSTEM__CLIENT:
			return ((InternalEList<?>) getClient()).basicRemove(otherEnd, msgs);
		case CCSPackage.SYSTEM__SYS2CLIENTBINDING:
			return ((InternalEList<?>) getSys2clientbinding()).basicRemove(otherEnd, msgs);
		case CCSPackage.SYSTEM__SYSTEMINTERFACE:
			return ((InternalEList<?>) getSysteminterface()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SYSTEM__SERVER:
			return getServer();
		case CCSPackage.SYSTEM__RPC:
			return getRpc();
		case CCSPackage.SYSTEM__CLIENT:
			return getClient();
		case CCSPackage.SYSTEM__SYS2CLIENTBINDING:
			return getSys2clientbinding();
		case CCSPackage.SYSTEM__SYSTEMINTERFACE:
			return getSysteminterface();
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
		case CCSPackage.SYSTEM__SERVER:
			getServer().clear();
			getServer().addAll((Collection<? extends ServerComp>) newValue);
			return;
		case CCSPackage.SYSTEM__RPC:
			getRpc().clear();
			getRpc().addAll((Collection<? extends RPC>) newValue);
			return;
		case CCSPackage.SYSTEM__CLIENT:
			getClient().clear();
			getClient().addAll((Collection<? extends Client>) newValue);
			return;
		case CCSPackage.SYSTEM__SYS2CLIENTBINDING:
			getSys2clientbinding().clear();
			getSys2clientbinding().addAll((Collection<? extends Sys2ClientBinding>) newValue);
			return;
		case CCSPackage.SYSTEM__SYSTEMINTERFACE:
			getSysteminterface().clear();
			getSysteminterface().addAll((Collection<? extends SystemInterface>) newValue);
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
		case CCSPackage.SYSTEM__SERVER:
			getServer().clear();
			return;
		case CCSPackage.SYSTEM__RPC:
			getRpc().clear();
			return;
		case CCSPackage.SYSTEM__CLIENT:
			getClient().clear();
			return;
		case CCSPackage.SYSTEM__SYS2CLIENTBINDING:
			getSys2clientbinding().clear();
			return;
		case CCSPackage.SYSTEM__SYSTEMINTERFACE:
			getSysteminterface().clear();
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
		case CCSPackage.SYSTEM__SERVER:
			return server != null && !server.isEmpty();
		case CCSPackage.SYSTEM__RPC:
			return rpc != null && !rpc.isEmpty();
		case CCSPackage.SYSTEM__CLIENT:
			return client != null && !client.isEmpty();
		case CCSPackage.SYSTEM__SYS2CLIENTBINDING:
			return sys2clientbinding != null && !sys2clientbinding.isEmpty();
		case CCSPackage.SYSTEM__SYSTEMINTERFACE:
			return systeminterface != null && !systeminterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
