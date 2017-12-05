/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceComponent;
import cCS.PortsComponent;
import cCS.ServicesComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link cCS.impl.InterfaceComponentImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceComponentImpl extends MinimalEObjectImpl.Container implements InterfaceComponent {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected PortsComponent ports;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesComponent services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsComponent getPorts() {
		if (ports != null && ports.eIsProxy()) {
			InternalEObject oldPorts = (InternalEObject) ports;
			ports = (PortsComponent) eResolveProxy(oldPorts);
			if (ports != oldPorts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.INTERFACE_COMPONENT__PORTS,
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
	public PortsComponent basicGetPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(PortsComponent newPorts) {
		PortsComponent oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_COMPONENT__PORTS, oldPorts,
					ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesComponent getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject) services;
			services = (ServicesComponent) eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.INTERFACE_COMPONENT__SERVICES,
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
	public ServicesComponent basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(ServicesComponent newServices) {
		ServicesComponent oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.INTERFACE_COMPONENT__SERVICES, oldServices,
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
		case CCSPackage.INTERFACE_COMPONENT__PORTS:
			if (resolve)
				return getPorts();
			return basicGetPorts();
		case CCSPackage.INTERFACE_COMPONENT__SERVICES:
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
		case CCSPackage.INTERFACE_COMPONENT__PORTS:
			setPorts((PortsComponent) newValue);
			return;
		case CCSPackage.INTERFACE_COMPONENT__SERVICES:
			setServices((ServicesComponent) newValue);
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
		case CCSPackage.INTERFACE_COMPONENT__PORTS:
			setPorts((PortsComponent) null);
			return;
		case CCSPackage.INTERFACE_COMPONENT__SERVICES:
			setServices((ServicesComponent) null);
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
		case CCSPackage.INTERFACE_COMPONENT__PORTS:
			return ports != null;
		case CCSPackage.INTERFACE_COMPONENT__SERVICES:
			return services != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceComponentImpl
