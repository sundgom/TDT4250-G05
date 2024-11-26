/**
 */
package no.ntnu.tdt4250.oi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traversability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Traversability#isIsTraversable <em>Is Traversable</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getTraversability()
 * @model
 * @generated
 */
public interface Traversability extends State {
	/**
	 * Returns the value of the '<em><b>Is Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Traversable</em>' attribute.
	 * @see #setIsTraversable(boolean)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getTraversability_IsTraversable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isIsTraversable();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Traversability#isIsTraversable <em>Is Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Traversable</em>' attribute.
	 * @see #isIsTraversable()
	 * @generated
	 */
	void setIsTraversable(boolean value);

} // Traversability
