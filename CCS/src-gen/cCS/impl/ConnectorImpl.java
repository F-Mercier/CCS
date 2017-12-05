/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Connector;
import cCS.Glue;
import cCS.InterfaceConnector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ConnectorImpl#getNeweclass16 <em>Neweclass16</em>}</li>
 *   <li>{@link cCS.impl.ConnectorImpl#getNeweclass17 <em>Neweclass17</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getNeweclass16() <em>Neweclass16</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeweclass16()
	 * @generated
	 * @ordered
	 */
	protected Glue neweclass16;

	/**
	 * The cached value of the '{@link #getNeweclass17() <em>Neweclass17</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeweclass17()
	 * @generated
	 * @ordered
	 */
	protected InterfaceConnector neweclass17;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getNeweclass16() {
		if (neweclass16 != null && neweclass16.eIsProxy()) {
			InternalEObject oldNeweclass16 = (InternalEObject) neweclass16;
			neweclass16 = (Glue) eResolveProxy(oldNeweclass16);
			if (neweclass16 != oldNeweclass16) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.CONNECTOR__NEWECLASS16,
							oldNeweclass16, neweclass16));
			}
		}
		return neweclass16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetNeweclass16() {
		return neweclass16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeweclass16(Glue newNeweclass16) {
		Glue oldNeweclass16 = neweclass16;
		neweclass16 = newNeweclass16;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.CONNECTOR__NEWECLASS16, oldNeweclass16,
					neweclass16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector getNeweclass17() {
		if (neweclass17 != null && neweclass17.eIsProxy()) {
			InternalEObject oldNeweclass17 = (InternalEObject) neweclass17;
			neweclass17 = (InterfaceConnector) eResolveProxy(oldNeweclass17);
			if (neweclass17 != oldNeweclass17) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.CONNECTOR__NEWECLASS17,
							oldNeweclass17, neweclass17));
			}
		}
		return neweclass17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector basicGetNeweclass17() {
		return neweclass17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeweclass17(InterfaceConnector newNeweclass17) {
		InterfaceConnector oldNeweclass17 = neweclass17;
		neweclass17 = newNeweclass17;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.CONNECTOR__NEWECLASS17, oldNeweclass17,
					neweclass17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.CONNECTOR__NEWECLASS16:
			if (resolve)
				return getNeweclass16();
			return basicGetNeweclass16();
		case CCSPackage.CONNECTOR__NEWECLASS17:
			if (resolve)
				return getNeweclass17();
			return basicGetNeweclass17();
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
		case CCSPackage.CONNECTOR__NEWECLASS16:
			setNeweclass16((Glue) newValue);
			return;
		case CCSPackage.CONNECTOR__NEWECLASS17:
			setNeweclass17((InterfaceConnector) newValue);
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
		case CCSPackage.CONNECTOR__NEWECLASS16:
			setNeweclass16((Glue) null);
			return;
		case CCSPackage.CONNECTOR__NEWECLASS17:
			setNeweclass17((InterfaceConnector) null);
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
		case CCSPackage.CONNECTOR__NEWECLASS16:
			return neweclass16 != null;
		case CCSPackage.CONNECTOR__NEWECLASS17:
			return neweclass17 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
