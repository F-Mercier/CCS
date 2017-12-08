/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.InterfaceBeta#getRbeta2sec <em>Rbeta2sec</em>}</li>
 *   <li>{@link cCS.InterfaceBeta#getRsec2beta <em>Rsec2beta</em>}</li>
 *   <li>{@link cCS.InterfaceBeta#getRbeta2db <em>Rbeta2db</em>}</li>
 *   <li>{@link cCS.InterfaceBeta#getRdb2beta <em>Rdb2beta</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getInterfaceBeta()
 * @model
 * @generated
 */
public interface InterfaceBeta extends InterfaceConnector {
	/**
	 * Returns the value of the '<em><b>Rbeta2sec</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RBeta2Sec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rbeta2sec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rbeta2sec</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceBeta_Rbeta2sec()
	 * @model containment="true"
	 * @generated
	 */
	EList<RBeta2Sec> getRbeta2sec();

	/**
	 * Returns the value of the '<em><b>Rsec2beta</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RSec2Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rsec2beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsec2beta</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceBeta_Rsec2beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<RSec2Beta> getRsec2beta();

	/**
	 * Returns the value of the '<em><b>Rbeta2db</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RBeta2DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rbeta2db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rbeta2db</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceBeta_Rbeta2db()
	 * @model containment="true"
	 * @generated
	 */
	EList<RBeta2DB> getRbeta2db();

	/**
	 * Returns the value of the '<em><b>Rdb2beta</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.RDB2Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdb2beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdb2beta</em>' containment reference list.
	 * @see cCS.CCSPackage#getInterfaceBeta_Rdb2beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDB2Beta> getRdb2beta();

} // InterfaceBeta
