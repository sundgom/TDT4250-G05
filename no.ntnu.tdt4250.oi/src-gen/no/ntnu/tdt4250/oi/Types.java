/**
 */
package no.ntnu.tdt4250.oi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oi.OiPackage#getTypes()
 * @model
 * @generated
 */
public enum Types implements Enumerator {
	/**
	 * The '<em><b>Player</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYER(0, "Player", "Player"),

	/**
	 * The '<em><b>Rock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK_VALUE
	 * @generated
	 * @ordered
	 */
	ROCK(1, "Rock", "Rock"),

	/**
	 * The '<em><b>Pressure Plate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_PLATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE_PLATE(2, "PressurePlate", "PressurePlate"),

	/**
	 * The '<em><b>Wall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALL_VALUE
	 * @generated
	 * @ordered
	 */
	WALL(3, "Wall", "Wall"),

	/**
	 * The '<em><b>Portal One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTAL_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	PORTAL_ONE(4, "PortalOne", "PortalOne"),

	/**
	 * The '<em><b>Portal Two</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTAL_TWO_VALUE
	 * @generated
	 * @ordered
	 */
	PORTAL_TWO(5, "PortalTwo", "PortalTwo"),

	/**
	 * The '<em><b>Floor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOR_VALUE
	 * @generated
	 * @ordered
	 */
	FLOOR(6, "Floor", "Floor"),

	/**
	 * The '<em><b>Teleporter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPORTER_VALUE
	 * @generated
	 * @ordered
	 */
	TELEPORTER(7, "Teleporter", "Teleporter");

	/**
	 * The '<em><b>Player</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER
	 * @model name="Player"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_VALUE = 0;

	/**
	 * The '<em><b>Rock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK
	 * @model name="Rock"
	 * @generated
	 * @ordered
	 */
	public static final int ROCK_VALUE = 1;

	/**
	 * The '<em><b>Pressure Plate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_PLATE
	 * @model name="PressurePlate"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_PLATE_VALUE = 2;

	/**
	 * The '<em><b>Wall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALL
	 * @model name="Wall"
	 * @generated
	 * @ordered
	 */
	public static final int WALL_VALUE = 3;

	/**
	 * The '<em><b>Portal One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTAL_ONE
	 * @model name="PortalOne"
	 * @generated
	 * @ordered
	 */
	public static final int PORTAL_ONE_VALUE = 4;

	/**
	 * The '<em><b>Portal Two</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTAL_TWO
	 * @model name="PortalTwo"
	 * @generated
	 * @ordered
	 */
	public static final int PORTAL_TWO_VALUE = 5;

	/**
	 * The '<em><b>Floor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOR
	 * @model name="Floor"
	 * @generated
	 * @ordered
	 */
	public static final int FLOOR_VALUE = 6;

	/**
	 * The '<em><b>Teleporter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPORTER
	 * @model name="Teleporter"
	 * @generated
	 * @ordered
	 */
	public static final int TELEPORTER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Types[] VALUES_ARRAY = new Types[] { PLAYER, ROCK, PRESSURE_PLATE, WALL, PORTAL_ONE,
			PORTAL_TWO, FLOOR, TELEPORTER, };

	/**
	 * A public read-only list of all the '<em><b>Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Types> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Types get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Types result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Types getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Types result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Types get(int value) {
		switch (value) {
		case PLAYER_VALUE:
			return PLAYER;
		case ROCK_VALUE:
			return ROCK;
		case PRESSURE_PLATE_VALUE:
			return PRESSURE_PLATE;
		case WALL_VALUE:
			return WALL;
		case PORTAL_ONE_VALUE:
			return PORTAL_ONE;
		case PORTAL_TWO_VALUE:
			return PORTAL_TWO;
		case FLOOR_VALUE:
			return FLOOR;
		case TELEPORTER_VALUE:
			return TELEPORTER;
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
	private Types(int value, String name, String literal) {
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

} //Types
