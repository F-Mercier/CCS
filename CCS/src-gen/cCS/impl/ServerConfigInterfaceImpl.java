/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.ServConf2ConnectServP;
import cCS.ServConf2ServCompConfP;
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
 * An implementation of the model object '<em><b>Server Config Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServerConfigInterfaceImpl#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}</li>
 *   <li>{@link cCS.impl.ServerConfigInterfaceImpl#getServconf2connectservp <em>Servconf2connectservp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerConfigInterfaceImpl extends InterfaceConfigImpl implements ServerConfigInterface {
	/**
	 * The cached value of the '{@link #getServconf2servcompconfp() <em>Servconf2servcompconfp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2servcompconfp()
	 * @generated
	 * @ordered
	 */
	protected EList<ServConf2ServCompConfP> servconf2servcompconfp;

	/**
	 * The cached value of the '{@link #getServconf2connectservp() <em>Servconf2connectservp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2connectservp()
	 * @generated
	 * @ordered
	 */
	protected EList<ServConf2ConnectServP> servconf2connectservp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfigInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERVER_CONFIG_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServConf2ServCompConfP> getServconf2servcompconfp() {
		if (servconf2servcompconfp == null) {
			servconf2servcompconfp = new EObjectContainmentEList<ServConf2ServCompConfP>(ServConf2ServCompConfP.class,
					this, CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP);
		}
		return servconf2servcompconfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServConf2ConnectServP> getServconf2connectservp() {
		if (servconf2connectservp == null) {
			servconf2connectservp = new EObjectContainmentEList<ServConf2ConnectServP>(ServConf2ConnectServP.class,
					this, CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP);
		}
		return servconf2connectservp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP:
			return ((InternalEList<?>) getServconf2servcompconfp()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP:
			return ((InternalEList<?>) getServconf2connectservp()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP:
			return getServconf2servcompconfp();
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP:
			return getServconf2connectservp();
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
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP:
			getServconf2servcompconfp().clear();
			getServconf2servcompconfp().addAll((Collection<? extends ServConf2ServCompConfP>) newValue);
			return;
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP:
			getServconf2connectservp().clear();
			getServconf2connectservp().addAll((Collection<? extends ServConf2ConnectServP>) newValue);
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
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP:
			getServconf2servcompconfp().clear();
			return;
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP:
			getServconf2connectservp().clear();
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
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP:
			return servconf2servcompconfp != null && !servconf2servcompconfp.isEmpty();
		case CCSPackage.SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP:
			return servconf2connectservp != null && !servconf2connectservp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServerConfigInterfaceImpl
