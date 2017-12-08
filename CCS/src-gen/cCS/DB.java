/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.DB#getDbinterface <em>Dbinterface</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getDB()
 * @model
 * @generated
 */
public interface DB extends Component {
	/**
	 * Returns the value of the '<em><b>Dbinterface</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.DBInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbinterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbinterface</em>' containment reference list.
	 * @see cCS.CCSPackage#getDB_Dbinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<DBInterface> getDbinterface();

} // DB
