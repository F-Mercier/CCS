/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Beta#getInterfacebeta <em>Interfacebeta</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getBeta()
 * @model
 * @generated
 */
public interface Beta extends Connector {
	/**
	 * Returns the value of the '<em><b>Interfacebeta</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfaceBeta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacebeta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacebeta</em>' containment reference list.
	 * @see cCS.CCSPackage#getBeta_Interfacebeta()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceBeta> getInterfacebeta();

} // Beta
