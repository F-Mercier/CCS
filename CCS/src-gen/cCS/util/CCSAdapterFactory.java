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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cCS.CCSPackage
 * @generated
 */
public class CCSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CCSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CCSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCSSwitch<Adapter> modelSwitch = new CCSSwitch<Adapter>() {
		@Override
		public Adapter caseConfig(Config object) {
			return createConfigAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseElemArchi(ElemArchi object) {
			return createElemArchiAdapter();
		}

		@Override
		public Adapter caseProperties(Properties object) {
			return createPropertiesAdapter();
		}

		@Override
		public Adapter caseConstraints(Constraints object) {
			return createConstraintsAdapter();
		}

		@Override
		public Adapter caseInterfaceComponent(InterfaceComponent object) {
			return createInterfaceComponentAdapter();
		}

		@Override
		public Adapter casePortsComponent(PortsComponent object) {
			return createPortsComponentAdapter();
		}

		@Override
		public Adapter caseServicesComponent(ServicesComponent object) {
			return createServicesComponentAdapter();
		}

		@Override
		public Adapter caseInterfaceConfig(InterfaceConfig object) {
			return createInterfaceConfigAdapter();
		}

		@Override
		public Adapter caseLinks(Links object) {
			return createLinksAdapter();
		}

		@Override
		public Adapter casePortsConfig(PortsConfig object) {
			return createPortsConfigAdapter();
		}

		@Override
		public Adapter caseServicesConfig(ServicesConfig object) {
			return createServicesConfigAdapter();
		}

		@Override
		public Adapter caseAttachments(Attachments object) {
			return createAttachmentsAdapter();
		}

		@Override
		public Adapter caseBindings(Bindings object) {
			return createBindingsAdapter();
		}

		@Override
		public Adapter caseGlue(Glue object) {
			return createGlueAdapter();
		}

		@Override
		public Adapter caseInterfaceConnector(InterfaceConnector object) {
			return createInterfaceConnectorAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter casePPComp(PPComp object) {
			return createPPCompAdapter();
		}

		@Override
		public Adapter caseRPComp(RPComp object) {
			return createRPCompAdapter();
		}

		@Override
		public Adapter casePSComp(PSComp object) {
			return createPSCompAdapter();
		}

		@Override
		public Adapter caseRSComp(RSComp object) {
			return createRSCompAdapter();
		}

		@Override
		public Adapter casePPConf(PPConf object) {
			return createPPConfAdapter();
		}

		@Override
		public Adapter caseRPConf(RPConf object) {
			return createRPConfAdapter();
		}

		@Override
		public Adapter casePSConf(PSConf object) {
			return createPSConfAdapter();
		}

		@Override
		public Adapter caseRSConf(RSConf object) {
			return createRSConfAdapter();
		}

		@Override
		public Adapter casePB(PB object) {
			return createPBAdapter();
		}

		@Override
		public Adapter caseRB(RB object) {
			return createRBAdapter();
		}

		@Override
		public Adapter casePRA(PRA object) {
			return createPRAAdapter();
		}

		@Override
		public Adapter caseRPA(RPA object) {
			return createRPAAdapter();
		}

		@Override
		public Adapter casePR(PR object) {
			return createPRAdapter();
		}

		@Override
		public Adapter caseRR(RR object) {
			return createRRAdapter();
		}

		@Override
		public Adapter caseServer(Server object) {
			return createServerAdapter();
		}

		@Override
		public Adapter caseServerComp(ServerComp object) {
			return createServerCompAdapter();
		}

		@Override
		public Adapter caseSystem(cCS.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseRPC(RPC object) {
			return createRPCAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseServerConfig(ServerConfig object) {
			return createServerConfigAdapter();
		}

		@Override
		public Adapter caseConnectionManager(ConnectionManager object) {
			return createConnectionManagerAdapter();
		}

		@Override
		public Adapter caseSecurityManager(cCS.SecurityManager object) {
			return createSecurityManagerAdapter();
		}

		@Override
		public Adapter caseDB(DB object) {
			return createDBAdapter();
		}

		@Override
		public Adapter caseAttachmentCR(AttachmentCR object) {
			return createAttachmentCRAdapter();
		}

		@Override
		public Adapter caseAttachmentRC(AttachmentRC object) {
			return createAttachmentRCAdapter();
		}

		@Override
		public Adapter caseinterfacesC(interfacesC object) {
			return createinterfacesCAdapter();
		}

		@Override
		public Adapter casePortRC(PortRC object) {
			return createPortRCAdapter();
		}

		@Override
		public Adapter casePortPC(PortPC object) {
			return createPortPCAdapter();
		}

		@Override
		public Adapter caseInterfaceRPC(InterfaceRPC object) {
			return createInterfaceRPCAdapter();
		}

		@Override
		public Adapter caseRRoleRPCClient(RRoleRPCClient object) {
			return createRRoleRPCClientAdapter();
		}

		@Override
		public Adapter casePRoleRPCClient(PRoleRPCClient object) {
			return createPRoleRPCClientAdapter();
		}

		@Override
		public Adapter caseInterfacesConnect(InterfacesConnect object) {
			return createInterfacesConnectAdapter();
		}

		@Override
		public Adapter caseInterfacesServer(InterfacesServer object) {
			return createInterfacesServerAdapter();
		}

		@Override
		public Adapter casePortPS(PortPS object) {
			return createPortPSAdapter();
		}

		@Override
		public Adapter casePortRS(PortRS object) {
			return createPortRSAdapter();
		}

		@Override
		public Adapter caseRRoleRPCServer(RRoleRPCServer object) {
			return createRRoleRPCServerAdapter();
		}

		@Override
		public Adapter casePRoleRPCSev(PRoleRPCSev object) {
			return createPRoleRPCSevAdapter();
		}

		@Override
		public Adapter caseAttachementSRPC(AttachementSRPC object) {
			return createAttachementSRPCAdapter();
		}

		@Override
		public Adapter caseAttachementsRPCServ(AttachementsRPCServ object) {
			return createAttachementsRPCServAdapter();
		}

		@Override
		public Adapter caseSecurityInterface(SecurityInterface object) {
			return createSecurityInterfaceAdapter();
		}

		@Override
		public Adapter caseDBInterface(DBInterface object) {
			return createDBInterfaceAdapter();
		}

		@Override
		public Adapter caseAlpha(Alpha object) {
			return createAlphaAdapter();
		}

		@Override
		public Adapter caseBeta(Beta object) {
			return createBetaAdapter();
		}

		@Override
		public Adapter caseGamma(Gamma object) {
			return createGammaAdapter();
		}

		@Override
		public Adapter casePDB2Gamma(PDB2Gamma object) {
			return createPDB2GammaAdapter();
		}

		@Override
		public Adapter casePSec2Alpha(PSec2Alpha object) {
			return createPSec2AlphaAdapter();
		}

		@Override
		public Adapter casePConnect2Alpha(PConnect2Alpha object) {
			return createPConnect2AlphaAdapter();
		}

		@Override
		public Adapter casePAlpha2Sec(PAlpha2Sec object) {
			return createPAlpha2SecAdapter();
		}

		@Override
		public Adapter casePGamma2DB(PGamma2DB object) {
			return createPGamma2DBAdapter();
		}

		@Override
		public Adapter casePAlpha2Connect(PAlpha2Connect object) {
			return createPAlpha2ConnectAdapter();
		}

		@Override
		public Adapter caseInterfaceAlpha(InterfaceAlpha object) {
			return createInterfaceAlphaAdapter();
		}

		@Override
		public Adapter caseInterfaceBeta(InterfaceBeta object) {
			return createInterfaceBetaAdapter();
		}

		@Override
		public Adapter caseInterfaceGamma(InterfaceGamma object) {
			return createInterfaceGammaAdapter();
		}

		@Override
		public Adapter casePSec2Beta(PSec2Beta object) {
			return createPSec2BetaAdapter();
		}

		@Override
		public Adapter casePBeta2Sec(PBeta2Sec object) {
			return createPBeta2SecAdapter();
		}

		@Override
		public Adapter caseRBeta2DB(RBeta2DB object) {
			return createRBeta2DBAdapter();
		}

		@Override
		public Adapter caseRBeta2Sec(RBeta2Sec object) {
			return createRBeta2SecAdapter();
		}

		@Override
		public Adapter caseRSec2Beta(RSec2Beta object) {
			return createRSec2BetaAdapter();
		}

		@Override
		public Adapter caseRDB2Beta(RDB2Beta object) {
			return createRDB2BetaAdapter();
		}

		@Override
		public Adapter caseRConnect2Alpha(RConnect2Alpha object) {
			return createRConnect2AlphaAdapter();
		}

		@Override
		public Adapter caseRAlpha2Sec(RAlpha2Sec object) {
			return createRAlpha2SecAdapter();
		}

		@Override
		public Adapter caseRSec2Alpha(RSec2Alpha object) {
			return createRSec2AlphaAdapter();
		}

		@Override
		public Adapter caseRAlpha2Connect(RAlpha2Connect object) {
			return createRAlpha2ConnectAdapter();
		}

		@Override
		public Adapter casePConnect2Gamma(PConnect2Gamma object) {
			return createPConnect2GammaAdapter();
		}

		@Override
		public Adapter casePGamma2Connect(PGamma2Connect object) {
			return createPGamma2ConnectAdapter();
		}

		@Override
		public Adapter casePDB2Beta(PDB2Beta object) {
			return createPDB2BetaAdapter();
		}

		@Override
		public Adapter casePBeta2DB(PBeta2DB object) {
			return createPBeta2DBAdapter();
		}

		@Override
		public Adapter caseRGamma2DB(RGamma2DB object) {
			return createRGamma2DBAdapter();
		}

		@Override
		public Adapter caseRDB2Gamma(RDB2Gamma object) {
			return createRDB2GammaAdapter();
		}

		@Override
		public Adapter caseRGamma2Connect(RGamma2Connect object) {
			return createRGamma2ConnectAdapter();
		}

		@Override
		public Adapter caseRConnect2Gamma(RConnect2Gamma object) {
			return createRConnect2GammaAdapter();
		}

		@Override
		public Adapter caseADB2Gamma(ADB2Gamma object) {
			return createADB2GammaAdapter();
		}

		@Override
		public Adapter caseAConnect2Gamma(AConnect2Gamma object) {
			return createAConnect2GammaAdapter();
		}

		@Override
		public Adapter caseAGamma2DB(AGamma2DB object) {
			return createAGamma2DBAdapter();
		}

		@Override
		public Adapter caseAGamma2Connect(AGamma2Connect object) {
			return createAGamma2ConnectAdapter();
		}

		@Override
		public Adapter caseADB2Beta(ADB2Beta object) {
			return createADB2BetaAdapter();
		}

		@Override
		public Adapter caseABeta2DB(ABeta2DB object) {
			return createABeta2DBAdapter();
		}

		@Override
		public Adapter caseASec2Beta(ASec2Beta object) {
			return createASec2BetaAdapter();
		}

		@Override
		public Adapter caseABeta2Sec(ABeta2Sec object) {
			return createABeta2SecAdapter();
		}

		@Override
		public Adapter caseAConnect2Alpha(AConnect2Alpha object) {
			return createAConnect2AlphaAdapter();
		}

		@Override
		public Adapter caseAAlpha2Connect(AAlpha2Connect object) {
			return createAAlpha2ConnectAdapter();
		}

		@Override
		public Adapter caseASec2Alpha(ASec2Alpha object) {
			return createASec2AlphaAdapter();
		}

		@Override
		public Adapter caseAAlpha2Sec(AAlpha2Sec object) {
			return createAAlpha2SecAdapter();
		}

		@Override
		public Adapter caseSys2ClientBinding(Sys2ClientBinding object) {
			return createSys2ClientBindingAdapter();
		}

		@Override
		public Adapter caseSystemInterface(SystemInterface object) {
			return createSystemInterfaceAdapter();
		}

		@Override
		public Adapter caseSys2ClientSP(Sys2ClientSP object) {
			return createSys2ClientSPAdapter();
		}

		@Override
		public Adapter caseSys2ClientCP(Sys2ClientCP object) {
			return createSys2ClientCPAdapter();
		}

		@Override
		public Adapter caseServ2ServBinding(Serv2ServBinding object) {
			return createServ2ServBindingAdapter();
		}

		@Override
		public Adapter caseServerConfigInterface(ServerConfigInterface object) {
			return createServerConfigInterfaceAdapter();
		}

		@Override
		public Adapter caseServConf2ServCompConfP(ServConf2ServCompConfP object) {
			return createServConf2ServCompConfPAdapter();
		}

		@Override
		public Adapter caseServConf2ServCompCompP(ServConf2ServCompCompP object) {
			return createServConf2ServCompCompPAdapter();
		}

		@Override
		public Adapter caseServConf2ConnectServP(ServConf2ConnectServP object) {
			return createServConf2ConnectServPAdapter();
		}

		@Override
		public Adapter caseServConf2ConnectConnectP(ServConf2ConnectConnectP object) {
			return createServConf2ConnectConnectPAdapter();
		}

		@Override
		public Adapter caseServConf2ConnectBinding(ServConf2ConnectBinding object) {
			return createServConf2ConnectBindingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Config
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ElemArchi <em>Elem Archi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ElemArchi
	 * @generated
	 */
	public Adapter createElemArchiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Constraints
	 * @generated
	 */
	public Adapter createConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceComponent
	 * @generated
	 */
	public Adapter createInterfaceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortsComponent <em>Ports Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortsComponent
	 * @generated
	 */
	public Adapter createPortsComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServicesComponent <em>Services Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServicesComponent
	 * @generated
	 */
	public Adapter createServicesComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceConfig <em>Interface Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceConfig
	 * @generated
	 */
	public Adapter createInterfaceConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Links
	 * @generated
	 */
	public Adapter createLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortsConfig <em>Ports Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortsConfig
	 * @generated
	 */
	public Adapter createPortsConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServicesConfig <em>Services Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServicesConfig
	 * @generated
	 */
	public Adapter createServicesConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Attachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Attachments
	 * @generated
	 */
	public Adapter createAttachmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Bindings
	 * @generated
	 */
	public Adapter createBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceConnector
	 * @generated
	 */
	public Adapter createInterfaceConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PPComp <em>PP Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PPComp
	 * @generated
	 */
	public Adapter createPPCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RPComp <em>RP Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RPComp
	 * @generated
	 */
	public Adapter createRPCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PSComp <em>PS Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PSComp
	 * @generated
	 */
	public Adapter createPSCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RSComp <em>RS Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RSComp
	 * @generated
	 */
	public Adapter createRSCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PPConf <em>PP Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PPConf
	 * @generated
	 */
	public Adapter createPPConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RPConf <em>RP Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RPConf
	 * @generated
	 */
	public Adapter createRPConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PSConf <em>PS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PSConf
	 * @generated
	 */
	public Adapter createPSConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RSConf <em>RS Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RSConf
	 * @generated
	 */
	public Adapter createRSConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PB <em>PB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PB
	 * @generated
	 */
	public Adapter createPBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RB <em>RB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RB
	 * @generated
	 */
	public Adapter createRBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PRA <em>PRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PRA
	 * @generated
	 */
	public Adapter createPRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RPA <em>RPA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RPA
	 * @generated
	 */
	public Adapter createRPAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PR <em>PR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PR
	 * @generated
	 */
	public Adapter createPRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RR <em>RR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RR
	 * @generated
	 */
	public Adapter createRRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServerComp <em>Server Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServerComp
	 * @generated
	 */
	public Adapter createServerCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServerConfig
	 * @generated
	 */
	public Adapter createServerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ConnectionManager
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.SecurityManager
	 * @generated
	 */
	public Adapter createSecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.DB <em>DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.DB
	 * @generated
	 */
	public Adapter createDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AttachmentCR <em>Attachment CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AttachmentCR
	 * @generated
	 */
	public Adapter createAttachmentCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AttachmentRC <em>Attachment RC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AttachmentRC
	 * @generated
	 */
	public Adapter createAttachmentRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.interfacesC <em>interfaces C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.interfacesC
	 * @generated
	 */
	public Adapter createinterfacesCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortRC <em>Port RC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortRC
	 * @generated
	 */
	public Adapter createPortRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortPC <em>Port PC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortPC
	 * @generated
	 */
	public Adapter createPortPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceRPC <em>Interface RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceRPC
	 * @generated
	 */
	public Adapter createInterfaceRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RRoleRPCClient <em>RRole RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RRoleRPCClient
	 * @generated
	 */
	public Adapter createRRoleRPCClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PRoleRPCClient <em>PRole RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PRoleRPCClient
	 * @generated
	 */
	public Adapter createPRoleRPCClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfacesConnect <em>Interfaces Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfacesConnect
	 * @generated
	 */
	public Adapter createInterfacesConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfacesServer <em>Interfaces Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfacesServer
	 * @generated
	 */
	public Adapter createInterfacesServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortPS <em>Port PS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortPS
	 * @generated
	 */
	public Adapter createPortPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PortRS <em>Port RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PortRS
	 * @generated
	 */
	public Adapter createPortRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RRoleRPCServer <em>RRole RPC Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RRoleRPCServer
	 * @generated
	 */
	public Adapter createRRoleRPCServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PRoleRPCSev <em>PRole RPC Sev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PRoleRPCSev
	 * @generated
	 */
	public Adapter createPRoleRPCSevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AttachementSRPC <em>Attachement SRPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AttachementSRPC
	 * @generated
	 */
	public Adapter createAttachementSRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AttachementsRPCServ <em>Attachements RPC Serv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AttachementsRPCServ
	 * @generated
	 */
	public Adapter createAttachementsRPCServAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.SecurityInterface <em>Security Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.SecurityInterface
	 * @generated
	 */
	public Adapter createSecurityInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.DBInterface <em>DB Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.DBInterface
	 * @generated
	 */
	public Adapter createDBInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Alpha
	 * @generated
	 */
	public Adapter createAlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Beta
	 * @generated
	 */
	public Adapter createBetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Gamma
	 * @generated
	 */
	public Adapter createGammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PDB2Gamma <em>PDB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PDB2Gamma
	 * @generated
	 */
	public Adapter createPDB2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PSec2Alpha <em>PSec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PSec2Alpha
	 * @generated
	 */
	public Adapter createPSec2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PConnect2Alpha <em>PConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PConnect2Alpha
	 * @generated
	 */
	public Adapter createPConnect2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PAlpha2Sec <em>PAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PAlpha2Sec
	 * @generated
	 */
	public Adapter createPAlpha2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PGamma2DB <em>PGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PGamma2DB
	 * @generated
	 */
	public Adapter createPGamma2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PAlpha2Connect <em>PAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PAlpha2Connect
	 * @generated
	 */
	public Adapter createPAlpha2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceAlpha <em>Interface Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceAlpha
	 * @generated
	 */
	public Adapter createInterfaceAlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceBeta <em>Interface Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceBeta
	 * @generated
	 */
	public Adapter createInterfaceBetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.InterfaceGamma <em>Interface Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.InterfaceGamma
	 * @generated
	 */
	public Adapter createInterfaceGammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PSec2Beta <em>PSec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PSec2Beta
	 * @generated
	 */
	public Adapter createPSec2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PBeta2Sec <em>PBeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PBeta2Sec
	 * @generated
	 */
	public Adapter createPBeta2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RBeta2DB <em>RBeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RBeta2DB
	 * @generated
	 */
	public Adapter createRBeta2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RBeta2Sec <em>RBeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RBeta2Sec
	 * @generated
	 */
	public Adapter createRBeta2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RSec2Beta <em>RSec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RSec2Beta
	 * @generated
	 */
	public Adapter createRSec2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RDB2Beta <em>RDB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RDB2Beta
	 * @generated
	 */
	public Adapter createRDB2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RConnect2Alpha <em>RConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RConnect2Alpha
	 * @generated
	 */
	public Adapter createRConnect2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RAlpha2Sec <em>RAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RAlpha2Sec
	 * @generated
	 */
	public Adapter createRAlpha2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RSec2Alpha <em>RSec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RSec2Alpha
	 * @generated
	 */
	public Adapter createRSec2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RAlpha2Connect <em>RAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RAlpha2Connect
	 * @generated
	 */
	public Adapter createRAlpha2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PConnect2Gamma <em>PConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PConnect2Gamma
	 * @generated
	 */
	public Adapter createPConnect2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PGamma2Connect <em>PGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PGamma2Connect
	 * @generated
	 */
	public Adapter createPGamma2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PDB2Beta <em>PDB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PDB2Beta
	 * @generated
	 */
	public Adapter createPDB2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.PBeta2DB <em>PBeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.PBeta2DB
	 * @generated
	 */
	public Adapter createPBeta2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RGamma2DB <em>RGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RGamma2DB
	 * @generated
	 */
	public Adapter createRGamma2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RDB2Gamma <em>RDB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RDB2Gamma
	 * @generated
	 */
	public Adapter createRDB2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RGamma2Connect <em>RGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RGamma2Connect
	 * @generated
	 */
	public Adapter createRGamma2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.RConnect2Gamma <em>RConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.RConnect2Gamma
	 * @generated
	 */
	public Adapter createRConnect2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ADB2Gamma <em>ADB2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ADB2Gamma
	 * @generated
	 */
	public Adapter createADB2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AConnect2Gamma <em>AConnect2 Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AConnect2Gamma
	 * @generated
	 */
	public Adapter createAConnect2GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AGamma2DB <em>AGamma2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AGamma2DB
	 * @generated
	 */
	public Adapter createAGamma2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AGamma2Connect <em>AGamma2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AGamma2Connect
	 * @generated
	 */
	public Adapter createAGamma2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ADB2Beta <em>ADB2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ADB2Beta
	 * @generated
	 */
	public Adapter createADB2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ABeta2DB <em>ABeta2 DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ABeta2DB
	 * @generated
	 */
	public Adapter createABeta2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ASec2Beta <em>ASec2 Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ASec2Beta
	 * @generated
	 */
	public Adapter createASec2BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ABeta2Sec <em>ABeta2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ABeta2Sec
	 * @generated
	 */
	public Adapter createABeta2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AConnect2Alpha <em>AConnect2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AConnect2Alpha
	 * @generated
	 */
	public Adapter createAConnect2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AAlpha2Connect <em>AAlpha2 Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AAlpha2Connect
	 * @generated
	 */
	public Adapter createAAlpha2ConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ASec2Alpha <em>ASec2 Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ASec2Alpha
	 * @generated
	 */
	public Adapter createASec2AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.AAlpha2Sec <em>AAlpha2 Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.AAlpha2Sec
	 * @generated
	 */
	public Adapter createAAlpha2SecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Sys2ClientBinding <em>Sys2 Client Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Sys2ClientBinding
	 * @generated
	 */
	public Adapter createSys2ClientBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.SystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.SystemInterface
	 * @generated
	 */
	public Adapter createSystemInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Sys2ClientSP <em>Sys2 Client SP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Sys2ClientSP
	 * @generated
	 */
	public Adapter createSys2ClientSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Sys2ClientCP <em>Sys2 Client CP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Sys2ClientCP
	 * @generated
	 */
	public Adapter createSys2ClientCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Serv2ServBinding <em>Serv2 Serv Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Serv2ServBinding
	 * @generated
	 */
	public Adapter createServ2ServBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServerConfigInterface <em>Server Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServerConfigInterface
	 * @generated
	 */
	public Adapter createServerConfigInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServConf2ServCompConfP <em>Serv Conf2 Serv Comp Conf P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServConf2ServCompConfP
	 * @generated
	 */
	public Adapter createServConf2ServCompConfPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServConf2ServCompCompP <em>Serv Conf2 Serv Comp Comp P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServConf2ServCompCompP
	 * @generated
	 */
	public Adapter createServConf2ServCompCompPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServConf2ConnectServP <em>Serv Conf2 Connect Serv P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServConf2ConnectServP
	 * @generated
	 */
	public Adapter createServConf2ConnectServPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServConf2ConnectConnectP <em>Serv Conf2 Connect Connect P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServConf2ConnectConnectP
	 * @generated
	 */
	public Adapter createServConf2ConnectConnectPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ServConf2ConnectBinding <em>Serv Conf2 Connect Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ServConf2ConnectBinding
	 * @generated
	 */
	public Adapter createServConf2ConnectBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CCSAdapterFactory
