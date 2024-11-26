/**
 */
package no.ntnu.tdt4250.oi.impl;

import no.ntnu.tdt4250.oi.Connection;
import no.ntnu.tdt4250.oi.OiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ConnectionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ConnectionImpl#isIsConnected <em>Is Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends StateImpl implements Connection {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected no.ntnu.tdt4250.oi.Object object;

	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public no.ntnu.tdt4250.oi.Object getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(no.ntnu.tdt4250.oi.Object newObject, NotificationChain msgs) {
		no.ntnu.tdt4250.oi.Object oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiPackage.CONNECTION__OBJECT,
					oldObject, newObject);
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
	@Override
	public void setObject(no.ntnu.tdt4250.oi.Object newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OiPackage.CONNECTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OiPackage.CONNECTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.CONNECTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isIsConnected() {
		// TODO: implement this method to return the 'Is Connected' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		if (this.getObject() != null) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OiPackage.CONNECTION__OBJECT:
			return basicSetObject(null, msgs);
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
		case OiPackage.CONNECTION__OBJECT:
			return getObject();
		case OiPackage.CONNECTION__IS_CONNECTED:
			return isIsConnected();
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
		case OiPackage.CONNECTION__OBJECT:
			setObject((no.ntnu.tdt4250.oi.Object) newValue);
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
		case OiPackage.CONNECTION__OBJECT:
			setObject((no.ntnu.tdt4250.oi.Object) null);
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
		case OiPackage.CONNECTION__OBJECT:
			return object != null;
		case OiPackage.CONNECTION__IS_CONNECTED:
			return isIsConnected() != IS_CONNECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
