/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Action#getResponder <em>Responder</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Action#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Action#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Action#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Responder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responder</em>' reference.
	 * @see #setResponder(Responder)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getAction_Responder()
	 * @model required="true"
	 * @generated
	 */
	Responder getResponder();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Action#getResponder <em>Responder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responder</em>' reference.
	 * @see #getResponder()
	 * @generated
	 */
	void setResponder(Responder value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.Initiator#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(Initiator)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getAction_Initiator()
	 * @see no.ntnu.tdt4250.oi.Initiator#getAction
	 * @model opposite="action" required="true"
	 * @generated
	 */
	Initiator getInitiator();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Action#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(Initiator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.oi.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getAction_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Action
