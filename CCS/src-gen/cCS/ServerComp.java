/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.ServerComp#getServerconfig <em>Serverconfig</em>}</li>
 *   <li>{@link cCS.ServerComp#getInterfacesserver <em>Interfacesserver</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getServerComp()
 * @model
 * @generated
 */
public interface ServerComp extends Component {
	/**
	 * Returns the value of the '<em><b>Serverconfig</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ServerConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverconfig</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerComp_Serverconfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerConfig> getServerconfig();

	/**
	 * Returns the value of the '<em><b>Interfacesserver</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.InterfacesServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacesserver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacesserver</em>' containment reference list.
	 * @see cCS.CCSPackage#getServerComp_Interfacesserver()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfacesServer> getInterfacesserver();

} // ServerComp
