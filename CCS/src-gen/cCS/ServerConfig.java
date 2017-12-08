/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServerConfig#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cCS.ServerConfig#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cCS.ServerConfig#getDb <em>Db</em>}</li>
 *   <li>{@link cCS.ServerConfig#getConnectdb <em>Connectdb</em>}</li>
 *   <li>{@link cCS.ServerConfig#getSecdb <em>Secdb</em>}</li>
 *   <li>{@link cCS.ServerConfig#getConnectsec <em>Connectsec</em>}</li>
 *   <li>{@link cCS.ServerConfig#getServ2servbinding <em>Serv2servbinding</em>}</li>
 *   <li>{@link cCS.ServerConfig#getServerconfiginterface <em>Serverconfiginterface</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServerConfig()
 * @model
 * @generated
 */
public interface ServerConfig extends Config {
	/**
	 * Returns the value of the '<em><b>Connectionmanager</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ConnectionManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Connectionmanager()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionManager> getConnectionmanager();

	/**
	 * Returns the value of the '<em><b>Securitymanager</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.SecurityManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanager</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Securitymanager()
	 * @model containment="true"
	 * @generated
	 */
	EList<cCS.SecurityManager> getSecuritymanager();

	/**
	 * Returns the value of the '<em><b>Db</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Db()
	 * @model containment="true"
	 * @generated
	 */
	EList<DB> getDb();

	/**
	 * Returns the value of the '<em><b>Connectdb</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectdb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectdb</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Connectdb()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gamma> getConnectdb();

	/**
	 * Returns the value of the '<em><b>Secdb</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secdb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secdb</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Secdb()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beta> getSecdb();

	/**
	 * Returns the value of the '<em><b>Connectsec</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectsec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectsec</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Connectsec()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alpha> getConnectsec();

	/**
	 * Returns the value of the '<em><b>Serv2servbinding</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Serv2ServBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serv2servbinding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serv2servbinding</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Serv2servbinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serv2ServBinding> getServ2servbinding();

	/**
	 * Returns the value of the '<em><b>Serverconfiginterface</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServerConfigInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfiginterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfiginterface</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerConfig_Serverconfiginterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerConfigInterface> getServerconfiginterface();

} // ServerConfig
