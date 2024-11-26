/**
 */
package no.ntnu.tdt4250.oi.impl;

import no.ntnu.tdt4250.oi.OiPackage;
import no.ntnu.tdt4250.oi.State;
import no.ntnu.tdt4250.oi.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.TransitionImpl#getBeforeState <em>Before State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.TransitionImpl#getAfterState <em>After State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getBeforeState() <em>Before State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeState()
	 * @generated
	 * @ordered
	 */
	protected State beforeState;

	/**
	 * The cached value of the '{@link #getAfterState() <em>After State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterState()
	 * @generated
	 * @ordered
	 */
	protected State afterState;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "transition";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getBeforeState() {
		if (beforeState != null && beforeState.eIsProxy()) {
			InternalEObject oldBeforeState = (InternalEObject) beforeState;
			beforeState = (State) eResolveProxy(oldBeforeState);
			if (beforeState != oldBeforeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.TRANSITION__BEFORE_STATE,
							oldBeforeState, beforeState));
			}
		}
		return beforeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetBeforeState() {
		return beforeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeState(State newBeforeState, NotificationChain msgs) {
		State oldBeforeState = beforeState;
		beforeState = newBeforeState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OiPackage.TRANSITION__BEFORE_STATE, oldBeforeState, newBeforeState);
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
	public void setBeforeState(State newBeforeState) {
		if (newBeforeState != beforeState) {
			NotificationChain msgs = null;
			if (beforeState != null)
				msgs = ((InternalEObject) beforeState).eInverseRemove(this, OiPackage.STATE__OUTGOING, State.class,
						msgs);
			if (newBeforeState != null)
				msgs = ((InternalEObject) newBeforeState).eInverseAdd(this, OiPackage.STATE__OUTGOING, State.class,
						msgs);
			msgs = basicSetBeforeState(newBeforeState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.TRANSITION__BEFORE_STATE, newBeforeState,
					newBeforeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getAfterState() {
		if (afterState != null && afterState.eIsProxy()) {
			InternalEObject oldAfterState = (InternalEObject) afterState;
			afterState = (State) eResolveProxy(oldAfterState);
			if (afterState != oldAfterState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.TRANSITION__AFTER_STATE,
							oldAfterState, afterState));
			}
		}
		return afterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetAfterState() {
		return afterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterState(State newAfterState, NotificationChain msgs) {
		State oldAfterState = afterState;
		afterState = newAfterState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OiPackage.TRANSITION__AFTER_STATE, oldAfterState, newAfterState);
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
	public void setAfterState(State newAfterState) {
		if (newAfterState != afterState) {
			NotificationChain msgs = null;
			if (afterState != null)
				msgs = ((InternalEObject) afterState).eInverseRemove(this, OiPackage.STATE__INCOMING, State.class,
						msgs);
			if (newAfterState != null)
				msgs = ((InternalEObject) newAfterState).eInverseAdd(this, OiPackage.STATE__INCOMING, State.class,
						msgs);
			msgs = basicSetAfterState(newAfterState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.TRANSITION__AFTER_STATE, newAfterState,
					newAfterState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		String transitioningObjectName = "Object";
		// if (this.transitioningObject != null) {
		// this.beforeState.get
		//}
		String beforeStateName = "Before State";
		if (this.getBeforeState() != null) {
			beforeStateName = this.getBeforeState().eClass().getName();
			if (this.getBeforeState().getContainer() != null) {
				transitioningObjectName = this.getBeforeState().getContainer().getName();
			}
		}
		return transitioningObjectName + " " + beforeStateName + " transition";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OiPackage.TRANSITION__BEFORE_STATE:
			if (beforeState != null)
				msgs = ((InternalEObject) beforeState).eInverseRemove(this, OiPackage.STATE__OUTGOING, State.class,
						msgs);
			return basicSetBeforeState((State) otherEnd, msgs);
		case OiPackage.TRANSITION__AFTER_STATE:
			if (afterState != null)
				msgs = ((InternalEObject) afterState).eInverseRemove(this, OiPackage.STATE__INCOMING, State.class,
						msgs);
			return basicSetAfterState((State) otherEnd, msgs);
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
		case OiPackage.TRANSITION__BEFORE_STATE:
			return basicSetBeforeState(null, msgs);
		case OiPackage.TRANSITION__AFTER_STATE:
			return basicSetAfterState(null, msgs);
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
		case OiPackage.TRANSITION__BEFORE_STATE:
			if (resolve)
				return getBeforeState();
			return basicGetBeforeState();
		case OiPackage.TRANSITION__AFTER_STATE:
			if (resolve)
				return getAfterState();
			return basicGetAfterState();
		case OiPackage.TRANSITION__NAME:
			return getName();
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
		case OiPackage.TRANSITION__BEFORE_STATE:
			setBeforeState((State) newValue);
			return;
		case OiPackage.TRANSITION__AFTER_STATE:
			setAfterState((State) newValue);
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
		case OiPackage.TRANSITION__BEFORE_STATE:
			setBeforeState((State) null);
			return;
		case OiPackage.TRANSITION__AFTER_STATE:
			setAfterState((State) null);
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
		case OiPackage.TRANSITION__BEFORE_STATE:
			return beforeState != null;
		case OiPackage.TRANSITION__AFTER_STATE:
			return afterState != null;
		case OiPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
