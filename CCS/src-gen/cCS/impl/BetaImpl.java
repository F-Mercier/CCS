/**
 */
package cCS.impl;

import cCS.Beta;
import cCS.CCSPackage;
import cCS.InterfaceBeta;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.BetaImpl#getInterfacebeta <em>Interfacebeta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetaImpl extends ConnectorImpl implements Beta {
	/**
	 * The cached value of the '{@link #getInterfacebeta() <em>Interfacebeta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacebeta()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceBeta> interfacebeta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceBeta> getInterfacebeta() {
		if (interfacebeta == null) {
			interfacebeta = new EObjectContainmentEList<InterfaceBeta>(InterfaceBeta.class, this,
					CCSPackage.BETA__INTERFACEBETA);
		}
		return interfacebeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.BETA__INTERFACEBETA:
			return ((InternalEList<?>) getInterfacebeta()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.BETA__INTERFACEBETA:
			return getInterfacebeta();
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
		case CCSPackage.BETA__INTERFACEBETA:
			getInterfacebeta().clear();
			getInterfacebeta().addAll((Collection<? extends InterfaceBeta>) newValue);
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
		case CCSPackage.BETA__INTERFACEBETA:
			getInterfacebeta().clear();
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
		case CCSPackage.BETA__INTERFACEBETA:
			return interfacebeta != null && !interfacebeta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BetaImpl
