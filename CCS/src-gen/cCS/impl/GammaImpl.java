/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.Gamma;
import cCS.InterfaceGamma;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.GammaImpl#getInterfacegamma <em>Interfacegamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GammaImpl extends ConnectorImpl implements Gamma {
	/**
	 * The cached value of the '{@link #getInterfacegamma() <em>Interfacegamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacegamma()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceGamma> interfacegamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceGamma> getInterfacegamma() {
		if (interfacegamma == null) {
			interfacegamma = new EObjectContainmentEList<InterfaceGamma>(InterfaceGamma.class, this,
					CCSPackage.GAMMA__INTERFACEGAMMA);
		}
		return interfacegamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.GAMMA__INTERFACEGAMMA:
			return ((InternalEList<?>) getInterfacegamma()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.GAMMA__INTERFACEGAMMA:
			return getInterfacegamma();
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
		case CCSPackage.GAMMA__INTERFACEGAMMA:
			getInterfacegamma().clear();
			getInterfacegamma().addAll((Collection<? extends InterfaceGamma>) newValue);
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
		case CCSPackage.GAMMA__INTERFACEGAMMA:
			getInterfacegamma().clear();
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
		case CCSPackage.GAMMA__INTERFACEGAMMA:
			return interfacegamma != null && !interfacegamma.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GammaImpl
