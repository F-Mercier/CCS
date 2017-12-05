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
	 * The feature id for the '<em><b>Neweclass18</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__NEWECLASS18 = 0;

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
	 * Returns the meta object for the reference '{@link cCS.InterfaceConnector#getNeweclass18 <em>Neweclass18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neweclass18</em>'.
	 * @see cCS.InterfaceConnector#getNeweclass18()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Neweclass18();

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
		 * The meta object literal for the '<em><b>Neweclass18</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__NEWECLASS18 = eINSTANCE.getInterfaceConnector_Neweclass18();

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

	}

} //CCSPackage
