/**
 */
package no.ntnu.tdt4250.oi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Activation#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getActivation()
 * @model
 * @generated
 */
public interface Activation extends State {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getActivation_IsActive()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Activation#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

} // Activation
