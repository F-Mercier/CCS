/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Alpha#getInterfacealpha <em>Interfacealpha</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getAlpha()
 * @model
 * @generated
 */
public interface Alpha extends Connector {
	/**
	 * Returns the value of the '<em><b>Interfacealpha</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfaceAlpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacealpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacealpha</em>' containment reference list.
	 * @see cCS.CCSPackage#getAlpha_Interfacealpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceAlpha> getInterfacealpha();

} // Alpha
