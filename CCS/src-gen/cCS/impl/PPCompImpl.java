/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PB;
import cCS.PPComp;
import cCS.PRA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PP Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PPCompImpl#getPb <em>Pb</em>}</li>
 *   <li>{@link cCS.impl.PPCompImpl#getPra <em>Pra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPCompImpl extends MinimalEObjectImpl.Container implements PPComp {
	/**
	 * The cached value of the '{@link #getPb() <em>Pb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPb()
	 * @generated
	 * @ordered
	 */
	protected PB pb;

	/**
	 * The cached value of the '{@link #getPra() <em>Pra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPra()
	 * @generated
	 * @ordered
	 */
	protected PRA pra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPCompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PP_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PB getPb() {
		if (pb != null && pb.eIsProxy()) {
			InternalEObject oldPb = (InternalEObject) pb;
			pb = (PB) eResolveProxy(oldPb);
			if (pb != oldPb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PP_COMP__PB, oldPb, pb));
			}
		}
		return pb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PB basicGetPb() {
		return pb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPb(PB newPb, NotificationChain msgs) {
		PB oldPb = pb;
		pb = newPb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PP_COMP__PB,
					oldPb, newPb);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPb(PB newPb) {
		if (newPb != pb) {
			NotificationChain msgs = null;
			if (pb != null)
				msgs = ((InternalEObject) pb).eInverseRemove(this, CCSPackage.PB__PP, PB.class, msgs);
			if (newPb != null)
				msgs = ((InternalEObject) newPb).eInverseAdd(this, CCSPackage.PB__PP, PB.class, msgs);
			msgs = basicSetPb(newPb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PP_COMP__PB, newPb, newPb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA getPra() {
		if (pra != null && pra.eIsProxy()) {
			InternalEObject oldPra = (InternalEObject) pra;
			pra = (PRA) eResolveProxy(oldPra);
			if (pra != oldPra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PP_COMP__PRA, oldPra, pra));
			}
		}
		return pra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA basicGetPra() {
		return pra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPra(PRA newPra, NotificationChain msgs) {
		PRA oldPra = pra;
		pra = newPra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PP_COMP__PRA,
					oldPra, newPra);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPra(PRA newPra) {
		if (newPra != pra) {
			NotificationChain msgs = null;
			if (pra != null)
				msgs = ((InternalEObject) pra).eInverseRemove(this, CCSPackage.PRA__PP, PRA.class, msgs);
			if (newPra != null)
				msgs = ((InternalEObject) newPra).eInverseAdd(this, CCSPackage.PRA__PP, PRA.class, msgs);
			msgs = basicSetPra(newPra, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PP_COMP__PRA, newPra, newPra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PP_COMP__PB:
			if (pb != null)
				msgs = ((InternalEObject) pb).eInverseRemove(this, CCSPackage.PB__PP, PB.class, msgs);
			return basicSetPb((PB) otherEnd, msgs);
		case CCSPackage.PP_COMP__PRA:
			if (pra != null)
				msgs = ((InternalEObject) pra).eInverseRemove(this, CCSPackage.PRA__PP, PRA.class, msgs);
			return basicSetPra((PRA) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PP_COMP__PB:
			return basicSetPb(null, msgs);
		case CCSPackage.PP_COMP__PRA:
			return basicSetPra(null, msgs);
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
		case CCSPackage.PP_COMP__PB:
			if (resolve)
				return getPb();
			return basicGetPb();
		case CCSPackage.PP_COMP__PRA:
			if (resolve)
				return getPra();
			return basicGetPra();
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
		case CCSPackage.PP_COMP__PB:
			setPb((PB) newValue);
			return;
		case CCSPackage.PP_COMP__PRA:
			setPra((PRA) newValue);
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
		case CCSPackage.PP_COMP__PB:
			setPb((PB) null);
			return;
		case CCSPackage.PP_COMP__PRA:
			setPra((PRA) null);
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
		case CCSPackage.PP_COMP__PB:
			return pb != null;
		case CCSPackage.PP_COMP__PRA:
			return pra != null;
		}
		return super.eIsSet(featureID);
	}

} //PPCompImpl
