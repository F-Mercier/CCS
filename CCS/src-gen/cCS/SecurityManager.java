/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.SecurityManager#getSecurityinterface <em>Securityinterface</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSecurityManager()
 * @model
 * @generated
 */
public interface SecurityManager extends Component {
	/**
	 * Returns the value of the '<em><b>Securityinterface</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.SecurityInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityinterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityinterface</em>' containment reference list.
	 * @see cCS.CCSPackage#getSecurityManager_Securityinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityInterface> getSecurityinterface();

} // SecurityManager
