/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfacesServer;
import cCS.PortPS;
import cCS.PortRS;
import cCS.ServConf2ServCompCompP;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfaces Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfacesServerImpl#getPortps <em>Portps</em>}</li>
 *   <li>{@link cCS.impl.InterfacesServerImpl#getPortrs <em>Portrs</em>}</li>
 *   <li>{@link cCS.impl.InterfacesServerImpl#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfacesServerImpl extends InterfaceComponentImpl implements InterfacesServer {
	/**
	 * The cached value of the '{@link #getPortps() <em>Portps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortps()
	 * @generated
	 * @ordered
	 */
	protected EList<PortPS> portps;

	/**
	 * The cached value of the '{@link #getPortrs() <em>Portrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrs()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRS> portrs;

	/**
	 * The cached value of the '{@link #getServconf2servcompcompp() <em>Servconf2servcompcompp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2servcompcompp()
	 * @generated
	 * @ordered
	 */
	protected EList<ServConf2ServCompCompP> servconf2servcompcompp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacesServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACES_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortPS> getPortps() {
		if (portps == null) {
			portps = new EObjectContainmentEList<PortPS>(PortPS.class, this, CCSPackage.INTERFACES_SERVER__PORTPS);
		}
		return portps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRS> getPortrs() {
		if (portrs == null) {
			portrs = new EObjectContainmentEList<PortRS>(PortRS.class, this, CCSPackage.INTERFACES_SERVER__PORTRS);
		}
		return portrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServConf2ServCompCompP> getServconf2servcompcompp() {
		if (servconf2servcompcompp == null) {
			servconf2servcompcompp = new EObjectContainmentEList<ServConf2ServCompCompP>(ServConf2ServCompCompP.class,
					this, CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP);
		}
		return servconf2servcompcompp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACES_SERVER__PORTPS:
			return ((InternalEList<?>) getPortps()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_SERVER__PORTRS:
			return ((InternalEList<?>) getPortrs()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP:
			return ((InternalEList<?>) getServconf2servcompcompp()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACES_SERVER__PORTPS:
			return getPortps();
		case CCSPackage.INTERFACES_SERVER__PORTRS:
			return getPortrs();
		case CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP:
			return getServconf2servcompcompp();
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
		case CCSPackage.INTERFACES_SERVER__PORTPS:
			getPortps().clear();
			getPortps().addAll((Collection<? extends PortPS>) newValue);
			return;
		case CCSPackage.INTERFACES_SERVER__PORTRS:
			getPortrs().clear();
			getPortrs().addAll((Collection<? extends PortRS>) newValue);
			return;
		case CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP:
			getServconf2servcompcompp().clear();
			getServconf2servcompcompp().addAll((Collection<? extends ServConf2ServCompCompP>) newValue);
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
		case CCSPackage.INTERFACES_SERVER__PORTPS:
			getPortps().clear();
			return;
		case CCSPackage.INTERFACES_SERVER__PORTRS:
			getPortrs().clear();
			return;
		case CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP:
			getServconf2servcompcompp().clear();
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
		case CCSPackage.INTERFACES_SERVER__PORTPS:
			return portps != null && !portps.isEmpty();
		case CCSPackage.INTERFACES_SERVER__PORTRS:
			return portrs != null && !portrs.isEmpty();
		case CCSPackage.INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP:
			return servconf2servcompcompp != null && !servconf2servcompcompp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfacesServerImpl
