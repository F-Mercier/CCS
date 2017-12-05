/**
 */
package cCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceConfig#getPorts <em>Ports</em>}</li>
 *   <li>{@link cCS.InterfaceConfig#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceConfig()
 * @model
 * @generated
 */
public interface InterfaceConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference.
	 * @see #setPorts(PortsConfig)
	 * @see cCS.CCSPackage#getInterfaceConfig_Ports()
	 * @model
	 * @generated
	 */
	PortsConfig getPorts();

	/**
	 * Sets the value of the '{@link cCS.InterfaceConfig#getPorts <em>Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(PortsConfig value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(ServicesConfig)
	 * @see cCS.CCSPackage#getInterfaceConfig_Services()
	 * @model
	 * @generated
	 */
	ServicesConfig getServices();

	/**
	 * Sets the value of the '{@link cCS.InterfaceConfig#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesConfig value);

} // InterfaceConfig
