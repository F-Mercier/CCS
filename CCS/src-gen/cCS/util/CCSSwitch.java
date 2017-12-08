/**
 */
package cCS.util;

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
import cCS.Attachments;
import cCS.Beta;
import cCS.Bindings;
import cCS.CCSPackage;
import cCS.Client;
import cCS.Component;
import cCS.Config;
import cCS.ConnectionManager;
import cCS.Connector;
import cCS.Constraints;
import cCS.DB;
import cCS.DBInterface;
import cCS.ElemArchi;
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
import cCS.Links;
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
import cCS.PortsComponent;
import cCS.PortsConfig;
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
import cCS.Role;
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
import cCS.ServicesComponent;
import cCS.ServicesConfig;
import cCS.Sys2ClientBinding;
import cCS.Sys2ClientCP;
import cCS.Sys2ClientSP;
import cCS.SystemInterface;
import cCS.interfacesC;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cCS.CCSPackage
 * @generated
 */
public class CCSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CCSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSSwitch() {
		if (modelPackage == null) {
			modelPackage = CCSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CCSPackage.CONFIG: {
			Config config = (Config) theEObject;
			T result = caseConfig(config);
			if (result == null)
				result = caseElemArchi(config);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseElemArchi(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseElemArchi(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ELEM_ARCHI: {
			ElemArchi elemArchi = (ElemArchi) theEObject;
			T result = caseElemArchi(elemArchi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PROPERTIES: {
			Properties properties = (Properties) theEObject;
			T result = caseProperties(properties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.CONSTRAINTS: {
			Constraints constraints = (Constraints) theEObject;
			T result = caseConstraints(constraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_COMPONENT: {
			InterfaceComponent interfaceComponent = (InterfaceComponent) theEObject;
			T result = caseInterfaceComponent(interfaceComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORTS_COMPONENT: {
			PortsComponent portsComponent = (PortsComponent) theEObject;
			T result = casePortsComponent(portsComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVICES_COMPONENT: {
			ServicesComponent servicesComponent = (ServicesComponent) theEObject;
			T result = caseServicesComponent(servicesComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_CONFIG: {
			InterfaceConfig interfaceConfig = (InterfaceConfig) theEObject;
			T result = caseInterfaceConfig(interfaceConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.LINKS: {
			Links links = (Links) theEObject;
			T result = caseLinks(links);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORTS_CONFIG: {
			PortsConfig portsConfig = (PortsConfig) theEObject;
			T result = casePortsConfig(portsConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVICES_CONFIG: {
			ServicesConfig servicesConfig = (ServicesConfig) theEObject;
			T result = caseServicesConfig(servicesConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ATTACHMENTS: {
			Attachments attachments = (Attachments) theEObject;
			T result = caseAttachments(attachments);
			if (result == null)
				result = caseLinks(attachments);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.BINDINGS: {
			Bindings bindings = (Bindings) theEObject;
			T result = caseBindings(bindings);
			if (result == null)
				result = caseLinks(bindings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.GLUE: {
			Glue glue = (Glue) theEObject;
			T result = caseGlue(glue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_CONNECTOR: {
			InterfaceConnector interfaceConnector = (InterfaceConnector) theEObject;
			T result = caseInterfaceConnector(interfaceConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PP_COMP: {
			PPComp ppComp = (PPComp) theEObject;
			T result = casePPComp(ppComp);
			if (result == null)
				result = casePortsComponent(ppComp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RP_COMP: {
			RPComp rpComp = (RPComp) theEObject;
			T result = caseRPComp(rpComp);
			if (result == null)
				result = casePortsComponent(rpComp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PS_COMP: {
			PSComp psComp = (PSComp) theEObject;
			T result = casePSComp(psComp);
			if (result == null)
				result = caseServicesComponent(psComp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RS_COMP: {
			RSComp rsComp = (RSComp) theEObject;
			T result = caseRSComp(rsComp);
			if (result == null)
				result = caseServicesComponent(rsComp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PP_CONF: {
			PPConf ppConf = (PPConf) theEObject;
			T result = casePPConf(ppConf);
			if (result == null)
				result = casePortsConfig(ppConf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RP_CONF: {
			RPConf rpConf = (RPConf) theEObject;
			T result = caseRPConf(rpConf);
			if (result == null)
				result = casePortsConfig(rpConf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PS_CONF: {
			PSConf psConf = (PSConf) theEObject;
			T result = casePSConf(psConf);
			if (result == null)
				result = caseServicesConfig(psConf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RS_CONF: {
			RSConf rsConf = (RSConf) theEObject;
			T result = caseRSConf(rsConf);
			if (result == null)
				result = caseServicesConfig(rsConf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PB: {
			PB pb = (PB) theEObject;
			T result = casePB(pb);
			if (result == null)
				result = caseBindings(pb);
			if (result == null)
				result = caseLinks(pb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RB: {
			RB rb = (RB) theEObject;
			T result = caseRB(rb);
			if (result == null)
				result = caseBindings(rb);
			if (result == null)
				result = caseLinks(rb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PRA: {
			PRA pra = (PRA) theEObject;
			T result = casePRA(pra);
			if (result == null)
				result = caseAttachments(pra);
			if (result == null)
				result = caseLinks(pra);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RPA: {
			RPA rpa = (RPA) theEObject;
			T result = caseRPA(rpa);
			if (result == null)
				result = caseAttachments(rpa);
			if (result == null)
				result = caseLinks(rpa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PR: {
			PR pr = (PR) theEObject;
			T result = casePR(pr);
			if (result == null)
				result = caseRole(pr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RR: {
			RR rr = (RR) theEObject;
			T result = caseRR(rr);
			if (result == null)
				result = caseRole(rr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVER: {
			Server server = (Server) theEObject;
			T result = caseServer(server);
			if (result == null)
				result = caseComponent(server);
			if (result == null)
				result = caseElemArchi(server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVER_COMP: {
			ServerComp serverComp = (ServerComp) theEObject;
			T result = caseServerComp(serverComp);
			if (result == null)
				result = caseComponent(serverComp);
			if (result == null)
				result = caseElemArchi(serverComp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SYSTEM: {
			cCS.System system = (cCS.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = caseConfig(system);
			if (result == null)
				result = caseElemArchi(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RPC: {
			RPC rpc = (RPC) theEObject;
			T result = caseRPC(rpc);
			if (result == null)
				result = caseConnector(rpc);
			if (result == null)
				result = caseElemArchi(rpc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.CLIENT: {
			Client client = (Client) theEObject;
			T result = caseClient(client);
			if (result == null)
				result = caseComponent(client);
			if (result == null)
				result = caseElemArchi(client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVER_CONFIG: {
			ServerConfig serverConfig = (ServerConfig) theEObject;
			T result = caseServerConfig(serverConfig);
			if (result == null)
				result = caseConfig(serverConfig);
			if (result == null)
				result = caseElemArchi(serverConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.CONNECTION_MANAGER: {
			ConnectionManager connectionManager = (ConnectionManager) theEObject;
			T result = caseConnectionManager(connectionManager);
			if (result == null)
				result = caseComponent(connectionManager);
			if (result == null)
				result = caseElemArchi(connectionManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SECURITY_MANAGER: {
			cCS.SecurityManager securityManager = (cCS.SecurityManager) theEObject;
			T result = caseSecurityManager(securityManager);
			if (result == null)
				result = caseComponent(securityManager);
			if (result == null)
				result = caseElemArchi(securityManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.DB: {
			DB db = (DB) theEObject;
			T result = caseDB(db);
			if (result == null)
				result = caseComponent(db);
			if (result == null)
				result = caseElemArchi(db);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ATTACHMENT_CR: {
			AttachmentCR attachmentCR = (AttachmentCR) theEObject;
			T result = caseAttachmentCR(attachmentCR);
			if (result == null)
				result = casePRA(attachmentCR);
			if (result == null)
				result = caseAttachments(attachmentCR);
			if (result == null)
				result = caseLinks(attachmentCR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ATTACHMENT_RC: {
			AttachmentRC attachmentRC = (AttachmentRC) theEObject;
			T result = caseAttachmentRC(attachmentRC);
			if (result == null)
				result = caseRPA(attachmentRC);
			if (result == null)
				result = caseAttachments(attachmentRC);
			if (result == null)
				result = caseLinks(attachmentRC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACES_C: {
			interfacesC interfacesC = (interfacesC) theEObject;
			T result = caseinterfacesC(interfacesC);
			if (result == null)
				result = caseInterfaceComponent(interfacesC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORT_RC: {
			PortRC portRC = (PortRC) theEObject;
			T result = casePortRC(portRC);
			if (result == null)
				result = caseRPComp(portRC);
			if (result == null)
				result = casePortsComponent(portRC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORT_PC: {
			PortPC portPC = (PortPC) theEObject;
			T result = casePortPC(portPC);
			if (result == null)
				result = casePPComp(portPC);
			if (result == null)
				result = casePortsComponent(portPC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_RPC: {
			InterfaceRPC interfaceRPC = (InterfaceRPC) theEObject;
			T result = caseInterfaceRPC(interfaceRPC);
			if (result == null)
				result = caseInterfaceConnector(interfaceRPC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RROLE_RPC_CLIENT: {
			RRoleRPCClient rRoleRPCClient = (RRoleRPCClient) theEObject;
			T result = caseRRoleRPCClient(rRoleRPCClient);
			if (result == null)
				result = caseRR(rRoleRPCClient);
			if (result == null)
				result = caseRole(rRoleRPCClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PROLE_RPC_CLIENT: {
			PRoleRPCClient pRoleRPCClient = (PRoleRPCClient) theEObject;
			T result = casePRoleRPCClient(pRoleRPCClient);
			if (result == null)
				result = casePR(pRoleRPCClient);
			if (result == null)
				result = caseRole(pRoleRPCClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACES_CONNECT: {
			InterfacesConnect interfacesConnect = (InterfacesConnect) theEObject;
			T result = caseInterfacesConnect(interfacesConnect);
			if (result == null)
				result = caseInterfaceComponent(interfacesConnect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACES_SERVER: {
			InterfacesServer interfacesServer = (InterfacesServer) theEObject;
			T result = caseInterfacesServer(interfacesServer);
			if (result == null)
				result = caseInterfaceComponent(interfacesServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORT_PS: {
			PortPS portPS = (PortPS) theEObject;
			T result = casePortPS(portPS);
			if (result == null)
				result = casePPComp(portPS);
			if (result == null)
				result = casePortsComponent(portPS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PORT_RS: {
			PortRS portRS = (PortRS) theEObject;
			T result = casePortRS(portRS);
			if (result == null)
				result = caseRPComp(portRS);
			if (result == null)
				result = casePortsComponent(portRS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RROLE_RPC_SERVER: {
			RRoleRPCServer rRoleRPCServer = (RRoleRPCServer) theEObject;
			T result = caseRRoleRPCServer(rRoleRPCServer);
			if (result == null)
				result = caseRR(rRoleRPCServer);
			if (result == null)
				result = caseRole(rRoleRPCServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PROLE_RPC_SEV: {
			PRoleRPCSev pRoleRPCSev = (PRoleRPCSev) theEObject;
			T result = casePRoleRPCSev(pRoleRPCSev);
			if (result == null)
				result = casePR(pRoleRPCSev);
			if (result == null)
				result = caseRole(pRoleRPCSev);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ATTACHEMENT_SRPC: {
			AttachementSRPC attachementSRPC = (AttachementSRPC) theEObject;
			T result = caseAttachementSRPC(attachementSRPC);
			if (result == null)
				result = casePRA(attachementSRPC);
			if (result == null)
				result = caseAttachments(attachementSRPC);
			if (result == null)
				result = caseLinks(attachementSRPC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ATTACHEMENTS_RPC_SERV: {
			AttachementsRPCServ attachementsRPCServ = (AttachementsRPCServ) theEObject;
			T result = caseAttachementsRPCServ(attachementsRPCServ);
			if (result == null)
				result = caseRPA(attachementsRPCServ);
			if (result == null)
				result = caseAttachments(attachementsRPCServ);
			if (result == null)
				result = caseLinks(attachementsRPCServ);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SECURITY_INTERFACE: {
			SecurityInterface securityInterface = (SecurityInterface) theEObject;
			T result = caseSecurityInterface(securityInterface);
			if (result == null)
				result = caseInterfaceComponent(securityInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.DB_INTERFACE: {
			DBInterface dbInterface = (DBInterface) theEObject;
			T result = caseDBInterface(dbInterface);
			if (result == null)
				result = caseInterfaceComponent(dbInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ALPHA: {
			Alpha alpha = (Alpha) theEObject;
			T result = caseAlpha(alpha);
			if (result == null)
				result = caseConnector(alpha);
			if (result == null)
				result = caseElemArchi(alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.BETA: {
			Beta beta = (Beta) theEObject;
			T result = caseBeta(beta);
			if (result == null)
				result = caseConnector(beta);
			if (result == null)
				result = caseElemArchi(beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.GAMMA: {
			Gamma gamma = (Gamma) theEObject;
			T result = caseGamma(gamma);
			if (result == null)
				result = caseConnector(gamma);
			if (result == null)
				result = caseElemArchi(gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PDB2_GAMMA: {
			PDB2Gamma pdb2Gamma = (PDB2Gamma) theEObject;
			T result = casePDB2Gamma(pdb2Gamma);
			if (result == null)
				result = casePPComp(pdb2Gamma);
			if (result == null)
				result = casePortsComponent(pdb2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PSEC2_ALPHA: {
			PSec2Alpha pSec2Alpha = (PSec2Alpha) theEObject;
			T result = casePSec2Alpha(pSec2Alpha);
			if (result == null)
				result = casePPComp(pSec2Alpha);
			if (result == null)
				result = casePortsComponent(pSec2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PCONNECT2_ALPHA: {
			PConnect2Alpha pConnect2Alpha = (PConnect2Alpha) theEObject;
			T result = casePConnect2Alpha(pConnect2Alpha);
			if (result == null)
				result = casePPComp(pConnect2Alpha);
			if (result == null)
				result = casePortsComponent(pConnect2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PALPHA2_SEC: {
			PAlpha2Sec pAlpha2Sec = (PAlpha2Sec) theEObject;
			T result = casePAlpha2Sec(pAlpha2Sec);
			if (result == null)
				result = caseRPComp(pAlpha2Sec);
			if (result == null)
				result = casePortsComponent(pAlpha2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PGAMMA2_DB: {
			PGamma2DB pGamma2DB = (PGamma2DB) theEObject;
			T result = casePGamma2DB(pGamma2DB);
			if (result == null)
				result = caseRPComp(pGamma2DB);
			if (result == null)
				result = casePortsComponent(pGamma2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PALPHA2_CONNECT: {
			PAlpha2Connect pAlpha2Connect = (PAlpha2Connect) theEObject;
			T result = casePAlpha2Connect(pAlpha2Connect);
			if (result == null)
				result = caseRPComp(pAlpha2Connect);
			if (result == null)
				result = casePortsComponent(pAlpha2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_ALPHA: {
			InterfaceAlpha interfaceAlpha = (InterfaceAlpha) theEObject;
			T result = caseInterfaceAlpha(interfaceAlpha);
			if (result == null)
				result = caseInterfaceConnector(interfaceAlpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_BETA: {
			InterfaceBeta interfaceBeta = (InterfaceBeta) theEObject;
			T result = caseInterfaceBeta(interfaceBeta);
			if (result == null)
				result = caseInterfaceConnector(interfaceBeta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.INTERFACE_GAMMA: {
			InterfaceGamma interfaceGamma = (InterfaceGamma) theEObject;
			T result = caseInterfaceGamma(interfaceGamma);
			if (result == null)
				result = caseInterfaceConnector(interfaceGamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PSEC2_BETA: {
			PSec2Beta pSec2Beta = (PSec2Beta) theEObject;
			T result = casePSec2Beta(pSec2Beta);
			if (result == null)
				result = casePPComp(pSec2Beta);
			if (result == null)
				result = casePortsComponent(pSec2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PBETA2_SEC: {
			PBeta2Sec pBeta2Sec = (PBeta2Sec) theEObject;
			T result = casePBeta2Sec(pBeta2Sec);
			if (result == null)
				result = caseRPComp(pBeta2Sec);
			if (result == null)
				result = casePortsComponent(pBeta2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RBETA2_DB: {
			RBeta2DB rBeta2DB = (RBeta2DB) theEObject;
			T result = caseRBeta2DB(rBeta2DB);
			if (result == null)
				result = casePR(rBeta2DB);
			if (result == null)
				result = caseRole(rBeta2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RBETA2_SEC: {
			RBeta2Sec rBeta2Sec = (RBeta2Sec) theEObject;
			T result = caseRBeta2Sec(rBeta2Sec);
			if (result == null)
				result = casePR(rBeta2Sec);
			if (result == null)
				result = caseRole(rBeta2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RSEC2_BETA: {
			RSec2Beta rSec2Beta = (RSec2Beta) theEObject;
			T result = caseRSec2Beta(rSec2Beta);
			if (result == null)
				result = caseRR(rSec2Beta);
			if (result == null)
				result = caseRole(rSec2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RDB2_BETA: {
			RDB2Beta rdb2Beta = (RDB2Beta) theEObject;
			T result = caseRDB2Beta(rdb2Beta);
			if (result == null)
				result = caseRR(rdb2Beta);
			if (result == null)
				result = caseRole(rdb2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RCONNECT2_ALPHA: {
			RConnect2Alpha rConnect2Alpha = (RConnect2Alpha) theEObject;
			T result = caseRConnect2Alpha(rConnect2Alpha);
			if (result == null)
				result = caseRR(rConnect2Alpha);
			if (result == null)
				result = caseRole(rConnect2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RALPHA2_SEC: {
			RAlpha2Sec rAlpha2Sec = (RAlpha2Sec) theEObject;
			T result = caseRAlpha2Sec(rAlpha2Sec);
			if (result == null)
				result = casePR(rAlpha2Sec);
			if (result == null)
				result = caseRole(rAlpha2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RSEC2_ALPHA: {
			RSec2Alpha rSec2Alpha = (RSec2Alpha) theEObject;
			T result = caseRSec2Alpha(rSec2Alpha);
			if (result == null)
				result = caseRR(rSec2Alpha);
			if (result == null)
				result = caseRole(rSec2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RALPHA2_CONNECT: {
			RAlpha2Connect rAlpha2Connect = (RAlpha2Connect) theEObject;
			T result = caseRAlpha2Connect(rAlpha2Connect);
			if (result == null)
				result = casePR(rAlpha2Connect);
			if (result == null)
				result = caseRole(rAlpha2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PCONNECT2_GAMMA: {
			PConnect2Gamma pConnect2Gamma = (PConnect2Gamma) theEObject;
			T result = casePConnect2Gamma(pConnect2Gamma);
			if (result == null)
				result = casePPComp(pConnect2Gamma);
			if (result == null)
				result = casePortsComponent(pConnect2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PGAMMA2_CONNECT: {
			PGamma2Connect pGamma2Connect = (PGamma2Connect) theEObject;
			T result = casePGamma2Connect(pGamma2Connect);
			if (result == null)
				result = caseRPComp(pGamma2Connect);
			if (result == null)
				result = casePortsComponent(pGamma2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PDB2_BETA: {
			PDB2Beta pdb2Beta = (PDB2Beta) theEObject;
			T result = casePDB2Beta(pdb2Beta);
			if (result == null)
				result = casePPComp(pdb2Beta);
			if (result == null)
				result = casePortsComponent(pdb2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.PBETA2_DB: {
			PBeta2DB pBeta2DB = (PBeta2DB) theEObject;
			T result = casePBeta2DB(pBeta2DB);
			if (result == null)
				result = caseRPComp(pBeta2DB);
			if (result == null)
				result = casePortsComponent(pBeta2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RGAMMA2_DB: {
			RGamma2DB rGamma2DB = (RGamma2DB) theEObject;
			T result = caseRGamma2DB(rGamma2DB);
			if (result == null)
				result = casePR(rGamma2DB);
			if (result == null)
				result = caseRole(rGamma2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RDB2_GAMMA: {
			RDB2Gamma rdb2Gamma = (RDB2Gamma) theEObject;
			T result = caseRDB2Gamma(rdb2Gamma);
			if (result == null)
				result = caseRR(rdb2Gamma);
			if (result == null)
				result = caseRole(rdb2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RGAMMA2_CONNECT: {
			RGamma2Connect rGamma2Connect = (RGamma2Connect) theEObject;
			T result = caseRGamma2Connect(rGamma2Connect);
			if (result == null)
				result = casePR(rGamma2Connect);
			if (result == null)
				result = caseRole(rGamma2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.RCONNECT2_GAMMA: {
			RConnect2Gamma rConnect2Gamma = (RConnect2Gamma) theEObject;
			T result = caseRConnect2Gamma(rConnect2Gamma);
			if (result == null)
				result = caseRR(rConnect2Gamma);
			if (result == null)
				result = caseRole(rConnect2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ADB2_GAMMA: {
			ADB2Gamma adb2Gamma = (ADB2Gamma) theEObject;
			T result = caseADB2Gamma(adb2Gamma);
			if (result == null)
				result = casePRA(adb2Gamma);
			if (result == null)
				result = caseAttachments(adb2Gamma);
			if (result == null)
				result = caseLinks(adb2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ACONNECT2_GAMMA: {
			AConnect2Gamma aConnect2Gamma = (AConnect2Gamma) theEObject;
			T result = caseAConnect2Gamma(aConnect2Gamma);
			if (result == null)
				result = casePRA(aConnect2Gamma);
			if (result == null)
				result = caseAttachments(aConnect2Gamma);
			if (result == null)
				result = caseLinks(aConnect2Gamma);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.AGAMMA2_DB: {
			AGamma2DB aGamma2DB = (AGamma2DB) theEObject;
			T result = caseAGamma2DB(aGamma2DB);
			if (result == null)
				result = caseRPA(aGamma2DB);
			if (result == null)
				result = caseAttachments(aGamma2DB);
			if (result == null)
				result = caseLinks(aGamma2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.AGAMMA2_CONNECT: {
			AGamma2Connect aGamma2Connect = (AGamma2Connect) theEObject;
			T result = caseAGamma2Connect(aGamma2Connect);
			if (result == null)
				result = caseRPA(aGamma2Connect);
			if (result == null)
				result = caseAttachments(aGamma2Connect);
			if (result == null)
				result = caseLinks(aGamma2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ADB2_BETA: {
			ADB2Beta adb2Beta = (ADB2Beta) theEObject;
			T result = caseADB2Beta(adb2Beta);
			if (result == null)
				result = casePRA(adb2Beta);
			if (result == null)
				result = caseAttachments(adb2Beta);
			if (result == null)
				result = caseLinks(adb2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ABETA2_DB: {
			ABeta2DB aBeta2DB = (ABeta2DB) theEObject;
			T result = caseABeta2DB(aBeta2DB);
			if (result == null)
				result = caseRPA(aBeta2DB);
			if (result == null)
				result = caseAttachments(aBeta2DB);
			if (result == null)
				result = caseLinks(aBeta2DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ASEC2_BETA: {
			ASec2Beta aSec2Beta = (ASec2Beta) theEObject;
			T result = caseASec2Beta(aSec2Beta);
			if (result == null)
				result = casePRA(aSec2Beta);
			if (result == null)
				result = caseAttachments(aSec2Beta);
			if (result == null)
				result = caseLinks(aSec2Beta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ABETA2_SEC: {
			ABeta2Sec aBeta2Sec = (ABeta2Sec) theEObject;
			T result = caseABeta2Sec(aBeta2Sec);
			if (result == null)
				result = caseRPA(aBeta2Sec);
			if (result == null)
				result = caseAttachments(aBeta2Sec);
			if (result == null)
				result = caseLinks(aBeta2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ACONNECT2_ALPHA: {
			AConnect2Alpha aConnect2Alpha = (AConnect2Alpha) theEObject;
			T result = caseAConnect2Alpha(aConnect2Alpha);
			if (result == null)
				result = casePRA(aConnect2Alpha);
			if (result == null)
				result = caseAttachments(aConnect2Alpha);
			if (result == null)
				result = caseLinks(aConnect2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.AALPHA2_CONNECT: {
			AAlpha2Connect aAlpha2Connect = (AAlpha2Connect) theEObject;
			T result = caseAAlpha2Connect(aAlpha2Connect);
			if (result == null)
				result = caseRPA(aAlpha2Connect);
			if (result == null)
				result = caseAttachments(aAlpha2Connect);
			if (result == null)
				result = caseLinks(aAlpha2Connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.ASEC2_ALPHA: {
			ASec2Alpha aSec2Alpha = (ASec2Alpha) theEObject;
			T result = caseASec2Alpha(aSec2Alpha);
			if (result == null)
				result = casePRA(aSec2Alpha);
			if (result == null)
				result = caseAttachments(aSec2Alpha);
			if (result == null)
				result = caseLinks(aSec2Alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.AALPHA2_SEC: {
			AAlpha2Sec aAlpha2Sec = (AAlpha2Sec) theEObject;
			T result = caseAAlpha2Sec(aAlpha2Sec);
			if (result == null)
				result = caseRPA(aAlpha2Sec);
			if (result == null)
				result = caseAttachments(aAlpha2Sec);
			if (result == null)
				result = caseLinks(aAlpha2Sec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SYS2_CLIENT_BINDING: {
			Sys2ClientBinding sys2ClientBinding = (Sys2ClientBinding) theEObject;
			T result = caseSys2ClientBinding(sys2ClientBinding);
			if (result == null)
				result = casePB(sys2ClientBinding);
			if (result == null)
				result = caseBindings(sys2ClientBinding);
			if (result == null)
				result = caseLinks(sys2ClientBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SYSTEM_INTERFACE: {
			SystemInterface systemInterface = (SystemInterface) theEObject;
			T result = caseSystemInterface(systemInterface);
			if (result == null)
				result = caseInterfaceConfig(systemInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SYS2_CLIENT_SP: {
			Sys2ClientSP sys2ClientSP = (Sys2ClientSP) theEObject;
			T result = caseSys2ClientSP(sys2ClientSP);
			if (result == null)
				result = casePPConf(sys2ClientSP);
			if (result == null)
				result = casePortsConfig(sys2ClientSP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SYS2_CLIENT_CP: {
			Sys2ClientCP sys2ClientCP = (Sys2ClientCP) theEObject;
			T result = caseSys2ClientCP(sys2ClientCP);
			if (result == null)
				result = casePPComp(sys2ClientCP);
			if (result == null)
				result = casePortsComponent(sys2ClientCP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV2_SERV_BINDING: {
			Serv2ServBinding serv2ServBinding = (Serv2ServBinding) theEObject;
			T result = caseServ2ServBinding(serv2ServBinding);
			if (result == null)
				result = casePB(serv2ServBinding);
			if (result == null)
				result = caseBindings(serv2ServBinding);
			if (result == null)
				result = caseLinks(serv2ServBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERVER_CONFIG_INTERFACE: {
			ServerConfigInterface serverConfigInterface = (ServerConfigInterface) theEObject;
			T result = caseServerConfigInterface(serverConfigInterface);
			if (result == null)
				result = caseInterfaceConfig(serverConfigInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV_CONF2_SERV_COMP_CONF_P: {
			ServConf2ServCompConfP servConf2ServCompConfP = (ServConf2ServCompConfP) theEObject;
			T result = caseServConf2ServCompConfP(servConf2ServCompConfP);
			if (result == null)
				result = casePPConf(servConf2ServCompConfP);
			if (result == null)
				result = casePortsConfig(servConf2ServCompConfP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV_CONF2_SERV_COMP_COMP_P: {
			ServConf2ServCompCompP servConf2ServCompCompP = (ServConf2ServCompCompP) theEObject;
			T result = caseServConf2ServCompCompP(servConf2ServCompCompP);
			if (result == null)
				result = casePPComp(servConf2ServCompCompP);
			if (result == null)
				result = casePortsComponent(servConf2ServCompCompP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV_CONF2_CONNECT_SERV_P: {
			ServConf2ConnectServP servConf2ConnectServP = (ServConf2ConnectServP) theEObject;
			T result = caseServConf2ConnectServP(servConf2ConnectServP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV_CONF2_CONNECT_CONNECT_P: {
			ServConf2ConnectConnectP servConf2ConnectConnectP = (ServConf2ConnectConnectP) theEObject;
			T result = caseServConf2ConnectConnectP(servConf2ConnectConnectP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CCSPackage.SERV_CONF2_CONNECT_BINDING: {
			ServConf2ConnectBinding servConf2ConnectBinding = (ServConf2ConnectBinding) theEObject;
			T result = caseServConf2ConnectBinding(servConf2ConnectBinding);
			if (result == null)
				result = casePB(servConf2ConnectBinding);
			if (result == null)
				result = caseBindings(servConf2ConnectBinding);
			if (result == null)
				result = caseLinks(servConf2ConnectBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfig(Config object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elem Archi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elem Archi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemArchi(ElemArchi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraints(Constraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComponent(InterfaceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComponent(PortsComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesComponent(ServicesComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConfig(InterfaceConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinks(Links object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsConfig(PortsConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesConfig(ServicesConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachments(Attachments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindings(Bindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnector(InterfaceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PP Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PP Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPComp(PPComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RP Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RP Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPComp(RPComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSComp(PSComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSComp(RSComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PP Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PP Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPConf(PPConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RP Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RP Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPConf(RPConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PS Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PS Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSConf(PSConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSConf(RSConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePB(PB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRB(RB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRA(PRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPA(RPA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePR(PR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRR(RR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerComp(ServerComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(cCS.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfig(ServerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManager(cCS.SecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDB(DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentCR(AttachmentCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentRC(AttachmentRC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interfaces C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interfaces C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinterfacesC(interfacesC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port RC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port RC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRC(PortRC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port PC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port PC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPC(PortPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRPC(InterfaceRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRole RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRole RPC Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRoleRPCClient(RRoleRPCClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRole RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRole RPC Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRoleRPCClient(PRoleRPCClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaces Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaces Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacesConnect(InterfacesConnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaces Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaces Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacesServer(InterfacesServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port PS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port PS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPS(PortPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port RS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port RS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRS(PortRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRole RPC Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRole RPC Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRoleRPCServer(RRoleRPCServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRole RPC Sev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRole RPC Sev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRoleRPCSev(PRoleRPCSev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement SRPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement SRPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementSRPC(AttachementSRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachements RPC Serv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachements RPC Serv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementsRPCServ(AttachementsRPCServ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityInterface(SecurityInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBInterface(DBInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlpha(Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeta(Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamma(Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDB2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDB2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDB2Gamma(PDB2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSec2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSec2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSec2Alpha(PSec2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConnect2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConnect2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConnect2Alpha(PConnect2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PAlpha2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PAlpha2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePAlpha2Sec(PAlpha2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGamma2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGamma2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGamma2DB(PGamma2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PAlpha2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PAlpha2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePAlpha2Connect(PAlpha2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceAlpha(InterfaceAlpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBeta(InterfaceBeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceGamma(InterfaceGamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSec2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSec2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSec2Beta(PSec2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PBeta2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PBeta2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePBeta2Sec(PBeta2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBeta2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBeta2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBeta2DB(RBeta2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBeta2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBeta2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBeta2Sec(RBeta2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSec2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSec2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSec2Beta(RSec2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDB2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDB2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDB2Beta(RDB2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RConnect2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RConnect2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRConnect2Alpha(RConnect2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAlpha2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAlpha2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAlpha2Sec(RAlpha2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSec2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSec2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSec2Alpha(RSec2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAlpha2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAlpha2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAlpha2Connect(RAlpha2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConnect2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConnect2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConnect2Gamma(PConnect2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGamma2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGamma2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGamma2Connect(PGamma2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDB2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDB2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDB2Beta(PDB2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PBeta2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PBeta2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePBeta2DB(PBeta2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGamma2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGamma2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGamma2DB(RGamma2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDB2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDB2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDB2Gamma(RDB2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGamma2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGamma2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGamma2Connect(RGamma2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RConnect2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RConnect2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRConnect2Gamma(RConnect2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADB2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADB2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADB2Gamma(ADB2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AConnect2 Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AConnect2 Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAConnect2Gamma(AConnect2Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGamma2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGamma2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGamma2DB(AGamma2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGamma2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGamma2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGamma2Connect(AGamma2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADB2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADB2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADB2Beta(ADB2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABeta2 DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABeta2 DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABeta2DB(ABeta2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASec2 Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASec2 Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASec2Beta(ASec2Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABeta2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABeta2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABeta2Sec(ABeta2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AConnect2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AConnect2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAConnect2Alpha(AConnect2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAlpha2 Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAlpha2 Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAlpha2Connect(AAlpha2Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASec2 Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASec2 Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASec2Alpha(ASec2Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAlpha2 Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAlpha2 Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAlpha2Sec(AAlpha2Sec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys2 Client Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys2 Client Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSys2ClientBinding(Sys2ClientBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInterface(SystemInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys2 Client SP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys2 Client SP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSys2ClientSP(Sys2ClientSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys2 Client CP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys2 Client CP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSys2ClientCP(Sys2ClientCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv2 Serv Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv2 Serv Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServ2ServBinding(Serv2ServBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Config Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Config Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfigInterface(ServerConfigInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Conf2 Serv Comp Conf P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Conf2 Serv Comp Conf P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServConf2ServCompConfP(ServConf2ServCompConfP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Conf2 Serv Comp Comp P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Conf2 Serv Comp Comp P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServConf2ServCompCompP(ServConf2ServCompCompP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Serv P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Serv P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServConf2ConnectServP(ServConf2ConnectServP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Connect P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Connect P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServConf2ConnectConnectP(ServConf2ConnectConnectP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serv Conf2 Connect Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServConf2ConnectBinding(ServConf2ConnectBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CCSSwitch
