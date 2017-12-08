/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.DBInterface;
import cCS.PBeta2DB;
import cCS.PDB2Beta;
import cCS.PDB2Gamma;
import cCS.PGamma2DB;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.DBInterfaceImpl#getPdb2gamma <em>Pdb2gamma</em>}</li>
 *   <li>{@link cCS.impl.DBInterfaceImpl#getPgamma2db <em>Pgamma2db</em>}</li>
 *   <li>{@link cCS.impl.DBInterfaceImpl#getPdb2beta <em>Pdb2beta</em>}</li>
 *   <li>{@link cCS.impl.DBInterfaceImpl#getPbeta2db <em>Pbeta2db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBInterfaceImpl extends InterfaceComponentImpl implements DBInterface {
	/**
	 * The cached value of the '{@link #getPdb2gamma() <em>Pdb2gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdb2gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<PDB2Gamma> pdb2gamma;

	/**
	 * The cached value of the '{@link #getPgamma2db() <em>Pgamma2db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgamma2db()
	 * @generated
	 * @ordered
	 */
	protected EList<PGamma2DB> pgamma2db;

	/**
	 * The cached value of the '{@link #getPdb2beta() <em>Pdb2beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdb2beta()
	 * @generated
	 * @ordered
	 */
	protected EList<PDB2Beta> pdb2beta;

	/**
	 * The cached value of the '{@link #getPbeta2db() <em>Pbeta2db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPbeta2db()
	 * @generated
	 * @ordered
	 */
	protected EList<PBeta2DB> pbeta2db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.DB_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDB2Gamma> getPdb2gamma() {
		if (pdb2gamma == null) {
			pdb2gamma = new EObjectContainmentEList<PDB2Gamma>(PDB2Gamma.class, this,
					CCSPackage.DB_INTERFACE__PDB2GAMMA);
		}
		return pdb2gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PGamma2DB> getPgamma2db() {
		if (pgamma2db == null) {
			pgamma2db = new EObjectContainmentEList<PGamma2DB>(PGamma2DB.class, this,
					CCSPackage.DB_INTERFACE__PGAMMA2DB);
		}
		return pgamma2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDB2Beta> getPdb2beta() {
		if (pdb2beta == null) {
			pdb2beta = new EObjectContainmentEList<PDB2Beta>(PDB2Beta.class, this, CCSPackage.DB_INTERFACE__PDB2BETA);
		}
		return pdb2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PBeta2DB> getPbeta2db() {
		if (pbeta2db == null) {
			pbeta2db = new EObjectContainmentEList<PBeta2DB>(PBeta2DB.class, this, CCSPackage.DB_INTERFACE__PBETA2DB);
		}
		return pbeta2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.DB_INTERFACE__PDB2GAMMA:
			return ((InternalEList<?>) getPdb2gamma()).basicRemove(otherEnd, msgs);
		case CCSPackage.DB_INTERFACE__PGAMMA2DB:
			return ((InternalEList<?>) getPgamma2db()).basicRemove(otherEnd, msgs);
		case CCSPackage.DB_INTERFACE__PDB2BETA:
			return ((InternalEList<?>) getPdb2beta()).basicRemove(otherEnd, msgs);
		case CCSPackage.DB_INTERFACE__PBETA2DB:
			return ((InternalEList<?>) getPbeta2db()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.DB_INTERFACE__PDB2GAMMA:
			return getPdb2gamma();
		case CCSPackage.DB_INTERFACE__PGAMMA2DB:
			return getPgamma2db();
		case CCSPackage.DB_INTERFACE__PDB2BETA:
			return getPdb2beta();
		case CCSPackage.DB_INTERFACE__PBETA2DB:
			return getPbeta2db();
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
		case CCSPackage.DB_INTERFACE__PDB2GAMMA:
			getPdb2gamma().clear();
			getPdb2gamma().addAll((Collection<? extends PDB2Gamma>) newValue);
			return;
		case CCSPackage.DB_INTERFACE__PGAMMA2DB:
			getPgamma2db().clear();
			getPgamma2db().addAll((Collection<? extends PGamma2DB>) newValue);
			return;
		case CCSPackage.DB_INTERFACE__PDB2BETA:
			getPdb2beta().clear();
			getPdb2beta().addAll((Collection<? extends PDB2Beta>) newValue);
			return;
		case CCSPackage.DB_INTERFACE__PBETA2DB:
			getPbeta2db().clear();
			getPbeta2db().addAll((Collection<? extends PBeta2DB>) newValue);
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
		case CCSPackage.DB_INTERFACE__PDB2GAMMA:
			getPdb2gamma().clear();
			return;
		case CCSPackage.DB_INTERFACE__PGAMMA2DB:
			getPgamma2db().clear();
			return;
		case CCSPackage.DB_INTERFACE__PDB2BETA:
			getPdb2beta().clear();
			return;
		case CCSPackage.DB_INTERFACE__PBETA2DB:
			getPbeta2db().clear();
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
		case CCSPackage.DB_INTERFACE__PDB2GAMMA:
			return pdb2gamma != null && !pdb2gamma.isEmpty();
		case CCSPackage.DB_INTERFACE__PGAMMA2DB:
			return pgamma2db != null && !pgamma2db.isEmpty();
		case CCSPackage.DB_INTERFACE__PDB2BETA:
			return pdb2beta != null && !pdb2beta.isEmpty();
		case CCSPackage.DB_INTERFACE__PBETA2DB:
			return pbeta2db != null && !pbeta2db.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DBInterfaceImpl
