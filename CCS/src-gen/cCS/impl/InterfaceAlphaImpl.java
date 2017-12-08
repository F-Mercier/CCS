/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.InterfaceAlpha;
import cCS.RAlpha2Connect;
import cCS.RAlpha2Sec;
import cCS.RConnect2Alpha;
import cCS.RSec2Alpha;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.InterfaceAlphaImpl#getRsec2alpha <em>Rsec2alpha</em>}</li>
 *   <li>{@link cCS.impl.InterfaceAlphaImpl#getRalpha2sec <em>Ralpha2sec</em>}</li>
 *   <li>{@link cCS.impl.InterfaceAlphaImpl#getRconnect2alpha <em>Rconnect2alpha</em>}</li>
 *   <li>{@link cCS.impl.InterfaceAlphaImpl#getRalpha2connect <em>Ralpha2connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceAlphaImpl extends InterfaceConnectorImpl implements InterfaceAlpha {
	/**
	 * The cached value of the '{@link #getRsec2alpha() <em>Rsec2alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsec2alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<RSec2Alpha> rsec2alpha;

	/**
	 * The cached value of the '{@link #getRalpha2sec() <em>Ralpha2sec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRalpha2sec()
	 * @generated
	 * @ordered
	 */
	protected EList<RAlpha2Sec> ralpha2sec;

	/**
	 * The cached value of the '{@link #getRconnect2alpha() <em>Rconnect2alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRconnect2alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<RConnect2Alpha> rconnect2alpha;

	/**
	 * The cached value of the '{@link #getRalpha2connect() <em>Ralpha2connect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRalpha2connect()
	 * @generated
	 * @ordered
	 */
	protected EList<RAlpha2Connect> ralpha2connect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceAlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.INTERFACE_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RSec2Alpha> getRsec2alpha() {
		if (rsec2alpha == null) {
			rsec2alpha = new EObjectContainmentEList<RSec2Alpha>(RSec2Alpha.class, this,
					CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA);
		}
		return rsec2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RAlpha2Sec> getRalpha2sec() {
		if (ralpha2sec == null) {
			ralpha2sec = new EObjectContainmentEList<RAlpha2Sec>(RAlpha2Sec.class, this,
					CCSPackage.INTERFACE_ALPHA__RALPHA2SEC);
		}
		return ralpha2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RConnect2Alpha> getRconnect2alpha() {
		if (rconnect2alpha == null) {
			rconnect2alpha = new EObjectContainmentEList<RConnect2Alpha>(RConnect2Alpha.class, this,
					CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA);
		}
		return rconnect2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RAlpha2Connect> getRalpha2connect() {
		if (ralpha2connect == null) {
			ralpha2connect = new EObjectContainmentEList<RAlpha2Connect>(RAlpha2Connect.class, this,
					CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT);
		}
		return ralpha2connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA:
			return ((InternalEList<?>) getRsec2alpha()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_ALPHA__RALPHA2SEC:
			return ((InternalEList<?>) getRalpha2sec()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA:
			return ((InternalEList<?>) getRconnect2alpha()).basicRemove(otherEnd, msgs);
		case CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT:
			return ((InternalEList<?>) getRalpha2connect()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA:
			return getRsec2alpha();
		case CCSPackage.INTERFACE_ALPHA__RALPHA2SEC:
			return getRalpha2sec();
		case CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA:
			return getRconnect2alpha();
		case CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT:
			return getRalpha2connect();
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
		case CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA:
			getRsec2alpha().clear();
			getRsec2alpha().addAll((Collection<? extends RSec2Alpha>) newValue);
			return;
		case CCSPackage.INTERFACE_ALPHA__RALPHA2SEC:
			getRalpha2sec().clear();
			getRalpha2sec().addAll((Collection<? extends RAlpha2Sec>) newValue);
			return;
		case CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA:
			getRconnect2alpha().clear();
			getRconnect2alpha().addAll((Collection<? extends RConnect2Alpha>) newValue);
			return;
		case CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT:
			getRalpha2connect().clear();
			getRalpha2connect().addAll((Collection<? extends RAlpha2Connect>) newValue);
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
		case CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA:
			getRsec2alpha().clear();
			return;
		case CCSPackage.INTERFACE_ALPHA__RALPHA2SEC:
			getRalpha2sec().clear();
			return;
		case CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA:
			getRconnect2alpha().clear();
			return;
		case CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT:
			getRalpha2connect().clear();
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
		case CCSPackage.INTERFACE_ALPHA__RSEC2ALPHA:
			return rsec2alpha != null && !rsec2alpha.isEmpty();
		case CCSPackage.INTERFACE_ALPHA__RALPHA2SEC:
			return ralpha2sec != null && !ralpha2sec.isEmpty();
		case CCSPackage.INTERFACE_ALPHA__RCONNECT2ALPHA:
			return rconnect2alpha != null && !rconnect2alpha.isEmpty();
		case CCSPackage.INTERFACE_ALPHA__RALPHA2CONNECT:
			return ralpha2connect != null && !ralpha2connect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceAlphaImpl
