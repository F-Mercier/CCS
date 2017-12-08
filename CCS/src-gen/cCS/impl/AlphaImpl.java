/**
 */
package cCS.impl;

import cCS.Alpha;
import cCS.CCSPackage;
import cCS.InterfaceAlpha;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.AlphaImpl#getInterfacealpha <em>Interfacealpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaImpl extends ConnectorImpl implements Alpha {
	/**
	 * The cached value of the '{@link #getInterfacealpha() <em>Interfacealpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacealpha()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAlpha> interfacealpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceAlpha> getInterfacealpha() {
		if (interfacealpha == null) {
			interfacealpha = new EObjectContainmentEList<InterfaceAlpha>(InterfaceAlpha.class, this,
					CCSPackage.ALPHA__INTERFACEALPHA);
		}
		return interfacealpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.ALPHA__INTERFACEALPHA:
			return ((InternalEList<?>) getInterfacealpha()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.ALPHA__INTERFACEALPHA:
			return getInterfacealpha();
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
		case CCSPackage.ALPHA__INTERFACEALPHA:
			getInterfacealpha().clear();
			getInterfacealpha().addAll((Collection<? extends InterfaceAlpha>) newValue);
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
		case CCSPackage.ALPHA__INTERFACEALPHA:
			getInterfacealpha().clear();
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
		case CCSPackage.ALPHA__INTERFACEALPHA:
			return interfacealpha != null && !interfacealpha.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaImpl
