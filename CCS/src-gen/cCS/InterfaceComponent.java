/**
 */
package cCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceComponent#getPorts <em>Ports</em>}</li>
 *   <li>{@link cCS.InterfaceComponent#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceComponent()
 * @model
 * @generated
 */
public interface InterfaceComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference.
	 * @see #setPorts(PortsComponent)
	 * @see cCS.CCSPackage#getInterfaceComponent_Ports()
	 * @model
	 * @generated
	 */
	PortsComponent getPorts();

	/**
	 * Sets the value of the '{@link cCS.InterfaceComponent#getPorts <em>Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(PortsComponent value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(ServicesComponent)
	 * @see cCS.CCSPackage#getInterfaceComponent_Services()
	 * @model
	 * @generated
	 */
	ServicesComponent getServices();

	/**
	 * Sets the value of the '{@link cCS.InterfaceComponent#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesComponent value);

} // InterfaceComponent
