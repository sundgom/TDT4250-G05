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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.StateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.impl.StateImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected Transition outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected Transition incoming;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OiPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getOutgoing() {
		if (outgoing != null && outgoing.eIsProxy()) {
			InternalEObject oldOutgoing = (InternalEObject) outgoing;
			outgoing = (Transition) eResolveProxy(oldOutgoing);
			if (outgoing != oldOutgoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.STATE__OUTGOING, oldOutgoing,
							outgoing));
			}
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoing(Transition newOutgoing, NotificationChain msgs) {
		Transition oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiPackage.STATE__OUTGOING,
					oldOutgoing, newOutgoing);
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
	public void setOutgoing(Transition newOutgoing) {
		if (newOutgoing != outgoing) {
			NotificationChain msgs = null;
			if (outgoing != null)
				msgs = ((InternalEObject) outgoing).eInverseRemove(this, OiPackage.TRANSITION__BEFORE_STATE,
						Transition.class, msgs);
			if (newOutgoing != null)
				msgs = ((InternalEObject) newOutgoing).eInverseAdd(this, OiPackage.TRANSITION__BEFORE_STATE,
						Transition.class, msgs);
			msgs = basicSetOutgoing(newOutgoing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.STATE__OUTGOING, newOutgoing, newOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject) incoming;
			incoming = (Transition) eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OiPackage.STATE__INCOMING, oldIncoming,
							incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(Transition newIncoming, NotificationChain msgs) {
		Transition oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiPackage.STATE__INCOMING,
					oldIncoming, newIncoming);
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
	public void setIncoming(Transition newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject) incoming).eInverseRemove(this, OiPackage.TRANSITION__AFTER_STATE,
						Transition.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject) newIncoming).eInverseAdd(this, OiPackage.TRANSITION__AFTER_STATE,
						Transition.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.STATE__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getLabel() {
		// TODO: implement this method to return the 'Label' attribute
		// Ensure that you remove @generated or mark it @generated NOT

		String order = "";
		if (this.getOutgoing() != null) {
			order = "Before";
		}
		if (this.getIncoming() != null) {
			order = "After";
		}
		// return this.getClass().getSimpleName() + " " + order;
		String containerName = "Container";
		if (this.getContainer() != null) {
			containerName = this.getContainer().getName();
		}
		return containerName + " " + this.eClass().getName() + " " + order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public no.ntnu.tdt4250.oi.Object getContainer() {
		if (eContainerFeatureID() != OiPackage.STATE__CONTAINER)
			return null;
		return (no.ntnu.tdt4250.oi.Object) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(no.ntnu.tdt4250.oi.Object newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, OiPackage.STATE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(no.ntnu.tdt4250.oi.Object newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != OiPackage.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, OiPackage.OBJECT__STATE,
						no.ntnu.tdt4250.oi.Object.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OiPackage.STATE__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OiPackage.STATE__OUTGOING:
			if (outgoing != null)
				msgs = ((InternalEObject) outgoing).eInverseRemove(this, OiPackage.TRANSITION__BEFORE_STATE,
						Transition.class, msgs);
			return basicSetOutgoing((Transition) otherEnd, msgs);
		case OiPackage.STATE__INCOMING:
			if (incoming != null)
				msgs = ((InternalEObject) incoming).eInverseRemove(this, OiPackage.TRANSITION__AFTER_STATE,
						Transition.class, msgs);
			return basicSetIncoming((Transition) otherEnd, msgs);
		case OiPackage.STATE__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((no.ntnu.tdt4250.oi.Object) otherEnd, msgs);
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
		case OiPackage.STATE__OUTGOING:
			return basicSetOutgoing(null, msgs);
		case OiPackage.STATE__INCOMING:
			return basicSetIncoming(null, msgs);
		case OiPackage.STATE__CONTAINER:
			return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case OiPackage.STATE__CONTAINER:
			return eInternalContainer().eInverseRemove(this, OiPackage.OBJECT__STATE, no.ntnu.tdt4250.oi.Object.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OiPackage.STATE__OUTGOING:
			if (resolve)
				return getOutgoing();
			return basicGetOutgoing();
		case OiPackage.STATE__INCOMING:
			if (resolve)
				return getIncoming();
			return basicGetIncoming();
		case OiPackage.STATE__LABEL:
			return getLabel();
		case OiPackage.STATE__CONTAINER:
			return getContainer();
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
		case OiPackage.STATE__OUTGOING:
			setOutgoing((Transition) newValue);
			return;
		case OiPackage.STATE__INCOMING:
			setIncoming((Transition) newValue);
			return;
		case OiPackage.STATE__CONTAINER:
			setContainer((no.ntnu.tdt4250.oi.Object) newValue);
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
		case OiPackage.STATE__OUTGOING:
			setOutgoing((Transition) null);
			return;
		case OiPackage.STATE__INCOMING:
			setIncoming((Transition) null);
			return;
		case OiPackage.STATE__CONTAINER:
			setContainer((no.ntnu.tdt4250.oi.Object) null);
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
		case OiPackage.STATE__OUTGOING:
			return outgoing != null;
		case OiPackage.STATE__INCOMING:
			return incoming != null;
		case OiPackage.STATE__LABEL:
			return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		case OiPackage.STATE__CONTAINER:
			return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
