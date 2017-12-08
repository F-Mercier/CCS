/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceAlpha#getRsec2alpha <em>Rsec2alpha</em>}</li>
 *   <li>{@link cCS.InterfaceAlpha#getRalpha2sec <em>Ralpha2sec</em>}</li>
 *   <li>{@link cCS.InterfaceAlpha#getRconnect2alpha <em>Rconnect2alpha</em>}</li>
 *   <li>{@link cCS.InterfaceAlpha#getRalpha2connect <em>Ralpha2connect</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceAlpha()
 * @model
 * @generated
 */
public interface InterfaceAlpha extends InterfaceConnector {
	/**
	 * Returns the value of the '<em><b>Rsec2alpha</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RSec2Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rsec2alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsec2alpha</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceAlpha_Rsec2alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<RSec2Alpha> getRsec2alpha();

	/**
	 * Returns the value of the '<em><b>Ralpha2sec</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RAlpha2Sec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ralpha2sec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ralpha2sec</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceAlpha_Ralpha2sec()
	 * @model containment="true"
	 * @generated
	 */
	EList<RAlpha2Sec> getRalpha2sec();

	/**
	 * Returns the value of the '<em><b>Rconnect2alpha</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RConnect2Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rconnect2alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rconnect2alpha</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceAlpha_Rconnect2alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<RConnect2Alpha> getRconnect2alpha();

	/**
	 * Returns the value of the '<em><b>Ralpha2connect</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RAlpha2Connect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ralpha2connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ralpha2connect</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceAlpha_Ralpha2connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<RAlpha2Connect> getRalpha2connect();

} // InterfaceAlpha
