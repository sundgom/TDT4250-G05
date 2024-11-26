/**
 */
package no.ntnu.tdt4250.oi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oi.OiPackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator {
	/**
	 * The '<em><b>Pushes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHES_VALUE
	 * @generated
	 * @ordered
	 */
	PUSHES(0, "Pushes", "Pushes"),

	/**
	 * The '<em><b>Enters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERS_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERS(1, "Enters", "Enters"),

	/**
	 * The '<em><b>Moves On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVES_ON_VALUE
	 * @generated
	 * @ordered
	 */
	MOVES_ON(2, "MovesOn", "MovesOn"),

	/**
	 * The '<em><b>Shoots Portal One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS_PORTAL_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	SHOOTS_PORTAL_ONE(3, "ShootsPortalOne", "ShootsPortalOne"),

	/**
	 * The '<em><b>Shoots Portal Two</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS_PORTAL_TWO_VALUE
	 * @generated
	 * @ordered
	 */
	SHOOTS_PORTAL_TWO(4, "ShootsPortalTwo", "ShootsPortalTwo"),

	/**
	 * The '<em><b>Connects To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_TO_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTS_TO(5, "ConnectsTo", "ConnectTo");

	/**
	 * The '<em><b>Pushes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHES
	 * @model name="Pushes"
	 * @generated
	 * @ordered
	 */
	public static final int PUSHES_VALUE = 0;

	/**
	 * The '<em><b>Enters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERS
	 * @model name="Enters"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERS_VALUE = 1;

	/**
	 * The '<em><b>Moves On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVES_ON
	 * @model name="MovesOn"
	 * @generated
	 * @ordered
	 */
	public static final int MOVES_ON_VALUE = 2;

	/**
	 * The '<em><b>Shoots Portal One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS_PORTAL_ONE
	 * @model name="ShootsPortalOne"
	 * @generated
	 * @ordered
	 */
	public static final int SHOOTS_PORTAL_ONE_VALUE = 3;

	/**
	 * The '<em><b>Shoots Portal Two</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS_PORTAL_TWO
	 * @model name="ShootsPortalTwo"
	 * @generated
	 * @ordered
	 */
	public static final int SHOOTS_PORTAL_TWO_VALUE = 4;

	/**
	 * The '<em><b>Connects To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_TO
	 * @model name="ConnectsTo" literal="ConnectTo"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTS_TO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Actions[] VALUES_ARRAY = new Actions[] { PUSHES, ENTERS, MOVES_ON, SHOOTS_PORTAL_ONE,
			SHOOTS_PORTAL_TWO, CONNECTS_TO, };

	/**
	 * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Actions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Actions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Actions get(int value) {
		switch (value) {
		case PUSHES_VALUE:
			return PUSHES;
		case ENTERS_VALUE:
			return ENTERS;
		case MOVES_ON_VALUE:
			return MOVES_ON;
		case SHOOTS_PORTAL_ONE_VALUE:
			return SHOOTS_PORTAL_ONE;
		case SHOOTS_PORTAL_TWO_VALUE:
			return SHOOTS_PORTAL_TWO;
		case CONNECTS_TO_VALUE:
			return CONNECTS_TO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Actions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Actions
