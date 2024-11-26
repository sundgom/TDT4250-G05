/**
 */
package no.ntnu.tdt4250.oi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Direction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getDirection()
 * @model
 * @generated
 */
public interface Direction extends State {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.oi.Directions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.Directions
	 * @see #setName(Directions)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getDirection_Name()
	 * @model required="true"
	 * @generated
	 */
	Directions getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Direction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.Directions
	 * @see #getName()
	 * @generated
	 */
	void setName(Directions value);

} // Direction
