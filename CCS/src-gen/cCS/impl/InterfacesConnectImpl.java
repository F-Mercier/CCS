/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfacesConnect;
import cCS.PAlpha2Connect;
import cCS.PConnect2Alpha;
import cCS.PConnect2Gamma;
import cCS.PGamma2Connect;
import cCS.ServConf2ConnectConnectP;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interfaces Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfacesConnectImpl#getPalpha2connect <em>Palpha2connect</em>}</li>
 *   <li>{@link cCS.impl.InterfacesConnectImpl#getPconnect2alpha <em>Pconnect2alpha</em>}</li>
 *   <li>{@link cCS.impl.InterfacesConnectImpl#getPconnect2gamma <em>Pconnect2gamma</em>}</li>
 *   <li>{@link cCS.impl.InterfacesConnectImpl#getPgamma2connect <em>Pgamma2connect</em>}</li>
 *   <li>{@link cCS.impl.InterfacesConnectImpl#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfacesConnectImpl extends InterfaceComponentImpl implements InterfacesConnect {
	/**
	 * The cached value of the '{@link #getPalpha2connect() <em>Palpha2connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalpha2connect()
	 * @generated
	 * @ordered
	 */
	protected EList<PAlpha2Connect> palpha2connect;

	/**
	 * The cached value of the '{@link #getPconnect2alpha() <em>Pconnect2alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconnect2alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<PConnect2Alpha> pconnect2alpha;

	/**
	 * The cached value of the '{@link #getPconnect2gamma() <em>Pconnect2gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconnect2gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<PConnect2Gamma> pconnect2gamma;

	/**
	 * The cached value of the '{@link #getPgamma2connect() <em>Pgamma2connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgamma2connect()
	 * @generated
	 * @ordered
	 */
	protected EList<PGamma2Connect> pgamma2connect;

	/**
	 * The cached value of the '{@link #getServconf2connectconnectp() <em>Servconf2connectconnectp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServconf2connectconnectp()
	 * @generated
	 * @ordered
	 */
	protected EList<ServConf2ConnectConnectP> servconf2connectconnectp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacesConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACES_CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAlpha2Connect> getPalpha2connect() {
		if (palpha2connect == null) {
			palpha2connect = new EObjectContainmentEList<PAlpha2Connect>(PAlpha2Connect.class, this,
					CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT);
		}
		return palpha2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PConnect2Alpha> getPconnect2alpha() {
		if (pconnect2alpha == null) {
			pconnect2alpha = new EObjectContainmentEList<PConnect2Alpha>(PConnect2Alpha.class, this,
					CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA);
		}
		return pconnect2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PConnect2Gamma> getPconnect2gamma() {
		if (pconnect2gamma == null) {
			pconnect2gamma = new EObjectContainmentEList<PConnect2Gamma>(PConnect2Gamma.class, this,
					CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA);
		}
		return pconnect2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PGamma2Connect> getPgamma2connect() {
		if (pgamma2connect == null) {
			pgamma2connect = new EObjectContainmentEList<PGamma2Connect>(PGamma2Connect.class, this,
					CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT);
		}
		return pgamma2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServConf2ConnectConnectP> getServconf2connectconnectp() {
		if (servconf2connectconnectp == null) {
			servconf2connectconnectp = new EObjectContainmentEList<ServConf2ConnectConnectP>(
					ServConf2ConnectConnectP.class, this, CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP);
		}
		return servconf2connectconnectp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT:
			return ((InternalEList<?>) getPalpha2connect()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA:
			return ((InternalEList<?>) getPconnect2alpha()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA:
			return ((InternalEList<?>) getPconnect2gamma()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT:
			return ((InternalEList<?>) getPgamma2connect()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP:
			return ((InternalEList<?>) getServconf2connectconnectp()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT:
			return getPalpha2connect();
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA:
			return getPconnect2alpha();
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA:
			return getPconnect2gamma();
		case CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT:
			return getPgamma2connect();
		case CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP:
			return getServconf2connectconnectp();
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
		case CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT:
			getPalpha2connect().clear();
			getPalpha2connect().addAll((Collection<? extends PAlpha2Connect>) newValue);
			return;
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA:
			getPconnect2alpha().clear();
			getPconnect2alpha().addAll((Collection<? extends PConnect2Alpha>) newValue);
			return;
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA:
			getPconnect2gamma().clear();
			getPconnect2gamma().addAll((Collection<? extends PConnect2Gamma>) newValue);
			return;
		case CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT:
			getPgamma2connect().clear();
			getPgamma2connect().addAll((Collection<? extends PGamma2Connect>) newValue);
			return;
		case CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP:
			getServconf2connectconnectp().clear();
			getServconf2connectconnectp().addAll((Collection<? extends ServConf2ConnectConnectP>) newValue);
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
		case CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT:
			getPalpha2connect().clear();
			return;
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA:
			getPconnect2alpha().clear();
			return;
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA:
			getPconnect2gamma().clear();
			return;
		case CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT:
			getPgamma2connect().clear();
			return;
		case CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP:
			getServconf2connectconnectp().clear();
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
		case CCSPackage.INTERFACES_CONNECT__PALPHA2CONNECT:
			return palpha2connect != null && !palpha2connect.isEmpty();
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2ALPHA:
			return pconnect2alpha != null && !pconnect2alpha.isEmpty();
		case CCSPackage.INTERFACES_CONNECT__PCONNECT2GAMMA:
			return pconnect2gamma != null && !pconnect2gamma.isEmpty();
		case CCSPackage.INTERFACES_CONNECT__PGAMMA2CONNECT:
			return pgamma2connect != null && !pgamma2connect.isEmpty();
		case CCSPackage.INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP:
			return servconf2connectconnectp != null && !servconf2connectconnectp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfacesConnectImpl
