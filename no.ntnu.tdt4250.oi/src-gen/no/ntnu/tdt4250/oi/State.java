/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.State#getLabel <em>Label</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.State#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getState()
 * @model abstract="true"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.Transition#getBeforeState <em>Before State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Transition)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getState_Outgoing()
	 * @see no.ntnu.tdt4250.oi.Transition#getBeforeState
	 * @model opposite="beforeState"
	 * @generated
	 */
	Transition getOutgoing();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.State#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Transition value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.Transition#getAfterState <em>After State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getState_Incoming()
	 * @see no.ntnu.tdt4250.oi.Transition#getAfterState
	 * @model opposite="afterState"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.State#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getState_Label()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.Object#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(no.ntnu.tdt4250.oi.Object)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getState_Container()
	 * @see no.ntnu.tdt4250.oi.Object#getState
	 * @model opposite="state" required="true" transient="false"
	 * @generated
	 */
	no.ntnu.tdt4250.oi.Object getContainer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.State#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(no.ntnu.tdt4250.oi.Object value);

} // State
