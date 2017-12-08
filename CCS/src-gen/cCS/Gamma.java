/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Gamma#getInterfacegamma <em>Interfacegamma</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getGamma()
 * @model
 * @generated
 */
public interface Gamma extends Connector {
	/**
	 * Returns the value of the '<em><b>Interfacegamma</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfaceGamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacegamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacegamma</em>' containment reference list.
	 * @see cCS.CCSPackage#getGamma_Interfacegamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceGamma> getInterfacegamma();

} // Gamma
