/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.ObjectInteraction#getObject <em>Object</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.ObjectInteraction#getAction <em>Action</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.ObjectInteraction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getObjectInteraction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StatesMayOnlyHaveOneTransition'"
 * @generated
 */
public interface ObjectInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.oi.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getObjectInteraction_Object()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<no.ntnu.tdt4250.oi.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getObjectInteraction_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.ObjectInteraction#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getObjectInteraction_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // ObjectInteraction
