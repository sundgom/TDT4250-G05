/**
 */
package no.ntnu.tdt4250.oi.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oi.Action;
import no.ntnu.tdt4250.oi.Initiator;
import no.ntnu.tdt4250.oi.OiPackage;
import no.ntnu.tdt4250.oi.Responder;
import no.ntnu.tdt4250.oi.Transition;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ActionImpl#getResponder <em>Responder</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ActionImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.ActionImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getResponder() <em>Responder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponder()
	 * @generated
	 * @ordered
	 */
	protected Responder responder;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected Initiator initiator;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responder getResponder() {
		if (responder != null && responder.eIsProxy()) {
			InternalEObject oldResponder = (InternalEObject) responder;
			responder = (Responder) eResolveProxy(oldResponder);
			if (responder != oldResponder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.ACTION__RESPONDER, oldResponder,
							responder));
			}
		}
		return responder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responder basicGetResponder() {
		return responder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponder(Responder newResponder) {
		Responder oldResponder = responder;
		responder = newResponder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.ACTION__RESPONDER, oldResponder,
					responder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initiator getInitiator() {
		if (initiator != null && initiator.eIsProxy()) {
			InternalEObject oldInitiator = (InternalEObject) initiator;
			initiator = (Initiator) eResolveProxy(oldInitiator);
			if (initiator != oldInitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.ACTION__INITIATOR, oldInitiator,
							initiator));
			}
		}
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator basicGetInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiator(Initiator newInitiator, NotificationChain msgs) {
		Initiator oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiPackage.ACTION__INITIATOR,
					oldInitiator, newInitiator);
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
	public void setInitiator(Initiator newInitiator) {
		if (newInitiator != initiator) {
			NotificationChain msgs = null;
			if (initiator != null)
				msgs = ((InternalEObject) initiator).eInverseRemove(this, OiPackage.INITIATOR__ACTION, Initiator.class,
						msgs);
			if (newInitiator != null)
				msgs = ((InternalEObject) newInitiator).eInverseAdd(this, OiPackage.INITIATOR__ACTION, Initiator.class,
						msgs);
			msgs = basicSetInitiator(newInitiator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.ACTION__INITIATOR, newInitiator,
					newInitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, OiPackage.ACTION__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OiPackage.ACTION__INITIATOR:
			if (initiator != null)
				msgs = ((InternalEObject) initiator).eInverseRemove(this, OiPackage.INITIATOR__ACTION, Initiator.class,
						msgs);
			return basicSetInitiator((Initiator) otherEnd, msgs);
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
		case OiPackage.ACTION__INITIATOR:
			return basicSetInitiator(null, msgs);
		case OiPackage.ACTION__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
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
		case OiPackage.ACTION__RESPONDER:
			if (resolve)
				return getResponder();
			return basicGetResponder();
		case OiPackage.ACTION__INITIATOR:
			if (resolve)
				return getInitiator();
			return basicGetInitiator();
		case OiPackage.ACTION__NAME:
			return getName();
		case OiPackage.ACTION__TRANSITION:
			return getTransition();
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
		case OiPackage.ACTION__RESPONDER:
			setResponder((Responder) newValue);
			return;
		case OiPackage.ACTION__INITIATOR:
			setInitiator((Initiator) newValue);
			return;
		case OiPackage.ACTION__NAME:
			setName((String) newValue);
			return;
		case OiPackage.ACTION__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
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
		case OiPackage.ACTION__RESPONDER:
			setResponder((Responder) null);
			return;
		case OiPackage.ACTION__INITIATOR:
			setInitiator((Initiator) null);
			return;
		case OiPackage.ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OiPackage.ACTION__TRANSITION:
			getTransition().clear();
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
		case OiPackage.ACTION__RESPONDER:
			return responder != null;
		case OiPackage.ACTION__INITIATOR:
			return initiator != null;
		case OiPackage.ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OiPackage.ACTION__TRANSITION:
			return transition != null && !transition.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
