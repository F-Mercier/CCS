/**
 */
package cCS.impl;

import cCS.ABeta2DB;
import cCS.CCSPackage;
import cCS.RBeta2DB;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBeta2 DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.RBeta2DBImpl#getAbeta2db <em>Abeta2db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBeta2DBImpl extends PRImpl implements RBeta2DB {
	/**
	 * The cached value of the '{@link #getAbeta2db() <em>Abeta2db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbeta2db()
	 * @generated
	 * @ordered
	 */
	protected ABeta2DB abeta2db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBeta2DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.RBETA2_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2DB getAbeta2db() {
		if (abeta2db != null && abeta2db.eIsProxy()) {
			InternalEObject oldAbeta2db = (InternalEObject) abeta2db;
			abeta2db = (ABeta2DB) eResolveProxy(oldAbeta2db);
			if (abeta2db != oldAbeta2db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.RBETA2_DB__ABETA2DB,
							oldAbeta2db, abeta2db));
			}
		}
		return abeta2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2DB basicGetAbeta2db() {
		return abeta2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbeta2db(ABeta2DB newAbeta2db) {
		ABeta2DB oldAbeta2db = abeta2db;
		abeta2db = newAbeta2db;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.RBETA2_DB__ABETA2DB, oldAbeta2db,
					abeta2db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CCSPackage.RBETA2_DB__ABETA2DB:
			if (resolve)
				return getAbeta2db();
			return basicGetAbeta2db();
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
		case CCSPackage.RBETA2_DB__ABETA2DB:
			setAbeta2db((ABeta2DB) newValue);
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
		case CCSPackage.RBETA2_DB__ABETA2DB:
			setAbeta2db((ABeta2DB) null);
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
		case CCSPackage.RBETA2_DB__ABETA2DB:
			return abeta2db != null;
		}
		return super.eIsSet(featureID);
	}

} //RBeta2DBImpl
