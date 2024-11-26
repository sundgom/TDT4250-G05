/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Transition#getBeforeState <em>Before State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Transition#getAfterState <em>After State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Before State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before State</em>' reference.
	 * @see #setBeforeState(State)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getTransition_BeforeState()
	 * @see no.ntnu.tdt4250.oi.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getBeforeState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Transition#getBeforeState <em>Before State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before State</em>' reference.
	 * @see #getBeforeState()
	 * @generated
	 */
	void setBeforeState(State value);

	/**
	 * Returns the value of the '<em><b>After State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After State</em>' reference.
	 * @see #setAfterState(State)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getTransition_AfterState()
	 * @see no.ntnu.tdt4250.oi.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getAfterState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Transition#getAfterState <em>After State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After State</em>' reference.
	 * @see #getAfterState()
	 * @generated
	 */
	void setAfterState(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"transition"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getTransition_Name()
	 * @model default="transition" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // Transition
