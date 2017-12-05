/**
 */
package cCS.impl;

import cCS.CCSPackage;
import cCS.PB;
import cCS.PPConf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PP Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.impl.PPConfImpl#getPb <em>Pb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPConfImpl extends MinimalEObjectImpl.Container implements PPConf {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCSPackage.Literals.PP_CONF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CCSPackage.PP_CONF__PB, oldPb, pb));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCSPackage.PP_CONF__PB,
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
				msgs = ((InternalEObject) pb).eInverseRemove(this, CCSPackage.PB__PP2, PB.class, msgs);
			if (newPb != null)
				msgs = ((InternalEObject) newPb).eInverseAdd(this, CCSPackage.PB__PP2, PB.class, msgs);
			msgs = basicSetPb(newPb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCSPackage.PP_CONF__PB, newPb, newPb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CCSPackage.PP_CONF__PB:
			if (pb != null)
				msgs = ((InternalEObject) pb).eInverseRemove(this, CCSPackage.PB__PP2, PB.class, msgs);
			return basicSetPb((PB) otherEnd, msgs);
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
		case CCSPackage.PP_CONF__PB:
			return basicSetPb(null, msgs);
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
		case CCSPackage.PP_CONF__PB:
			if (resolve)
				return getPb();
			return basicGetPb();
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
		case CCSPackage.PP_CONF__PB:
			setPb((PB) newValue);
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
		case CCSPackage.PP_CONF__PB:
			setPb((PB) null);
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
		case CCSPackage.PP_CONF__PB:
			return pb != null;
		}
		return super.eIsSet(featureID);
	}

} //PPConfImpl
