/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PortPC;
import cCS.PortRC;
import cCS.Sys2ClientCP;
import cCS.interfacesC;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interfaces C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.interfacesCImpl#getPortrc <em>Portrc</em>}</li>
 *   <li>{@link cCS.impl.interfacesCImpl#getPortpc <em>Portpc</em>}</li>
 *   <li>{@link cCS.impl.interfacesCImpl#getSys2clientcp <em>Sys2clientcp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class interfacesCImpl extends InterfaceComponentImpl implements interfacesC {
	/**
	 * The cached value of the '{@link #getPortrc() <em>Portrc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrc()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRC> portrc;

	/**
	 * The cached value of the '{@link #getPortpc() <em>Portpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortpc()
	 * @generated
	 * @ordered
	 */
	protected EList<PortPC> portpc;

	/**
	 * The cached value of the '{@link #getSys2clientcp() <em>Sys2clientcp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys2clientcp()
	 * @generated
	 * @ordered
	 */
	protected EList<Sys2ClientCP> sys2clientcp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected interfacesCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACES_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRC> getPortrc() {
		if (portrc == null) {
			portrc = new EObjectContainmentEList<PortRC>(PortRC.class, this, CCSPackage.INTERFACES_C__PORTRC);
		}
		return portrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortPC> getPortpc() {
		if (portpc == null) {
			portpc = new EObjectContainmentEList<PortPC>(PortPC.class, this, CCSPackage.INTERFACES_C__PORTPC);
		}
		return portpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sys2ClientCP> getSys2clientcp() {
		if (sys2clientcp == null) {
			sys2clientcp = new EObjectContainmentEList<Sys2ClientCP>(Sys2ClientCP.class, this,
					CCSPackage.INTERFACES_C__SYS2CLIENTCP);
		}
		return sys2clientcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACES_C__PORTRC:
			return ((InternalEList<?>) getPortrc()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_C__PORTPC:
			return ((InternalEList<?>) getPortpc()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_C__SYS2CLIENTCP:
			return ((InternalEList<?>) getSys2clientcp()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACES_C__PORTRC:
			return getPortrc();
		case CCSPackage.INTERFACES_C__PORTPC:
			return getPortpc();
		case CCSPackage.INTERFACES_C__SYS2CLIENTCP:
			return getSys2clientcp();
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
		case CCSPackage.INTERFACES_C__PORTRC:
			getPortrc().clear();
			getPortrc().addAll((Collection<? extends PortRC>) newValue);
			return;
		case CCSPackage.INTERFACES_C__PORTPC:
			getPortpc().clear();
			getPortpc().addAll((Collection<? extends PortPC>) newValue);
			return;
		case CCSPackage.INTERFACES_C__SYS2CLIENTCP:
			getSys2clientcp().clear();
			getSys2clientcp().addAll((Collection<? extends Sys2ClientCP>) newValue);
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
		case CCSPackage.INTERFACES_C__PORTRC:
			getPortrc().clear();
			return;
		case CCSPackage.INTERFACES_C__PORTPC:
			getPortpc().clear();
			return;
		case CCSPackage.INTERFACES_C__SYS2CLIENTCP:
			getSys2clientcp().clear();
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
		case CCSPackage.INTERFACES_C__PORTRC:
			return portrc != null && !portrc.isEmpty();
		case CCSPackage.INTERFACES_C__PORTPC:
			return portpc != null && !portpc.isEmpty();
		case CCSPackage.INTERFACES_C__SYS2CLIENTCP:
			return sys2clientcp != null && !sys2clientcp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //interfacesCImpl
