/**
 */
package cCS.impl;

import cCS.AGamma2DB;
import cCS.CCSPackage;
import cCS.PGamma2DB;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGamma2 DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PGamma2DBImpl#getAgamma2db <em>Agamma2db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGamma2DBImpl extends RPCompImpl implements PGamma2DB {
	/**
	 * The cached value of the '{@link #getAgamma2db() <em>Agamma2db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgamma2db()
	 * @generated
	 * @ordered
	 */
	protected AGamma2DB agamma2db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGamma2DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PGAMMA2_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2DB getAgamma2db() {
		if (agamma2db != null && agamma2db.eIsProxy()) {
			InternalEObject oldAgamma2db = (InternalEObject) agamma2db;
			agamma2db = (AGamma2DB) eResolveProxy(oldAgamma2db);
			if (agamma2db != oldAgamma2db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PGAMMA2_DB__AGAMMA2DB,
							oldAgamma2db, agamma2db));
			}
		}
		return agamma2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2DB basicGetAgamma2db() {
		return agamma2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgamma2db(AGamma2DB newAgamma2db) {
		AGamma2DB oldAgamma2db = agamma2db;
		agamma2db = newAgamma2db;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PGAMMA2_DB__AGAMMA2DB, oldAgamma2db,
					agamma2db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.PGAMMA2_DB__AGAMMA2DB:
			if (resolve)
				return getAgamma2db();
			return basicGetAgamma2db();
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
		case CCSPackage.PGAMMA2_DB__AGAMMA2DB:
			setAgamma2db((AGamma2DB) newValue);
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
		case CCSPackage.PGAMMA2_DB__AGAMMA2DB:
			setAgamma2db((AGamma2DB) null);
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
		case CCSPackage.PGAMMA2_DB__AGAMMA2DB:
			return agamma2db != null;
		}
		return super.eIsSet(featureID);
	}

} //PGamma2DBImpl
