/**
 */
package cCS.impl;

import cCS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCSFactoryImpl extends EFactoryImpl implements CCSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CCSFactory init() {
		try {
			CCSFactory theCCSFactory = (CCSFactory) EPackage.Registry.INSTANCE.getEFactory(CCSPackage.eNS_URI);
			if (theCCSFactory != null) {
				return theCCSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CCSPackage.CONFIG:
			return createConfig();
		case CCSPackage.CONNECTOR:
			return createConnector();
		case CCSPackage.COMPONENT:
			return createComponent();
		case CCSPackage.PROPERTIES:
			return createProperties();
		case CCSPackage.CONSTRAINTS:
			return createConstraints();
		case CCSPackage.INTERFACE_COMPONENT:
			return createInterfaceComponent();
		case CCSPackage.INTERFACE_CONFIG:
			return createInterfaceConfig();
		case CCSPackage.GLUE:
			return createGlue();
		case CCSPackage.INTERFACE_CONNECTOR:
			return createInterfaceConnector();
		case CCSPackage.PP_COMP:
			return createPPComp();
		case CCSPackage.RP_COMP:
			return createRPComp();
		case CCSPackage.PS_COMP:
			return createPSComp();
		case CCSPackage.RS_COMP:
			return createRSComp();
		case CCSPackage.PP_CONF:
			return createPPConf();
		case CCSPackage.RP_CONF:
			return createRPConf();
		case CCSPackage.PS_CONF:
			return createPSConf();
		case CCSPackage.RS_CONF:
			return createRSConf();
		case CCSPackage.PB:
			return createPB();
		case CCSPackage.RB:
			return createRB();
		case CCSPackage.PRA:
			return createPRA();
		case CCSPackage.RPA:
			return createRPA();
		case CCSPackage.PR:
			return createPR();
		case CCSPackage.RR:
			return createRR();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComponent createInterfaceComponent() {
		InterfaceComponentImpl interfaceComponent = new InterfaceComponentImpl();
		return interfaceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConfig createInterfaceConfig() {
		InterfaceConfigImpl interfaceConfig = new InterfaceConfigImpl();
		return interfaceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnector() {
		InterfaceConnectorImpl interfaceConnector = new InterfaceConnectorImpl();
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPComp createPPComp() {
		PPCompImpl ppComp = new PPCompImpl();
		return ppComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPComp createRPComp() {
		RPCompImpl rpComp = new RPCompImpl();
		return rpComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSComp createPSComp() {
		PSCompImpl psComp = new PSCompImpl();
		return psComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSComp createRSComp() {
		RSCompImpl rsComp = new RSCompImpl();
		return rsComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPConf createPPConf() {
		PPConfImpl ppConf = new PPConfImpl();
		return ppConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPConf createRPConf() {
		RPConfImpl rpConf = new RPConfImpl();
		return rpConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSConf createPSConf() {
		PSConfImpl psConf = new PSConfImpl();
		return psConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSConf createRSConf() {
		RSConfImpl rsConf = new RSConfImpl();
		return rsConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PB createPB() {
		PBImpl pb = new PBImpl();
		return pb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RB createRB() {
		RBImpl rb = new RBImpl();
		return rb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA createPRA() {
		PRAImpl pra = new PRAImpl();
		return pra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPA createRPA() {
		RPAImpl rpa = new RPAImpl();
		return rpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR createPR() {
		PRImpl pr = new PRImpl();
		return pr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RR createRR() {
		RRImpl rr = new RRImpl();
		return rr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSPackage getCCSPackage() {
		return (CCSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CCSPackage getPackage() {
		return CCSPackage.eINSTANCE;
	}

} //CCSFactoryImpl
