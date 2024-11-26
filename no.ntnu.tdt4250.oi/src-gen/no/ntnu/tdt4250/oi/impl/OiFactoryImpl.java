/**
 */
package no.ntnu.tdt4250.oi.impl;

import no.ntnu.tdt4250.oi.Action;
import no.ntnu.tdt4250.oi.Activation;
import no.ntnu.tdt4250.oi.Connection;
import no.ntnu.tdt4250.oi.Direction;
import no.ntnu.tdt4250.oi.Directions;
import no.ntnu.tdt4250.oi.Initiator;
import no.ntnu.tdt4250.oi.ObjectInteraction;
import no.ntnu.tdt4250.oi.OiFactory;
import no.ntnu.tdt4250.oi.OiPackage;
import no.ntnu.tdt4250.oi.Position;
import no.ntnu.tdt4250.oi.Responder;
import no.ntnu.tdt4250.oi.Transition;
import no.ntnu.tdt4250.oi.Traversability;
import no.ntnu.tdt4250.oi.Type;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OiFactoryImpl extends EFactoryImpl implements OiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OiFactory init() {
		try {
			OiFactory theOiFactory = (OiFactory) EPackage.Registry.INSTANCE.getEFactory(OiPackage.eNS_URI);
			if (theOiFactory != null) {
				return theOiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OiPackage.OBJECT_INTERACTION:
			return createObjectInteraction();
		case OiPackage.OBJECT:
			return createObject();
		case OiPackage.INITIATOR:
			return createInitiator();
		case OiPackage.RESPONDER:
			return createResponder();
		case OiPackage.ACTION:
			return createAction();
		case OiPackage.TRANSITION:
			return createTransition();
		case OiPackage.POSITION:
			return createPosition();
		case OiPackage.CONNECTION:
			return createConnection();
		case OiPackage.DIRECTION:
			return createDirection();
		case OiPackage.TYPE:
			return createType();
		case OiPackage.ACTIVATION:
			return createActivation();
		case OiPackage.TRAVERSABILITY:
			return createTraversability();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case OiPackage.DIRECTIONS:
			return createDirectionsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case OiPackage.DIRECTIONS:
			return convertDirectionsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectInteraction createObjectInteraction() {
		ObjectInteractionImpl objectInteraction = new ObjectInteractionImpl();
		return objectInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public no.ntnu.tdt4250.oi.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initiator createInitiator() {
		InitiatorImpl initiator = new InitiatorImpl();
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responder createResponder() {
		ResponderImpl responder = new ResponderImpl();
		return responder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction createDirection() {
		DirectionImpl direction = new DirectionImpl();
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activation createActivation() {
		ActivationImpl activation = new ActivationImpl();
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Traversability createTraversability() {
		TraversabilityImpl traversability = new TraversabilityImpl();
		return traversability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directions createDirectionsFromString(EDataType eDataType, String initialValue) {
		Directions result = Directions.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OiPackage getOiPackage() {
		return (OiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OiPackage getPackage() {
		return OiPackage.eINSTANCE;
	}

} //OiFactoryImpl
