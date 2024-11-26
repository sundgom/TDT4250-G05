/**
 */
package no.ntnu.tdt4250.oi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oi.Connection#getObject <em>Object</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oi.Connection#isIsConnected <em>Is Connected</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oi.OiPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends State {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(no.ntnu.tdt4250.oi.Object)
	 * @see no.ntnu.tdt4250.oi.OiPackage#getConnection_Object()
	 * @model containment="true"
	 * @generated
	 */
	no.ntnu.tdt4250.oi.Object getObject();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oi.Connection#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(no.ntnu.tdt4250.oi.Object value);

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see no.ntnu.tdt4250.oi.OiPackage#getConnection_IsConnected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsConnected();

} // Connection
