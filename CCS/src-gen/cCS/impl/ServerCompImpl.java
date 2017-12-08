/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfacesServer;
import cCS.ServerComp;
import cCS.ServerConfig;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.ServerCompImpl#getServerconfig <em>Serverconfig</em>}</li>
 *   <li>{@link cCS.impl.ServerCompImpl#getInterfacesserver <em>Interfacesserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerCompImpl extends ComponentImpl implements ServerComp {
	/**
	 * The cached value of the '{@link #getServerconfig() <em>Serverconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerConfig> serverconfig;

	/**
	 * The cached value of the '{@link #getInterfacesserver() <em>Interfacesserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacesserver()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacesServer> interfacesserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerCompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SERVER_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerConfig> getServerconfig() {
		if (serverconfig == null) {
			serverconfig = new EObjectContainmentEList<ServerConfig>(ServerConfig.class, this,
					CCSPackage.SERVER_COMP__SERVERCONFIG);
		}
		return serverconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacesServer> getInterfacesserver() {
		if (interfacesserver == null) {
			interfacesserver = new EObjectContainmentEList<InterfacesServer>(InterfacesServer.class, this,
					CCSPackage.SERVER_COMP__INTERFACESSERVER);
		}
		return interfacesserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SERVER_COMP__SERVERCONFIG:
			return ((InternalEList<?>) getServerconfig()).basicRemove(otherEnd, msgs);
		case CCSPackage.SERVER_COMP__INTERFACESSERVER:
			return ((InternalEList<?>) getInterfacesserver()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SERVER_COMP__SERVERCONFIG:
			return getServerconfig();
		case CCSPackage.SERVER_COMP__INTERFACESSERVER:
			return getInterfacesserver();
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
		case CCSPackage.SERVER_COMP__SERVERCONFIG:
			getServerconfig().clear();
			getServerconfig().addAll((Collection<? extends ServerConfig>) newValue);
			return;
		case CCSPackage.SERVER_COMP__INTERFACESSERVER:
			getInterfacesserver().clear();
			getInterfacesserver().addAll((Collection<? extends InterfacesServer>) newValue);
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
		case CCSPackage.SERVER_COMP__SERVERCONFIG:
			getServerconfig().clear();
			return;
		case CCSPackage.SERVER_COMP__INTERFACESSERVER:
			getInterfacesserver().clear();
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
		case CCSPackage.SERVER_COMP__SERVERCONFIG:
			return serverconfig != null && !serverconfig.isEmpty();
		case CCSPackage.SERVER_COMP__INTERFACESSERVER:
			return interfacesserver != null && !interfacesserver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServerCompImpl
