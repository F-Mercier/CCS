/**
 */
package cCS.impl;

import cCS.Alpha;
import cCS.Beta;
import cCS.CCSPackage;
import cCS.ConnectionManager;
import cCS.DB;
import cCS.Gamma;
import cCS.Serv2ServBinding;
import cCS.ServerConfig;
import cCS.ServerConfigInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServerConfigImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getDb <em>Db</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getConnectdb <em>Connectdb</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getSecdb <em>Secdb</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getConnectsec <em>Connectsec</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getServ2servbinding <em>Serv2servbinding</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigImpl#getServerconfiginterface <em>Serverconfiginterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerConfigImpl extends ConfigImpl implements ServerConfig {
	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionManager> connectionmanager;

	/**
	 * The cached value of the '{@link #getSecuritymanager() <em>Securitymanager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected EList<cCS.SecurityManager> securitymanager;

	/**
	 * The cached value of the '{@link #getDb() <em>Db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb()
	 * @generated
	 * @ordered
	 */
	protected EList<DB> db;

	/**
	 * The cached value of the '{@link #getConnectdb() <em>Connectdb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectdb()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamma> connectdb;

	/**
	 * The cached value of the '{@link #getSecdb() <em>Secdb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecdb()
	 * @generated
	 * @ordered
	 */
	protected EList<Beta> secdb;

	/**
	 * The cached value of the '{@link #getConnectsec() <em>Connectsec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectsec()
	 * @generated
	 * @ordered
	 */
	protected EList<Alpha> connectsec;

	/**
	 * The cached value of the '{@link #getServ2servbinding() <em>Serv2servbinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServ2servbinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Serv2ServBinding> serv2servbinding;

	/**
	 * The cached value of the '{@link #getServerconfiginterface() <em>Serverconfiginterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfiginterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerConfigInterface> serverconfiginterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERVER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionManager> getConnectionmanager() {
		if (connectionmanager == null) {
			connectionmanager = new EObjectContainmentEList<ConnectionManager>(ConnectionManager.class, this,
					CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER);
		}
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cCS.SecurityManager> getSecuritymanager() {
		if (securitymanager == null) {
			securitymanager = new EObjectContainmentEList<cCS.SecurityManager>(cCS.SecurityManager.class, this,
					CCSPackage.SERVER_CONFIG__SECURITYMANAGER);
		}
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DB> getDb() {
		if (db == null) {
			db = new EObjectContainmentEList<DB>(DB.class, this, CCSPackage.SERVER_CONFIG__DB);
		}
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamma> getConnectdb() {
		if (connectdb == null) {
			connectdb = new EObjectContainmentEList<Gamma>(Gamma.class, this, CCSPackage.SERVER_CONFIG__CONNECTDB);
		}
		return connectdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Beta> getSecdb() {
		if (secdb == null) {
			secdb = new EObjectContainmentEList<Beta>(Beta.class, this, CCSPackage.SERVER_CONFIG__SECDB);
		}
		return secdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alpha> getConnectsec() {
		if (connectsec == null) {
			connectsec = new EObjectContainmentEList<Alpha>(Alpha.class, this, CCSPackage.SERVER_CONFIG__CONNECTSEC);
		}
		return connectsec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serv2ServBinding> getServ2servbinding() {
		if (serv2servbinding == null) {
			serv2servbinding = new EObjectContainmentEList<Serv2ServBinding>(Serv2ServBinding.class, this,
					CCSPackage.SERVER_CONFIG__SERV2SERVBINDING);
		}
		return serv2servbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerConfigInterface> getServerconfiginterface() {
		if (serverconfiginterface == null) {
			serverconfiginterface = new EObjectContainmentEList<ServerConfigInterface>(ServerConfigInterface.class,
					this, CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE);
		}
		return serverconfiginterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER:
			return ((InternalEList<?>) getConnectionmanager()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__SECURITYMANAGER:
			return ((InternalEList<?>) getSecuritymanager()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__DB:
			return ((InternalEList<?>) getDb()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__CONNECTDB:
			return ((InternalEList<?>) getConnectdb()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__SECDB:
			return ((InternalEList<?>) getSecdb()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__CONNECTSEC:
			return ((InternalEList<?>) getConnectsec()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__SERV2SERVBINDING:
			return ((InternalEList<?>) getServ2servbinding()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE:
			return ((InternalEList<?>) getServerconfiginterface()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER:
			return getConnectionmanager();
		case CCSPackage.SERVER_CONFIG__SECURITYMANAGER:
			return getSecuritymanager();
		case CCSPackage.SERVER_CONFIG__DB:
			return getDb();
		case CCSPackage.SERVER_CONFIG__CONNECTDB:
			return getConnectdb();
		case CCSPackage.SERVER_CONFIG__SECDB:
			return getSecdb();
		case CCSPackage.SERVER_CONFIG__CONNECTSEC:
			return getConnectsec();
		case CCSPackage.SERVER_CONFIG__SERV2SERVBINDING:
			return getServ2servbinding();
		case CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE:
			return getServerconfiginterface();
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
		case CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER:
			getConnectionmanager().clear();
			getConnectionmanager().addAll((Collection<? extends ConnectionManager>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__SECURITYMANAGER:
			getSecuritymanager().clear();
			getSecuritymanager().addAll((Collection<? extends cCS.SecurityManager>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__DB:
			getDb().clear();
			getDb().addAll((Collection<? extends DB>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__CONNECTDB:
			getConnectdb().clear();
			getConnectdb().addAll((Collection<? extends Gamma>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__SECDB:
			getSecdb().clear();
			getSecdb().addAll((Collection<? extends Beta>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__CONNECTSEC:
			getConnectsec().clear();
			getConnectsec().addAll((Collection<? extends Alpha>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__SERV2SERVBINDING:
			getServ2servbinding().clear();
			getServ2servbinding().addAll((Collection<? extends Serv2ServBinding>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE:
			getServerconfiginterface().clear();
			getServerconfiginterface().addAll((Collection<? extends ServerConfigInterface>) newValue);
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
		case CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER:
			getConnectionmanager().clear();
			return;
		case CCSPackage.SERVER_CONFIG__SECURITYMANAGER:
			getSecuritymanager().clear();
			return;
		case CCSPackage.SERVER_CONFIG__DB:
			getDb().clear();
			return;
		case CCSPackage.SERVER_CONFIG__CONNECTDB:
			getConnectdb().clear();
			return;
		case CCSPackage.SERVER_CONFIG__SECDB:
			getSecdb().clear();
			return;
		case CCSPackage.SERVER_CONFIG__CONNECTSEC:
			getConnectsec().clear();
			return;
		case CCSPackage.SERVER_CONFIG__SERV2SERVBINDING:
			getServ2servbinding().clear();
			return;
		case CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE:
			getServerconfiginterface().clear();
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
		case CCSPackage.SERVER_CONFIG__CONNECTIONMANAGER:
			return connectionmanager != null && !connectionmanager.isEmpty();
		case CCSPackage.SERVER_CONFIG__SECURITYMANAGER:
			return securitymanager != null && !securitymanager.isEmpty();
		case CCSPackage.SERVER_CONFIG__DB:
			return db != null && !db.isEmpty();
		case CCSPackage.SERVER_CONFIG__CONNECTDB:
			return connectdb != null && !connectdb.isEmpty();
		case CCSPackage.SERVER_CONFIG__SECDB:
			return secdb != null && !secdb.isEmpty();
		case CCSPackage.SERVER_CONFIG__CONNECTSEC:
			return connectsec != null && !connectsec.isEmpty();
		case CCSPackage.SERVER_CONFIG__SERV2SERVBINDING:
			return serv2servbinding != null && !serv2servbinding.isEmpty();
		case CCSPackage.SERVER_CONFIG__SERVERCONFIGINTERFACE:
			return serverconfiginterface != null && !serverconfiginterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServerConfigImpl
