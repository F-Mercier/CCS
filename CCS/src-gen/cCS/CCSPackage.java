/**
 */
package cCS;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cCS.CCSFactory
 * @model kind="package"
 * @generated
 */
public interface CCSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cCS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cCS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CCSPackage eINSTANCE = cCS.impl.CCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link cCS.ElemArchi <em>Elem Archi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.ElemArchi
	 * @see cCS.impl.CCSPackageImpl#getElemArchi()
	 * @generated
	 */
	int ELEM_ARCHI = 3;

	/**
	 * The number of structural features of the '<em>Elem Archi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_ARCHI_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elem Archi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_ARCHI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConfigImpl
	 * @see cCS.impl.CCSPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__COMPONENT = ELEM_ARCHI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONNECTOR = ELEM_ARCHI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INTERFACE = ELEM_ARCHI_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__LINKS = ELEM_ARCHI_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = ELEM_ARCHI_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = ELEM_ARCHI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConnectorImpl
	 * @see cCS.impl.CCSPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Neweclass16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NEWECLASS16 = ELEM_ARCHI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neweclass17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NEWECLASS17 = ELEM_ARCHI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ELEM_ARCHI_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ELEM_ARCHI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ComponentImpl
	 * @see cCS.impl.CCSPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = ELEM_ARCHI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINTS = ELEM_ARCHI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACE = ELEM_ARCHI_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ELEM_ARCHI_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ELEM_ARCHI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PropertiesImpl
	 * @see cCS.impl.CCSPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConstraintsImpl
	 * @see cCS.impl.CCSPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 5;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceComponentImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceComponent()
	 * @generated
	 */
	int INTERFACE_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.PortsComponent <em>Ports Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.PortsComponent
	 * @see cCS.impl.CCSPackageImpl#getPortsComponent()
	 * @generated
	 */
	int PORTS_COMPONENT = 7;

	/**
	 * The number of structural features of the '<em>Ports Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ports Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.ServicesComponent <em>Services Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.ServicesComponent
	 * @see cCS.impl.CCSPackageImpl#getServicesComponent()
	 * @generated
	 */
	int SERVICES_COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Services Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Services Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceConfigImpl <em>Interface Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceConfigImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceConfig()
	 * @generated
	 */
	int INTERFACE_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Interface Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Links <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Links
	 * @see cCS.impl.CCSPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 10;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.PortsConfig <em>Ports Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.PortsConfig
	 * @see cCS.impl.CCSPackageImpl#getPortsConfig()
	 * @generated
	 */
	int PORTS_CONFIG = 11;

	/**
	 * The number of structural features of the '<em>Ports Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ports Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.ServicesConfig <em>Services Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.ServicesConfig
	 * @see cCS.impl.CCSPackageImpl#getServicesConfig()
	 * @generated
	 */
	int SERVICES_CONFIG = 12;

	/**
	 * The number of structural features of the '<em>Services Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Services Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Attachments <em>Attachments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Attachments
	 * @see cCS.impl.CCSPackageImpl#getAttachments()
	 * @generated
	 */
	int ATTACHMENTS = 13;

	/**
	 * The number of structural features of the '<em>Attachments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_FEATURE_COUNT = LINKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_OPERATION_COUNT = LINKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Bindings <em>Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Bindings
	 * @see cCS.impl.CCSPackageImpl#getBindings()
	 * @generated
	 */
	int BINDINGS = 14;

	/**
	 * The number of structural features of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_FEATURE_COUNT = LINKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_OPERATION_COUNT = LINKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.GlueImpl
	 * @see cCS.impl.CCSPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 15;

	/**
	 * The feature id for the '<em><b>Neweclass18</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__NEWECLASS18 = 0;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceConnectorImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Role <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Role
	 * @see cCS.impl.CCSPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 17;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PPCompImpl <em>PP Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PPCompImpl
	 * @see cCS.impl.CCSPackageImpl#getPPComp()
	 * @generated
	 */
	int PP_COMP = 18;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_COMP__PB = PORTS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_COMP__PRA = PORTS_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PP Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_COMP_FEATURE_COUNT = PORTS_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PP Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_COMP_OPERATION_COUNT = PORTS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RPCompImpl <em>RP Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RPCompImpl
	 * @see cCS.impl.CCSPackageImpl#getRPComp()
	 * @generated
	 */
	int RP_COMP = 19;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_COMP__RB = PORTS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_COMP__RPA = PORTS_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RP Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_COMP_FEATURE_COUNT = PORTS_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RP Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_COMP_OPERATION_COUNT = PORTS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PSCompImpl <em>PS Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PSCompImpl
	 * @see cCS.impl.CCSPackageImpl#getPSComp()
	 * @generated
	 */
	int PS_COMP = 20;

	/**
	 * The number of structural features of the '<em>PS Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMP_FEATURE_COUNT = SERVICES_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMP_OPERATION_COUNT = SERVICES_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RSCompImpl <em>RS Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RSCompImpl
	 * @see cCS.impl.CCSPackageImpl#getRSComp()
	 * @generated
	 */
	int RS_COMP = 21;

	/**
	 * The number of structural features of the '<em>RS Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_COMP_FEATURE_COUNT = SERVICES_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RS Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_COMP_OPERATION_COUNT = SERVICES_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PPConfImpl <em>PP Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PPConfImpl
	 * @see cCS.impl.CCSPackageImpl#getPPConf()
	 * @generated
	 */
	int PP_CONF = 22;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_CONF__PB = PORTS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PP Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_CONF_FEATURE_COUNT = PORTS_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PP Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_CONF_OPERATION_COUNT = PORTS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RPConfImpl <em>RP Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RPConfImpl
	 * @see cCS.impl.CCSPackageImpl#getRPConf()
	 * @generated
	 */
	int RP_CONF = 23;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_CONF__RB = PORTS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RP Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_CONF_FEATURE_COUNT = PORTS_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RP Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_CONF_OPERATION_COUNT = PORTS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PSConfImpl <em>PS Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PSConfImpl
	 * @see cCS.impl.CCSPackageImpl#getPSConf()
	 * @generated
	 */
	int PS_CONF = 24;

	/**
	 * The number of structural features of the '<em>PS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CONF_FEATURE_COUNT = SERVICES_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CONF_OPERATION_COUNT = SERVICES_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RSConfImpl <em>RS Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RSConfImpl
	 * @see cCS.impl.CCSPackageImpl#getRSConf()
	 * @generated
	 */
	int RS_CONF = 25;

	/**
	 * The number of structural features of the '<em>RS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_CONF_FEATURE_COUNT = SERVICES_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RS Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS_CONF_OPERATION_COUNT = SERVICES_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PBImpl <em>PB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PBImpl
	 * @see cCS.impl.CCSPackageImpl#getPB()
	 * @generated
	 */
	int PB = 26;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PB__PP = BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PB__PP2 = BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PB_FEATURE_COUNT = BINDINGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PB_OPERATION_COUNT = BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RBImpl <em>RB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RBImpl
	 * @see cCS.impl.CCSPackageImpl#getRB()
	 * @generated
	 */
	int RB = 27;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB__RP = BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB__RP2 = BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_FEATURE_COUNT = BINDINGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_OPERATION_COUNT = BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PRAImpl <em>PRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PRAImpl
	 * @see cCS.impl.CCSPackageImpl#getPRA()
	 * @generated
	 */
	int PRA = 28;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRA__PP = ATTACHMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRA__RR = ATTACHMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRA_FEATURE_COUNT = ATTACHMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRA_OPERATION_COUNT = ATTACHMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RPAImpl <em>RPA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RPAImpl
	 * @see cCS.impl.CCSPackageImpl#getRPA()
	 * @generated
	 */
	int RPA = 29;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPA__RP = ATTACHMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPA__PR = ATTACHMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPA_FEATURE_COUNT = ATTACHMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPA_OPERATION_COUNT = ATTACHMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PRImpl <em>PR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PRImpl
	 * @see cCS.impl.CCSPackageImpl#getPR()
	 * @generated
	 */
	int PR = 30;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR__RPA = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RRImpl <em>RR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RRImpl
	 * @see cCS.impl.CCSPackageImpl#getRR()
	 * @generated
	 */
	int RR = 31;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RR__PRA = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RR_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RR_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServerImpl
	 * @see cCS.impl.CCSPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 32;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServerCompImpl <em>Server Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServerCompImpl
	 * @see cCS.impl.CCSPackageImpl#getServerComp()
	 * @generated
	 */
	int SERVER_COMP = 33;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Serverconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP__SERVERCONFIG = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacesserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP__INTERFACESSERVER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMP_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.SystemImpl
	 * @see cCS.impl.CCSPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 34;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENT = CONFIG__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTOR = CONFIG__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTERFACE = CONFIG__INTERFACE;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LINKS = CONFIG__LINKS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVER = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RPC = CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CLIENT = CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sys2clientbinding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYS2CLIENTBINDING = CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Systeminterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEMINTERFACE = CONFIG_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RPCImpl
	 * @see cCS.impl.CCSPackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 35;

	/**
	 * The feature id for the '<em><b>Neweclass16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NEWECLASS16 = CONNECTOR__NEWECLASS16;

	/**
	 * The feature id for the '<em><b>Neweclass17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NEWECLASS17 = CONNECTOR__NEWECLASS17;

	/**
	 * The feature id for the '<em><b>Interfacerpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACERPC = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ClientImpl
	 * @see cCS.impl.CCSPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 36;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Interfacesc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACESC = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServerConfigImpl <em>Server Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServerConfigImpl
	 * @see cCS.impl.CCSPackageImpl#getServerConfig()
	 * @generated
	 */
	int SERVER_CONFIG = 37;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__COMPONENT = CONFIG__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__CONNECTOR = CONFIG__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__INTERFACE = CONFIG__INTERFACE;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__LINKS = CONFIG__LINKS;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__CONNECTIONMANAGER = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securitymanager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__SECURITYMANAGER = CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__DB = CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connectdb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__CONNECTDB = CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Secdb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__SECDB = CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connectsec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__CONNECTSEC = CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Serv2servbinding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__SERV2SERVBINDING = CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Serverconfiginterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG__SERVERCONFIGINTERFACE = CONFIG_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Server Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Server Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_OPERATION_COUNT = CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ConnectionManagerImpl
	 * @see cCS.impl.CCSPackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 38;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Interfacesconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACESCONNECT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.SecurityManagerImpl
	 * @see cCS.impl.CCSPackageImpl#getSecurityManager()
	 * @generated
	 */
	int SECURITY_MANAGER = 39;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Securityinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__SECURITYINTERFACE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.DBImpl <em>DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.DBImpl
	 * @see cCS.impl.CCSPackageImpl#getDB()
	 * @generated
	 */
	int DB = 40;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB__CONSTRAINTS = COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB__INTERFACE = COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Dbinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB__DBINTERFACE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AttachmentCRImpl <em>Attachment CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AttachmentCRImpl
	 * @see cCS.impl.CCSPackageImpl#getAttachmentCR()
	 * @generated
	 */
	int ATTACHMENT_CR = 41;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CR__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CR__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>Attachment CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CR_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CR_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AttachmentRCImpl <em>Attachment RC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AttachmentRCImpl
	 * @see cCS.impl.CCSPackageImpl#getAttachmentRC()
	 * @generated
	 */
	int ATTACHMENT_RC = 42;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RC__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RC__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>Attachment RC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RC_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment RC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RC_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.interfacesCImpl <em>interfaces C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.interfacesCImpl
	 * @see cCS.impl.CCSPackageImpl#getinterfacesC()
	 * @generated
	 */
	int INTERFACES_C = 43;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C__PORTS = INTERFACE_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C__SERVICES = INTERFACE_COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Portrc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C__PORTRC = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C__PORTPC = INTERFACE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sys2clientcp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C__SYS2CLIENTCP = INTERFACE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>interfaces C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>interfaces C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_C_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortRCImpl <em>Port RC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortRCImpl
	 * @see cCS.impl.CCSPackageImpl#getPortRC()
	 * @generated
	 */
	int PORT_RC = 44;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RC__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RC__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Attachmentrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RC__ATTACHMENTRC = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port RC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RC_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port RC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RC_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortPCImpl <em>Port PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortPCImpl
	 * @see cCS.impl.CCSPackageImpl#getPortPC()
	 * @generated
	 */
	int PORT_PC = 45;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PC__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PC__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Attachmentcr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PC__ATTACHMENTCR = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PC_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PC_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceRPCImpl <em>Interface RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceRPCImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceRPC()
	 * @generated
	 */
	int INTERFACE_RPC = 46;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__ROLE = INTERFACE_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Prolerpc2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__PROLERPC2 = INTERFACE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rrolerpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__RROLERPC = INTERFACE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rrolerpc2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__RROLERPC2 = INTERFACE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prolerpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__PROLERPC = INTERFACE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC_FEATURE_COUNT = INTERFACE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC_OPERATION_COUNT = INTERFACE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RRoleRPCClientImpl <em>RRole RPC Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RRoleRPCClientImpl
	 * @see cCS.impl.CCSPackageImpl#getRRoleRPCClient()
	 * @generated
	 */
	int RROLE_RPC_CLIENT = 47;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_CLIENT__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Attachmentcr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_CLIENT__ATTACHMENTCR = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RRole RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_CLIENT_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RRole RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_CLIENT_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PRoleRPCClientImpl <em>PRole RPC Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PRoleRPCClientImpl
	 * @see cCS.impl.CCSPackageImpl#getPRoleRPCClient()
	 * @generated
	 */
	int PROLE_RPC_CLIENT = 48;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_CLIENT__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Attachmentrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_CLIENT__ATTACHMENTRC = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRole RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_CLIENT_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PRole RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_CLIENT_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfacesConnectImpl <em>Interfaces Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfacesConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfacesConnect()
	 * @generated
	 */
	int INTERFACES_CONNECT = 49;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__PORTS = INTERFACE_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__SERVICES = INTERFACE_COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Palpha2connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__PALPHA2CONNECT = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pconnect2alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__PCONNECT2ALPHA = INTERFACE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pconnect2gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__PCONNECT2GAMMA = INTERFACE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pgamma2connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__PGAMMA2CONNECT = INTERFACE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Servconf2connectconnectp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP = INTERFACE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interfaces Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Interfaces Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_CONNECT_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfacesServerImpl <em>Interfaces Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfacesServerImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfacesServer()
	 * @generated
	 */
	int INTERFACES_SERVER = 50;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER__PORTS = INTERFACE_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER__SERVICES = INTERFACE_COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Portps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER__PORTPS = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER__PORTRS = INTERFACE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Servconf2servcompcompp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP = INTERFACE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interfaces Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interfaces Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_SERVER_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortPSImpl <em>Port PS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortPSImpl
	 * @see cCS.impl.CCSPackageImpl#getPortPS()
	 * @generated
	 */
	int PORT_PS = 51;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PS__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PS__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Attachementsrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PS__ATTACHEMENTSRPC = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port PS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PS_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port PS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PS_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PortRSImpl <em>Port RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PortRSImpl
	 * @see cCS.impl.CCSPackageImpl#getPortRS()
	 * @generated
	 */
	int PORT_RS = 52;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RS__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RS__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Attachementsrpcserv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RS__ATTACHEMENTSRPCSERV = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RS_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RS_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RRoleRPCServerImpl <em>RRole RPC Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RRoleRPCServerImpl
	 * @see cCS.impl.CCSPackageImpl#getRRoleRPCServer()
	 * @generated
	 */
	int RROLE_RPC_SERVER = 53;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_SERVER__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Attachementsrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_SERVER__ATTACHEMENTSRPC = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RRole RPC Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_SERVER_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RRole RPC Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RROLE_RPC_SERVER_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PRoleRPCSevImpl <em>PRole RPC Sev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PRoleRPCSevImpl
	 * @see cCS.impl.CCSPackageImpl#getPRoleRPCSev()
	 * @generated
	 */
	int PROLE_RPC_SEV = 54;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_SEV__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Attachementsrpcserv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_SEV__ATTACHEMENTSRPCSERV = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PRole RPC Sev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_SEV_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PRole RPC Sev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROLE_RPC_SEV_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AttachementSRPCImpl <em>Attachement SRPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AttachementSRPCImpl
	 * @see cCS.impl.CCSPackageImpl#getAttachementSRPC()
	 * @generated
	 */
	int ATTACHEMENT_SRPC = 55;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SRPC__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SRPC__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>Attachement SRPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SRPC_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachement SRPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SRPC_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AttachementsRPCServImpl <em>Attachements RPC Serv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AttachementsRPCServImpl
	 * @see cCS.impl.CCSPackageImpl#getAttachementsRPCServ()
	 * @generated
	 */
	int ATTACHEMENTS_RPC_SERV = 56;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENTS_RPC_SERV__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENTS_RPC_SERV__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>Attachements RPC Serv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENTS_RPC_SERV_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachements RPC Serv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENTS_RPC_SERV_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.SecurityInterfaceImpl <em>Security Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.SecurityInterfaceImpl
	 * @see cCS.impl.CCSPackageImpl#getSecurityInterface()
	 * @generated
	 */
	int SECURITY_INTERFACE = 57;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__PORTS = INTERFACE_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__SERVICES = INTERFACE_COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Psec2beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__PSEC2BETA = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pbeta2sec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__PBETA2SEC = INTERFACE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Palpha2sec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__PALPHA2SEC = INTERFACE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Psec2alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE__PSEC2ALPHA = INTERFACE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_INTERFACE_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.DBInterfaceImpl <em>DB Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.DBInterfaceImpl
	 * @see cCS.impl.CCSPackageImpl#getDBInterface()
	 * @generated
	 */
	int DB_INTERFACE = 58;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__PORTS = INTERFACE_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__SERVICES = INTERFACE_COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Pdb2gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__PDB2GAMMA = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pgamma2db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__PGAMMA2DB = INTERFACE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pdb2beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__PDB2BETA = INTERFACE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pbeta2db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE__PBETA2DB = INTERFACE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DB Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DB Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AlphaImpl <em>Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getAlpha()
	 * @generated
	 */
	int ALPHA = 59;

	/**
	 * The feature id for the '<em><b>Neweclass16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__NEWECLASS16 = CONNECTOR__NEWECLASS16;

	/**
	 * The feature id for the '<em><b>Neweclass17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__NEWECLASS17 = CONNECTOR__NEWECLASS17;

	/**
	 * The feature id for the '<em><b>Interfacealpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__INTERFACEALPHA = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.BetaImpl <em>Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getBeta()
	 * @generated
	 */
	int BETA = 60;

	/**
	 * The feature id for the '<em><b>Neweclass16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__NEWECLASS16 = CONNECTOR__NEWECLASS16;

	/**
	 * The feature id for the '<em><b>Neweclass17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__NEWECLASS17 = CONNECTOR__NEWECLASS17;

	/**
	 * The feature id for the '<em><b>Interfacebeta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__INTERFACEBETA = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.GammaImpl <em>Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getGamma()
	 * @generated
	 */
	int GAMMA = 61;

	/**
	 * The feature id for the '<em><b>Neweclass16</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__NEWECLASS16 = CONNECTOR__NEWECLASS16;

	/**
	 * The feature id for the '<em><b>Neweclass17</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__NEWECLASS17 = CONNECTOR__NEWECLASS17;

	/**
	 * The feature id for the '<em><b>Interfacegamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__INTERFACEGAMMA = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PDB2GammaImpl <em>PDB2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PDB2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getPDB2Gamma()
	 * @generated
	 */
	int PDB2_GAMMA = 62;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_GAMMA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_GAMMA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Adb2gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_GAMMA__ADB2GAMMA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_GAMMA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PDB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_GAMMA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PSec2AlphaImpl <em>PSec2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PSec2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getPSec2Alpha()
	 * @generated
	 */
	int PSEC2_ALPHA = 63;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_ALPHA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_ALPHA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Asec2alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_ALPHA__ASEC2ALPHA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_ALPHA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_ALPHA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PConnect2AlphaImpl <em>PConnect2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PConnect2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getPConnect2Alpha()
	 * @generated
	 */
	int PCONNECT2_ALPHA = 64;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_ALPHA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_ALPHA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Aconnect2alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_ALPHA__ACONNECT2ALPHA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_ALPHA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_ALPHA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PAlpha2SecImpl <em>PAlpha2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PAlpha2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getPAlpha2Sec()
	 * @generated
	 */
	int PALPHA2_SEC = 65;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_SEC__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_SEC__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Aalpha2sec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_SEC__AALPHA2SEC = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_SEC_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_SEC_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PGamma2DBImpl <em>PGamma2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PGamma2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getPGamma2DB()
	 * @generated
	 */
	int PGAMMA2_DB = 66;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_DB__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_DB__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Agamma2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_DB__AGAMMA2DB = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_DB_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_DB_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PAlpha2ConnectImpl <em>PAlpha2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PAlpha2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getPAlpha2Connect()
	 * @generated
	 */
	int PALPHA2_CONNECT = 67;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_CONNECT__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_CONNECT__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Aalpha2connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_CONNECT__AALPHA2CONNECT = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_CONNECT_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALPHA2_CONNECT_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceAlphaImpl <em>Interface Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceAlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceAlpha()
	 * @generated
	 */
	int INTERFACE_ALPHA = 68;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__ROLE = INTERFACE_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Rsec2alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__RSEC2ALPHA = INTERFACE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ralpha2sec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__RALPHA2SEC = INTERFACE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rconnect2alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__RCONNECT2ALPHA = INTERFACE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ralpha2connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__RALPHA2CONNECT = INTERFACE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA_FEATURE_COUNT = INTERFACE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA_OPERATION_COUNT = INTERFACE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceBetaImpl <em>Interface Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceBetaImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceBeta()
	 * @generated
	 */
	int INTERFACE_BETA = 69;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__ROLE = INTERFACE_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Rbeta2sec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__RBETA2SEC = INTERFACE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rsec2beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__RSEC2BETA = INTERFACE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rbeta2db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__RBETA2DB = INTERFACE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rdb2beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__RDB2BETA = INTERFACE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA_FEATURE_COUNT = INTERFACE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA_OPERATION_COUNT = INTERFACE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.InterfaceGammaImpl <em>Interface Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.InterfaceGammaImpl
	 * @see cCS.impl.CCSPackageImpl#getInterfaceGamma()
	 * @generated
	 */
	int INTERFACE_GAMMA = 70;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__ROLE = INTERFACE_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Rconnect2gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__RCONNECT2GAMMA = INTERFACE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rgamma2connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__RGAMMA2CONNECT = INTERFACE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rdb2gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__RDB2GAMMA = INTERFACE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rgamma2db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__RGAMMA2DB = INTERFACE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA_FEATURE_COUNT = INTERFACE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA_OPERATION_COUNT = INTERFACE_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PSec2BetaImpl <em>PSec2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PSec2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getPSec2Beta()
	 * @generated
	 */
	int PSEC2_BETA = 71;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_BETA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_BETA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Asec2beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_BETA__ASEC2BETA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_BETA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEC2_BETA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PBeta2SecImpl <em>PBeta2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PBeta2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getPBeta2Sec()
	 * @generated
	 */
	int PBETA2_SEC = 72;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_SEC__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_SEC__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Abeta2sec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_SEC__ABETA2SEC = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PBeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_SEC_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PBeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_SEC_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RBeta2DBImpl <em>RBeta2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RBeta2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getRBeta2DB()
	 * @generated
	 */
	int RBETA2_DB = 73;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_DB__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Abeta2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_DB__ABETA2DB = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RBeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_DB_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RBeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_DB_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RBeta2SecImpl <em>RBeta2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RBeta2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getRBeta2Sec()
	 * @generated
	 */
	int RBETA2_SEC = 74;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_SEC__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Abeta2sec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_SEC__ABETA2SEC = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RBeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_SEC_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RBeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBETA2_SEC_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RSec2BetaImpl <em>RSec2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RSec2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getRSec2Beta()
	 * @generated
	 */
	int RSEC2_BETA = 75;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_BETA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Asec2beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_BETA__ASEC2BETA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RSec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_BETA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RSec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_BETA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RDB2BetaImpl <em>RDB2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RDB2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getRDB2Beta()
	 * @generated
	 */
	int RDB2_BETA = 76;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_BETA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Adb2beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_BETA__ADB2BETA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RDB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_BETA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RDB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_BETA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RConnect2AlphaImpl <em>RConnect2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RConnect2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getRConnect2Alpha()
	 * @generated
	 */
	int RCONNECT2_ALPHA = 77;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_ALPHA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Aconnect2alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_ALPHA__ACONNECT2ALPHA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_ALPHA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_ALPHA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RAlpha2SecImpl <em>RAlpha2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RAlpha2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getRAlpha2Sec()
	 * @generated
	 */
	int RALPHA2_SEC = 78;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_SEC__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Aalpha2sec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_SEC__AALPHA2SEC = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_SEC_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_SEC_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RSec2AlphaImpl <em>RSec2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RSec2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getRSec2Alpha()
	 * @generated
	 */
	int RSEC2_ALPHA = 79;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_ALPHA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Asec2alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_ALPHA__ASEC2ALPHA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RSec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_ALPHA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RSec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSEC2_ALPHA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RAlpha2ConnectImpl <em>RAlpha2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RAlpha2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getRAlpha2Connect()
	 * @generated
	 */
	int RALPHA2_CONNECT = 80;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_CONNECT__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Aalpha2connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_CONNECT__AALPHA2CONNECT = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_CONNECT_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RALPHA2_CONNECT_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PConnect2GammaImpl <em>PConnect2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PConnect2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getPConnect2Gamma()
	 * @generated
	 */
	int PCONNECT2_GAMMA = 81;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_GAMMA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_GAMMA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Aconnect2gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_GAMMA__ACONNECT2GAMMA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_GAMMA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECT2_GAMMA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PGamma2ConnectImpl <em>PGamma2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PGamma2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getPGamma2Connect()
	 * @generated
	 */
	int PGAMMA2_CONNECT = 82;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_CONNECT__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_CONNECT__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Agamma2connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_CONNECT__AGAMMA2CONNECT = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_CONNECT_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGAMMA2_CONNECT_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PDB2BetaImpl <em>PDB2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PDB2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getPDB2Beta()
	 * @generated
	 */
	int PDB2_BETA = 83;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_BETA__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_BETA__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Adb2beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_BETA__ADB2BETA = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_BETA_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PDB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDB2_BETA_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.PBeta2DBImpl <em>PBeta2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.PBeta2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getPBeta2DB()
	 * @generated
	 */
	int PBETA2_DB = 84;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_DB__RB = RP_COMP__RB;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_DB__RPA = RP_COMP__RPA;

	/**
	 * The feature id for the '<em><b>Abeta2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_DB__ABETA2DB = RP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PBeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_DB_FEATURE_COUNT = RP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PBeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBETA2_DB_OPERATION_COUNT = RP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RGamma2DBImpl <em>RGamma2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RGamma2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getRGamma2DB()
	 * @generated
	 */
	int RGAMMA2_DB = 85;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_DB__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Agamma2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_DB__AGAMMA2DB = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_DB_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_DB_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RDB2GammaImpl <em>RDB2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RDB2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getRDB2Gamma()
	 * @generated
	 */
	int RDB2_GAMMA = 86;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_GAMMA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Adb2gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_GAMMA__ADB2GAMMA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RDB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_GAMMA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RDB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDB2_GAMMA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RGamma2ConnectImpl <em>RGamma2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RGamma2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getRGamma2Connect()
	 * @generated
	 */
	int RGAMMA2_CONNECT = 87;

	/**
	 * The feature id for the '<em><b>Rpa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_CONNECT__RPA = PR__RPA;

	/**
	 * The feature id for the '<em><b>Agamma2connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_CONNECT__AGAMMA2CONNECT = PR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_CONNECT_FEATURE_COUNT = PR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGAMMA2_CONNECT_OPERATION_COUNT = PR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.RConnect2GammaImpl <em>RConnect2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.RConnect2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getRConnect2Gamma()
	 * @generated
	 */
	int RCONNECT2_GAMMA = 88;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_GAMMA__PRA = RR__PRA;

	/**
	 * The feature id for the '<em><b>Aconnect2gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_GAMMA__ACONNECT2GAMMA = RR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_GAMMA_FEATURE_COUNT = RR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONNECT2_GAMMA_OPERATION_COUNT = RR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ADB2GammaImpl <em>ADB2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ADB2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getADB2Gamma()
	 * @generated
	 */
	int ADB2_GAMMA = 89;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_GAMMA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_GAMMA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>ADB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_GAMMA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ADB2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_GAMMA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AConnect2GammaImpl <em>AConnect2 Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AConnect2GammaImpl
	 * @see cCS.impl.CCSPackageImpl#getAConnect2Gamma()
	 * @generated
	 */
	int ACONNECT2_GAMMA = 90;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_GAMMA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_GAMMA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>AConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_GAMMA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AConnect2 Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_GAMMA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AGamma2DBImpl <em>AGamma2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AGamma2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getAGamma2DB()
	 * @generated
	 */
	int AGAMMA2_DB = 91;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_DB__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_DB__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>AGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_DB_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGamma2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_DB_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AGamma2ConnectImpl <em>AGamma2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AGamma2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getAGamma2Connect()
	 * @generated
	 */
	int AGAMMA2_CONNECT = 92;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_CONNECT__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_CONNECT__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>AGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_CONNECT_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGamma2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGAMMA2_CONNECT_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ADB2BetaImpl <em>ADB2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ADB2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getADB2Beta()
	 * @generated
	 */
	int ADB2_BETA = 93;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_BETA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_BETA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>ADB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_BETA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ADB2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADB2_BETA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ABeta2DBImpl <em>ABeta2 DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ABeta2DBImpl
	 * @see cCS.impl.CCSPackageImpl#getABeta2DB()
	 * @generated
	 */
	int ABETA2_DB = 94;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_DB__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_DB__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>ABeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_DB_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ABeta2 DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_DB_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ASec2BetaImpl <em>ASec2 Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ASec2BetaImpl
	 * @see cCS.impl.CCSPackageImpl#getASec2Beta()
	 * @generated
	 */
	int ASEC2_BETA = 95;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_BETA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_BETA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>ASec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_BETA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ASec2 Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_BETA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ABeta2SecImpl <em>ABeta2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ABeta2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getABeta2Sec()
	 * @generated
	 */
	int ABETA2_SEC = 96;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_SEC__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_SEC__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>ABeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_SEC_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ABeta2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABETA2_SEC_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AConnect2AlphaImpl <em>AConnect2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AConnect2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getAConnect2Alpha()
	 * @generated
	 */
	int ACONNECT2_ALPHA = 97;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_ALPHA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_ALPHA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>AConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_ALPHA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AConnect2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT2_ALPHA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AAlpha2ConnectImpl <em>AAlpha2 Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AAlpha2ConnectImpl
	 * @see cCS.impl.CCSPackageImpl#getAAlpha2Connect()
	 * @generated
	 */
	int AALPHA2_CONNECT = 98;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_CONNECT__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_CONNECT__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>AAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_CONNECT_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AAlpha2 Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_CONNECT_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ASec2AlphaImpl <em>ASec2 Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ASec2AlphaImpl
	 * @see cCS.impl.CCSPackageImpl#getASec2Alpha()
	 * @generated
	 */
	int ASEC2_ALPHA = 99;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_ALPHA__PP = PRA__PP;

	/**
	 * The feature id for the '<em><b>Rr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_ALPHA__RR = PRA__RR;

	/**
	 * The number of structural features of the '<em>ASec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_ALPHA_FEATURE_COUNT = PRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ASec2 Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEC2_ALPHA_OPERATION_COUNT = PRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.AAlpha2SecImpl <em>AAlpha2 Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.AAlpha2SecImpl
	 * @see cCS.impl.CCSPackageImpl#getAAlpha2Sec()
	 * @generated
	 */
	int AALPHA2_SEC = 100;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_SEC__RP = RPA__RP;

	/**
	 * The feature id for the '<em><b>Pr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_SEC__PR = RPA__PR;

	/**
	 * The number of structural features of the '<em>AAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_SEC_FEATURE_COUNT = RPA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AAlpha2 Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALPHA2_SEC_OPERATION_COUNT = RPA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.Sys2ClientBindingImpl <em>Sys2 Client Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.Sys2ClientBindingImpl
	 * @see cCS.impl.CCSPackageImpl#getSys2ClientBinding()
	 * @generated
	 */
	int SYS2_CLIENT_BINDING = 101;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING__PP = PB__PP;

	/**
	 * The feature id for the '<em><b>Pp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING__PP2 = PB__PP2;

	/**
	 * The feature id for the '<em><b>Sys2clientsp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING__SYS2CLIENTSP = PB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sys2clientcp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING__SYS2CLIENTCP = PB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sys2 Client Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING_FEATURE_COUNT = PB_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sys2 Client Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_BINDING_OPERATION_COUNT = PB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.SystemInterfaceImpl <em>System Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.SystemInterfaceImpl
	 * @see cCS.impl.CCSPackageImpl#getSystemInterface()
	 * @generated
	 */
	int SYSTEM_INTERFACE = 102;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTERFACE__PORTS = INTERFACE_CONFIG__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTERFACE__SERVICES = INTERFACE_CONFIG__SERVICES;

	/**
	 * The feature id for the '<em><b>Sys2clientsp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTERFACE__SYS2CLIENTSP = INTERFACE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTERFACE_FEATURE_COUNT = INTERFACE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INTERFACE_OPERATION_COUNT = INTERFACE_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.Sys2ClientSPImpl <em>Sys2 Client SP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.Sys2ClientSPImpl
	 * @see cCS.impl.CCSPackageImpl#getSys2ClientSP()
	 * @generated
	 */
	int SYS2_CLIENT_SP = 103;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_SP__PB = PP_CONF__PB;

	/**
	 * The feature id for the '<em><b>Sys2clientbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_SP__SYS2CLIENTBINDING = PP_CONF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys2 Client SP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_SP_FEATURE_COUNT = PP_CONF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sys2 Client SP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_SP_OPERATION_COUNT = PP_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.Sys2ClientCPImpl <em>Sys2 Client CP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.Sys2ClientCPImpl
	 * @see cCS.impl.CCSPackageImpl#getSys2ClientCP()
	 * @generated
	 */
	int SYS2_CLIENT_CP = 104;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_CP__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_CP__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Sys2clientbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_CP__SYS2CLIENTBINDING = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys2 Client CP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_CP_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sys2 Client CP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS2_CLIENT_CP_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.Serv2ServBindingImpl <em>Serv2 Serv Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.Serv2ServBindingImpl
	 * @see cCS.impl.CCSPackageImpl#getServ2ServBinding()
	 * @generated
	 */
	int SERV2_SERV_BINDING = 105;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING__PP = PB__PP;

	/**
	 * The feature id for the '<em><b>Pp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING__PP2 = PB__PP2;

	/**
	 * The feature id for the '<em><b>Servconf2servcompconfp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP = PB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servconf2servcompcompp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP = PB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Serv2 Serv Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING_FEATURE_COUNT = PB_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Serv2 Serv Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV2_SERV_BINDING_OPERATION_COUNT = PB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServerConfigInterfaceImpl <em>Server Config Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServerConfigInterfaceImpl
	 * @see cCS.impl.CCSPackageImpl#getServerConfigInterface()
	 * @generated
	 */
	int SERVER_CONFIG_INTERFACE = 106;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE__PORTS = INTERFACE_CONFIG__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE__SERVICES = INTERFACE_CONFIG__SERVICES;

	/**
	 * The feature id for the '<em><b>Servconf2servcompconfp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP = INTERFACE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servconf2connectservp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP = INTERFACE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Config Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE_FEATURE_COUNT = INTERFACE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server Config Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIG_INTERFACE_OPERATION_COUNT = INTERFACE_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServConf2ServCompConfPImpl <em>Serv Conf2 Serv Comp Conf P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServConf2ServCompConfPImpl
	 * @see cCS.impl.CCSPackageImpl#getServConf2ServCompConfP()
	 * @generated
	 */
	int SERV_CONF2_SERV_COMP_CONF_P = 107;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_CONF_P__PB = PP_CONF__PB;

	/**
	 * The feature id for the '<em><b>Serv2servbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING = PP_CONF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serv Conf2 Serv Comp Conf P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_CONF_P_FEATURE_COUNT = PP_CONF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Serv Conf2 Serv Comp Conf P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_CONF_P_OPERATION_COUNT = PP_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServConf2ServCompCompPImpl <em>Serv Conf2 Serv Comp Comp P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServConf2ServCompCompPImpl
	 * @see cCS.impl.CCSPackageImpl#getServConf2ServCompCompP()
	 * @generated
	 */
	int SERV_CONF2_SERV_COMP_COMP_P = 108;

	/**
	 * The feature id for the '<em><b>Pb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_COMP_P__PB = PP_COMP__PB;

	/**
	 * The feature id for the '<em><b>Pra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_COMP_P__PRA = PP_COMP__PRA;

	/**
	 * The feature id for the '<em><b>Serv2servbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING = PP_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serv Conf2 Serv Comp Comp P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_COMP_P_FEATURE_COUNT = PP_COMP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Serv Conf2 Serv Comp Comp P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_SERV_COMP_COMP_P_OPERATION_COUNT = PP_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServConf2ConnectServPImpl <em>Serv Conf2 Connect Serv P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServConf2ConnectServPImpl
	 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectServP()
	 * @generated
	 */
	int SERV_CONF2_CONNECT_SERV_P = 109;

	/**
	 * The feature id for the '<em><b>Servconf2connectbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING = 0;

	/**
	 * The number of structural features of the '<em>Serv Conf2 Connect Serv P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_SERV_P_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Serv Conf2 Connect Serv P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_SERV_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServConf2ConnectConnectPImpl <em>Serv Conf2 Connect Connect P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServConf2ConnectConnectPImpl
	 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectConnectP()
	 * @generated
	 */
	int SERV_CONF2_CONNECT_CONNECT_P = 110;

	/**
	 * The feature id for the '<em><b>Servconf2connectbinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING = 0;

	/**
	 * The number of structural features of the '<em>Serv Conf2 Connect Connect P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_CONNECT_P_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Serv Conf2 Connect Connect P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_CONNECT_P_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.impl.ServConf2ConnectBindingImpl <em>Serv Conf2 Connect Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.impl.ServConf2ConnectBindingImpl
	 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectBinding()
	 * @generated
	 */
	int SERV_CONF2_CONNECT_BINDING = 111;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING__PP = PB__PP;

	/**
	 * The feature id for the '<em><b>Pp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING__PP2 = PB__PP2;

	/**
	 * The feature id for the '<em><b>Servconf2connectservp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP = PB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servconf2connectconnectp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP = PB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Serv Conf2 Connect Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING_FEATURE_COUNT = PB_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Serv Conf2 Connect Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERV_CONF2_CONNECT_BINDING_OPERATION_COUNT = PB_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link cCS.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see cCS.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Config#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see cCS.Config#getComponent()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Component();

	/**
	 * Returns the meta object for the reference '{@link cCS.Config#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see cCS.Config#getConnector()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Connector();

	/**
	 * Returns the meta object for the reference '{@link cCS.Config#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see cCS.Config#getInterface()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Interface();

	/**
	 * Returns the meta object for the reference '{@link cCS.Config#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Links</em>'.
	 * @see cCS.Config#getLinks()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Links();

	/**
	 * Returns the meta object for class '{@link cCS.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cCS.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link cCS.Connector#getNeweclass16 <em>Neweclass16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neweclass16</em>'.
	 * @see cCS.Connector#getNeweclass16()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Neweclass16();

	/**
	 * Returns the meta object for the reference '{@link cCS.Connector#getNeweclass17 <em>Neweclass17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neweclass17</em>'.
	 * @see cCS.Connector#getNeweclass17()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Neweclass17();

	/**
	 * Returns the meta object for class '{@link cCS.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cCS.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link cCS.Component#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see cCS.Component#getProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Properties();

	/**
	 * Returns the meta object for the reference '{@link cCS.Component#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraints</em>'.
	 * @see cCS.Component#getConstraints()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Constraints();

	/**
	 * Returns the meta object for the reference '{@link cCS.Component#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see cCS.Component#getInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interface();

	/**
	 * Returns the meta object for class '{@link cCS.ElemArchi <em>Elem Archi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elem Archi</em>'.
	 * @see cCS.ElemArchi
	 * @generated
	 */
	EClass getElemArchi();

	/**
	 * Returns the meta object for class '{@link cCS.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see cCS.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for class '{@link cCS.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see cCS.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Component</em>'.
	 * @see cCS.InterfaceComponent
	 * @generated
	 */
	EClass getInterfaceComponent();

	/**
	 * Returns the meta object for the reference '{@link cCS.InterfaceComponent#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ports</em>'.
	 * @see cCS.InterfaceComponent#getPorts()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Ports();

	/**
	 * Returns the meta object for the reference '{@link cCS.InterfaceComponent#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see cCS.InterfaceComponent#getServices()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Services();

	/**
	 * Returns the meta object for class '{@link cCS.PortsComponent <em>Ports Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports Component</em>'.
	 * @see cCS.PortsComponent
	 * @generated
	 */
	EClass getPortsComponent();

	/**
	 * Returns the meta object for class '{@link cCS.ServicesComponent <em>Services Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Component</em>'.
	 * @see cCS.ServicesComponent
	 * @generated
	 */
	EClass getServicesComponent();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceConfig <em>Interface Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Config</em>'.
	 * @see cCS.InterfaceConfig
	 * @generated
	 */
	EClass getInterfaceConfig();

	/**
	 * Returns the meta object for the reference '{@link cCS.InterfaceConfig#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ports</em>'.
	 * @see cCS.InterfaceConfig#getPorts()
	 * @see #getInterfaceConfig()
	 * @generated
	 */
	EReference getInterfaceConfig_Ports();

	/**
	 * Returns the meta object for the reference '{@link cCS.InterfaceConfig#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see cCS.InterfaceConfig#getServices()
	 * @see #getInterfaceConfig()
	 * @generated
	 */
	EReference getInterfaceConfig_Services();

	/**
	 * Returns the meta object for class '{@link cCS.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see cCS.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for class '{@link cCS.PortsConfig <em>Ports Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports Config</em>'.
	 * @see cCS.PortsConfig
	 * @generated
	 */
	EClass getPortsConfig();

	/**
	 * Returns the meta object for class '{@link cCS.ServicesConfig <em>Services Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Config</em>'.
	 * @see cCS.ServicesConfig
	 * @generated
	 */
	EClass getServicesConfig();

	/**
	 * Returns the meta object for class '{@link cCS.Attachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachments</em>'.
	 * @see cCS.Attachments
	 * @generated
	 */
	EClass getAttachments();

	/**
	 * Returns the meta object for class '{@link cCS.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings</em>'.
	 * @see cCS.Bindings
	 * @generated
	 */
	EClass getBindings();

	/**
	 * Returns the meta object for class '{@link cCS.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see cCS.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference '{@link cCS.Glue#getNeweclass18 <em>Neweclass18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neweclass18</em>'.
	 * @see cCS.Glue#getNeweclass18()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Neweclass18();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connector</em>'.
	 * @see cCS.InterfaceConnector
	 * @generated
	 */
	EClass getInterfaceConnector();

	/**
	 * Returns the meta object for the reference '{@link cCS.InterfaceConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see cCS.InterfaceConnector#getRole()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Role();

	/**
	 * Returns the meta object for class '{@link cCS.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cCS.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link cCS.PPComp <em>PP Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PP Comp</em>'.
	 * @see cCS.PPComp
	 * @generated
	 */
	EClass getPPComp();

	/**
	 * Returns the meta object for the reference '{@link cCS.PPComp#getPb <em>Pb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pb</em>'.
	 * @see cCS.PPComp#getPb()
	 * @see #getPPComp()
	 * @generated
	 */
	EReference getPPComp_Pb();

	/**
	 * Returns the meta object for the reference '{@link cCS.PPComp#getPra <em>Pra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pra</em>'.
	 * @see cCS.PPComp#getPra()
	 * @see #getPPComp()
	 * @generated
	 */
	EReference getPPComp_Pra();

	/**
	 * Returns the meta object for class '{@link cCS.RPComp <em>RP Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RP Comp</em>'.
	 * @see cCS.RPComp
	 * @generated
	 */
	EClass getRPComp();

	/**
	 * Returns the meta object for the reference '{@link cCS.RPComp#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rb</em>'.
	 * @see cCS.RPComp#getRb()
	 * @see #getRPComp()
	 * @generated
	 */
	EReference getRPComp_Rb();

	/**
	 * Returns the meta object for the reference '{@link cCS.RPComp#getRpa <em>Rpa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpa</em>'.
	 * @see cCS.RPComp#getRpa()
	 * @see #getRPComp()
	 * @generated
	 */
	EReference getRPComp_Rpa();

	/**
	 * Returns the meta object for class '{@link cCS.PSComp <em>PS Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Comp</em>'.
	 * @see cCS.PSComp
	 * @generated
	 */
	EClass getPSComp();

	/**
	 * Returns the meta object for class '{@link cCS.RSComp <em>RS Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS Comp</em>'.
	 * @see cCS.RSComp
	 * @generated
	 */
	EClass getRSComp();

	/**
	 * Returns the meta object for class '{@link cCS.PPConf <em>PP Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PP Conf</em>'.
	 * @see cCS.PPConf
	 * @generated
	 */
	EClass getPPConf();

	/**
	 * Returns the meta object for the reference '{@link cCS.PPConf#getPb <em>Pb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pb</em>'.
	 * @see cCS.PPConf#getPb()
	 * @see #getPPConf()
	 * @generated
	 */
	EReference getPPConf_Pb();

	/**
	 * Returns the meta object for class '{@link cCS.RPConf <em>RP Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RP Conf</em>'.
	 * @see cCS.RPConf
	 * @generated
	 */
	EClass getRPConf();

	/**
	 * Returns the meta object for the reference '{@link cCS.RPConf#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rb</em>'.
	 * @see cCS.RPConf#getRb()
	 * @see #getRPConf()
	 * @generated
	 */
	EReference getRPConf_Rb();

	/**
	 * Returns the meta object for class '{@link cCS.PSConf <em>PS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Conf</em>'.
	 * @see cCS.PSConf
	 * @generated
	 */
	EClass getPSConf();

	/**
	 * Returns the meta object for class '{@link cCS.RSConf <em>RS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS Conf</em>'.
	 * @see cCS.RSConf
	 * @generated
	 */
	EClass getRSConf();

	/**
	 * Returns the meta object for class '{@link cCS.PB <em>PB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PB</em>'.
	 * @see cCS.PB
	 * @generated
	 */
	EClass getPB();

	/**
	 * Returns the meta object for the reference '{@link cCS.PB#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pp</em>'.
	 * @see cCS.PB#getPp()
	 * @see #getPB()
	 * @generated
	 */
	EReference getPB_Pp();

	/**
	 * Returns the meta object for the reference '{@link cCS.PB#getPp2 <em>Pp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pp2</em>'.
	 * @see cCS.PB#getPp2()
	 * @see #getPB()
	 * @generated
	 */
	EReference getPB_Pp2();

	/**
	 * Returns the meta object for class '{@link cCS.RB <em>RB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RB</em>'.
	 * @see cCS.RB
	 * @generated
	 */
	EClass getRB();

	/**
	 * Returns the meta object for the reference '{@link cCS.RB#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rp</em>'.
	 * @see cCS.RB#getRp()
	 * @see #getRB()
	 * @generated
	 */
	EReference getRB_Rp();

	/**
	 * Returns the meta object for the reference '{@link cCS.RB#getRp2 <em>Rp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rp2</em>'.
	 * @see cCS.RB#getRp2()
	 * @see #getRB()
	 * @generated
	 */
	EReference getRB_Rp2();

	/**
	 * Returns the meta object for class '{@link cCS.PRA <em>PRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRA</em>'.
	 * @see cCS.PRA
	 * @generated
	 */
	EClass getPRA();

	/**
	 * Returns the meta object for the reference '{@link cCS.PRA#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pp</em>'.
	 * @see cCS.PRA#getPp()
	 * @see #getPRA()
	 * @generated
	 */
	EReference getPRA_Pp();

	/**
	 * Returns the meta object for the reference '{@link cCS.PRA#getRr <em>Rr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rr</em>'.
	 * @see cCS.PRA#getRr()
	 * @see #getPRA()
	 * @generated
	 */
	EReference getPRA_Rr();

	/**
	 * Returns the meta object for class '{@link cCS.RPA <em>RPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPA</em>'.
	 * @see cCS.RPA
	 * @generated
	 */
	EClass getRPA();

	/**
	 * Returns the meta object for the reference '{@link cCS.RPA#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rp</em>'.
	 * @see cCS.RPA#getRp()
	 * @see #getRPA()
	 * @generated
	 */
	EReference getRPA_Rp();

	/**
	 * Returns the meta object for the reference '{@link cCS.RPA#getPr <em>Pr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pr</em>'.
	 * @see cCS.RPA#getPr()
	 * @see #getRPA()
	 * @generated
	 */
	EReference getRPA_Pr();

	/**
	 * Returns the meta object for class '{@link cCS.PR <em>PR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PR</em>'.
	 * @see cCS.PR
	 * @generated
	 */
	EClass getPR();

	/**
	 * Returns the meta object for the reference '{@link cCS.PR#getRpa <em>Rpa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpa</em>'.
	 * @see cCS.PR#getRpa()
	 * @see #getPR()
	 * @generated
	 */
	EReference getPR_Rpa();

	/**
	 * Returns the meta object for class '{@link cCS.RR <em>RR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RR</em>'.
	 * @see cCS.RR
	 * @generated
	 */
	EClass getRR();

	/**
	 * Returns the meta object for the reference '{@link cCS.RR#getPra <em>Pra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pra</em>'.
	 * @see cCS.RR#getPra()
	 * @see #getRR()
	 * @generated
	 */
	EReference getRR_Pra();

	/**
	 * Returns the meta object for class '{@link cCS.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see cCS.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link cCS.ServerComp <em>Server Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Comp</em>'.
	 * @see cCS.ServerComp
	 * @generated
	 */
	EClass getServerComp();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerComp#getServerconfig <em>Serverconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serverconfig</em>'.
	 * @see cCS.ServerComp#getServerconfig()
	 * @see #getServerComp()
	 * @generated
	 */
	EReference getServerComp_Serverconfig();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerComp#getInterfacesserver <em>Interfacesserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacesserver</em>'.
	 * @see cCS.ServerComp#getInterfacesserver()
	 * @see #getServerComp()
	 * @generated
	 */
	EReference getServerComp_Interfacesserver();

	/**
	 * Returns the meta object for class '{@link cCS.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see cCS.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.System#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see cCS.System#getServer()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.System#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpc</em>'.
	 * @see cCS.System#getRpc()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Rpc();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.System#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client</em>'.
	 * @see cCS.System#getClient()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.System#getSys2clientbinding <em>Sys2clientbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sys2clientbinding</em>'.
	 * @see cCS.System#getSys2clientbinding()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Sys2clientbinding();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.System#getSysteminterface <em>Systeminterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systeminterface</em>'.
	 * @see cCS.System#getSysteminterface()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Systeminterface();

	/**
	 * Returns the meta object for class '{@link cCS.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see cCS.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.RPC#getInterfacerpc <em>Interfacerpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacerpc</em>'.
	 * @see cCS.RPC#getInterfacerpc()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Interfacerpc();

	/**
	 * Returns the meta object for class '{@link cCS.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see cCS.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Client#getInterfacesc <em>Interfacesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacesc</em>'.
	 * @see cCS.Client#getInterfacesc()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Interfacesc();

	/**
	 * Returns the meta object for class '{@link cCS.ServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Config</em>'.
	 * @see cCS.ServerConfig
	 * @generated
	 */
	EClass getServerConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectionmanager</em>'.
	 * @see cCS.ServerConfig#getConnectionmanager()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Connectionmanager();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getSecuritymanager <em>Securitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitymanager</em>'.
	 * @see cCS.ServerConfig#getSecuritymanager()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Securitymanager();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db</em>'.
	 * @see cCS.ServerConfig#getDb()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Db();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getConnectdb <em>Connectdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectdb</em>'.
	 * @see cCS.ServerConfig#getConnectdb()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Connectdb();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getSecdb <em>Secdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secdb</em>'.
	 * @see cCS.ServerConfig#getSecdb()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Secdb();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getConnectsec <em>Connectsec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectsec</em>'.
	 * @see cCS.ServerConfig#getConnectsec()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Connectsec();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getServ2servbinding <em>Serv2servbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serv2servbinding</em>'.
	 * @see cCS.ServerConfig#getServ2servbinding()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Serv2servbinding();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfig#getServerconfiginterface <em>Serverconfiginterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serverconfiginterface</em>'.
	 * @see cCS.ServerConfig#getServerconfiginterface()
	 * @see #getServerConfig()
	 * @generated
	 */
	EReference getServerConfig_Serverconfiginterface();

	/**
	 * Returns the meta object for class '{@link cCS.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see cCS.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ConnectionManager#getInterfacesconnect <em>Interfacesconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacesconnect</em>'.
	 * @see cCS.ConnectionManager#getInterfacesconnect()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Interfacesconnect();

	/**
	 * Returns the meta object for class '{@link cCS.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager</em>'.
	 * @see cCS.SecurityManager
	 * @generated
	 */
	EClass getSecurityManager();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SecurityManager#getSecurityinterface <em>Securityinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securityinterface</em>'.
	 * @see cCS.SecurityManager#getSecurityinterface()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Securityinterface();

	/**
	 * Returns the meta object for class '{@link cCS.DB <em>DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB</em>'.
	 * @see cCS.DB
	 * @generated
	 */
	EClass getDB();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.DB#getDbinterface <em>Dbinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dbinterface</em>'.
	 * @see cCS.DB#getDbinterface()
	 * @see #getDB()
	 * @generated
	 */
	EReference getDB_Dbinterface();

	/**
	 * Returns the meta object for class '{@link cCS.AttachmentCR <em>Attachment CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CR</em>'.
	 * @see cCS.AttachmentCR
	 * @generated
	 */
	EClass getAttachmentCR();

	/**
	 * Returns the meta object for class '{@link cCS.AttachmentRC <em>Attachment RC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RC</em>'.
	 * @see cCS.AttachmentRC
	 * @generated
	 */
	EClass getAttachmentRC();

	/**
	 * Returns the meta object for class '{@link cCS.interfacesC <em>interfaces C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interfaces C</em>'.
	 * @see cCS.interfacesC
	 * @generated
	 */
	EClass getinterfacesC();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.interfacesC#getPortrc <em>Portrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portrc</em>'.
	 * @see cCS.interfacesC#getPortrc()
	 * @see #getinterfacesC()
	 * @generated
	 */
	EReference getinterfacesC_Portrc();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.interfacesC#getPortpc <em>Portpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portpc</em>'.
	 * @see cCS.interfacesC#getPortpc()
	 * @see #getinterfacesC()
	 * @generated
	 */
	EReference getinterfacesC_Portpc();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.interfacesC#getSys2clientcp <em>Sys2clientcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sys2clientcp</em>'.
	 * @see cCS.interfacesC#getSys2clientcp()
	 * @see #getinterfacesC()
	 * @generated
	 */
	EReference getinterfacesC_Sys2clientcp();

	/**
	 * Returns the meta object for class '{@link cCS.PortRC <em>Port RC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port RC</em>'.
	 * @see cCS.PortRC
	 * @generated
	 */
	EClass getPortRC();

	/**
	 * Returns the meta object for the reference '{@link cCS.PortRC#getAttachmentrc <em>Attachmentrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentrc</em>'.
	 * @see cCS.PortRC#getAttachmentrc()
	 * @see #getPortRC()
	 * @generated
	 */
	EReference getPortRC_Attachmentrc();

	/**
	 * Returns the meta object for class '{@link cCS.PortPC <em>Port PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port PC</em>'.
	 * @see cCS.PortPC
	 * @generated
	 */
	EClass getPortPC();

	/**
	 * Returns the meta object for the reference '{@link cCS.PortPC#getAttachmentcr <em>Attachmentcr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentcr</em>'.
	 * @see cCS.PortPC#getAttachmentcr()
	 * @see #getPortPC()
	 * @generated
	 */
	EReference getPortPC_Attachmentcr();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceRPC <em>Interface RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface RPC</em>'.
	 * @see cCS.InterfaceRPC
	 * @generated
	 */
	EClass getInterfaceRPC();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceRPC#getProlerpc2 <em>Prolerpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prolerpc2</em>'.
	 * @see cCS.InterfaceRPC#getProlerpc2()
	 * @see #getInterfaceRPC()
	 * @generated
	 */
	EReference getInterfaceRPC_Prolerpc2();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceRPC#getRrolerpc <em>Rrolerpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rrolerpc</em>'.
	 * @see cCS.InterfaceRPC#getRrolerpc()
	 * @see #getInterfaceRPC()
	 * @generated
	 */
	EReference getInterfaceRPC_Rrolerpc();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceRPC#getRrolerpc2 <em>Rrolerpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rrolerpc2</em>'.
	 * @see cCS.InterfaceRPC#getRrolerpc2()
	 * @see #getInterfaceRPC()
	 * @generated
	 */
	EReference getInterfaceRPC_Rrolerpc2();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceRPC#getProlerpc <em>Prolerpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prolerpc</em>'.
	 * @see cCS.InterfaceRPC#getProlerpc()
	 * @see #getInterfaceRPC()
	 * @generated
	 */
	EReference getInterfaceRPC_Prolerpc();

	/**
	 * Returns the meta object for class '{@link cCS.RRoleRPCClient <em>RRole RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRole RPC Client</em>'.
	 * @see cCS.RRoleRPCClient
	 * @generated
	 */
	EClass getRRoleRPCClient();

	/**
	 * Returns the meta object for the reference '{@link cCS.RRoleRPCClient#getAttachmentcr <em>Attachmentcr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentcr</em>'.
	 * @see cCS.RRoleRPCClient#getAttachmentcr()
	 * @see #getRRoleRPCClient()
	 * @generated
	 */
	EReference getRRoleRPCClient_Attachmentcr();

	/**
	 * Returns the meta object for class '{@link cCS.PRoleRPCClient <em>PRole RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRole RPC Client</em>'.
	 * @see cCS.PRoleRPCClient
	 * @generated
	 */
	EClass getPRoleRPCClient();

	/**
	 * Returns the meta object for the reference '{@link cCS.PRoleRPCClient#getAttachmentrc <em>Attachmentrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentrc</em>'.
	 * @see cCS.PRoleRPCClient#getAttachmentrc()
	 * @see #getPRoleRPCClient()
	 * @generated
	 */
	EReference getPRoleRPCClient_Attachmentrc();

	/**
	 * Returns the meta object for class '{@link cCS.InterfacesConnect <em>Interfaces Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Connect</em>'.
	 * @see cCS.InterfacesConnect
	 * @generated
	 */
	EClass getInterfacesConnect();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesConnect#getPalpha2connect <em>Palpha2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Palpha2connect</em>'.
	 * @see cCS.InterfacesConnect#getPalpha2connect()
	 * @see #getInterfacesConnect()
	 * @generated
	 */
	EReference getInterfacesConnect_Palpha2connect();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesConnect#getPconnect2alpha <em>Pconnect2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pconnect2alpha</em>'.
	 * @see cCS.InterfacesConnect#getPconnect2alpha()
	 * @see #getInterfacesConnect()
	 * @generated
	 */
	EReference getInterfacesConnect_Pconnect2alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesConnect#getPconnect2gamma <em>Pconnect2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pconnect2gamma</em>'.
	 * @see cCS.InterfacesConnect#getPconnect2gamma()
	 * @see #getInterfacesConnect()
	 * @generated
	 */
	EReference getInterfacesConnect_Pconnect2gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesConnect#getPgamma2connect <em>Pgamma2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pgamma2connect</em>'.
	 * @see cCS.InterfacesConnect#getPgamma2connect()
	 * @see #getInterfacesConnect()
	 * @generated
	 */
	EReference getInterfacesConnect_Pgamma2connect();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesConnect#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servconf2connectconnectp</em>'.
	 * @see cCS.InterfacesConnect#getServconf2connectconnectp()
	 * @see #getInterfacesConnect()
	 * @generated
	 */
	EReference getInterfacesConnect_Servconf2connectconnectp();

	/**
	 * Returns the meta object for class '{@link cCS.InterfacesServer <em>Interfaces Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Server</em>'.
	 * @see cCS.InterfacesServer
	 * @generated
	 */
	EClass getInterfacesServer();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesServer#getPortps <em>Portps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portps</em>'.
	 * @see cCS.InterfacesServer#getPortps()
	 * @see #getInterfacesServer()
	 * @generated
	 */
	EReference getInterfacesServer_Portps();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesServer#getPortrs <em>Portrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portrs</em>'.
	 * @see cCS.InterfacesServer#getPortrs()
	 * @see #getInterfacesServer()
	 * @generated
	 */
	EReference getInterfacesServer_Portrs();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfacesServer#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servconf2servcompcompp</em>'.
	 * @see cCS.InterfacesServer#getServconf2servcompcompp()
	 * @see #getInterfacesServer()
	 * @generated
	 */
	EReference getInterfacesServer_Servconf2servcompcompp();

	/**
	 * Returns the meta object for class '{@link cCS.PortPS <em>Port PS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port PS</em>'.
	 * @see cCS.PortPS
	 * @generated
	 */
	EClass getPortPS();

	/**
	 * Returns the meta object for the reference '{@link cCS.PortPS#getAttachementsrpc <em>Attachementsrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementsrpc</em>'.
	 * @see cCS.PortPS#getAttachementsrpc()
	 * @see #getPortPS()
	 * @generated
	 */
	EReference getPortPS_Attachementsrpc();

	/**
	 * Returns the meta object for class '{@link cCS.PortRS <em>Port RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port RS</em>'.
	 * @see cCS.PortRS
	 * @generated
	 */
	EClass getPortRS();

	/**
	 * Returns the meta object for the reference '{@link cCS.PortRS#getAttachementsrpcserv <em>Attachementsrpcserv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementsrpcserv</em>'.
	 * @see cCS.PortRS#getAttachementsrpcserv()
	 * @see #getPortRS()
	 * @generated
	 */
	EReference getPortRS_Attachementsrpcserv();

	/**
	 * Returns the meta object for class '{@link cCS.RRoleRPCServer <em>RRole RPC Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRole RPC Server</em>'.
	 * @see cCS.RRoleRPCServer
	 * @generated
	 */
	EClass getRRoleRPCServer();

	/**
	 * Returns the meta object for the reference '{@link cCS.RRoleRPCServer#getAttachementsrpc <em>Attachementsrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementsrpc</em>'.
	 * @see cCS.RRoleRPCServer#getAttachementsrpc()
	 * @see #getRRoleRPCServer()
	 * @generated
	 */
	EReference getRRoleRPCServer_Attachementsrpc();

	/**
	 * Returns the meta object for class '{@link cCS.PRoleRPCSev <em>PRole RPC Sev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRole RPC Sev</em>'.
	 * @see cCS.PRoleRPCSev
	 * @generated
	 */
	EClass getPRoleRPCSev();

	/**
	 * Returns the meta object for the reference '{@link cCS.PRoleRPCSev#getAttachementsrpcserv <em>Attachementsrpcserv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementsrpcserv</em>'.
	 * @see cCS.PRoleRPCSev#getAttachementsrpcserv()
	 * @see #getPRoleRPCSev()
	 * @generated
	 */
	EReference getPRoleRPCSev_Attachementsrpcserv();

	/**
	 * Returns the meta object for class '{@link cCS.AttachementSRPC <em>Attachement SRPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement SRPC</em>'.
	 * @see cCS.AttachementSRPC
	 * @generated
	 */
	EClass getAttachementSRPC();

	/**
	 * Returns the meta object for class '{@link cCS.AttachementsRPCServ <em>Attachements RPC Serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachements RPC Serv</em>'.
	 * @see cCS.AttachementsRPCServ
	 * @generated
	 */
	EClass getAttachementsRPCServ();

	/**
	 * Returns the meta object for class '{@link cCS.SecurityInterface <em>Security Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Interface</em>'.
	 * @see cCS.SecurityInterface
	 * @generated
	 */
	EClass getSecurityInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SecurityInterface#getPsec2beta <em>Psec2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Psec2beta</em>'.
	 * @see cCS.SecurityInterface#getPsec2beta()
	 * @see #getSecurityInterface()
	 * @generated
	 */
	EReference getSecurityInterface_Psec2beta();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SecurityInterface#getPbeta2sec <em>Pbeta2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pbeta2sec</em>'.
	 * @see cCS.SecurityInterface#getPbeta2sec()
	 * @see #getSecurityInterface()
	 * @generated
	 */
	EReference getSecurityInterface_Pbeta2sec();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SecurityInterface#getPalpha2sec <em>Palpha2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Palpha2sec</em>'.
	 * @see cCS.SecurityInterface#getPalpha2sec()
	 * @see #getSecurityInterface()
	 * @generated
	 */
	EReference getSecurityInterface_Palpha2sec();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SecurityInterface#getPsec2alpha <em>Psec2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Psec2alpha</em>'.
	 * @see cCS.SecurityInterface#getPsec2alpha()
	 * @see #getSecurityInterface()
	 * @generated
	 */
	EReference getSecurityInterface_Psec2alpha();

	/**
	 * Returns the meta object for class '{@link cCS.DBInterface <em>DB Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Interface</em>'.
	 * @see cCS.DBInterface
	 * @generated
	 */
	EClass getDBInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.DBInterface#getPdb2gamma <em>Pdb2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdb2gamma</em>'.
	 * @see cCS.DBInterface#getPdb2gamma()
	 * @see #getDBInterface()
	 * @generated
	 */
	EReference getDBInterface_Pdb2gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.DBInterface#getPgamma2db <em>Pgamma2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pgamma2db</em>'.
	 * @see cCS.DBInterface#getPgamma2db()
	 * @see #getDBInterface()
	 * @generated
	 */
	EReference getDBInterface_Pgamma2db();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.DBInterface#getPdb2beta <em>Pdb2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pdb2beta</em>'.
	 * @see cCS.DBInterface#getPdb2beta()
	 * @see #getDBInterface()
	 * @generated
	 */
	EReference getDBInterface_Pdb2beta();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.DBInterface#getPbeta2db <em>Pbeta2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pbeta2db</em>'.
	 * @see cCS.DBInterface#getPbeta2db()
	 * @see #getDBInterface()
	 * @generated
	 */
	EReference getDBInterface_Pbeta2db();

	/**
	 * Returns the meta object for class '{@link cCS.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha</em>'.
	 * @see cCS.Alpha
	 * @generated
	 */
	EClass getAlpha();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Alpha#getInterfacealpha <em>Interfacealpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacealpha</em>'.
	 * @see cCS.Alpha#getInterfacealpha()
	 * @see #getAlpha()
	 * @generated
	 */
	EReference getAlpha_Interfacealpha();

	/**
	 * Returns the meta object for class '{@link cCS.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta</em>'.
	 * @see cCS.Beta
	 * @generated
	 */
	EClass getBeta();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Beta#getInterfacebeta <em>Interfacebeta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacebeta</em>'.
	 * @see cCS.Beta#getInterfacebeta()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Interfacebeta();

	/**
	 * Returns the meta object for class '{@link cCS.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma</em>'.
	 * @see cCS.Gamma
	 * @generated
	 */
	EClass getGamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Gamma#getInterfacegamma <em>Interfacegamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacegamma</em>'.
	 * @see cCS.Gamma#getInterfacegamma()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Interfacegamma();

	/**
	 * Returns the meta object for class '{@link cCS.PDB2Gamma <em>PDB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDB2 Gamma</em>'.
	 * @see cCS.PDB2Gamma
	 * @generated
	 */
	EClass getPDB2Gamma();

	/**
	 * Returns the meta object for the reference '{@link cCS.PDB2Gamma#getAdb2gamma <em>Adb2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adb2gamma</em>'.
	 * @see cCS.PDB2Gamma#getAdb2gamma()
	 * @see #getPDB2Gamma()
	 * @generated
	 */
	EReference getPDB2Gamma_Adb2gamma();

	/**
	 * Returns the meta object for class '{@link cCS.PSec2Alpha <em>PSec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSec2 Alpha</em>'.
	 * @see cCS.PSec2Alpha
	 * @generated
	 */
	EClass getPSec2Alpha();

	/**
	 * Returns the meta object for the reference '{@link cCS.PSec2Alpha#getAsec2alpha <em>Asec2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asec2alpha</em>'.
	 * @see cCS.PSec2Alpha#getAsec2alpha()
	 * @see #getPSec2Alpha()
	 * @generated
	 */
	EReference getPSec2Alpha_Asec2alpha();

	/**
	 * Returns the meta object for class '{@link cCS.PConnect2Alpha <em>PConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConnect2 Alpha</em>'.
	 * @see cCS.PConnect2Alpha
	 * @generated
	 */
	EClass getPConnect2Alpha();

	/**
	 * Returns the meta object for the reference '{@link cCS.PConnect2Alpha#getAconnect2alpha <em>Aconnect2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aconnect2alpha</em>'.
	 * @see cCS.PConnect2Alpha#getAconnect2alpha()
	 * @see #getPConnect2Alpha()
	 * @generated
	 */
	EReference getPConnect2Alpha_Aconnect2alpha();

	/**
	 * Returns the meta object for class '{@link cCS.PAlpha2Sec <em>PAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAlpha2 Sec</em>'.
	 * @see cCS.PAlpha2Sec
	 * @generated
	 */
	EClass getPAlpha2Sec();

	/**
	 * Returns the meta object for the reference '{@link cCS.PAlpha2Sec#getAalpha2sec <em>Aalpha2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aalpha2sec</em>'.
	 * @see cCS.PAlpha2Sec#getAalpha2sec()
	 * @see #getPAlpha2Sec()
	 * @generated
	 */
	EReference getPAlpha2Sec_Aalpha2sec();

	/**
	 * Returns the meta object for class '{@link cCS.PGamma2DB <em>PGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGamma2 DB</em>'.
	 * @see cCS.PGamma2DB
	 * @generated
	 */
	EClass getPGamma2DB();

	/**
	 * Returns the meta object for the reference '{@link cCS.PGamma2DB#getAgamma2db <em>Agamma2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agamma2db</em>'.
	 * @see cCS.PGamma2DB#getAgamma2db()
	 * @see #getPGamma2DB()
	 * @generated
	 */
	EReference getPGamma2DB_Agamma2db();

	/**
	 * Returns the meta object for class '{@link cCS.PAlpha2Connect <em>PAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAlpha2 Connect</em>'.
	 * @see cCS.PAlpha2Connect
	 * @generated
	 */
	EClass getPAlpha2Connect();

	/**
	 * Returns the meta object for the reference '{@link cCS.PAlpha2Connect#getAalpha2connect <em>Aalpha2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aalpha2connect</em>'.
	 * @see cCS.PAlpha2Connect#getAalpha2connect()
	 * @see #getPAlpha2Connect()
	 * @generated
	 */
	EReference getPAlpha2Connect_Aalpha2connect();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceAlpha <em>Interface Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Alpha</em>'.
	 * @see cCS.InterfaceAlpha
	 * @generated
	 */
	EClass getInterfaceAlpha();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceAlpha#getRsec2alpha <em>Rsec2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rsec2alpha</em>'.
	 * @see cCS.InterfaceAlpha#getRsec2alpha()
	 * @see #getInterfaceAlpha()
	 * @generated
	 */
	EReference getInterfaceAlpha_Rsec2alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceAlpha#getRalpha2sec <em>Ralpha2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ralpha2sec</em>'.
	 * @see cCS.InterfaceAlpha#getRalpha2sec()
	 * @see #getInterfaceAlpha()
	 * @generated
	 */
	EReference getInterfaceAlpha_Ralpha2sec();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceAlpha#getRconnect2alpha <em>Rconnect2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rconnect2alpha</em>'.
	 * @see cCS.InterfaceAlpha#getRconnect2alpha()
	 * @see #getInterfaceAlpha()
	 * @generated
	 */
	EReference getInterfaceAlpha_Rconnect2alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceAlpha#getRalpha2connect <em>Ralpha2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ralpha2connect</em>'.
	 * @see cCS.InterfaceAlpha#getRalpha2connect()
	 * @see #getInterfaceAlpha()
	 * @generated
	 */
	EReference getInterfaceAlpha_Ralpha2connect();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceBeta <em>Interface Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Beta</em>'.
	 * @see cCS.InterfaceBeta
	 * @generated
	 */
	EClass getInterfaceBeta();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceBeta#getRbeta2sec <em>Rbeta2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rbeta2sec</em>'.
	 * @see cCS.InterfaceBeta#getRbeta2sec()
	 * @see #getInterfaceBeta()
	 * @generated
	 */
	EReference getInterfaceBeta_Rbeta2sec();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceBeta#getRsec2beta <em>Rsec2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rsec2beta</em>'.
	 * @see cCS.InterfaceBeta#getRsec2beta()
	 * @see #getInterfaceBeta()
	 * @generated
	 */
	EReference getInterfaceBeta_Rsec2beta();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceBeta#getRbeta2db <em>Rbeta2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rbeta2db</em>'.
	 * @see cCS.InterfaceBeta#getRbeta2db()
	 * @see #getInterfaceBeta()
	 * @generated
	 */
	EReference getInterfaceBeta_Rbeta2db();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceBeta#getRdb2beta <em>Rdb2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdb2beta</em>'.
	 * @see cCS.InterfaceBeta#getRdb2beta()
	 * @see #getInterfaceBeta()
	 * @generated
	 */
	EReference getInterfaceBeta_Rdb2beta();

	/**
	 * Returns the meta object for class '{@link cCS.InterfaceGamma <em>Interface Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Gamma</em>'.
	 * @see cCS.InterfaceGamma
	 * @generated
	 */
	EClass getInterfaceGamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceGamma#getRconnect2gamma <em>Rconnect2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rconnect2gamma</em>'.
	 * @see cCS.InterfaceGamma#getRconnect2gamma()
	 * @see #getInterfaceGamma()
	 * @generated
	 */
	EReference getInterfaceGamma_Rconnect2gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceGamma#getRgamma2connect <em>Rgamma2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rgamma2connect</em>'.
	 * @see cCS.InterfaceGamma#getRgamma2connect()
	 * @see #getInterfaceGamma()
	 * @generated
	 */
	EReference getInterfaceGamma_Rgamma2connect();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceGamma#getRdb2gamma <em>Rdb2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdb2gamma</em>'.
	 * @see cCS.InterfaceGamma#getRdb2gamma()
	 * @see #getInterfaceGamma()
	 * @generated
	 */
	EReference getInterfaceGamma_Rdb2gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.InterfaceGamma#getRgamma2db <em>Rgamma2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rgamma2db</em>'.
	 * @see cCS.InterfaceGamma#getRgamma2db()
	 * @see #getInterfaceGamma()
	 * @generated
	 */
	EReference getInterfaceGamma_Rgamma2db();

	/**
	 * Returns the meta object for class '{@link cCS.PSec2Beta <em>PSec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSec2 Beta</em>'.
	 * @see cCS.PSec2Beta
	 * @generated
	 */
	EClass getPSec2Beta();

	/**
	 * Returns the meta object for the reference '{@link cCS.PSec2Beta#getAsec2beta <em>Asec2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asec2beta</em>'.
	 * @see cCS.PSec2Beta#getAsec2beta()
	 * @see #getPSec2Beta()
	 * @generated
	 */
	EReference getPSec2Beta_Asec2beta();

	/**
	 * Returns the meta object for class '{@link cCS.PBeta2Sec <em>PBeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBeta2 Sec</em>'.
	 * @see cCS.PBeta2Sec
	 * @generated
	 */
	EClass getPBeta2Sec();

	/**
	 * Returns the meta object for the reference '{@link cCS.PBeta2Sec#getAbeta2sec <em>Abeta2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abeta2sec</em>'.
	 * @see cCS.PBeta2Sec#getAbeta2sec()
	 * @see #getPBeta2Sec()
	 * @generated
	 */
	EReference getPBeta2Sec_Abeta2sec();

	/**
	 * Returns the meta object for class '{@link cCS.RBeta2DB <em>RBeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBeta2 DB</em>'.
	 * @see cCS.RBeta2DB
	 * @generated
	 */
	EClass getRBeta2DB();

	/**
	 * Returns the meta object for the reference '{@link cCS.RBeta2DB#getAbeta2db <em>Abeta2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abeta2db</em>'.
	 * @see cCS.RBeta2DB#getAbeta2db()
	 * @see #getRBeta2DB()
	 * @generated
	 */
	EReference getRBeta2DB_Abeta2db();

	/**
	 * Returns the meta object for class '{@link cCS.RBeta2Sec <em>RBeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBeta2 Sec</em>'.
	 * @see cCS.RBeta2Sec
	 * @generated
	 */
	EClass getRBeta2Sec();

	/**
	 * Returns the meta object for the reference '{@link cCS.RBeta2Sec#getAbeta2sec <em>Abeta2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abeta2sec</em>'.
	 * @see cCS.RBeta2Sec#getAbeta2sec()
	 * @see #getRBeta2Sec()
	 * @generated
	 */
	EReference getRBeta2Sec_Abeta2sec();

	/**
	 * Returns the meta object for class '{@link cCS.RSec2Beta <em>RSec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSec2 Beta</em>'.
	 * @see cCS.RSec2Beta
	 * @generated
	 */
	EClass getRSec2Beta();

	/**
	 * Returns the meta object for the reference '{@link cCS.RSec2Beta#getAsec2beta <em>Asec2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asec2beta</em>'.
	 * @see cCS.RSec2Beta#getAsec2beta()
	 * @see #getRSec2Beta()
	 * @generated
	 */
	EReference getRSec2Beta_Asec2beta();

	/**
	 * Returns the meta object for class '{@link cCS.RDB2Beta <em>RDB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDB2 Beta</em>'.
	 * @see cCS.RDB2Beta
	 * @generated
	 */
	EClass getRDB2Beta();

	/**
	 * Returns the meta object for the reference '{@link cCS.RDB2Beta#getAdb2beta <em>Adb2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adb2beta</em>'.
	 * @see cCS.RDB2Beta#getAdb2beta()
	 * @see #getRDB2Beta()
	 * @generated
	 */
	EReference getRDB2Beta_Adb2beta();

	/**
	 * Returns the meta object for class '{@link cCS.RConnect2Alpha <em>RConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RConnect2 Alpha</em>'.
	 * @see cCS.RConnect2Alpha
	 * @generated
	 */
	EClass getRConnect2Alpha();

	/**
	 * Returns the meta object for the reference '{@link cCS.RConnect2Alpha#getAconnect2alpha <em>Aconnect2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aconnect2alpha</em>'.
	 * @see cCS.RConnect2Alpha#getAconnect2alpha()
	 * @see #getRConnect2Alpha()
	 * @generated
	 */
	EReference getRConnect2Alpha_Aconnect2alpha();

	/**
	 * Returns the meta object for class '{@link cCS.RAlpha2Sec <em>RAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAlpha2 Sec</em>'.
	 * @see cCS.RAlpha2Sec
	 * @generated
	 */
	EClass getRAlpha2Sec();

	/**
	 * Returns the meta object for the reference '{@link cCS.RAlpha2Sec#getAalpha2sec <em>Aalpha2sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aalpha2sec</em>'.
	 * @see cCS.RAlpha2Sec#getAalpha2sec()
	 * @see #getRAlpha2Sec()
	 * @generated
	 */
	EReference getRAlpha2Sec_Aalpha2sec();

	/**
	 * Returns the meta object for class '{@link cCS.RSec2Alpha <em>RSec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSec2 Alpha</em>'.
	 * @see cCS.RSec2Alpha
	 * @generated
	 */
	EClass getRSec2Alpha();

	/**
	 * Returns the meta object for the reference '{@link cCS.RSec2Alpha#getAsec2alpha <em>Asec2alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asec2alpha</em>'.
	 * @see cCS.RSec2Alpha#getAsec2alpha()
	 * @see #getRSec2Alpha()
	 * @generated
	 */
	EReference getRSec2Alpha_Asec2alpha();

	/**
	 * Returns the meta object for class '{@link cCS.RAlpha2Connect <em>RAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAlpha2 Connect</em>'.
	 * @see cCS.RAlpha2Connect
	 * @generated
	 */
	EClass getRAlpha2Connect();

	/**
	 * Returns the meta object for the reference '{@link cCS.RAlpha2Connect#getAalpha2connect <em>Aalpha2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aalpha2connect</em>'.
	 * @see cCS.RAlpha2Connect#getAalpha2connect()
	 * @see #getRAlpha2Connect()
	 * @generated
	 */
	EReference getRAlpha2Connect_Aalpha2connect();

	/**
	 * Returns the meta object for class '{@link cCS.PConnect2Gamma <em>PConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConnect2 Gamma</em>'.
	 * @see cCS.PConnect2Gamma
	 * @generated
	 */
	EClass getPConnect2Gamma();

	/**
	 * Returns the meta object for the reference '{@link cCS.PConnect2Gamma#getAconnect2gamma <em>Aconnect2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aconnect2gamma</em>'.
	 * @see cCS.PConnect2Gamma#getAconnect2gamma()
	 * @see #getPConnect2Gamma()
	 * @generated
	 */
	EReference getPConnect2Gamma_Aconnect2gamma();

	/**
	 * Returns the meta object for class '{@link cCS.PGamma2Connect <em>PGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGamma2 Connect</em>'.
	 * @see cCS.PGamma2Connect
	 * @generated
	 */
	EClass getPGamma2Connect();

	/**
	 * Returns the meta object for the reference '{@link cCS.PGamma2Connect#getAgamma2connect <em>Agamma2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agamma2connect</em>'.
	 * @see cCS.PGamma2Connect#getAgamma2connect()
	 * @see #getPGamma2Connect()
	 * @generated
	 */
	EReference getPGamma2Connect_Agamma2connect();

	/**
	 * Returns the meta object for class '{@link cCS.PDB2Beta <em>PDB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDB2 Beta</em>'.
	 * @see cCS.PDB2Beta
	 * @generated
	 */
	EClass getPDB2Beta();

	/**
	 * Returns the meta object for the reference '{@link cCS.PDB2Beta#getAdb2beta <em>Adb2beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adb2beta</em>'.
	 * @see cCS.PDB2Beta#getAdb2beta()
	 * @see #getPDB2Beta()
	 * @generated
	 */
	EReference getPDB2Beta_Adb2beta();

	/**
	 * Returns the meta object for class '{@link cCS.PBeta2DB <em>PBeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBeta2 DB</em>'.
	 * @see cCS.PBeta2DB
	 * @generated
	 */
	EClass getPBeta2DB();

	/**
	 * Returns the meta object for the reference '{@link cCS.PBeta2DB#getAbeta2db <em>Abeta2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abeta2db</em>'.
	 * @see cCS.PBeta2DB#getAbeta2db()
	 * @see #getPBeta2DB()
	 * @generated
	 */
	EReference getPBeta2DB_Abeta2db();

	/**
	 * Returns the meta object for class '{@link cCS.RGamma2DB <em>RGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGamma2 DB</em>'.
	 * @see cCS.RGamma2DB
	 * @generated
	 */
	EClass getRGamma2DB();

	/**
	 * Returns the meta object for the reference '{@link cCS.RGamma2DB#getAgamma2db <em>Agamma2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agamma2db</em>'.
	 * @see cCS.RGamma2DB#getAgamma2db()
	 * @see #getRGamma2DB()
	 * @generated
	 */
	EReference getRGamma2DB_Agamma2db();

	/**
	 * Returns the meta object for class '{@link cCS.RDB2Gamma <em>RDB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDB2 Gamma</em>'.
	 * @see cCS.RDB2Gamma
	 * @generated
	 */
	EClass getRDB2Gamma();

	/**
	 * Returns the meta object for the reference '{@link cCS.RDB2Gamma#getAdb2gamma <em>Adb2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adb2gamma</em>'.
	 * @see cCS.RDB2Gamma#getAdb2gamma()
	 * @see #getRDB2Gamma()
	 * @generated
	 */
	EReference getRDB2Gamma_Adb2gamma();

	/**
	 * Returns the meta object for class '{@link cCS.RGamma2Connect <em>RGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGamma2 Connect</em>'.
	 * @see cCS.RGamma2Connect
	 * @generated
	 */
	EClass getRGamma2Connect();

	/**
	 * Returns the meta object for the reference '{@link cCS.RGamma2Connect#getAgamma2connect <em>Agamma2connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agamma2connect</em>'.
	 * @see cCS.RGamma2Connect#getAgamma2connect()
	 * @see #getRGamma2Connect()
	 * @generated
	 */
	EReference getRGamma2Connect_Agamma2connect();

	/**
	 * Returns the meta object for class '{@link cCS.RConnect2Gamma <em>RConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RConnect2 Gamma</em>'.
	 * @see cCS.RConnect2Gamma
	 * @generated
	 */
	EClass getRConnect2Gamma();

	/**
	 * Returns the meta object for the reference '{@link cCS.RConnect2Gamma#getAconnect2gamma <em>Aconnect2gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aconnect2gamma</em>'.
	 * @see cCS.RConnect2Gamma#getAconnect2gamma()
	 * @see #getRConnect2Gamma()
	 * @generated
	 */
	EReference getRConnect2Gamma_Aconnect2gamma();

	/**
	 * Returns the meta object for class '{@link cCS.ADB2Gamma <em>ADB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADB2 Gamma</em>'.
	 * @see cCS.ADB2Gamma
	 * @generated
	 */
	EClass getADB2Gamma();

	/**
	 * Returns the meta object for class '{@link cCS.AConnect2Gamma <em>AConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AConnect2 Gamma</em>'.
	 * @see cCS.AConnect2Gamma
	 * @generated
	 */
	EClass getAConnect2Gamma();

	/**
	 * Returns the meta object for class '{@link cCS.AGamma2DB <em>AGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGamma2 DB</em>'.
	 * @see cCS.AGamma2DB
	 * @generated
	 */
	EClass getAGamma2DB();

	/**
	 * Returns the meta object for class '{@link cCS.AGamma2Connect <em>AGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGamma2 Connect</em>'.
	 * @see cCS.AGamma2Connect
	 * @generated
	 */
	EClass getAGamma2Connect();

	/**
	 * Returns the meta object for class '{@link cCS.ADB2Beta <em>ADB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADB2 Beta</em>'.
	 * @see cCS.ADB2Beta
	 * @generated
	 */
	EClass getADB2Beta();

	/**
	 * Returns the meta object for class '{@link cCS.ABeta2DB <em>ABeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABeta2 DB</em>'.
	 * @see cCS.ABeta2DB
	 * @generated
	 */
	EClass getABeta2DB();

	/**
	 * Returns the meta object for class '{@link cCS.ASec2Beta <em>ASec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASec2 Beta</em>'.
	 * @see cCS.ASec2Beta
	 * @generated
	 */
	EClass getASec2Beta();

	/**
	 * Returns the meta object for class '{@link cCS.ABeta2Sec <em>ABeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABeta2 Sec</em>'.
	 * @see cCS.ABeta2Sec
	 * @generated
	 */
	EClass getABeta2Sec();

	/**
	 * Returns the meta object for class '{@link cCS.AConnect2Alpha <em>AConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AConnect2 Alpha</em>'.
	 * @see cCS.AConnect2Alpha
	 * @generated
	 */
	EClass getAConnect2Alpha();

	/**
	 * Returns the meta object for class '{@link cCS.AAlpha2Connect <em>AAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAlpha2 Connect</em>'.
	 * @see cCS.AAlpha2Connect
	 * @generated
	 */
	EClass getAAlpha2Connect();

	/**
	 * Returns the meta object for class '{@link cCS.ASec2Alpha <em>ASec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASec2 Alpha</em>'.
	 * @see cCS.ASec2Alpha
	 * @generated
	 */
	EClass getASec2Alpha();

	/**
	 * Returns the meta object for class '{@link cCS.AAlpha2Sec <em>AAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAlpha2 Sec</em>'.
	 * @see cCS.AAlpha2Sec
	 * @generated
	 */
	EClass getAAlpha2Sec();

	/**
	 * Returns the meta object for class '{@link cCS.Sys2ClientBinding <em>Sys2 Client Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys2 Client Binding</em>'.
	 * @see cCS.Sys2ClientBinding
	 * @generated
	 */
	EClass getSys2ClientBinding();

	/**
	 * Returns the meta object for the reference '{@link cCS.Sys2ClientBinding#getSys2clientsp <em>Sys2clientsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sys2clientsp</em>'.
	 * @see cCS.Sys2ClientBinding#getSys2clientsp()
	 * @see #getSys2ClientBinding()
	 * @generated
	 */
	EReference getSys2ClientBinding_Sys2clientsp();

	/**
	 * Returns the meta object for the reference '{@link cCS.Sys2ClientBinding#getSys2clientcp <em>Sys2clientcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sys2clientcp</em>'.
	 * @see cCS.Sys2ClientBinding#getSys2clientcp()
	 * @see #getSys2ClientBinding()
	 * @generated
	 */
	EReference getSys2ClientBinding_Sys2clientcp();

	/**
	 * Returns the meta object for class '{@link cCS.SystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Interface</em>'.
	 * @see cCS.SystemInterface
	 * @generated
	 */
	EClass getSystemInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.SystemInterface#getSys2clientsp <em>Sys2clientsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sys2clientsp</em>'.
	 * @see cCS.SystemInterface#getSys2clientsp()
	 * @see #getSystemInterface()
	 * @generated
	 */
	EReference getSystemInterface_Sys2clientsp();

	/**
	 * Returns the meta object for class '{@link cCS.Sys2ClientSP <em>Sys2 Client SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys2 Client SP</em>'.
	 * @see cCS.Sys2ClientSP
	 * @generated
	 */
	EClass getSys2ClientSP();

	/**
	 * Returns the meta object for the reference '{@link cCS.Sys2ClientSP#getSys2clientbinding <em>Sys2clientbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sys2clientbinding</em>'.
	 * @see cCS.Sys2ClientSP#getSys2clientbinding()
	 * @see #getSys2ClientSP()
	 * @generated
	 */
	EReference getSys2ClientSP_Sys2clientbinding();

	/**
	 * Returns the meta object for class '{@link cCS.Sys2ClientCP <em>Sys2 Client CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys2 Client CP</em>'.
	 * @see cCS.Sys2ClientCP
	 * @generated
	 */
	EClass getSys2ClientCP();

	/**
	 * Returns the meta object for the reference '{@link cCS.Sys2ClientCP#getSys2clientbinding <em>Sys2clientbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sys2clientbinding</em>'.
	 * @see cCS.Sys2ClientCP#getSys2clientbinding()
	 * @see #getSys2ClientCP()
	 * @generated
	 */
	EReference getSys2ClientCP_Sys2clientbinding();

	/**
	 * Returns the meta object for class '{@link cCS.Serv2ServBinding <em>Serv2 Serv Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv2 Serv Binding</em>'.
	 * @see cCS.Serv2ServBinding
	 * @generated
	 */
	EClass getServ2ServBinding();

	/**
	 * Returns the meta object for the reference '{@link cCS.Serv2ServBinding#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2servcompconfp</em>'.
	 * @see cCS.Serv2ServBinding#getServconf2servcompconfp()
	 * @see #getServ2ServBinding()
	 * @generated
	 */
	EReference getServ2ServBinding_Servconf2servcompconfp();

	/**
	 * Returns the meta object for the reference '{@link cCS.Serv2ServBinding#getServconf2servcompcompp <em>Servconf2servcompcompp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2servcompcompp</em>'.
	 * @see cCS.Serv2ServBinding#getServconf2servcompcompp()
	 * @see #getServ2ServBinding()
	 * @generated
	 */
	EReference getServ2ServBinding_Servconf2servcompcompp();

	/**
	 * Returns the meta object for class '{@link cCS.ServerConfigInterface <em>Server Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Config Interface</em>'.
	 * @see cCS.ServerConfigInterface
	 * @generated
	 */
	EClass getServerConfigInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfigInterface#getServconf2servcompconfp <em>Servconf2servcompconfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servconf2servcompconfp</em>'.
	 * @see cCS.ServerConfigInterface#getServconf2servcompconfp()
	 * @see #getServerConfigInterface()
	 * @generated
	 */
	EReference getServerConfigInterface_Servconf2servcompconfp();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.ServerConfigInterface#getServconf2connectservp <em>Servconf2connectservp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servconf2connectservp</em>'.
	 * @see cCS.ServerConfigInterface#getServconf2connectservp()
	 * @see #getServerConfigInterface()
	 * @generated
	 */
	EReference getServerConfigInterface_Servconf2connectservp();

	/**
	 * Returns the meta object for class '{@link cCS.ServConf2ServCompConfP <em>Serv Conf2 Serv Comp Conf P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Conf2 Serv Comp Conf P</em>'.
	 * @see cCS.ServConf2ServCompConfP
	 * @generated
	 */
	EClass getServConf2ServCompConfP();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ServCompConfP#getServ2servbinding <em>Serv2servbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serv2servbinding</em>'.
	 * @see cCS.ServConf2ServCompConfP#getServ2servbinding()
	 * @see #getServConf2ServCompConfP()
	 * @generated
	 */
	EReference getServConf2ServCompConfP_Serv2servbinding();

	/**
	 * Returns the meta object for class '{@link cCS.ServConf2ServCompCompP <em>Serv Conf2 Serv Comp Comp P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Conf2 Serv Comp Comp P</em>'.
	 * @see cCS.ServConf2ServCompCompP
	 * @generated
	 */
	EClass getServConf2ServCompCompP();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ServCompCompP#getServ2servbinding <em>Serv2servbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serv2servbinding</em>'.
	 * @see cCS.ServConf2ServCompCompP#getServ2servbinding()
	 * @see #getServConf2ServCompCompP()
	 * @generated
	 */
	EReference getServConf2ServCompCompP_Serv2servbinding();

	/**
	 * Returns the meta object for class '{@link cCS.ServConf2ConnectServP <em>Serv Conf2 Connect Serv P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Conf2 Connect Serv P</em>'.
	 * @see cCS.ServConf2ConnectServP
	 * @generated
	 */
	EClass getServConf2ConnectServP();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ConnectServP#getServconf2connectbinding <em>Servconf2connectbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2connectbinding</em>'.
	 * @see cCS.ServConf2ConnectServP#getServconf2connectbinding()
	 * @see #getServConf2ConnectServP()
	 * @generated
	 */
	EReference getServConf2ConnectServP_Servconf2connectbinding();

	/**
	 * Returns the meta object for class '{@link cCS.ServConf2ConnectConnectP <em>Serv Conf2 Connect Connect P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Conf2 Connect Connect P</em>'.
	 * @see cCS.ServConf2ConnectConnectP
	 * @generated
	 */
	EClass getServConf2ConnectConnectP();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ConnectConnectP#getServconf2connectbinding <em>Servconf2connectbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2connectbinding</em>'.
	 * @see cCS.ServConf2ConnectConnectP#getServconf2connectbinding()
	 * @see #getServConf2ConnectConnectP()
	 * @generated
	 */
	EReference getServConf2ConnectConnectP_Servconf2connectbinding();

	/**
	 * Returns the meta object for class '{@link cCS.ServConf2ConnectBinding <em>Serv Conf2 Connect Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serv Conf2 Connect Binding</em>'.
	 * @see cCS.ServConf2ConnectBinding
	 * @generated
	 */
	EClass getServConf2ConnectBinding();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ConnectBinding#getServconf2connectservp <em>Servconf2connectservp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2connectservp</em>'.
	 * @see cCS.ServConf2ConnectBinding#getServconf2connectservp()
	 * @see #getServConf2ConnectBinding()
	 * @generated
	 */
	EReference getServConf2ConnectBinding_Servconf2connectservp();

	/**
	 * Returns the meta object for the reference '{@link cCS.ServConf2ConnectBinding#getServconf2connectconnectp <em>Servconf2connectconnectp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servconf2connectconnectp</em>'.
	 * @see cCS.ServConf2ConnectBinding#getServconf2connectconnectp()
	 * @see #getServConf2ConnectBinding()
	 * @generated
	 */
	EReference getServConf2ConnectBinding_Servconf2connectconnectp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CCSFactory getCCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cCS.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConfigImpl
		 * @see cCS.impl.CCSPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__COMPONENT = eINSTANCE.getConfig_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__CONNECTOR = eINSTANCE.getConfig_Connector();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__INTERFACE = eINSTANCE.getConfig_Interface();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__LINKS = eINSTANCE.getConfig_Links();

		/**
		 * The meta object literal for the '{@link cCS.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConnectorImpl
		 * @see cCS.impl.CCSPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Neweclass16</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__NEWECLASS16 = eINSTANCE.getConnector_Neweclass16();

		/**
		 * The meta object literal for the '<em><b>Neweclass17</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__NEWECLASS17 = eINSTANCE.getConnector_Neweclass17();

		/**
		 * The meta object literal for the '{@link cCS.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ComponentImpl
		 * @see cCS.impl.CCSPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSTRAINTS = eINSTANCE.getComponent_Constraints();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACE = eINSTANCE.getComponent_Interface();

		/**
		 * The meta object literal for the '{@link cCS.ElemArchi <em>Elem Archi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.ElemArchi
		 * @see cCS.impl.CCSPackageImpl#getElemArchi()
		 * @generated
		 */
		EClass ELEM_ARCHI = eINSTANCE.getElemArchi();

		/**
		 * The meta object literal for the '{@link cCS.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PropertiesImpl
		 * @see cCS.impl.CCSPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '{@link cCS.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConstraintsImpl
		 * @see cCS.impl.CCSPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceComponentImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceComponent()
		 * @generated
		 */
		EClass INTERFACE_COMPONENT = eINSTANCE.getInterfaceComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__PORTS = eINSTANCE.getInterfaceComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__SERVICES = eINSTANCE.getInterfaceComponent_Services();

		/**
		 * The meta object literal for the '{@link cCS.PortsComponent <em>Ports Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.PortsComponent
		 * @see cCS.impl.CCSPackageImpl#getPortsComponent()
		 * @generated
		 */
		EClass PORTS_COMPONENT = eINSTANCE.getPortsComponent();

		/**
		 * The meta object literal for the '{@link cCS.ServicesComponent <em>Services Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.ServicesComponent
		 * @see cCS.impl.CCSPackageImpl#getServicesComponent()
		 * @generated
		 */
		EClass SERVICES_COMPONENT = eINSTANCE.getServicesComponent();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceConfigImpl <em>Interface Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceConfigImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceConfig()
		 * @generated
		 */
		EClass INTERFACE_CONFIG = eINSTANCE.getInterfaceConfig();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONFIG__PORTS = eINSTANCE.getInterfaceConfig_Ports();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONFIG__SERVICES = eINSTANCE.getInterfaceConfig_Services();

		/**
		 * The meta object literal for the '{@link cCS.Links <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Links
		 * @see cCS.impl.CCSPackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '{@link cCS.PortsConfig <em>Ports Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.PortsConfig
		 * @see cCS.impl.CCSPackageImpl#getPortsConfig()
		 * @generated
		 */
		EClass PORTS_CONFIG = eINSTANCE.getPortsConfig();

		/**
		 * The meta object literal for the '{@link cCS.ServicesConfig <em>Services Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.ServicesConfig
		 * @see cCS.impl.CCSPackageImpl#getServicesConfig()
		 * @generated
		 */
		EClass SERVICES_CONFIG = eINSTANCE.getServicesConfig();

		/**
		 * The meta object literal for the '{@link cCS.Attachments <em>Attachments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Attachments
		 * @see cCS.impl.CCSPackageImpl#getAttachments()
		 * @generated
		 */
		EClass ATTACHMENTS = eINSTANCE.getAttachments();

		/**
		 * The meta object literal for the '{@link cCS.Bindings <em>Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Bindings
		 * @see cCS.impl.CCSPackageImpl#getBindings()
		 * @generated
		 */
		EClass BINDINGS = eINSTANCE.getBindings();

		/**
		 * The meta object literal for the '{@link cCS.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.GlueImpl
		 * @see cCS.impl.CCSPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Neweclass18</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__NEWECLASS18 = eINSTANCE.getGlue_Neweclass18();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceConnectorImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EClass INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__ROLE = eINSTANCE.getInterfaceConnector_Role();

		/**
		 * The meta object literal for the '{@link cCS.Role <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Role
		 * @see cCS.impl.CCSPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link cCS.impl.PPCompImpl <em>PP Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PPCompImpl
		 * @see cCS.impl.CCSPackageImpl#getPPComp()
		 * @generated
		 */
		EClass PP_COMP = eINSTANCE.getPPComp();

		/**
		 * The meta object literal for the '<em><b>Pb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PP_COMP__PB = eINSTANCE.getPPComp_Pb();

		/**
		 * The meta object literal for the '<em><b>Pra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PP_COMP__PRA = eINSTANCE.getPPComp_Pra();

		/**
		 * The meta object literal for the '{@link cCS.impl.RPCompImpl <em>RP Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RPCompImpl
		 * @see cCS.impl.CCSPackageImpl#getRPComp()
		 * @generated
		 */
		EClass RP_COMP = eINSTANCE.getRPComp();

		/**
		 * The meta object literal for the '<em><b>Rb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RP_COMP__RB = eINSTANCE.getRPComp_Rb();

		/**
		 * The meta object literal for the '<em><b>Rpa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RP_COMP__RPA = eINSTANCE.getRPComp_Rpa();

		/**
		 * The meta object literal for the '{@link cCS.impl.PSCompImpl <em>PS Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PSCompImpl
		 * @see cCS.impl.CCSPackageImpl#getPSComp()
		 * @generated
		 */
		EClass PS_COMP = eINSTANCE.getPSComp();

		/**
		 * The meta object literal for the '{@link cCS.impl.RSCompImpl <em>RS Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RSCompImpl
		 * @see cCS.impl.CCSPackageImpl#getRSComp()
		 * @generated
		 */
		EClass RS_COMP = eINSTANCE.getRSComp();

		/**
		 * The meta object literal for the '{@link cCS.impl.PPConfImpl <em>PP Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PPConfImpl
		 * @see cCS.impl.CCSPackageImpl#getPPConf()
		 * @generated
		 */
		EClass PP_CONF = eINSTANCE.getPPConf();

		/**
		 * The meta object literal for the '<em><b>Pb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PP_CONF__PB = eINSTANCE.getPPConf_Pb();

		/**
		 * The meta object literal for the '{@link cCS.impl.RPConfImpl <em>RP Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RPConfImpl
		 * @see cCS.impl.CCSPackageImpl#getRPConf()
		 * @generated
		 */
		EClass RP_CONF = eINSTANCE.getRPConf();

		/**
		 * The meta object literal for the '<em><b>Rb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RP_CONF__RB = eINSTANCE.getRPConf_Rb();

		/**
		 * The meta object literal for the '{@link cCS.impl.PSConfImpl <em>PS Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PSConfImpl
		 * @see cCS.impl.CCSPackageImpl#getPSConf()
		 * @generated
		 */
		EClass PS_CONF = eINSTANCE.getPSConf();

		/**
		 * The meta object literal for the '{@link cCS.impl.RSConfImpl <em>RS Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RSConfImpl
		 * @see cCS.impl.CCSPackageImpl#getRSConf()
		 * @generated
		 */
		EClass RS_CONF = eINSTANCE.getRSConf();

		/**
		 * The meta object literal for the '{@link cCS.impl.PBImpl <em>PB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PBImpl
		 * @see cCS.impl.CCSPackageImpl#getPB()
		 * @generated
		 */
		EClass PB = eINSTANCE.getPB();

		/**
		 * The meta object literal for the '<em><b>Pp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PB__PP = eINSTANCE.getPB_Pp();

		/**
		 * The meta object literal for the '<em><b>Pp2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PB__PP2 = eINSTANCE.getPB_Pp2();

		/**
		 * The meta object literal for the '{@link cCS.impl.RBImpl <em>RB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RBImpl
		 * @see cCS.impl.CCSPackageImpl#getRB()
		 * @generated
		 */
		EClass RB = eINSTANCE.getRB();

		/**
		 * The meta object literal for the '<em><b>Rp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RB__RP = eINSTANCE.getRB_Rp();

		/**
		 * The meta object literal for the '<em><b>Rp2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RB__RP2 = eINSTANCE.getRB_Rp2();

		/**
		 * The meta object literal for the '{@link cCS.impl.PRAImpl <em>PRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PRAImpl
		 * @see cCS.impl.CCSPackageImpl#getPRA()
		 * @generated
		 */
		EClass PRA = eINSTANCE.getPRA();

		/**
		 * The meta object literal for the '<em><b>Pp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRA__PP = eINSTANCE.getPRA_Pp();

		/**
		 * The meta object literal for the '<em><b>Rr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRA__RR = eINSTANCE.getPRA_Rr();

		/**
		 * The meta object literal for the '{@link cCS.impl.RPAImpl <em>RPA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RPAImpl
		 * @see cCS.impl.CCSPackageImpl#getRPA()
		 * @generated
		 */
		EClass RPA = eINSTANCE.getRPA();

		/**
		 * The meta object literal for the '<em><b>Rp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPA__RP = eINSTANCE.getRPA_Rp();

		/**
		 * The meta object literal for the '<em><b>Pr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPA__PR = eINSTANCE.getRPA_Pr();

		/**
		 * The meta object literal for the '{@link cCS.impl.PRImpl <em>PR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PRImpl
		 * @see cCS.impl.CCSPackageImpl#getPR()
		 * @generated
		 */
		EClass PR = eINSTANCE.getPR();

		/**
		 * The meta object literal for the '<em><b>Rpa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PR__RPA = eINSTANCE.getPR_Rpa();

		/**
		 * The meta object literal for the '{@link cCS.impl.RRImpl <em>RR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RRImpl
		 * @see cCS.impl.CCSPackageImpl#getRR()
		 * @generated
		 */
		EClass RR = eINSTANCE.getRR();

		/**
		 * The meta object literal for the '<em><b>Pra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RR__PRA = eINSTANCE.getRR_Pra();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServerImpl
		 * @see cCS.impl.CCSPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServerCompImpl <em>Server Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServerCompImpl
		 * @see cCS.impl.CCSPackageImpl#getServerComp()
		 * @generated
		 */
		EClass SERVER_COMP = eINSTANCE.getServerComp();

		/**
		 * The meta object literal for the '<em><b>Serverconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_COMP__SERVERCONFIG = eINSTANCE.getServerComp_Serverconfig();

		/**
		 * The meta object literal for the '<em><b>Interfacesserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_COMP__INTERFACESSERVER = eINSTANCE.getServerComp_Interfacesserver();

		/**
		 * The meta object literal for the '{@link cCS.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.SystemImpl
		 * @see cCS.impl.CCSPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVER = eINSTANCE.getSystem_Server();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RPC = eINSTANCE.getSystem_Rpc();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CLIENT = eINSTANCE.getSystem_Client();

		/**
		 * The meta object literal for the '<em><b>Sys2clientbinding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYS2CLIENTBINDING = eINSTANCE.getSystem_Sys2clientbinding();

		/**
		 * The meta object literal for the '<em><b>Systeminterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEMINTERFACE = eINSTANCE.getSystem_Systeminterface();

		/**
		 * The meta object literal for the '{@link cCS.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RPCImpl
		 * @see cCS.impl.CCSPackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Interfacerpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__INTERFACERPC = eINSTANCE.getRPC_Interfacerpc();

		/**
		 * The meta object literal for the '{@link cCS.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ClientImpl
		 * @see cCS.impl.CCSPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Interfacesc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__INTERFACESC = eINSTANCE.getClient_Interfacesc();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServerConfigImpl <em>Server Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServerConfigImpl
		 * @see cCS.impl.CCSPackageImpl#getServerConfig()
		 * @generated
		 */
		EClass SERVER_CONFIG = eINSTANCE.getServerConfig();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__CONNECTIONMANAGER = eINSTANCE.getServerConfig_Connectionmanager();

		/**
		 * The meta object literal for the '<em><b>Securitymanager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__SECURITYMANAGER = eINSTANCE.getServerConfig_Securitymanager();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__DB = eINSTANCE.getServerConfig_Db();

		/**
		 * The meta object literal for the '<em><b>Connectdb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__CONNECTDB = eINSTANCE.getServerConfig_Connectdb();

		/**
		 * The meta object literal for the '<em><b>Secdb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__SECDB = eINSTANCE.getServerConfig_Secdb();

		/**
		 * The meta object literal for the '<em><b>Connectsec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__CONNECTSEC = eINSTANCE.getServerConfig_Connectsec();

		/**
		 * The meta object literal for the '<em><b>Serv2servbinding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__SERV2SERVBINDING = eINSTANCE.getServerConfig_Serv2servbinding();

		/**
		 * The meta object literal for the '<em><b>Serverconfiginterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG__SERVERCONFIGINTERFACE = eINSTANCE.getServerConfig_Serverconfiginterface();

		/**
		 * The meta object literal for the '{@link cCS.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ConnectionManagerImpl
		 * @see cCS.impl.CCSPackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Interfacesconnect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__INTERFACESCONNECT = eINSTANCE.getConnectionManager_Interfacesconnect();

		/**
		 * The meta object literal for the '{@link cCS.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.SecurityManagerImpl
		 * @see cCS.impl.CCSPackageImpl#getSecurityManager()
		 * @generated
		 */
		EClass SECURITY_MANAGER = eINSTANCE.getSecurityManager();

		/**
		 * The meta object literal for the '<em><b>Securityinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__SECURITYINTERFACE = eINSTANCE.getSecurityManager_Securityinterface();

		/**
		 * The meta object literal for the '{@link cCS.impl.DBImpl <em>DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.DBImpl
		 * @see cCS.impl.CCSPackageImpl#getDB()
		 * @generated
		 */
		EClass DB = eINSTANCE.getDB();

		/**
		 * The meta object literal for the '<em><b>Dbinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB__DBINTERFACE = eINSTANCE.getDB_Dbinterface();

		/**
		 * The meta object literal for the '{@link cCS.impl.AttachmentCRImpl <em>Attachment CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AttachmentCRImpl
		 * @see cCS.impl.CCSPackageImpl#getAttachmentCR()
		 * @generated
		 */
		EClass ATTACHMENT_CR = eINSTANCE.getAttachmentCR();

		/**
		 * The meta object literal for the '{@link cCS.impl.AttachmentRCImpl <em>Attachment RC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AttachmentRCImpl
		 * @see cCS.impl.CCSPackageImpl#getAttachmentRC()
		 * @generated
		 */
		EClass ATTACHMENT_RC = eINSTANCE.getAttachmentRC();

		/**
		 * The meta object literal for the '{@link cCS.impl.interfacesCImpl <em>interfaces C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.interfacesCImpl
		 * @see cCS.impl.CCSPackageImpl#getinterfacesC()
		 * @generated
		 */
		EClass INTERFACES_C = eINSTANCE.getinterfacesC();

		/**
		 * The meta object literal for the '<em><b>Portrc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_C__PORTRC = eINSTANCE.getinterfacesC_Portrc();

		/**
		 * The meta object literal for the '<em><b>Portpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_C__PORTPC = eINSTANCE.getinterfacesC_Portpc();

		/**
		 * The meta object literal for the '<em><b>Sys2clientcp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_C__SYS2CLIENTCP = eINSTANCE.getinterfacesC_Sys2clientcp();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortRCImpl <em>Port RC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortRCImpl
		 * @see cCS.impl.CCSPackageImpl#getPortRC()
		 * @generated
		 */
		EClass PORT_RC = eINSTANCE.getPortRC();

		/**
		 * The meta object literal for the '<em><b>Attachmentrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_RC__ATTACHMENTRC = eINSTANCE.getPortRC_Attachmentrc();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortPCImpl <em>Port PC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortPCImpl
		 * @see cCS.impl.CCSPackageImpl#getPortPC()
		 * @generated
		 */
		EClass PORT_PC = eINSTANCE.getPortPC();

		/**
		 * The meta object literal for the '<em><b>Attachmentcr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PC__ATTACHMENTCR = eINSTANCE.getPortPC_Attachmentcr();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceRPCImpl <em>Interface RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceRPCImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceRPC()
		 * @generated
		 */
		EClass INTERFACE_RPC = eINSTANCE.getInterfaceRPC();

		/**
		 * The meta object literal for the '<em><b>Prolerpc2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__PROLERPC2 = eINSTANCE.getInterfaceRPC_Prolerpc2();

		/**
		 * The meta object literal for the '<em><b>Rrolerpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__RROLERPC = eINSTANCE.getInterfaceRPC_Rrolerpc();

		/**
		 * The meta object literal for the '<em><b>Rrolerpc2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__RROLERPC2 = eINSTANCE.getInterfaceRPC_Rrolerpc2();

		/**
		 * The meta object literal for the '<em><b>Prolerpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__PROLERPC = eINSTANCE.getInterfaceRPC_Prolerpc();

		/**
		 * The meta object literal for the '{@link cCS.impl.RRoleRPCClientImpl <em>RRole RPC Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RRoleRPCClientImpl
		 * @see cCS.impl.CCSPackageImpl#getRRoleRPCClient()
		 * @generated
		 */
		EClass RROLE_RPC_CLIENT = eINSTANCE.getRRoleRPCClient();

		/**
		 * The meta object literal for the '<em><b>Attachmentcr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RROLE_RPC_CLIENT__ATTACHMENTCR = eINSTANCE.getRRoleRPCClient_Attachmentcr();

		/**
		 * The meta object literal for the '{@link cCS.impl.PRoleRPCClientImpl <em>PRole RPC Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PRoleRPCClientImpl
		 * @see cCS.impl.CCSPackageImpl#getPRoleRPCClient()
		 * @generated
		 */
		EClass PROLE_RPC_CLIENT = eINSTANCE.getPRoleRPCClient();

		/**
		 * The meta object literal for the '<em><b>Attachmentrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROLE_RPC_CLIENT__ATTACHMENTRC = eINSTANCE.getPRoleRPCClient_Attachmentrc();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfacesConnectImpl <em>Interfaces Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfacesConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfacesConnect()
		 * @generated
		 */
		EClass INTERFACES_CONNECT = eINSTANCE.getInterfacesConnect();

		/**
		 * The meta object literal for the '<em><b>Palpha2connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_CONNECT__PALPHA2CONNECT = eINSTANCE.getInterfacesConnect_Palpha2connect();

		/**
		 * The meta object literal for the '<em><b>Pconnect2alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_CONNECT__PCONNECT2ALPHA = eINSTANCE.getInterfacesConnect_Pconnect2alpha();

		/**
		 * The meta object literal for the '<em><b>Pconnect2gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_CONNECT__PCONNECT2GAMMA = eINSTANCE.getInterfacesConnect_Pconnect2gamma();

		/**
		 * The meta object literal for the '<em><b>Pgamma2connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_CONNECT__PGAMMA2CONNECT = eINSTANCE.getInterfacesConnect_Pgamma2connect();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectconnectp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP = eINSTANCE
				.getInterfacesConnect_Servconf2connectconnectp();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfacesServerImpl <em>Interfaces Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfacesServerImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfacesServer()
		 * @generated
		 */
		EClass INTERFACES_SERVER = eINSTANCE.getInterfacesServer();

		/**
		 * The meta object literal for the '<em><b>Portps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_SERVER__PORTPS = eINSTANCE.getInterfacesServer_Portps();

		/**
		 * The meta object literal for the '<em><b>Portrs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_SERVER__PORTRS = eINSTANCE.getInterfacesServer_Portrs();

		/**
		 * The meta object literal for the '<em><b>Servconf2servcompcompp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP = eINSTANCE.getInterfacesServer_Servconf2servcompcompp();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortPSImpl <em>Port PS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortPSImpl
		 * @see cCS.impl.CCSPackageImpl#getPortPS()
		 * @generated
		 */
		EClass PORT_PS = eINSTANCE.getPortPS();

		/**
		 * The meta object literal for the '<em><b>Attachementsrpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PS__ATTACHEMENTSRPC = eINSTANCE.getPortPS_Attachementsrpc();

		/**
		 * The meta object literal for the '{@link cCS.impl.PortRSImpl <em>Port RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PortRSImpl
		 * @see cCS.impl.CCSPackageImpl#getPortRS()
		 * @generated
		 */
		EClass PORT_RS = eINSTANCE.getPortRS();

		/**
		 * The meta object literal for the '<em><b>Attachementsrpcserv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_RS__ATTACHEMENTSRPCSERV = eINSTANCE.getPortRS_Attachementsrpcserv();

		/**
		 * The meta object literal for the '{@link cCS.impl.RRoleRPCServerImpl <em>RRole RPC Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RRoleRPCServerImpl
		 * @see cCS.impl.CCSPackageImpl#getRRoleRPCServer()
		 * @generated
		 */
		EClass RROLE_RPC_SERVER = eINSTANCE.getRRoleRPCServer();

		/**
		 * The meta object literal for the '<em><b>Attachementsrpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RROLE_RPC_SERVER__ATTACHEMENTSRPC = eINSTANCE.getRRoleRPCServer_Attachementsrpc();

		/**
		 * The meta object literal for the '{@link cCS.impl.PRoleRPCSevImpl <em>PRole RPC Sev</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PRoleRPCSevImpl
		 * @see cCS.impl.CCSPackageImpl#getPRoleRPCSev()
		 * @generated
		 */
		EClass PROLE_RPC_SEV = eINSTANCE.getPRoleRPCSev();

		/**
		 * The meta object literal for the '<em><b>Attachementsrpcserv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROLE_RPC_SEV__ATTACHEMENTSRPCSERV = eINSTANCE.getPRoleRPCSev_Attachementsrpcserv();

		/**
		 * The meta object literal for the '{@link cCS.impl.AttachementSRPCImpl <em>Attachement SRPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AttachementSRPCImpl
		 * @see cCS.impl.CCSPackageImpl#getAttachementSRPC()
		 * @generated
		 */
		EClass ATTACHEMENT_SRPC = eINSTANCE.getAttachementSRPC();

		/**
		 * The meta object literal for the '{@link cCS.impl.AttachementsRPCServImpl <em>Attachements RPC Serv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AttachementsRPCServImpl
		 * @see cCS.impl.CCSPackageImpl#getAttachementsRPCServ()
		 * @generated
		 */
		EClass ATTACHEMENTS_RPC_SERV = eINSTANCE.getAttachementsRPCServ();

		/**
		 * The meta object literal for the '{@link cCS.impl.SecurityInterfaceImpl <em>Security Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.SecurityInterfaceImpl
		 * @see cCS.impl.CCSPackageImpl#getSecurityInterface()
		 * @generated
		 */
		EClass SECURITY_INTERFACE = eINSTANCE.getSecurityInterface();

		/**
		 * The meta object literal for the '<em><b>Psec2beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_INTERFACE__PSEC2BETA = eINSTANCE.getSecurityInterface_Psec2beta();

		/**
		 * The meta object literal for the '<em><b>Pbeta2sec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_INTERFACE__PBETA2SEC = eINSTANCE.getSecurityInterface_Pbeta2sec();

		/**
		 * The meta object literal for the '<em><b>Palpha2sec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_INTERFACE__PALPHA2SEC = eINSTANCE.getSecurityInterface_Palpha2sec();

		/**
		 * The meta object literal for the '<em><b>Psec2alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_INTERFACE__PSEC2ALPHA = eINSTANCE.getSecurityInterface_Psec2alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.DBInterfaceImpl <em>DB Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.DBInterfaceImpl
		 * @see cCS.impl.CCSPackageImpl#getDBInterface()
		 * @generated
		 */
		EClass DB_INTERFACE = eINSTANCE.getDBInterface();

		/**
		 * The meta object literal for the '<em><b>Pdb2gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_INTERFACE__PDB2GAMMA = eINSTANCE.getDBInterface_Pdb2gamma();

		/**
		 * The meta object literal for the '<em><b>Pgamma2db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_INTERFACE__PGAMMA2DB = eINSTANCE.getDBInterface_Pgamma2db();

		/**
		 * The meta object literal for the '<em><b>Pdb2beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_INTERFACE__PDB2BETA = eINSTANCE.getDBInterface_Pdb2beta();

		/**
		 * The meta object literal for the '<em><b>Pbeta2db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_INTERFACE__PBETA2DB = eINSTANCE.getDBInterface_Pbeta2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.AlphaImpl <em>Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getAlpha()
		 * @generated
		 */
		EClass ALPHA = eINSTANCE.getAlpha();

		/**
		 * The meta object literal for the '<em><b>Interfacealpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA__INTERFACEALPHA = eINSTANCE.getAlpha_Interfacealpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.BetaImpl <em>Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getBeta()
		 * @generated
		 */
		EClass BETA = eINSTANCE.getBeta();

		/**
		 * The meta object literal for the '<em><b>Interfacebeta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETA__INTERFACEBETA = eINSTANCE.getBeta_Interfacebeta();

		/**
		 * The meta object literal for the '{@link cCS.impl.GammaImpl <em>Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getGamma()
		 * @generated
		 */
		EClass GAMMA = eINSTANCE.getGamma();

		/**
		 * The meta object literal for the '<em><b>Interfacegamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMMA__INTERFACEGAMMA = eINSTANCE.getGamma_Interfacegamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.PDB2GammaImpl <em>PDB2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PDB2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getPDB2Gamma()
		 * @generated
		 */
		EClass PDB2_GAMMA = eINSTANCE.getPDB2Gamma();

		/**
		 * The meta object literal for the '<em><b>Adb2gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDB2_GAMMA__ADB2GAMMA = eINSTANCE.getPDB2Gamma_Adb2gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.PSec2AlphaImpl <em>PSec2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PSec2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getPSec2Alpha()
		 * @generated
		 */
		EClass PSEC2_ALPHA = eINSTANCE.getPSec2Alpha();

		/**
		 * The meta object literal for the '<em><b>Asec2alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEC2_ALPHA__ASEC2ALPHA = eINSTANCE.getPSec2Alpha_Asec2alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.PConnect2AlphaImpl <em>PConnect2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PConnect2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getPConnect2Alpha()
		 * @generated
		 */
		EClass PCONNECT2_ALPHA = eINSTANCE.getPConnect2Alpha();

		/**
		 * The meta object literal for the '<em><b>Aconnect2alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCONNECT2_ALPHA__ACONNECT2ALPHA = eINSTANCE.getPConnect2Alpha_Aconnect2alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.PAlpha2SecImpl <em>PAlpha2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PAlpha2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getPAlpha2Sec()
		 * @generated
		 */
		EClass PALPHA2_SEC = eINSTANCE.getPAlpha2Sec();

		/**
		 * The meta object literal for the '<em><b>Aalpha2sec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALPHA2_SEC__AALPHA2SEC = eINSTANCE.getPAlpha2Sec_Aalpha2sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.PGamma2DBImpl <em>PGamma2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PGamma2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getPGamma2DB()
		 * @generated
		 */
		EClass PGAMMA2_DB = eINSTANCE.getPGamma2DB();

		/**
		 * The meta object literal for the '<em><b>Agamma2db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PGAMMA2_DB__AGAMMA2DB = eINSTANCE.getPGamma2DB_Agamma2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.PAlpha2ConnectImpl <em>PAlpha2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PAlpha2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getPAlpha2Connect()
		 * @generated
		 */
		EClass PALPHA2_CONNECT = eINSTANCE.getPAlpha2Connect();

		/**
		 * The meta object literal for the '<em><b>Aalpha2connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALPHA2_CONNECT__AALPHA2CONNECT = eINSTANCE.getPAlpha2Connect_Aalpha2connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceAlphaImpl <em>Interface Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceAlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceAlpha()
		 * @generated
		 */
		EClass INTERFACE_ALPHA = eINSTANCE.getInterfaceAlpha();

		/**
		 * The meta object literal for the '<em><b>Rsec2alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__RSEC2ALPHA = eINSTANCE.getInterfaceAlpha_Rsec2alpha();

		/**
		 * The meta object literal for the '<em><b>Ralpha2sec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__RALPHA2SEC = eINSTANCE.getInterfaceAlpha_Ralpha2sec();

		/**
		 * The meta object literal for the '<em><b>Rconnect2alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__RCONNECT2ALPHA = eINSTANCE.getInterfaceAlpha_Rconnect2alpha();

		/**
		 * The meta object literal for the '<em><b>Ralpha2connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__RALPHA2CONNECT = eINSTANCE.getInterfaceAlpha_Ralpha2connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceBetaImpl <em>Interface Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceBetaImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceBeta()
		 * @generated
		 */
		EClass INTERFACE_BETA = eINSTANCE.getInterfaceBeta();

		/**
		 * The meta object literal for the '<em><b>Rbeta2sec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__RBETA2SEC = eINSTANCE.getInterfaceBeta_Rbeta2sec();

		/**
		 * The meta object literal for the '<em><b>Rsec2beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__RSEC2BETA = eINSTANCE.getInterfaceBeta_Rsec2beta();

		/**
		 * The meta object literal for the '<em><b>Rbeta2db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__RBETA2DB = eINSTANCE.getInterfaceBeta_Rbeta2db();

		/**
		 * The meta object literal for the '<em><b>Rdb2beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__RDB2BETA = eINSTANCE.getInterfaceBeta_Rdb2beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.InterfaceGammaImpl <em>Interface Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.InterfaceGammaImpl
		 * @see cCS.impl.CCSPackageImpl#getInterfaceGamma()
		 * @generated
		 */
		EClass INTERFACE_GAMMA = eINSTANCE.getInterfaceGamma();

		/**
		 * The meta object literal for the '<em><b>Rconnect2gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__RCONNECT2GAMMA = eINSTANCE.getInterfaceGamma_Rconnect2gamma();

		/**
		 * The meta object literal for the '<em><b>Rgamma2connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__RGAMMA2CONNECT = eINSTANCE.getInterfaceGamma_Rgamma2connect();

		/**
		 * The meta object literal for the '<em><b>Rdb2gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__RDB2GAMMA = eINSTANCE.getInterfaceGamma_Rdb2gamma();

		/**
		 * The meta object literal for the '<em><b>Rgamma2db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__RGAMMA2DB = eINSTANCE.getInterfaceGamma_Rgamma2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.PSec2BetaImpl <em>PSec2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PSec2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getPSec2Beta()
		 * @generated
		 */
		EClass PSEC2_BETA = eINSTANCE.getPSec2Beta();

		/**
		 * The meta object literal for the '<em><b>Asec2beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEC2_BETA__ASEC2BETA = eINSTANCE.getPSec2Beta_Asec2beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.PBeta2SecImpl <em>PBeta2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PBeta2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getPBeta2Sec()
		 * @generated
		 */
		EClass PBETA2_SEC = eINSTANCE.getPBeta2Sec();

		/**
		 * The meta object literal for the '<em><b>Abeta2sec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBETA2_SEC__ABETA2SEC = eINSTANCE.getPBeta2Sec_Abeta2sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.RBeta2DBImpl <em>RBeta2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RBeta2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getRBeta2DB()
		 * @generated
		 */
		EClass RBETA2_DB = eINSTANCE.getRBeta2DB();

		/**
		 * The meta object literal for the '<em><b>Abeta2db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBETA2_DB__ABETA2DB = eINSTANCE.getRBeta2DB_Abeta2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.RBeta2SecImpl <em>RBeta2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RBeta2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getRBeta2Sec()
		 * @generated
		 */
		EClass RBETA2_SEC = eINSTANCE.getRBeta2Sec();

		/**
		 * The meta object literal for the '<em><b>Abeta2sec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBETA2_SEC__ABETA2SEC = eINSTANCE.getRBeta2Sec_Abeta2sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.RSec2BetaImpl <em>RSec2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RSec2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getRSec2Beta()
		 * @generated
		 */
		EClass RSEC2_BETA = eINSTANCE.getRSec2Beta();

		/**
		 * The meta object literal for the '<em><b>Asec2beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSEC2_BETA__ASEC2BETA = eINSTANCE.getRSec2Beta_Asec2beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.RDB2BetaImpl <em>RDB2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RDB2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getRDB2Beta()
		 * @generated
		 */
		EClass RDB2_BETA = eINSTANCE.getRDB2Beta();

		/**
		 * The meta object literal for the '<em><b>Adb2beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDB2_BETA__ADB2BETA = eINSTANCE.getRDB2Beta_Adb2beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.RConnect2AlphaImpl <em>RConnect2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RConnect2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getRConnect2Alpha()
		 * @generated
		 */
		EClass RCONNECT2_ALPHA = eINSTANCE.getRConnect2Alpha();

		/**
		 * The meta object literal for the '<em><b>Aconnect2alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCONNECT2_ALPHA__ACONNECT2ALPHA = eINSTANCE.getRConnect2Alpha_Aconnect2alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.RAlpha2SecImpl <em>RAlpha2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RAlpha2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getRAlpha2Sec()
		 * @generated
		 */
		EClass RALPHA2_SEC = eINSTANCE.getRAlpha2Sec();

		/**
		 * The meta object literal for the '<em><b>Aalpha2sec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RALPHA2_SEC__AALPHA2SEC = eINSTANCE.getRAlpha2Sec_Aalpha2sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.RSec2AlphaImpl <em>RSec2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RSec2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getRSec2Alpha()
		 * @generated
		 */
		EClass RSEC2_ALPHA = eINSTANCE.getRSec2Alpha();

		/**
		 * The meta object literal for the '<em><b>Asec2alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSEC2_ALPHA__ASEC2ALPHA = eINSTANCE.getRSec2Alpha_Asec2alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.RAlpha2ConnectImpl <em>RAlpha2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RAlpha2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getRAlpha2Connect()
		 * @generated
		 */
		EClass RALPHA2_CONNECT = eINSTANCE.getRAlpha2Connect();

		/**
		 * The meta object literal for the '<em><b>Aalpha2connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RALPHA2_CONNECT__AALPHA2CONNECT = eINSTANCE.getRAlpha2Connect_Aalpha2connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.PConnect2GammaImpl <em>PConnect2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PConnect2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getPConnect2Gamma()
		 * @generated
		 */
		EClass PCONNECT2_GAMMA = eINSTANCE.getPConnect2Gamma();

		/**
		 * The meta object literal for the '<em><b>Aconnect2gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCONNECT2_GAMMA__ACONNECT2GAMMA = eINSTANCE.getPConnect2Gamma_Aconnect2gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.PGamma2ConnectImpl <em>PGamma2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PGamma2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getPGamma2Connect()
		 * @generated
		 */
		EClass PGAMMA2_CONNECT = eINSTANCE.getPGamma2Connect();

		/**
		 * The meta object literal for the '<em><b>Agamma2connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PGAMMA2_CONNECT__AGAMMA2CONNECT = eINSTANCE.getPGamma2Connect_Agamma2connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.PDB2BetaImpl <em>PDB2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PDB2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getPDB2Beta()
		 * @generated
		 */
		EClass PDB2_BETA = eINSTANCE.getPDB2Beta();

		/**
		 * The meta object literal for the '<em><b>Adb2beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDB2_BETA__ADB2BETA = eINSTANCE.getPDB2Beta_Adb2beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.PBeta2DBImpl <em>PBeta2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.PBeta2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getPBeta2DB()
		 * @generated
		 */
		EClass PBETA2_DB = eINSTANCE.getPBeta2DB();

		/**
		 * The meta object literal for the '<em><b>Abeta2db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBETA2_DB__ABETA2DB = eINSTANCE.getPBeta2DB_Abeta2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.RGamma2DBImpl <em>RGamma2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RGamma2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getRGamma2DB()
		 * @generated
		 */
		EClass RGAMMA2_DB = eINSTANCE.getRGamma2DB();

		/**
		 * The meta object literal for the '<em><b>Agamma2db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RGAMMA2_DB__AGAMMA2DB = eINSTANCE.getRGamma2DB_Agamma2db();

		/**
		 * The meta object literal for the '{@link cCS.impl.RDB2GammaImpl <em>RDB2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RDB2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getRDB2Gamma()
		 * @generated
		 */
		EClass RDB2_GAMMA = eINSTANCE.getRDB2Gamma();

		/**
		 * The meta object literal for the '<em><b>Adb2gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDB2_GAMMA__ADB2GAMMA = eINSTANCE.getRDB2Gamma_Adb2gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.RGamma2ConnectImpl <em>RGamma2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RGamma2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getRGamma2Connect()
		 * @generated
		 */
		EClass RGAMMA2_CONNECT = eINSTANCE.getRGamma2Connect();

		/**
		 * The meta object literal for the '<em><b>Agamma2connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RGAMMA2_CONNECT__AGAMMA2CONNECT = eINSTANCE.getRGamma2Connect_Agamma2connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.RConnect2GammaImpl <em>RConnect2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.RConnect2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getRConnect2Gamma()
		 * @generated
		 */
		EClass RCONNECT2_GAMMA = eINSTANCE.getRConnect2Gamma();

		/**
		 * The meta object literal for the '<em><b>Aconnect2gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCONNECT2_GAMMA__ACONNECT2GAMMA = eINSTANCE.getRConnect2Gamma_Aconnect2gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.ADB2GammaImpl <em>ADB2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ADB2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getADB2Gamma()
		 * @generated
		 */
		EClass ADB2_GAMMA = eINSTANCE.getADB2Gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.AConnect2GammaImpl <em>AConnect2 Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AConnect2GammaImpl
		 * @see cCS.impl.CCSPackageImpl#getAConnect2Gamma()
		 * @generated
		 */
		EClass ACONNECT2_GAMMA = eINSTANCE.getAConnect2Gamma();

		/**
		 * The meta object literal for the '{@link cCS.impl.AGamma2DBImpl <em>AGamma2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AGamma2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getAGamma2DB()
		 * @generated
		 */
		EClass AGAMMA2_DB = eINSTANCE.getAGamma2DB();

		/**
		 * The meta object literal for the '{@link cCS.impl.AGamma2ConnectImpl <em>AGamma2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AGamma2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getAGamma2Connect()
		 * @generated
		 */
		EClass AGAMMA2_CONNECT = eINSTANCE.getAGamma2Connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.ADB2BetaImpl <em>ADB2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ADB2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getADB2Beta()
		 * @generated
		 */
		EClass ADB2_BETA = eINSTANCE.getADB2Beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.ABeta2DBImpl <em>ABeta2 DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ABeta2DBImpl
		 * @see cCS.impl.CCSPackageImpl#getABeta2DB()
		 * @generated
		 */
		EClass ABETA2_DB = eINSTANCE.getABeta2DB();

		/**
		 * The meta object literal for the '{@link cCS.impl.ASec2BetaImpl <em>ASec2 Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ASec2BetaImpl
		 * @see cCS.impl.CCSPackageImpl#getASec2Beta()
		 * @generated
		 */
		EClass ASEC2_BETA = eINSTANCE.getASec2Beta();

		/**
		 * The meta object literal for the '{@link cCS.impl.ABeta2SecImpl <em>ABeta2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ABeta2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getABeta2Sec()
		 * @generated
		 */
		EClass ABETA2_SEC = eINSTANCE.getABeta2Sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.AConnect2AlphaImpl <em>AConnect2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AConnect2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getAConnect2Alpha()
		 * @generated
		 */
		EClass ACONNECT2_ALPHA = eINSTANCE.getAConnect2Alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.AAlpha2ConnectImpl <em>AAlpha2 Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AAlpha2ConnectImpl
		 * @see cCS.impl.CCSPackageImpl#getAAlpha2Connect()
		 * @generated
		 */
		EClass AALPHA2_CONNECT = eINSTANCE.getAAlpha2Connect();

		/**
		 * The meta object literal for the '{@link cCS.impl.ASec2AlphaImpl <em>ASec2 Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ASec2AlphaImpl
		 * @see cCS.impl.CCSPackageImpl#getASec2Alpha()
		 * @generated
		 */
		EClass ASEC2_ALPHA = eINSTANCE.getASec2Alpha();

		/**
		 * The meta object literal for the '{@link cCS.impl.AAlpha2SecImpl <em>AAlpha2 Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.AAlpha2SecImpl
		 * @see cCS.impl.CCSPackageImpl#getAAlpha2Sec()
		 * @generated
		 */
		EClass AALPHA2_SEC = eINSTANCE.getAAlpha2Sec();

		/**
		 * The meta object literal for the '{@link cCS.impl.Sys2ClientBindingImpl <em>Sys2 Client Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.Sys2ClientBindingImpl
		 * @see cCS.impl.CCSPackageImpl#getSys2ClientBinding()
		 * @generated
		 */
		EClass SYS2_CLIENT_BINDING = eINSTANCE.getSys2ClientBinding();

		/**
		 * The meta object literal for the '<em><b>Sys2clientsp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS2_CLIENT_BINDING__SYS2CLIENTSP = eINSTANCE.getSys2ClientBinding_Sys2clientsp();

		/**
		 * The meta object literal for the '<em><b>Sys2clientcp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS2_CLIENT_BINDING__SYS2CLIENTCP = eINSTANCE.getSys2ClientBinding_Sys2clientcp();

		/**
		 * The meta object literal for the '{@link cCS.impl.SystemInterfaceImpl <em>System Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.SystemInterfaceImpl
		 * @see cCS.impl.CCSPackageImpl#getSystemInterface()
		 * @generated
		 */
		EClass SYSTEM_INTERFACE = eINSTANCE.getSystemInterface();

		/**
		 * The meta object literal for the '<em><b>Sys2clientsp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INTERFACE__SYS2CLIENTSP = eINSTANCE.getSystemInterface_Sys2clientsp();

		/**
		 * The meta object literal for the '{@link cCS.impl.Sys2ClientSPImpl <em>Sys2 Client SP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.Sys2ClientSPImpl
		 * @see cCS.impl.CCSPackageImpl#getSys2ClientSP()
		 * @generated
		 */
		EClass SYS2_CLIENT_SP = eINSTANCE.getSys2ClientSP();

		/**
		 * The meta object literal for the '<em><b>Sys2clientbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS2_CLIENT_SP__SYS2CLIENTBINDING = eINSTANCE.getSys2ClientSP_Sys2clientbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.Sys2ClientCPImpl <em>Sys2 Client CP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.Sys2ClientCPImpl
		 * @see cCS.impl.CCSPackageImpl#getSys2ClientCP()
		 * @generated
		 */
		EClass SYS2_CLIENT_CP = eINSTANCE.getSys2ClientCP();

		/**
		 * The meta object literal for the '<em><b>Sys2clientbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS2_CLIENT_CP__SYS2CLIENTBINDING = eINSTANCE.getSys2ClientCP_Sys2clientbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.Serv2ServBindingImpl <em>Serv2 Serv Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.Serv2ServBindingImpl
		 * @see cCS.impl.CCSPackageImpl#getServ2ServBinding()
		 * @generated
		 */
		EClass SERV2_SERV_BINDING = eINSTANCE.getServ2ServBinding();

		/**
		 * The meta object literal for the '<em><b>Servconf2servcompconfp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP = eINSTANCE.getServ2ServBinding_Servconf2servcompconfp();

		/**
		 * The meta object literal for the '<em><b>Servconf2servcompcompp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP = eINSTANCE.getServ2ServBinding_Servconf2servcompcompp();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServerConfigInterfaceImpl <em>Server Config Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServerConfigInterfaceImpl
		 * @see cCS.impl.CCSPackageImpl#getServerConfigInterface()
		 * @generated
		 */
		EClass SERVER_CONFIG_INTERFACE = eINSTANCE.getServerConfigInterface();

		/**
		 * The meta object literal for the '<em><b>Servconf2servcompconfp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP = eINSTANCE
				.getServerConfigInterface_Servconf2servcompconfp();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectservp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP = eINSTANCE
				.getServerConfigInterface_Servconf2connectservp();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServConf2ServCompConfPImpl <em>Serv Conf2 Serv Comp Conf P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServConf2ServCompConfPImpl
		 * @see cCS.impl.CCSPackageImpl#getServConf2ServCompConfP()
		 * @generated
		 */
		EClass SERV_CONF2_SERV_COMP_CONF_P = eINSTANCE.getServConf2ServCompConfP();

		/**
		 * The meta object literal for the '<em><b>Serv2servbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING = eINSTANCE
				.getServConf2ServCompConfP_Serv2servbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServConf2ServCompCompPImpl <em>Serv Conf2 Serv Comp Comp P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServConf2ServCompCompPImpl
		 * @see cCS.impl.CCSPackageImpl#getServConf2ServCompCompP()
		 * @generated
		 */
		EClass SERV_CONF2_SERV_COMP_COMP_P = eINSTANCE.getServConf2ServCompCompP();

		/**
		 * The meta object literal for the '<em><b>Serv2servbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING = eINSTANCE
				.getServConf2ServCompCompP_Serv2servbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServConf2ConnectServPImpl <em>Serv Conf2 Connect Serv P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServConf2ConnectServPImpl
		 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectServP()
		 * @generated
		 */
		EClass SERV_CONF2_CONNECT_SERV_P = eINSTANCE.getServConf2ConnectServP();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING = eINSTANCE
				.getServConf2ConnectServP_Servconf2connectbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServConf2ConnectConnectPImpl <em>Serv Conf2 Connect Connect P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServConf2ConnectConnectPImpl
		 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectConnectP()
		 * @generated
		 */
		EClass SERV_CONF2_CONNECT_CONNECT_P = eINSTANCE.getServConf2ConnectConnectP();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectbinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING = eINSTANCE
				.getServConf2ConnectConnectP_Servconf2connectbinding();

		/**
		 * The meta object literal for the '{@link cCS.impl.ServConf2ConnectBindingImpl <em>Serv Conf2 Connect Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.impl.ServConf2ConnectBindingImpl
		 * @see cCS.impl.CCSPackageImpl#getServConf2ConnectBinding()
		 * @generated
		 */
		EClass SERV_CONF2_CONNECT_BINDING = eINSTANCE.getServConf2ConnectBinding();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectservp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP = eINSTANCE
				.getServConf2ConnectBinding_Servconf2connectservp();

		/**
		 * The meta object literal for the '<em><b>Servconf2connectconnectp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP = eINSTANCE
				.getServConf2ConnectBinding_Servconf2connectconnectp();

	}

} //CCSPackage
