/**
 */
package no.ntnu.tdt4250.oi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Object#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Object#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.oi.State}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oi.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getObject_State()
	 * @see no.ntnu.tdt4250.oi.State#getContainer
	 * @model opposite="container" containment="true" lower="2"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getObject_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // Object
