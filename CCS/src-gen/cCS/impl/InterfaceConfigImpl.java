/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceConfig;
import cCS.PortsConfig;
import cCS.ServicesConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceConfigImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link cCS.impl.InterfaceConfigImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceConfigImpl extends MinimalEObjectImpl.Container implements InterfaceConfig {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected PortsConfig ports;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesConfig services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsConfig getPorts() {
		if (ports != null && ports.eIsProxy()) {
			InternalEObject oldPorts = (InternalEObject) ports;
			ports = (PortsConfig) eResolveProxy(oldPorts);
			if (ports != oldPorts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.INTERFACE_CONFIG__PORTS,
							oldPorts, ports));
			}
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsConfig basicGetPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(PortsConfig newPorts) {
		PortsConfig oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_CONFIG__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesConfig getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject) services;
			services = (ServicesConfig) eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.INTERFACE_CONFIG__SERVICES,
							oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesConfig basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(ServicesConfig newServices) {
		ServicesConfig oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_CONFIG__SERVICES, oldServices,
					services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.INTERFACE_CONFIG__PORTS:
			if (resolve)
				return getPorts();
			return basicGetPorts();
		case CCSPackage.INTERFACE_CONFIG__SERVICES:
			if (resolve)
				return getServices();
			return basicGetServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CCSPackage.INTERFACE_CONFIG__PORTS:
			setPorts((PortsConfig) newValue);
			return;
		case CCSPackage.INTERFACE_CONFIG__SERVICES:
			setServices((ServicesConfig) newValue);
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
		case CCSPackage.INTERFACE_CONFIG__PORTS:
			setPorts((PortsConfig) null);
			return;
		case CCSPackage.INTERFACE_CONFIG__SERVICES:
			setServices((ServicesConfig) null);
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
		case CCSPackage.INTERFACE_CONFIG__PORTS:
			return ports != null;
		case CCSPackage.INTERFACE_CONFIG__SERVICES:
			return services != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceConfigImpl
