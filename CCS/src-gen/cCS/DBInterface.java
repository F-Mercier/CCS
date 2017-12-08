/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.DBInterface#getPdb2gamma <em>Pdb2gamma</em>}</li>
 *   <li>{@link cCS.DBInterface#getPgamma2db <em>Pgamma2db</em>}</li>
 *   <li>{@link cCS.DBInterface#getPdb2beta <em>Pdb2beta</em>}</li>
 *   <li>{@link cCS.DBInterface#getPbeta2db <em>Pbeta2db</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getDBInterface()
 * @model
 * @generated
 */
public interface DBInterface extends InterfaceComponent {
	/**
	 * Returns the value of the '<em><b>Pdb2gamma</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PDB2Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pdb2gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdb2gamma</em>' containment reference list.
	 * @see cCS.CCSPackage#getDBInterface_Pdb2gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<PDB2Gamma> getPdb2gamma();

	/**
	 * Returns the value of the '<em><b>Pgamma2db</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PGamma2DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgamma2db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgamma2db</em>' containment reference list.
	 * @see cCS.CCSPackage#getDBInterface_Pgamma2db()
	 * @model containment="true"
	 * @generated
	 */
	EList<PGamma2DB> getPgamma2db();

	/**
	 * Returns the value of the '<em><b>Pdb2beta</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PDB2Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pdb2beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdb2beta</em>' containment reference list.
	 * @see cCS.CCSPackage#getDBInterface_Pdb2beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<PDB2Beta> getPdb2beta();

	/**
	 * Returns the value of the '<em><b>Pbeta2db</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PBeta2DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pbeta2db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pbeta2db</em>' containment reference list.
	 * @see cCS.CCSPackage#getDBInterface_Pbeta2db()
	 * @model containment="true"
	 * @generated
	 */
	EList<PBeta2DB> getPbeta2db();

} // DBInterface
