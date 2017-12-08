/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PAlpha2Sec;
import cCS.PBeta2Sec;
import cCS.PSec2Alpha;
import cCS.PSec2Beta;
import cCS.SecurityInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.SecurityInterfaceImpl#getPsec2beta <em>Psec2beta</em>}</li>
 *   <li>{@link cCS.impl.SecurityInterfaceImpl#getPbeta2sec <em>Pbeta2sec</em>}</li>
 *   <li>{@link cCS.impl.SecurityInterfaceImpl#getPalpha2sec <em>Palpha2sec</em>}</li>
 *   <li>{@link cCS.impl.SecurityInterfaceImpl#getPsec2alpha <em>Psec2alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityInterfaceImpl extends InterfaceComponentImpl implements SecurityInterface {
	/**
	 * The cached value of the '{@link #getPsec2beta() <em>Psec2beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsec2beta()
	 * @generated
	 * @ordered
	 */
	protected EList<PSec2Beta> psec2beta;

	/**
	 * The cached value of the '{@link #getPbeta2sec() <em>Pbeta2sec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPbeta2sec()
	 * @generated
	 * @ordered
	 */
	protected EList<PBeta2Sec> pbeta2sec;

	/**
	 * The cached value of the '{@link #getPalpha2sec() <em>Palpha2sec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalpha2sec()
	 * @generated
	 * @ordered
	 */
	protected EList<PAlpha2Sec> palpha2sec;

	/**
	 * The cached value of the '{@link #getPsec2alpha() <em>Psec2alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsec2alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<PSec2Alpha> psec2alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.SECURITY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSec2Beta> getPsec2beta() {
		if (psec2beta == null) {
			psec2beta = new EObjectContainmentEList<PSec2Beta>(PSec2Beta.class, this,
					CCSPackage.SECURITY_INTERFACE__PSEC2BETA);
		}
		return psec2beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PBeta2Sec> getPbeta2sec() {
		if (pbeta2sec == null) {
			pbeta2sec = new EObjectContainmentEList<PBeta2Sec>(PBeta2Sec.class, this,
					CCSPackage.SECURITY_INTERFACE__PBETA2SEC);
		}
		return pbeta2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAlpha2Sec> getPalpha2sec() {
		if (palpha2sec == null) {
			palpha2sec = new EObjectContainmentEList<PAlpha2Sec>(PAlpha2Sec.class, this,
					CCSPackage.SECURITY_INTERFACE__PALPHA2SEC);
		}
		return palpha2sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSec2Alpha> getPsec2alpha() {
		if (psec2alpha == null) {
			psec2alpha = new EObjectContainmentEList<PSec2Alpha>(PSec2Alpha.class, this,
					CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA);
		}
		return psec2alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.SECURITY_INTERFACE__PSEC2BETA:
			return ((InternalEList<?>) getPsec2beta()).basicRemove(otherEnd, msgs);
		case CCSPackage.SECURITY_INTERFACE__PBETA2SEC:
			return ((InternalEList<?>) getPbeta2sec()).basicRemove(otherEnd, msgs);
		case CCSPackage.SECURITY_INTERFACE__PALPHA2SEC:
			return ((InternalEList<?>) getPalpha2sec()).basicRemove(otherEnd, msgs);
		case CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA:
			return ((InternalEList<?>) getPsec2alpha()).basicRemove(otherEnd, msgs);
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
		case CCSPackage.SECURITY_INTERFACE__PSEC2BETA:
			return getPsec2beta();
		case CCSPackage.SECURITY_INTERFACE__PBETA2SEC:
			return getPbeta2sec();
		case CCSPackage.SECURITY_INTERFACE__PALPHA2SEC:
			return getPalpha2sec();
		case CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA:
			return getPsec2alpha();
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
		case CCSPackage.SECURITY_INTERFACE__PSEC2BETA:
			getPsec2beta().clear();
			getPsec2beta().addAll((Collection<? extends PSec2Beta>) newValue);
			return;
		case CCSPackage.SECURITY_INTERFACE__PBETA2SEC:
			getPbeta2sec().clear();
			getPbeta2sec().addAll((Collection<? extends PBeta2Sec>) newValue);
			return;
		case CCSPackage.SECURITY_INTERFACE__PALPHA2SEC:
			getPalpha2sec().clear();
			getPalpha2sec().addAll((Collection<? extends PAlpha2Sec>) newValue);
			return;
		case CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA:
			getPsec2alpha().clear();
			getPsec2alpha().addAll((Collection<? extends PSec2Alpha>) newValue);
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
		case CCSPackage.SECURITY_INTERFACE__PSEC2BETA:
			getPsec2beta().clear();
			return;
		case CCSPackage.SECURITY_INTERFACE__PBETA2SEC:
			getPbeta2sec().clear();
			return;
		case CCSPackage.SECURITY_INTERFACE__PALPHA2SEC:
			getPalpha2sec().clear();
			return;
		case CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA:
			getPsec2alpha().clear();
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
		case CCSPackage.SECURITY_INTERFACE__PSEC2BETA:
			return psec2beta != null && !psec2beta.isEmpty();
		case CCSPackage.SECURITY_INTERFACE__PBETA2SEC:
			return pbeta2sec != null && !pbeta2sec.isEmpty();
		case CCSPackage.SECURITY_INTERFACE__PALPHA2SEC:
			return palpha2sec != null && !palpha2sec.isEmpty();
		case CCSPackage.SECURITY_INTERFACE__PSEC2ALPHA:
			return psec2alpha != null && !psec2alpha.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityInterfaceImpl
