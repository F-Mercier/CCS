/**
 */
package cCS.impl;

import cCS.AAlpha2Connect;
import cCS.AAlpha2Sec;
import cCS.ABeta2DB;
import cCS.ABeta2Sec;
import cCS.AConnect2Alpha;
import cCS.AConnect2Gamma;
import cCS.ADB2Beta;
import cCS.ADB2Gamma;
import cCS.AGamma2Connect;
import cCS.AGamma2DB;
import cCS.ASec2Alpha;
import cCS.ASec2Beta;
import cCS.Alpha;
import cCS.AttachementSRPC;
import cCS.AttachementsRPCServ;
import cCS.AttachmentCR;
import cCS.AttachmentRC;
import cCS.Beta;
import cCS.CCSFactory;
import cCS.CCSPackage;
import cCS.Client;
import cCS.Component;
import cCS.Config;
import cCS.ConnectionManager;
import cCS.Connector;
import cCS.Constraints;
import cCS.DB;
import cCS.DBInterface;
import cCS.Gamma;
import cCS.Glue;
import cCS.InterfaceAlpha;
import cCS.InterfaceBeta;
import cCS.InterfaceComponent;
import cCS.InterfaceConfig;
import cCS.InterfaceConnector;
import cCS.InterfaceGamma;
import cCS.InterfaceRPC;
import cCS.InterfacesConnect;
import cCS.InterfacesServer;
import cCS.PAlpha2Connect;
import cCS.PAlpha2Sec;
import cCS.PB;
import cCS.PBeta2DB;
import cCS.PBeta2Sec;
import cCS.PConnect2Alpha;
import cCS.PConnect2Gamma;
import cCS.PDB2Beta;
import cCS.PDB2Gamma;
import cCS.PGamma2Connect;
import cCS.PGamma2DB;
import cCS.PPComp;
import cCS.PPConf;
import cCS.PR;
import cCS.PRA;
import cCS.PRoleRPCClient;
import cCS.PRoleRPCSev;
import cCS.PSComp;
import cCS.PSConf;
import cCS.PSec2Alpha;
import cCS.PSec2Beta;
import cCS.PortPC;
import cCS.PortPS;
import cCS.PortRC;
import cCS.PortRS;
import cCS.Properties;
import cCS.RAlpha2Connect;
import cCS.RAlpha2Sec;
import cCS.RB;
import cCS.RBeta2DB;
import cCS.RBeta2Sec;
import cCS.RConnect2Alpha;
import cCS.RConnect2Gamma;
import cCS.RDB2Beta;
import cCS.RDB2Gamma;
import cCS.RGamma2Connect;
import cCS.RGamma2DB;
import cCS.RPA;
import cCS.RPC;
import cCS.RPComp;
import cCS.RPConf;
import cCS.RR;
import cCS.RRoleRPCClient;
import cCS.RRoleRPCServer;
import cCS.RSComp;
import cCS.RSConf;
import cCS.RSec2Alpha;
import cCS.RSec2Beta;
import cCS.SecurityInterface;
import cCS.Serv2ServBinding;
import cCS.ServConf2ConnectBinding;
import cCS.ServConf2ConnectConnectP;
import cCS.ServConf2ConnectServP;
import cCS.ServConf2ServCompCompP;
import cCS.ServConf2ServCompConfP;
import cCS.Server;
import cCS.ServerComp;
import cCS.ServerConfig;
import cCS.ServerConfigInterface;
import cCS.Sys2ClientBinding;
import cCS.Sys2ClientCP;
import cCS.Sys2ClientSP;
import cCS.SystemInterface;
import cCS.interfacesC;

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
		case CCSPackage.SERVER:
			return createServer();
		case CCSPackage.SERVER_COMP:
			return createServerComp();
		case CCSPackage.SYSTEM:
			return createSystem();
		case CCSPackage.RPC:
			return createRPC();
		case CCSPackage.CLIENT:
			return createClient();
		case CCSPackage.SERVER_CONFIG:
			return createServerConfig();
		case CCSPackage.CONNECTION_MANAGER:
			return createConnectionManager();
		case CCSPackage.SECURITY_MANAGER:
			return createSecurityManager();
		case CCSPackage.DB:
			return createDB();
		case CCSPackage.ATTACHMENT_CR:
			return createAttachmentCR();
		case CCSPackage.ATTACHMENT_RC:
			return createAttachmentRC();
		case CCSPackage.INTERFACES_C:
			return createinterfacesC();
		case CCSPackage.PORT_RC:
			return createPortRC();
		case CCSPackage.PORT_PC:
			return createPortPC();
		case CCSPackage.INTERFACE_RPC:
			return createInterfaceRPC();
		case CCSPackage.RROLE_RPC_CLIENT:
			return createRRoleRPCClient();
		case CCSPackage.PROLE_RPC_CLIENT:
			return createPRoleRPCClient();
		case CCSPackage.INTERFACES_CONNECT:
			return createInterfacesConnect();
		case CCSPackage.INTERFACES_SERVER:
			return createInterfacesServer();
		case CCSPackage.PORT_PS:
			return createPortPS();
		case CCSPackage.PORT_RS:
			return createPortRS();
		case CCSPackage.RROLE_RPC_SERVER:
			return createRRoleRPCServer();
		case CCSPackage.PROLE_RPC_SEV:
			return createPRoleRPCSev();
		case CCSPackage.ATTACHEMENT_SRPC:
			return createAttachementSRPC();
		case CCSPackage.ATTACHEMENTS_RPC_SERV:
			return createAttachementsRPCServ();
		case CCSPackage.SECURITY_INTERFACE:
			return createSecurityInterface();
		case CCSPackage.DB_INTERFACE:
			return createDBInterface();
		case CCSPackage.ALPHA:
			return createAlpha();
		case CCSPackage.BETA:
			return createBeta();
		case CCSPackage.GAMMA:
			return createGamma();
		case CCSPackage.PDB2_GAMMA:
			return createPDB2Gamma();
		case CCSPackage.PSEC2_ALPHA:
			return createPSec2Alpha();
		case CCSPackage.PCONNECT2_ALPHA:
			return createPConnect2Alpha();
		case CCSPackage.PALPHA2_SEC:
			return createPAlpha2Sec();
		case CCSPackage.PGAMMA2_DB:
			return createPGamma2DB();
		case CCSPackage.PALPHA2_CONNECT:
			return createPAlpha2Connect();
		case CCSPackage.INTERFACE_ALPHA:
			return createInterfaceAlpha();
		case CCSPackage.INTERFACE_BETA:
			return createInterfaceBeta();
		case CCSPackage.INTERFACE_GAMMA:
			return createInterfaceGamma();
		case CCSPackage.PSEC2_BETA:
			return createPSec2Beta();
		case CCSPackage.PBETA2_SEC:
			return createPBeta2Sec();
		case CCSPackage.RBETA2_DB:
			return createRBeta2DB();
		case CCSPackage.RBETA2_SEC:
			return createRBeta2Sec();
		case CCSPackage.RSEC2_BETA:
			return createRSec2Beta();
		case CCSPackage.RDB2_BETA:
			return createRDB2Beta();
		case CCSPackage.RCONNECT2_ALPHA:
			return createRConnect2Alpha();
		case CCSPackage.RALPHA2_SEC:
			return createRAlpha2Sec();
		case CCSPackage.RSEC2_ALPHA:
			return createRSec2Alpha();
		case CCSPackage.RALPHA2_CONNECT:
			return createRAlpha2Connect();
		case CCSPackage.PCONNECT2_GAMMA:
			return createPConnect2Gamma();
		case CCSPackage.PGAMMA2_CONNECT:
			return createPGamma2Connect();
		case CCSPackage.PDB2_BETA:
			return createPDB2Beta();
		case CCSPackage.PBETA2_DB:
			return createPBeta2DB();
		case CCSPackage.RGAMMA2_DB:
			return createRGamma2DB();
		case CCSPackage.RDB2_GAMMA:
			return createRDB2Gamma();
		case CCSPackage.RGAMMA2_CONNECT:
			return createRGamma2Connect();
		case CCSPackage.RCONNECT2_GAMMA:
			return createRConnect2Gamma();
		case CCSPackage.ADB2_GAMMA:
			return createADB2Gamma();
		case CCSPackage.ACONNECT2_GAMMA:
			return createAConnect2Gamma();
		case CCSPackage.AGAMMA2_DB:
			return createAGamma2DB();
		case CCSPackage.AGAMMA2_CONNECT:
			return createAGamma2Connect();
		case CCSPackage.ADB2_BETA:
			return createADB2Beta();
		case CCSPackage.ABETA2_DB:
			return createABeta2DB();
		case CCSPackage.ASEC2_BETA:
			return createASec2Beta();
		case CCSPackage.ABETA2_SEC:
			return createABeta2Sec();
		case CCSPackage.ACONNECT2_ALPHA:
			return createAConnect2Alpha();
		case CCSPackage.AALPHA2_CONNECT:
			return createAAlpha2Connect();
		case CCSPackage.ASEC2_ALPHA:
			return createASec2Alpha();
		case CCSPackage.AALPHA2_SEC:
			return createAAlpha2Sec();
		case CCSPackage.SYS2_CLIENT_BINDING:
			return createSys2ClientBinding();
		case CCSPackage.SYSTEM_INTERFACE:
			return createSystemInterface();
		case CCSPackage.SYS2_CLIENT_SP:
			return createSys2ClientSP();
		case CCSPackage.SYS2_CLIENT_CP:
			return createSys2ClientCP();
		case CCSPackage.SERV2_SERV_BINDING:
			return createServ2ServBinding();
		case CCSPackage.SERVER_CONFIG_INTERFACE:
			return createServerConfigInterface();
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P:
			return createServConf2ServCompConfP();
		case CCSPackage.SERV_CONF2_SERV_COMP_COMP_P:
			return createServConf2ServCompCompP();
		case CCSPackage.SERV_CONF2_CONNECT_SERV_P:
			return createServConf2ConnectServP();
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P:
			return createServConf2ConnectConnectP();
		case CCSPackage.SERV_CONF2_CONNECT_BINDING:
			return createServConf2ConnectBinding();
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
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerComp createServerComp() {
		ServerCompImpl serverComp = new ServerCompImpl();
		return serverComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cCS.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfig createServerConfig() {
		ServerConfigImpl serverConfig = new ServerConfigImpl();
		return serverConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cCS.SecurityManager createSecurityManager() {
		SecurityManagerImpl securityManager = new SecurityManagerImpl();
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB createDB() {
		DBImpl db = new DBImpl();
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentCR createAttachmentCR() {
		AttachmentCRImpl attachmentCR = new AttachmentCRImpl();
		return attachmentCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentRC createAttachmentRC() {
		AttachmentRCImpl attachmentRC = new AttachmentRCImpl();
		return attachmentRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfacesC createinterfacesC() {
		interfacesCImpl interfacesC = new interfacesCImpl();
		return interfacesC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRC createPortRC() {
		PortRCImpl portRC = new PortRCImpl();
		return portRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPC createPortPC() {
		PortPCImpl portPC = new PortPCImpl();
		return portPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRPC createInterfaceRPC() {
		InterfaceRPCImpl interfaceRPC = new InterfaceRPCImpl();
		return interfaceRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RRoleRPCClient createRRoleRPCClient() {
		RRoleRPCClientImpl rRoleRPCClient = new RRoleRPCClientImpl();
		return rRoleRPCClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRoleRPCClient createPRoleRPCClient() {
		PRoleRPCClientImpl pRoleRPCClient = new PRoleRPCClientImpl();
		return pRoleRPCClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesConnect createInterfacesConnect() {
		InterfacesConnectImpl interfacesConnect = new InterfacesConnectImpl();
		return interfacesConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesServer createInterfacesServer() {
		InterfacesServerImpl interfacesServer = new InterfacesServerImpl();
		return interfacesServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPS createPortPS() {
		PortPSImpl portPS = new PortPSImpl();
		return portPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRS createPortRS() {
		PortRSImpl portRS = new PortRSImpl();
		return portRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RRoleRPCServer createRRoleRPCServer() {
		RRoleRPCServerImpl rRoleRPCServer = new RRoleRPCServerImpl();
		return rRoleRPCServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRoleRPCSev createPRoleRPCSev() {
		PRoleRPCSevImpl pRoleRPCSev = new PRoleRPCSevImpl();
		return pRoleRPCSev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementSRPC createAttachementSRPC() {
		AttachementSRPCImpl attachementSRPC = new AttachementSRPCImpl();
		return attachementSRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementsRPCServ createAttachementsRPCServ() {
		AttachementsRPCServImpl attachementsRPCServ = new AttachementsRPCServImpl();
		return attachementsRPCServ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityInterface createSecurityInterface() {
		SecurityInterfaceImpl securityInterface = new SecurityInterfaceImpl();
		return securityInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBInterface createDBInterface() {
		DBInterfaceImpl dbInterface = new DBInterfaceImpl();
		return dbInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alpha createAlpha() {
		AlphaImpl alpha = new AlphaImpl();
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beta createBeta() {
		BetaImpl beta = new BetaImpl();
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gamma createGamma() {
		GammaImpl gamma = new GammaImpl();
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDB2Gamma createPDB2Gamma() {
		PDB2GammaImpl pdb2Gamma = new PDB2GammaImpl();
		return pdb2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSec2Alpha createPSec2Alpha() {
		PSec2AlphaImpl pSec2Alpha = new PSec2AlphaImpl();
		return pSec2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConnect2Alpha createPConnect2Alpha() {
		PConnect2AlphaImpl pConnect2Alpha = new PConnect2AlphaImpl();
		return pConnect2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAlpha2Sec createPAlpha2Sec() {
		PAlpha2SecImpl pAlpha2Sec = new PAlpha2SecImpl();
		return pAlpha2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGamma2DB createPGamma2DB() {
		PGamma2DBImpl pGamma2DB = new PGamma2DBImpl();
		return pGamma2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAlpha2Connect createPAlpha2Connect() {
		PAlpha2ConnectImpl pAlpha2Connect = new PAlpha2ConnectImpl();
		return pAlpha2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceAlpha createInterfaceAlpha() {
		InterfaceAlphaImpl interfaceAlpha = new InterfaceAlphaImpl();
		return interfaceAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceBeta createInterfaceBeta() {
		InterfaceBetaImpl interfaceBeta = new InterfaceBetaImpl();
		return interfaceBeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceGamma createInterfaceGamma() {
		InterfaceGammaImpl interfaceGamma = new InterfaceGammaImpl();
		return interfaceGamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSec2Beta createPSec2Beta() {
		PSec2BetaImpl pSec2Beta = new PSec2BetaImpl();
		return pSec2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBeta2Sec createPBeta2Sec() {
		PBeta2SecImpl pBeta2Sec = new PBeta2SecImpl();
		return pBeta2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBeta2DB createRBeta2DB() {
		RBeta2DBImpl rBeta2DB = new RBeta2DBImpl();
		return rBeta2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBeta2Sec createRBeta2Sec() {
		RBeta2SecImpl rBeta2Sec = new RBeta2SecImpl();
		return rBeta2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSec2Beta createRSec2Beta() {
		RSec2BetaImpl rSec2Beta = new RSec2BetaImpl();
		return rSec2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDB2Beta createRDB2Beta() {
		RDB2BetaImpl rdb2Beta = new RDB2BetaImpl();
		return rdb2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RConnect2Alpha createRConnect2Alpha() {
		RConnect2AlphaImpl rConnect2Alpha = new RConnect2AlphaImpl();
		return rConnect2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAlpha2Sec createRAlpha2Sec() {
		RAlpha2SecImpl rAlpha2Sec = new RAlpha2SecImpl();
		return rAlpha2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSec2Alpha createRSec2Alpha() {
		RSec2AlphaImpl rSec2Alpha = new RSec2AlphaImpl();
		return rSec2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAlpha2Connect createRAlpha2Connect() {
		RAlpha2ConnectImpl rAlpha2Connect = new RAlpha2ConnectImpl();
		return rAlpha2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConnect2Gamma createPConnect2Gamma() {
		PConnect2GammaImpl pConnect2Gamma = new PConnect2GammaImpl();
		return pConnect2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGamma2Connect createPGamma2Connect() {
		PGamma2ConnectImpl pGamma2Connect = new PGamma2ConnectImpl();
		return pGamma2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDB2Beta createPDB2Beta() {
		PDB2BetaImpl pdb2Beta = new PDB2BetaImpl();
		return pdb2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBeta2DB createPBeta2DB() {
		PBeta2DBImpl pBeta2DB = new PBeta2DBImpl();
		return pBeta2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGamma2DB createRGamma2DB() {
		RGamma2DBImpl rGamma2DB = new RGamma2DBImpl();
		return rGamma2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDB2Gamma createRDB2Gamma() {
		RDB2GammaImpl rdb2Gamma = new RDB2GammaImpl();
		return rdb2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGamma2Connect createRGamma2Connect() {
		RGamma2ConnectImpl rGamma2Connect = new RGamma2ConnectImpl();
		return rGamma2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RConnect2Gamma createRConnect2Gamma() {
		RConnect2GammaImpl rConnect2Gamma = new RConnect2GammaImpl();
		return rConnect2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Gamma createADB2Gamma() {
		ADB2GammaImpl adb2Gamma = new ADB2GammaImpl();
		return adb2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Gamma createAConnect2Gamma() {
		AConnect2GammaImpl aConnect2Gamma = new AConnect2GammaImpl();
		return aConnect2Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2DB createAGamma2DB() {
		AGamma2DBImpl aGamma2DB = new AGamma2DBImpl();
		return aGamma2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGamma2Connect createAGamma2Connect() {
		AGamma2ConnectImpl aGamma2Connect = new AGamma2ConnectImpl();
		return aGamma2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADB2Beta createADB2Beta() {
		ADB2BetaImpl adb2Beta = new ADB2BetaImpl();
		return adb2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2DB createABeta2DB() {
		ABeta2DBImpl aBeta2DB = new ABeta2DBImpl();
		return aBeta2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Beta createASec2Beta() {
		ASec2BetaImpl aSec2Beta = new ASec2BetaImpl();
		return aSec2Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABeta2Sec createABeta2Sec() {
		ABeta2SecImpl aBeta2Sec = new ABeta2SecImpl();
		return aBeta2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect2Alpha createAConnect2Alpha() {
		AConnect2AlphaImpl aConnect2Alpha = new AConnect2AlphaImpl();
		return aConnect2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Connect createAAlpha2Connect() {
		AAlpha2ConnectImpl aAlpha2Connect = new AAlpha2ConnectImpl();
		return aAlpha2Connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASec2Alpha createASec2Alpha() {
		ASec2AlphaImpl aSec2Alpha = new ASec2AlphaImpl();
		return aSec2Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAlpha2Sec createAAlpha2Sec() {
		AAlpha2SecImpl aAlpha2Sec = new AAlpha2SecImpl();
		return aAlpha2Sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientBinding createSys2ClientBinding() {
		Sys2ClientBindingImpl sys2ClientBinding = new Sys2ClientBindingImpl();
		return sys2ClientBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInterface createSystemInterface() {
		SystemInterfaceImpl systemInterface = new SystemInterfaceImpl();
		return systemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientSP createSys2ClientSP() {
		Sys2ClientSPImpl sys2ClientSP = new Sys2ClientSPImpl();
		return sys2ClientSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys2ClientCP createSys2ClientCP() {
		Sys2ClientCPImpl sys2ClientCP = new Sys2ClientCPImpl();
		return sys2ClientCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serv2ServBinding createServ2ServBinding() {
		Serv2ServBindingImpl serv2ServBinding = new Serv2ServBindingImpl();
		return serv2ServBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigInterface createServerConfigInterface() {
		ServerConfigInterfaceImpl serverConfigInterface = new ServerConfigInterfaceImpl();
		return serverConfigInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompConfP createServConf2ServCompConfP() {
		ServConf2ServCompConfPImpl servConf2ServCompConfP = new ServConf2ServCompConfPImpl();
		return servConf2ServCompConfP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ServCompCompP createServConf2ServCompCompP() {
		ServConf2ServCompCompPImpl servConf2ServCompCompP = new ServConf2ServCompCompPImpl();
		return servConf2ServCompCompP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectServP createServConf2ConnectServP() {
		ServConf2ConnectServPImpl servConf2ConnectServP = new ServConf2ConnectServPImpl();
		return servConf2ConnectServP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectConnectP createServConf2ConnectConnectP() {
		ServConf2ConnectConnectPImpl servConf2ConnectConnectP = new ServConf2ConnectConnectPImpl();
		return servConf2ConnectConnectP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServConf2ConnectBinding createServConf2ConnectBinding() {
		ServConf2ConnectBindingImpl servConf2ConnectBinding = new ServConf2ConnectBindingImpl();
		return servConf2ConnectBinding;
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
