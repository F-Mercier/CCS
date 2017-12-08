/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Client#getInterfacesc <em>Interfacesc</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Component {
	/**
	 * Returns the value of the '<em><b>Interfacesc</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.interfacesC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacesc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacesc</em>' containment reference list.
	 * @see cCS.CCSPackage#getClient_Interfacesc()
	 * @model containment="true"
	 * @generated
	 */
	EList<interfacesC> getInterfacesc();

} // Client
