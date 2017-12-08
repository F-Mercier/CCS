/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceGamma;
import cCS.RConnect2Gamma;
import cCS.RDB2Gamma;
import cCS.RGamma2Connect;
import cCS.RGamma2DB;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceGammaImpl#getRconnect2gamma <em>Rconnect2gamma</em>}</li>
 *   <li>{@link cCS.impl.InterfaceGammaImpl#getRgamma2connect <em>Rgamma2connect</em>}</li>
 *   <li>{@link cCS.impl.InterfaceGammaImpl#getRdb2gamma <em>Rdb2gamma</em>}</li>
 *   <li>{@link cCS.impl.InterfaceGammaImpl#getRgamma2db <em>Rgamma2db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceGammaImpl extends InterfaceConnectorImpl implements InterfaceGamma {
	/**
	 * The cached value of the '{@link #getRconnect2gamma() <em>Rconnect2gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRconnect2gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<RConnect2Gamma> rconnect2gamma;

	/**
	 * The cached value of the '{@link #getRgamma2connect() <em>Rgamma2connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgamma2connect()
	 * @generated
	 * @ordered
	 */
	protected EList<RGamma2Connect> rgamma2connect;

	/**
	 * The cached value of the '{@link #getRdb2gamma() <em>Rdb2gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdb2gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<RDB2Gamma> rdb2gamma;

	/**
	 * The cached value of the '{@link #getRgamma2db() <em>Rgamma2db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgamma2db()
	 * @generated
	 * @ordered
	 */
	protected EList<RGamma2DB> rgamma2db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceGammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RConnect2Gamma> getRconnect2gamma() {
		if (rconnect2gamma == null) {
			rconnect2gamma = new EObjectContainmentEList<RConnect2Gamma>(RConnect2Gamma.class, this,
					CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA);
		}
		return rconnect2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RGamma2Connect> getRgamma2connect() {
		if (rgamma2connect == null) {
			rgamma2connect = new EObjectContainmentEList<RGamma2Connect>(RGamma2Connect.class, this,
					CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT);
		}
		return rgamma2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDB2Gamma> getRdb2gamma() {
		if (rdb2gamma == null) {
			rdb2gamma = new EObjectContainmentEList<RDB2Gamma>(RDB2Gamma.class, this,
					CCSPackage.INTERFACE_GAMMA__RDB2GAMMA);
		}
		return rdb2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RGamma2DB> getRgamma2db() {
		if (rgamma2db == null) {
			rgamma2db = new EObjectContainmentEList<RGamma2DB>(RGamma2DB.class, this,
					CCSPackage.INTERFACE_GAMMA__RGAMMA2DB);
		}
		return rgamma2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA:
			return ((InternalEList<?>) getRconnect2gamma()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT:
			return ((InternalEList<?>) getRgamma2connect()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_GAMMA__RDB2GAMMA:
			return ((InternalEList<?>) getRdb2gamma()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2DB:
			return ((InternalEList<?>) getRgamma2db()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA:
			return getRconnect2gamma();
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT:
			return getRgamma2connect();
		case CCSPackage.INTERFACE_GAMMA__RDB2GAMMA:
			return getRdb2gamma();
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2DB:
			return getRgamma2db();
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
		case CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA:
			getRconnect2gamma().clear();
			getRconnect2gamma().addAll((Collection<? extends RConnect2Gamma>) newValue);
			return;
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT:
			getRgamma2connect().clear();
			getRgamma2connect().addAll((Collection<? extends RGamma2Connect>) newValue);
			return;
		case CCSPackage.INTERFACE_GAMMA__RDB2GAMMA:
			getRdb2gamma().clear();
			getRdb2gamma().addAll((Collection<? extends RDB2Gamma>) newValue);
			return;
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2DB:
			getRgamma2db().clear();
			getRgamma2db().addAll((Collection<? extends RGamma2DB>) newValue);
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
		case CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA:
			getRconnect2gamma().clear();
			return;
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT:
			getRgamma2connect().clear();
			return;
		case CCSPackage.INTERFACE_GAMMA__RDB2GAMMA:
			getRdb2gamma().clear();
			return;
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2DB:
			getRgamma2db().clear();
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
		case CCSPackage.INTERFACE_GAMMA__RCONNECT2GAMMA:
			return rconnect2gamma != null && !rconnect2gamma.isEmpty();
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2CONNECT:
			return rgamma2connect != null && !rgamma2connect.isEmpty();
		case CCSPackage.INTERFACE_GAMMA__RDB2GAMMA:
			return rdb2gamma != null && !rdb2gamma.isEmpty();
		case CCSPackage.INTERFACE_GAMMA__RGAMMA2DB:
			return rgamma2db != null && !rgamma2db.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceGammaImpl
