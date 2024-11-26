/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oi.OiFactory
 * @model kind="package"
 * @generated
 */
public interface OiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/oi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OiPackage eINSTANCE = no.ntnu.tdt4250.oi.impl.OiPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl <em>Object Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getObjectInteraction()
	 * @generated
	 */
	int OBJECT_INTERACTION = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERACTION__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERACTION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERACTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Object Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Object Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ObjectImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.InitiatorImpl <em>Initiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.InitiatorImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getInitiator()
	 * @generated
	 */
	int INITIATOR = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__STATE = OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__ACTION = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ResponderImpl <em>Responder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ResponderImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getResponder()
	 * @generated
	 */
	int RESPONDER = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDER__STATE = OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDER__NAME = OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Responder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDER_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDER_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ActionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Responder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESPONDER = 0;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INITIATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TRANSITION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.StateImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTAINER = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.TransitionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Before State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__BEFORE_STATE = 0;

	/**
	 * The feature id for the '<em><b>After State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__AFTER_STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.PositionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 7;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ConnectionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OBJECT = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IS_CONNECTED = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.DirectionImpl <em>Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.DirectionImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 9;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__NAME = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.TypeImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.ActivationImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 11;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__IS_ACTIVE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.impl.TraversabilityImpl <em>Traversability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.impl.TraversabilityImpl
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getTraversability()
	 * @generated
	 */
	int TRAVERSABILITY = 12;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY__IS_TRAVERSABLE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traversability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traversability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSABILITY_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oi.Directions <em>Directions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oi.Directions
	 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getDirections()
	 * @generated
	 */
	int DIRECTIONS = 13;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.ObjectInteraction <em>Object Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Interaction</em>'.
	 * @see no.ntnu.tdt4250.oi.ObjectInteraction
	 * @generated
	 */
	EClass getObjectInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oi.ObjectInteraction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see no.ntnu.tdt4250.oi.ObjectInteraction#getObject()
	 * @see #getObjectInteraction()
	 * @generated
	 */
	EReference getObjectInteraction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.oi.ObjectInteraction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see no.ntnu.tdt4250.oi.ObjectInteraction#getAction()
	 * @see #getObjectInteraction()
	 * @generated
	 */
	EReference getObjectInteraction_Action();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.ObjectInteraction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.ObjectInteraction#getName()
	 * @see #getObjectInteraction()
	 * @generated
	 */
	EAttribute getObjectInteraction_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see no.ntnu.tdt4250.oi.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oi.Object#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see no.ntnu.tdt4250.oi.Object#getState()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_State();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiator</em>'.
	 * @see no.ntnu.tdt4250.oi.Initiator
	 * @generated
	 */
	EClass getInitiator();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.Initiator#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see no.ntnu.tdt4250.oi.Initiator#getAction()
	 * @see #getInitiator()
	 * @generated
	 */
	EReference getInitiator_Action();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Responder <em>Responder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responder</em>'.
	 * @see no.ntnu.tdt4250.oi.Responder
	 * @generated
	 */
	EClass getResponder();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see no.ntnu.tdt4250.oi.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.Action#getResponder <em>Responder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responder</em>'.
	 * @see no.ntnu.tdt4250.oi.Action#getResponder()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Responder();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.Action#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see no.ntnu.tdt4250.oi.Action#getInitiator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Initiator();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oi.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see no.ntnu.tdt4250.oi.Action#getTransition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Transition();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see no.ntnu.tdt4250.oi.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see no.ntnu.tdt4250.oi.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see no.ntnu.tdt4250.oi.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see no.ntnu.tdt4250.oi.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.oi.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see no.ntnu.tdt4250.oi.State#getContainer()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Container();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see no.ntnu.tdt4250.oi.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.Transition#getBeforeState <em>Before State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before State</em>'.
	 * @see no.ntnu.tdt4250.oi.Transition#getBeforeState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_BeforeState();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oi.Transition#getAfterState <em>After State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After State</em>'.
	 * @see no.ntnu.tdt4250.oi.Transition#getAfterState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_AfterState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see no.ntnu.tdt4250.oi.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.ntnu.tdt4250.oi.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.ntnu.tdt4250.oi.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see no.ntnu.tdt4250.oi.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.oi.Connection#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see no.ntnu.tdt4250.oi.Connection#getObject()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Object();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Connection#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see no.ntnu.tdt4250.oi.Connection#isIsConnected()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_IsConnected();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction</em>'.
	 * @see no.ntnu.tdt4250.oi.Direction
	 * @generated
	 */
	EClass getDirection();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Direction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.Direction#getName()
	 * @see #getDirection()
	 * @generated
	 */
	EAttribute getDirection_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.oi.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oi.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see no.ntnu.tdt4250.oi.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Activation#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see no.ntnu.tdt4250.oi.Activation#isIsActive()
	 * @see #getActivation()
	 * @generated
	 */
	EAttribute getActivation_IsActive();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oi.Traversability <em>Traversability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversability</em>'.
	 * @see no.ntnu.tdt4250.oi.Traversability
	 * @generated
	 */
	EClass getTraversability();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oi.Traversability#isIsTraversable <em>Is Traversable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Traversable</em>'.
	 * @see no.ntnu.tdt4250.oi.Traversability#isIsTraversable()
	 * @see #getTraversability()
	 * @generated
	 */
	EAttribute getTraversability_IsTraversable();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.oi.Directions <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Directions</em>'.
	 * @see no.ntnu.tdt4250.oi.Directions
	 * @generated
	 */
	EEnum getDirections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OiFactory getOiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl <em>Object Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ObjectInteractionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getObjectInteraction()
		 * @generated
		 */
		EClass OBJECT_INTERACTION = eINSTANCE.getObjectInteraction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INTERACTION__OBJECT = eINSTANCE.getObjectInteraction_Object();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INTERACTION__ACTION = eINSTANCE.getObjectInteraction_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_INTERACTION__NAME = eINSTANCE.getObjectInteraction_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ObjectImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__STATE = eINSTANCE.getObject_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.InitiatorImpl <em>Initiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.InitiatorImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getInitiator()
		 * @generated
		 */
		EClass INITIATOR = eINSTANCE.getInitiator();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATOR__ACTION = eINSTANCE.getInitiator_Action();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ResponderImpl <em>Responder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ResponderImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getResponder()
		 * @generated
		 */
		EClass RESPONDER = eINSTANCE.getResponder();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ActionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Responder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RESPONDER = eINSTANCE.getAction_Responder();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INITIATOR = eINSTANCE.getAction_Initiator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TRANSITION = eINSTANCE.getAction_Transition();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.StateImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONTAINER = eINSTANCE.getState_Container();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.TransitionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Before State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__BEFORE_STATE = eINSTANCE.getTransition_BeforeState();

		/**
		 * The meta object literal for the '<em><b>After State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__AFTER_STATE = eINSTANCE.getTransition_AfterState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.PositionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ConnectionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__OBJECT = eINSTANCE.getConnection_Object();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IS_CONNECTED = eINSTANCE.getConnection_IsConnected();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.DirectionImpl <em>Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.DirectionImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getDirection()
		 * @generated
		 */
		EClass DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION__NAME = eINSTANCE.getDirection_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.TypeImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.ActivationImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION__IS_ACTIVE = eINSTANCE.getActivation_IsActive();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.impl.TraversabilityImpl <em>Traversability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.impl.TraversabilityImpl
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getTraversability()
		 * @generated
		 */
		EClass TRAVERSABILITY = eINSTANCE.getTraversability();

		/**
		 * The meta object literal for the '<em><b>Is Traversable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSABILITY__IS_TRAVERSABLE = eINSTANCE.getTraversability_IsTraversable();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oi.Directions <em>Directions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oi.Directions
		 * @see no.ntnu.tdt4250.oi.impl.OiPackageImpl#getDirections()
		 * @generated
		 */
		EEnum DIRECTIONS = eINSTANCE.getDirections();

	}

} //OiPackage
