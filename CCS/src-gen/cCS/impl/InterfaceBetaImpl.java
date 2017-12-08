/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceBeta;
import cCS.RBeta2DB;
import cCS.RBeta2Sec;
import cCS.RDB2Beta;
import cCS.RSec2Beta;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceBetaImpl#getRbeta2sec <em>Rbeta2sec</em>}</li>
 *   <li>{@link cCS.impl.InterfaceBetaImpl#getRsec2beta <em>Rsec2beta</em>}</li>
 *   <li>{@link cCS.impl.InterfaceBetaImpl#getRbeta2db <em>Rbeta2db</em>}</li>
 *   <li>{@link cCS.impl.InterfaceBetaImpl#getRdb2beta <em>Rdb2beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceBetaImpl extends InterfaceConnectorImpl implements InterfaceBeta {
	/**
	 * The cached value of the '{@link #getRbeta2sec() <em>Rbeta2sec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbeta2sec()
	 * @generated
	 * @ordered
	 */
	protected EList<RBeta2Sec> rbeta2sec;

	/**
	 * The cached value of the '{@link #getRsec2beta() <em>Rsec2beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsec2beta()
	 * @generated
	 * @ordered
	 */
	protected EList<RSec2Beta> rsec2beta;

	/**
	 * The cached value of the '{@link #getRbeta2db() <em>Rbeta2db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbeta2db()
	 * @generated
	 * @ordered
	 */
	protected EList<RBeta2DB> rbeta2db;

	/**
	 * The cached value of the '{@link #getRdb2beta() <em>Rdb2beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdb2beta()
	 * @generated
	 * @ordered
	 */
	protected EList<RDB2Beta> rdb2beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceBetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBeta2Sec> getRbeta2sec() {
		if (rbeta2sec == null) {
			rbeta2sec = new EObjectContainmentEList<RBeta2Sec>(RBeta2Sec.class, this,
					CCSPackage.INTERFACE_BETA__RBETA2SEC);
		}
		return rbeta2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RSec2Beta> getRsec2beta() {
		if (rsec2beta == null) {
			rsec2beta = new EObjectContainmentEList<RSec2Beta>(RSec2Beta.class, this,
					CCSPackage.INTERFACE_BETA__RSEC2BETA);
		}
		return rsec2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBeta2DB> getRbeta2db() {
		if (rbeta2db == null) {
			rbeta2db = new EObjectContainmentEList<RBeta2DB>(RBeta2DB.class, this, CCSPackage.INTERFACE_BETA__RBETA2DB);
		}
		return rbeta2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDB2Beta> getRdb2beta() {
		if (rdb2beta == null) {
			rdb2beta = new EObjectContainmentEList<RDB2Beta>(RDB2Beta.class, this, CCSPackage.INTERFACE_BETA__RDB2BETA);
		}
		return rdb2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACE_BETA__RBETA2SEC:
			return ((InternalEList<?>) getRbeta2sec()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_BETA__RSEC2BETA:
			return ((InternalEList<?>) getRsec2beta()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_BETA__RBETA2DB:
			return ((InternalEList<?>) getRbeta2db()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_BETA__RDB2BETA:
			return ((InternalEList<?>) getRdb2beta()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACE_BETA__RBETA2SEC:
			return getRbeta2sec();
		case CCSPackage.INTERFACE_BETA__RSEC2BETA:
			return getRsec2beta();
		case CCSPackage.INTERFACE_BETA__RBETA2DB:
			return getRbeta2db();
		case CCSPackage.INTERFACE_BETA__RDB2BETA:
			return getRdb2beta();
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
		case CCSPackage.INTERFACE_BETA__RBETA2SEC:
			getRbeta2sec().clear();
			getRbeta2sec().addAll((Collection<? extends RBeta2Sec>) newValue);
			return;
		case CCSPackage.INTERFACE_BETA__RSEC2BETA:
			getRsec2beta().clear();
			getRsec2beta().addAll((Collection<? extends RSec2Beta>) newValue);
			return;
		case CCSPackage.INTERFACE_BETA__RBETA2DB:
			getRbeta2db().clear();
			getRbeta2db().addAll((Collection<? extends RBeta2DB>) newValue);
			return;
		case CCSPackage.INTERFACE_BETA__RDB2BETA:
			getRdb2beta().clear();
			getRdb2beta().addAll((Collection<? extends RDB2Beta>) newValue);
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
		case CCSPackage.INTERFACE_BETA__RBETA2SEC:
			getRbeta2sec().clear();
			return;
		case CCSPackage.INTERFACE_BETA__RSEC2BETA:
			getRsec2beta().clear();
			return;
		case CCSPackage.INTERFACE_BETA__RBETA2DB:
			getRbeta2db().clear();
			return;
		case CCSPackage.INTERFACE_BETA__RDB2BETA:
			getRdb2beta().clear();
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
		case CCSPackage.INTERFACE_BETA__RBETA2SEC:
			return rbeta2sec != null && !rbeta2sec.isEmpty();
		case CCSPackage.INTERFACE_BETA__RSEC2BETA:
			return rsec2beta != null && !rsec2beta.isEmpty();
		case CCSPackage.INTERFACE_BETA__RBETA2DB:
			return rbeta2db != null && !rbeta2db.isEmpty();
		case CCSPackage.INTERFACE_BETA__RDB2BETA:
			return rdb2beta != null && !rdb2beta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceBetaImpl
