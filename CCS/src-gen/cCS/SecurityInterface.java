/**
 */
package cCS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.SecurityInterface#getPsec2beta <em>Psec2beta</em>}</li>
 *   <li>{@link cCS.SecurityInterface#getPbeta2sec <em>Pbeta2sec</em>}</li>
 *   <li>{@link cCS.SecurityInterface#getPalpha2sec <em>Palpha2sec</em>}</li>
 *   <li>{@link cCS.SecurityInterface#getPsec2alpha <em>Psec2alpha</em>}</li>
 * </ul>
 *
 * @see cCS.CCSPackage#getSecurityInterface()
 * @model
 * @generated
 */
public interface SecurityInterface extends InterfaceComponent {
	/**
	 * Returns the value of the '<em><b>Psec2beta</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PSec2Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psec2beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psec2beta</em>' containment reference list.
	 * @see cCS.CCSPackage#getSecurityInterface_Psec2beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSec2Beta> getPsec2beta();

	/**
	 * Returns the value of the '<em><b>Pbeta2sec</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PBeta2Sec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pbeta2sec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pbeta2sec</em>' containment reference list.
	 * @see cCS.CCSPackage#getSecurityInterface_Pbeta2sec()
	 * @model containment="true"
	 * @generated
	 */
	EList<PBeta2Sec> getPbeta2sec();

	/**
	 * Returns the value of the '<em><b>Palpha2sec</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PAlpha2Sec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palpha2sec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palpha2sec</em>' containment reference list.
	 * @see cCS.CCSPackage#getSecurityInterface_Palpha2sec()
	 * @model containment="true"
	 * @generated
	 */
	EList<PAlpha2Sec> getPalpha2sec();

	/**
	 * Returns the value of the '<em><b>Psec2alpha</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.PSec2Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psec2alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psec2alpha</em>' containment reference list.
	 * @see cCS.CCSPackage#getSecurityInterface_Psec2alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSec2Alpha> getPsec2alpha();

} // SecurityInterface
