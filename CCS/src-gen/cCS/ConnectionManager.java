/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ConnectionManager#getInterfacesconnect <em>Interfacesconnect</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getConnectionManager()
 * @model
 * @generated
 */
public interface ConnectionManager extends Component {
	/**
	 * Returns the value of the '<em><b>Interfacesconnect</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfacesConnect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacesconnect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacesconnect</em>' containment reference list.
	 * @see cCS.CCSPackage#getConnectionManager_Interfacesconnect()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfacesConnect> getInterfacesconnect();

} // ConnectionManager
