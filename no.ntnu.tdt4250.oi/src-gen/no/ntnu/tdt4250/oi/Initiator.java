/**
 */
package no.ntnu.tdt4250.oi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initiator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Initiator#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getInitiator()
 * @model
 * @generated
 */
public interface Initiator extends no.ntnu.tdt4250.oi.Object {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.Action#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getInitiator_Action()
	 * @see no.ntnu.tdt4250.oi.Action#getInitiator
	 * @model opposite="initiator" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Initiator#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Initiator
