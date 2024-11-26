/**
 */
package no.ntnu.tdt4250.oi.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oi.Action;
import no.ntnu.tdt4250.oi.Initiator;
import no.ntnu.tdt4250.oi.ObjectInteraction;
import no.ntnu.tdt4250.oi.OiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectInteractionImpl extends MinimalEObjectImpl.Container implements ObjectInteraction {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<no.ntnu.tdt4250.oi.Object> object;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.OBJECT_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<no.ntnu.tdt4250.oi.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<no.ntnu.tdt4250.oi.Object>(no.ntnu.tdt4250.oi.Object.class, this,
					OiPackage.OBJECT_INTERACTION__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OiPackage.OBJECT_INTERACTION__ACTION, oldAction, newAction);
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
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OiPackage.OBJECT_INTERACTION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OiPackage.OBJECT_INTERACTION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.OBJECT_INTERACTION__ACTION, newAction,
					newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	@Override
	public String getName() {
		EList<no.ntnu.tdt4250.oi.Object> objectList = this.getObject();
		no.ntnu.tdt4250.oi.Object initiator = null;
		no.ntnu.tdt4250.oi.Object responder = null;

		// TODO: ask about Initiator vs InitiatorImpl
		// TODO: import as something with a better name (?)
		for (no.ntnu.tdt4250.oi.Object obj : objectList) {
			if (obj instanceof Initiator) {
				initiator = obj;
			} else {
				responder = obj;
			}
		}

		String actionName = this.getAction() != null ? this.getAction().getName() : "Action";
		String initiatorName = (initiator != null && initiator.getName() != null) ? initiator.getName() : "Initiator";
		String responderName = (responder != null && responder.getName() != null) ? responder.getName() : "Responder";
		return initiatorName + " " + actionName + " " + responderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OiPackage.OBJECT_INTERACTION__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
		case OiPackage.OBJECT_INTERACTION__ACTION:
			return basicSetAction(null, msgs);
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
		case OiPackage.OBJECT_INTERACTION__OBJECT:
			return getObject();
		case OiPackage.OBJECT_INTERACTION__ACTION:
			return getAction();
		case OiPackage.OBJECT_INTERACTION__NAME:
			return getName();
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
		case OiPackage.OBJECT_INTERACTION__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends no.ntnu.tdt4250.oi.Object>) newValue);
			return;
		case OiPackage.OBJECT_INTERACTION__ACTION:
			setAction((Action) newValue);
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
		case OiPackage.OBJECT_INTERACTION__OBJECT:
			getObject().clear();
			return;
		case OiPackage.OBJECT_INTERACTION__ACTION:
			setAction((Action) null);
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
		case OiPackage.OBJECT_INTERACTION__OBJECT:
			return object != null && !object.isEmpty();
		case OiPackage.OBJECT_INTERACTION__ACTION:
			return action != null;
		case OiPackage.OBJECT_INTERACTION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //ObjectInteractionImpl
