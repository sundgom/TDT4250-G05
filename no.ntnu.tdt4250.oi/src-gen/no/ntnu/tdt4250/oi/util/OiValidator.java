/**
 */
package no.ntnu.tdt4250.oi.util;

import java.util.Map;

import no.ntnu.tdt4250.oi.Action;
import no.ntnu.tdt4250.oi.Activation;
import no.ntnu.tdt4250.oi.Connection;
import no.ntnu.tdt4250.oi.Direction;
import no.ntnu.tdt4250.oi.Directions;
import no.ntnu.tdt4250.oi.Initiator;
import no.ntnu.tdt4250.oi.ObjectInteraction;
import no.ntnu.tdt4250.oi.OiPackage;
import no.ntnu.tdt4250.oi.Position;
import no.ntnu.tdt4250.oi.Responder;
import no.ntnu.tdt4250.oi.State;
import no.ntnu.tdt4250.oi.Transition;
import no.ntnu.tdt4250.oi.Traversability;
import no.ntnu.tdt4250.oi.Type;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oi.OiPackage
 * @generated
 */
public class OiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OiValidator INSTANCE = new OiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.oi";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return OiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case OiPackage.OBJECT_INTERACTION:
			return validateObjectInteraction((ObjectInteraction) value, diagnostics, context);
		case OiPackage.OBJECT:
			return validateObject((no.ntnu.tdt4250.oi.Object) value, diagnostics, context);
		case OiPackage.INITIATOR:
			return validateInitiator((Initiator) value, diagnostics, context);
		case OiPackage.RESPONDER:
			return validateResponder((Responder) value, diagnostics, context);
		case OiPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case OiPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case OiPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case OiPackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case OiPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case OiPackage.DIRECTION:
			return validateDirection((Direction) value, diagnostics, context);
		case OiPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case OiPackage.ACTIVATION:
			return validateActivation((Activation) value, diagnostics, context);
		case OiPackage.TRAVERSABILITY:
			return validateTraversability((Traversability) value, diagnostics, context);
		case OiPackage.DIRECTIONS:
			return validateDirections((Directions) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectInteraction(ObjectInteraction objectInteraction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectInteraction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(objectInteraction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateObjectInteraction_StatesMayOnlyHaveOneTransition(objectInteraction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StatesMayOnlyHaveOneTransition constraint of '<em>Object Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectInteraction_StatesMayOnlyHaveOneTransition(ObjectInteraction objectInteraction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "StatesMayOnlyHaveOneTransition", getObjectLabel(objectInteraction, context) },
						new Object[] { objectInteraction }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(no.ntnu.tdt4250.oi.Object object, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiator(Initiator initiator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initiator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponder(Responder responder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirection(Direction direction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(direction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivation(Activation activation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraversability(Traversability traversability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traversability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirections(Directions directions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OiValidator
