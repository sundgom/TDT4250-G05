/**
 */
package no.ntnu.tdt4250.oi.impl;

import no.ntnu.tdt4250.oi.OiPackage;
import no.ntnu.tdt4250.oi.Traversability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traversability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.TraversabilityImpl#isIsTraversable <em>Is Traversable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraversabilityImpl extends StateImpl implements Traversability {
	/**
	 * The default value of the '{@link #isIsTraversable() <em>Is Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTraversable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRAVERSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTraversable() <em>Is Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTraversable()
	 * @generated
	 * @ordered
	 */
	protected boolean isTraversable = IS_TRAVERSABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraversabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.TRAVERSABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTraversable() {
		return isTraversable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTraversable(boolean newIsTraversable) {
		boolean oldIsTraversable = isTraversable;
		isTraversable = newIsTraversable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.TRAVERSABILITY__IS_TRAVERSABLE,
					oldIsTraversable, isTraversable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OiPackage.TRAVERSABILITY__IS_TRAVERSABLE:
			return isIsTraversable();
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
		case OiPackage.TRAVERSABILITY__IS_TRAVERSABLE:
			setIsTraversable((Boolean) newValue);
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
		case OiPackage.TRAVERSABILITY__IS_TRAVERSABLE:
			setIsTraversable(IS_TRAVERSABLE_EDEFAULT);
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
		case OiPackage.TRAVERSABILITY__IS_TRAVERSABLE:
			return isTraversable != IS_TRAVERSABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isTraversable: ");
		result.append(isTraversable);
		result.append(')');
		return result.toString();
	}

} //TraversabilityImpl
