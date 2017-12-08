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
import cCS.Attachments;
import cCS.Beta;
import cCS.Bindings;
import cCS.CCSFactory;
import cCS.CCSPackage;
import cCS.Client;
import cCS.Component;
import cCS.Config;
import cCS.ConnectionManager;
import cCS.Connector;
import cCS.Constraints;
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
import cCS.RBeta2DB;
import cCS.RBeta2Sec;
import cCS.RConnect2Alpha;
import cCS.RConnect2Gamma;
import cCS.RDB2Beta;
import cCS.RDB2Gamma;
import cCS.RGamma2Connect;
import cCS.RGamma2DB;
import cCS.RPComp;
import cCS.RPConf;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCSPackageImpl extends EPackageImpl implements CCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elemArchiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass praEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentRCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rRoleRPCClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRoleRPCClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rRoleRPCServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRoleRPCSevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementSRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementsRPCServEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdb2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pSec2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConnect2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAlpha2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pGamma2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAlpha2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceAlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceBetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceGammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pSec2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBeta2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rBeta2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rBeta2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rSec2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdb2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rConnect2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rAlpha2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rSec2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rAlpha2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConnect2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pGamma2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdb2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBeta2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rGamma2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdb2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rGamma2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rConnect2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adb2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aConnect2GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aGamma2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aGamma2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adb2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBeta2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSec2BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBeta2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aConnect2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAlpha2ConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSec2AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAlpha2SecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sys2ClientBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sys2ClientSPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sys2ClientCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serv2ServBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConfigInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servConf2ServCompConfPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servConf2ServCompCompPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servConf2ConnectServPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servConf2ConnectConnectPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servConf2ConnectBindingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cCS.CCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CCSPackageImpl() {
		super(eNS_URI, CCSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CCSPackage init() {
		if (isInited)
			return (CCSPackage) EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI);

		// Obtain or create and register package
		CCSPackageImpl theCCSPackage = (CCSPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CCSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CCSPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCCSPackage.createPackageContents();

		// Initialize created meta-data
		theCCSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCCSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CCSPackage.eNS_URI, theCCSPackage);
		return theCCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Component() {
		return (EReference) configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Connector() {
		return (EReference) configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Interface() {
		return (EReference) configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Links() {
		return (EReference) configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Neweclass16() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Neweclass17() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Properties() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Constraints() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Interface() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemArchi() {
		return elemArchiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraints() {
		return constraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceComponent() {
		return interfaceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComponent_Ports() {
		return (EReference) interfaceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComponent_Services() {
		return (EReference) interfaceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortsComponent() {
		return portsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicesComponent() {
		return servicesComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConfig() {
		return interfaceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConfig_Ports() {
		return (EReference) interfaceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConfig_Services() {
		return (EReference) interfaceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinks() {
		return linksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortsConfig() {
		return portsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicesConfig() {
		return servicesConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachments() {
		return attachmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindings() {
		return bindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Neweclass18() {
		return (EReference) glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnector() {
		return interfaceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Role() {
		return (EReference) interfaceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPComp() {
		return ppCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPComp_Pb() {
		return (EReference) ppCompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPComp_Pra() {
		return (EReference) ppCompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPComp() {
		return rpCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPComp_Rb() {
		return (EReference) rpCompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPComp_Rpa() {
		return (EReference) rpCompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSComp() {
		return psCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSComp() {
		return rsCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPConf() {
		return ppConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPConf_Pb() {
		return (EReference) ppConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPConf() {
		return rpConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPConf_Rb() {
		return (EReference) rpConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSConf() {
		return psConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSConf() {
		return rsConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPB() {
		return pbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPB_Pp() {
		return (EReference) pbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPB_Pp2() {
		return (EReference) pbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRB() {
		return rbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRB_Rp() {
		return (EReference) rbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRB_Rp2() {
		return (EReference) rbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRA() {
		return praEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRA_Pp() {
		return (EReference) praEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRA_Rr() {
		return (EReference) praEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPA() {
		return rpaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPA_Rp() {
		return (EReference) rpaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPA_Pr() {
		return (EReference) rpaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPR() {
		return prEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPR_Rpa() {
		return (EReference) prEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRR() {
		return rrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRR_Pra() {
		return (EReference) rrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerComp() {
		return serverCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerComp_Serverconfig() {
		return (EReference) serverCompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerComp_Interfacesserver() {
		return (EReference) serverCompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Server() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Rpc() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Client() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Sys2clientbinding() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Systeminterface() {
		return (EReference) systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Interfacerpc() {
		return (EReference) rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Interfacesc() {
		return (EReference) clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerConfig() {
		return serverConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Connectionmanager() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Securitymanager() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Db() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Connectdb() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Secdb() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Connectsec() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Serv2servbinding() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfig_Serverconfiginterface() {
		return (EReference) serverConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Interfacesconnect() {
		return (EReference) connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManager() {
		return securityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Securityinterface() {
		return (EReference) securityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDB() {
		return dbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDB_Dbinterface() {
		return (EReference) dbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentCR() {
		return attachmentCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentRC() {
		return attachmentRCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinterfacesC() {
		return interfacesCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfacesC_Portrc() {
		return (EReference) interfacesCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfacesC_Portpc() {
		return (EReference) interfacesCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfacesC_Sys2clientcp() {
		return (EReference) interfacesCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRC() {
		return portRCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortRC_Attachmentrc() {
		return (EReference) portRCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPC() {
		return portPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPC_Attachmentcr() {
		return (EReference) portPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRPC() {
		return interfaceRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRPC_Prolerpc2() {
		return (EReference) interfaceRPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRPC_Rrolerpc() {
		return (EReference) interfaceRPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRPC_Rrolerpc2() {
		return (EReference) interfaceRPCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRPC_Prolerpc() {
		return (EReference) interfaceRPCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRRoleRPCClient() {
		return rRoleRPCClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRRoleRPCClient_Attachmentcr() {
		return (EReference) rRoleRPCClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRoleRPCClient() {
		return pRoleRPCClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRoleRPCClient_Attachmentrc() {
		return (EReference) pRoleRPCClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacesConnect() {
		return interfacesConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesConnect_Palpha2connect() {
		return (EReference) interfacesConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesConnect_Pconnect2alpha() {
		return (EReference) interfacesConnectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesConnect_Pconnect2gamma() {
		return (EReference) interfacesConnectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesConnect_Pgamma2connect() {
		return (EReference) interfacesConnectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesConnect_Servconf2connectconnectp() {
		return (EReference) interfacesConnectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacesServer() {
		return interfacesServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesServer_Portps() {
		return (EReference) interfacesServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesServer_Portrs() {
		return (EReference) interfacesServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesServer_Servconf2servcompcompp() {
		return (EReference) interfacesServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPS() {
		return portPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPS_Attachementsrpc() {
		return (EReference) portPSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRS() {
		return portRSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortRS_Attachementsrpcserv() {
		return (EReference) portRSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRRoleRPCServer() {
		return rRoleRPCServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRRoleRPCServer_Attachementsrpc() {
		return (EReference) rRoleRPCServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRoleRPCSev() {
		return pRoleRPCSevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRoleRPCSev_Attachementsrpcserv() {
		return (EReference) pRoleRPCSevEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachementSRPC() {
		return attachementSRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachementsRPCServ() {
		return attachementsRPCServEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityInterface() {
		return securityInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityInterface_Psec2beta() {
		return (EReference) securityInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityInterface_Pbeta2sec() {
		return (EReference) securityInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityInterface_Palpha2sec() {
		return (EReference) securityInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityInterface_Psec2alpha() {
		return (EReference) securityInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBInterface() {
		return dbInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBInterface_Pdb2gamma() {
		return (EReference) dbInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBInterface_Pgamma2db() {
		return (EReference) dbInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBInterface_Pdb2beta() {
		return (EReference) dbInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBInterface_Pbeta2db() {
		return (EReference) dbInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlpha() {
		return alphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlpha_Interfacealpha() {
		return (EReference) alphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeta() {
		return betaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeta_Interfacebeta() {
		return (EReference) betaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamma() {
		return gammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamma_Interfacegamma() {
		return (EReference) gammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDB2Gamma() {
		return pdb2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDB2Gamma_Adb2gamma() {
		return (EReference) pdb2GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSec2Alpha() {
		return pSec2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSec2Alpha_Asec2alpha() {
		return (EReference) pSec2AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConnect2Alpha() {
		return pConnect2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConnect2Alpha_Aconnect2alpha() {
		return (EReference) pConnect2AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAlpha2Sec() {
		return pAlpha2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAlpha2Sec_Aalpha2sec() {
		return (EReference) pAlpha2SecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGamma2DB() {
		return pGamma2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPGamma2DB_Agamma2db() {
		return (EReference) pGamma2DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAlpha2Connect() {
		return pAlpha2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAlpha2Connect_Aalpha2connect() {
		return (EReference) pAlpha2ConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceAlpha() {
		return interfaceAlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAlpha_Rsec2alpha() {
		return (EReference) interfaceAlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAlpha_Ralpha2sec() {
		return (EReference) interfaceAlphaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAlpha_Rconnect2alpha() {
		return (EReference) interfaceAlphaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAlpha_Ralpha2connect() {
		return (EReference) interfaceAlphaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceBeta() {
		return interfaceBetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBeta_Rbeta2sec() {
		return (EReference) interfaceBetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBeta_Rsec2beta() {
		return (EReference) interfaceBetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBeta_Rbeta2db() {
		return (EReference) interfaceBetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceBeta_Rdb2beta() {
		return (EReference) interfaceBetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceGamma() {
		return interfaceGammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceGamma_Rconnect2gamma() {
		return (EReference) interfaceGammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceGamma_Rgamma2connect() {
		return (EReference) interfaceGammaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceGamma_Rdb2gamma() {
		return (EReference) interfaceGammaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceGamma_Rgamma2db() {
		return (EReference) interfaceGammaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSec2Beta() {
		return pSec2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSec2Beta_Asec2beta() {
		return (EReference) pSec2BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBeta2Sec() {
		return pBeta2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBeta2Sec_Abeta2sec() {
		return (EReference) pBeta2SecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBeta2DB() {
		return rBeta2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBeta2DB_Abeta2db() {
		return (EReference) rBeta2DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBeta2Sec() {
		return rBeta2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBeta2Sec_Abeta2sec() {
		return (EReference) rBeta2SecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSec2Beta() {
		return rSec2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSec2Beta_Asec2beta() {
		return (EReference) rSec2BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDB2Beta() {
		return rdb2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDB2Beta_Adb2beta() {
		return (EReference) rdb2BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRConnect2Alpha() {
		return rConnect2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRConnect2Alpha_Aconnect2alpha() {
		return (EReference) rConnect2AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAlpha2Sec() {
		return rAlpha2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRAlpha2Sec_Aalpha2sec() {
		return (EReference) rAlpha2SecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSec2Alpha() {
		return rSec2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSec2Alpha_Asec2alpha() {
		return (EReference) rSec2AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAlpha2Connect() {
		return rAlpha2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRAlpha2Connect_Aalpha2connect() {
		return (EReference) rAlpha2ConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConnect2Gamma() {
		return pConnect2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConnect2Gamma_Aconnect2gamma() {
		return (EReference) pConnect2GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGamma2Connect() {
		return pGamma2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPGamma2Connect_Agamma2connect() {
		return (EReference) pGamma2ConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDB2Beta() {
		return pdb2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDB2Beta_Adb2beta() {
		return (EReference) pdb2BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBeta2DB() {
		return pBeta2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBeta2DB_Abeta2db() {
		return (EReference) pBeta2DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGamma2DB() {
		return rGamma2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRGamma2DB_Agamma2db() {
		return (EReference) rGamma2DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDB2Gamma() {
		return rdb2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDB2Gamma_Adb2gamma() {
		return (EReference) rdb2GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGamma2Connect() {
		return rGamma2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRGamma2Connect_Agamma2connect() {
		return (EReference) rGamma2ConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRConnect2Gamma() {
		return rConnect2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRConnect2Gamma_Aconnect2gamma() {
		return (EReference) rConnect2GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADB2Gamma() {
		return adb2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAConnect2Gamma() {
		return aConnect2GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGamma2DB() {
		return aGamma2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGamma2Connect() {
		return aGamma2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADB2Beta() {
		return adb2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABeta2DB() {
		return aBeta2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASec2Beta() {
		return aSec2BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABeta2Sec() {
		return aBeta2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAConnect2Alpha() {
		return aConnect2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAlpha2Connect() {
		return aAlpha2ConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASec2Alpha() {
		return aSec2AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAlpha2Sec() {
		return aAlpha2SecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSys2ClientBinding() {
		return sys2ClientBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSys2ClientBinding_Sys2clientsp() {
		return (EReference) sys2ClientBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSys2ClientBinding_Sys2clientcp() {
		return (EReference) sys2ClientBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInterface() {
		return systemInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInterface_Sys2clientsp() {
		return (EReference) systemInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSys2ClientSP() {
		return sys2ClientSPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSys2ClientSP_Sys2clientbinding() {
		return (EReference) sys2ClientSPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSys2ClientCP() {
		return sys2ClientCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSys2ClientCP_Sys2clientbinding() {
		return (EReference) sys2ClientCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServ2ServBinding() {
		return serv2ServBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServ2ServBinding_Servconf2servcompconfp() {
		return (EReference) serv2ServBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServ2ServBinding_Servconf2servcompcompp() {
		return (EReference) serv2ServBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerConfigInterface() {
		return serverConfigInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfigInterface_Servconf2servcompconfp() {
		return (EReference) serverConfigInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfigInterface_Servconf2connectservp() {
		return (EReference) serverConfigInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServConf2ServCompConfP() {
		return servConf2ServCompConfPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ServCompConfP_Serv2servbinding() {
		return (EReference) servConf2ServCompConfPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServConf2ServCompCompP() {
		return servConf2ServCompCompPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ServCompCompP_Serv2servbinding() {
		return (EReference) servConf2ServCompCompPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServConf2ConnectServP() {
		return servConf2ConnectServPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ConnectServP_Servconf2connectbinding() {
		return (EReference) servConf2ConnectServPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServConf2ConnectConnectP() {
		return servConf2ConnectConnectPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ConnectConnectP_Servconf2connectbinding() {
		return (EReference) servConf2ConnectConnectPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServConf2ConnectBinding() {
		return servConf2ConnectBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ConnectBinding_Servconf2connectservp() {
		return (EReference) servConf2ConnectBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServConf2ConnectBinding_Servconf2connectconnectp() {
		return (EReference) servConf2ConnectBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSFactory getCCSFactory() {
		return (CCSFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		configEClass = createEClass(CONFIG);
		createEReference(configEClass, CONFIG__COMPONENT);
		createEReference(configEClass, CONFIG__CONNECTOR);
		createEReference(configEClass, CONFIG__INTERFACE);
		createEReference(configEClass, CONFIG__LINKS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__NEWECLASS16);
		createEReference(connectorEClass, CONNECTOR__NEWECLASS17);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROPERTIES);
		createEReference(componentEClass, COMPONENT__CONSTRAINTS);
		createEReference(componentEClass, COMPONENT__INTERFACE);

		elemArchiEClass = createEClass(ELEM_ARCHI);

		propertiesEClass = createEClass(PROPERTIES);

		constraintsEClass = createEClass(CONSTRAINTS);

		interfaceComponentEClass = createEClass(INTERFACE_COMPONENT);
		createEReference(interfaceComponentEClass, INTERFACE_COMPONENT__PORTS);
		createEReference(interfaceComponentEClass, INTERFACE_COMPONENT__SERVICES);

		portsComponentEClass = createEClass(PORTS_COMPONENT);

		servicesComponentEClass = createEClass(SERVICES_COMPONENT);

		interfaceConfigEClass = createEClass(INTERFACE_CONFIG);
		createEReference(interfaceConfigEClass, INTERFACE_CONFIG__PORTS);
		createEReference(interfaceConfigEClass, INTERFACE_CONFIG__SERVICES);

		linksEClass = createEClass(LINKS);

		portsConfigEClass = createEClass(PORTS_CONFIG);

		servicesConfigEClass = createEClass(SERVICES_CONFIG);

		attachmentsEClass = createEClass(ATTACHMENTS);

		bindingsEClass = createEClass(BINDINGS);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__NEWECLASS18);

		interfaceConnectorEClass = createEClass(INTERFACE_CONNECTOR);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__ROLE);

		roleEClass = createEClass(ROLE);

		ppCompEClass = createEClass(PP_COMP);
		createEReference(ppCompEClass, PP_COMP__PB);
		createEReference(ppCompEClass, PP_COMP__PRA);

		rpCompEClass = createEClass(RP_COMP);
		createEReference(rpCompEClass, RP_COMP__RB);
		createEReference(rpCompEClass, RP_COMP__RPA);

		psCompEClass = createEClass(PS_COMP);

		rsCompEClass = createEClass(RS_COMP);

		ppConfEClass = createEClass(PP_CONF);
		createEReference(ppConfEClass, PP_CONF__PB);

		rpConfEClass = createEClass(RP_CONF);
		createEReference(rpConfEClass, RP_CONF__RB);

		psConfEClass = createEClass(PS_CONF);

		rsConfEClass = createEClass(RS_CONF);

		pbEClass = createEClass(PB);
		createEReference(pbEClass, PB__PP);
		createEReference(pbEClass, PB__PP2);

		rbEClass = createEClass(RB);
		createEReference(rbEClass, RB__RP);
		createEReference(rbEClass, RB__RP2);

		praEClass = createEClass(PRA);
		createEReference(praEClass, PRA__PP);
		createEReference(praEClass, PRA__RR);

		rpaEClass = createEClass(RPA);
		createEReference(rpaEClass, RPA__RP);
		createEReference(rpaEClass, RPA__PR);

		prEClass = createEClass(PR);
		createEReference(prEClass, PR__RPA);

		rrEClass = createEClass(RR);
		createEReference(rrEClass, RR__PRA);

		serverEClass = createEClass(SERVER);

		serverCompEClass = createEClass(SERVER_COMP);
		createEReference(serverCompEClass, SERVER_COMP__SERVERCONFIG);
		createEReference(serverCompEClass, SERVER_COMP__INTERFACESSERVER);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__SERVER);
		createEReference(systemEClass, SYSTEM__RPC);
		createEReference(systemEClass, SYSTEM__CLIENT);
		createEReference(systemEClass, SYSTEM__SYS2CLIENTBINDING);
		createEReference(systemEClass, SYSTEM__SYSTEMINTERFACE);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__INTERFACERPC);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__INTERFACESC);

		serverConfigEClass = createEClass(SERVER_CONFIG);
		createEReference(serverConfigEClass, SERVER_CONFIG__CONNECTIONMANAGER);
		createEReference(serverConfigEClass, SERVER_CONFIG__SECURITYMANAGER);
		createEReference(serverConfigEClass, SERVER_CONFIG__DB);
		createEReference(serverConfigEClass, SERVER_CONFIG__CONNECTDB);
		createEReference(serverConfigEClass, SERVER_CONFIG__SECDB);
		createEReference(serverConfigEClass, SERVER_CONFIG__CONNECTSEC);
		createEReference(serverConfigEClass, SERVER_CONFIG__SERV2SERVBINDING);
		createEReference(serverConfigEClass, SERVER_CONFIG__SERVERCONFIGINTERFACE);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__INTERFACESCONNECT);

		securityManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(securityManagerEClass, SECURITY_MANAGER__SECURITYINTERFACE);

		dbEClass = createEClass(DB);
		createEReference(dbEClass, DB__DBINTERFACE);

		attachmentCREClass = createEClass(ATTACHMENT_CR);

		attachmentRCEClass = createEClass(ATTACHMENT_RC);

		interfacesCEClass = createEClass(INTERFACES_C);
		createEReference(interfacesCEClass, INTERFACES_C__PORTRC);
		createEReference(interfacesCEClass, INTERFACES_C__PORTPC);
		createEReference(interfacesCEClass, INTERFACES_C__SYS2CLIENTCP);

		portRCEClass = createEClass(PORT_RC);
		createEReference(portRCEClass, PORT_RC__ATTACHMENTRC);

		portPCEClass = createEClass(PORT_PC);
		createEReference(portPCEClass, PORT_PC__ATTACHMENTCR);

		interfaceRPCEClass = createEClass(INTERFACE_RPC);
		createEReference(interfaceRPCEClass, INTERFACE_RPC__PROLERPC2);
		createEReference(interfaceRPCEClass, INTERFACE_RPC__RROLERPC);
		createEReference(interfaceRPCEClass, INTERFACE_RPC__RROLERPC2);
		createEReference(interfaceRPCEClass, INTERFACE_RPC__PROLERPC);

		rRoleRPCClientEClass = createEClass(RROLE_RPC_CLIENT);
		createEReference(rRoleRPCClientEClass, RROLE_RPC_CLIENT__ATTACHMENTCR);

		pRoleRPCClientEClass = createEClass(PROLE_RPC_CLIENT);
		createEReference(pRoleRPCClientEClass, PROLE_RPC_CLIENT__ATTACHMENTRC);

		interfacesConnectEClass = createEClass(INTERFACES_CONNECT);
		createEReference(interfacesConnectEClass, INTERFACES_CONNECT__PALPHA2CONNECT);
		createEReference(interfacesConnectEClass, INTERFACES_CONNECT__PCONNECT2ALPHA);
		createEReference(interfacesConnectEClass, INTERFACES_CONNECT__PCONNECT2GAMMA);
		createEReference(interfacesConnectEClass, INTERFACES_CONNECT__PGAMMA2CONNECT);
		createEReference(interfacesConnectEClass, INTERFACES_CONNECT__SERVCONF2CONNECTCONNECTP);

		interfacesServerEClass = createEClass(INTERFACES_SERVER);
		createEReference(interfacesServerEClass, INTERFACES_SERVER__PORTPS);
		createEReference(interfacesServerEClass, INTERFACES_SERVER__PORTRS);
		createEReference(interfacesServerEClass, INTERFACES_SERVER__SERVCONF2SERVCOMPCOMPP);

		portPSEClass = createEClass(PORT_PS);
		createEReference(portPSEClass, PORT_PS__ATTACHEMENTSRPC);

		portRSEClass = createEClass(PORT_RS);
		createEReference(portRSEClass, PORT_RS__ATTACHEMENTSRPCSERV);

		rRoleRPCServerEClass = createEClass(RROLE_RPC_SERVER);
		createEReference(rRoleRPCServerEClass, RROLE_RPC_SERVER__ATTACHEMENTSRPC);

		pRoleRPCSevEClass = createEClass(PROLE_RPC_SEV);
		createEReference(pRoleRPCSevEClass, PROLE_RPC_SEV__ATTACHEMENTSRPCSERV);

		attachementSRPCEClass = createEClass(ATTACHEMENT_SRPC);

		attachementsRPCServEClass = createEClass(ATTACHEMENTS_RPC_SERV);

		securityInterfaceEClass = createEClass(SECURITY_INTERFACE);
		createEReference(securityInterfaceEClass, SECURITY_INTERFACE__PSEC2BETA);
		createEReference(securityInterfaceEClass, SECURITY_INTERFACE__PBETA2SEC);
		createEReference(securityInterfaceEClass, SECURITY_INTERFACE__PALPHA2SEC);
		createEReference(securityInterfaceEClass, SECURITY_INTERFACE__PSEC2ALPHA);

		dbInterfaceEClass = createEClass(DB_INTERFACE);
		createEReference(dbInterfaceEClass, DB_INTERFACE__PDB2GAMMA);
		createEReference(dbInterfaceEClass, DB_INTERFACE__PGAMMA2DB);
		createEReference(dbInterfaceEClass, DB_INTERFACE__PDB2BETA);
		createEReference(dbInterfaceEClass, DB_INTERFACE__PBETA2DB);

		alphaEClass = createEClass(ALPHA);
		createEReference(alphaEClass, ALPHA__INTERFACEALPHA);

		betaEClass = createEClass(BETA);
		createEReference(betaEClass, BETA__INTERFACEBETA);

		gammaEClass = createEClass(GAMMA);
		createEReference(gammaEClass, GAMMA__INTERFACEGAMMA);

		pdb2GammaEClass = createEClass(PDB2_GAMMA);
		createEReference(pdb2GammaEClass, PDB2_GAMMA__ADB2GAMMA);

		pSec2AlphaEClass = createEClass(PSEC2_ALPHA);
		createEReference(pSec2AlphaEClass, PSEC2_ALPHA__ASEC2ALPHA);

		pConnect2AlphaEClass = createEClass(PCONNECT2_ALPHA);
		createEReference(pConnect2AlphaEClass, PCONNECT2_ALPHA__ACONNECT2ALPHA);

		pAlpha2SecEClass = createEClass(PALPHA2_SEC);
		createEReference(pAlpha2SecEClass, PALPHA2_SEC__AALPHA2SEC);

		pGamma2DBEClass = createEClass(PGAMMA2_DB);
		createEReference(pGamma2DBEClass, PGAMMA2_DB__AGAMMA2DB);

		pAlpha2ConnectEClass = createEClass(PALPHA2_CONNECT);
		createEReference(pAlpha2ConnectEClass, PALPHA2_CONNECT__AALPHA2CONNECT);

		interfaceAlphaEClass = createEClass(INTERFACE_ALPHA);
		createEReference(interfaceAlphaEClass, INTERFACE_ALPHA__RSEC2ALPHA);
		createEReference(interfaceAlphaEClass, INTERFACE_ALPHA__RALPHA2SEC);
		createEReference(interfaceAlphaEClass, INTERFACE_ALPHA__RCONNECT2ALPHA);
		createEReference(interfaceAlphaEClass, INTERFACE_ALPHA__RALPHA2CONNECT);

		interfaceBetaEClass = createEClass(INTERFACE_BETA);
		createEReference(interfaceBetaEClass, INTERFACE_BETA__RBETA2SEC);
		createEReference(interfaceBetaEClass, INTERFACE_BETA__RSEC2BETA);
		createEReference(interfaceBetaEClass, INTERFACE_BETA__RBETA2DB);
		createEReference(interfaceBetaEClass, INTERFACE_BETA__RDB2BETA);

		interfaceGammaEClass = createEClass(INTERFACE_GAMMA);
		createEReference(interfaceGammaEClass, INTERFACE_GAMMA__RCONNECT2GAMMA);
		createEReference(interfaceGammaEClass, INTERFACE_GAMMA__RGAMMA2CONNECT);
		createEReference(interfaceGammaEClass, INTERFACE_GAMMA__RDB2GAMMA);
		createEReference(interfaceGammaEClass, INTERFACE_GAMMA__RGAMMA2DB);

		pSec2BetaEClass = createEClass(PSEC2_BETA);
		createEReference(pSec2BetaEClass, PSEC2_BETA__ASEC2BETA);

		pBeta2SecEClass = createEClass(PBETA2_SEC);
		createEReference(pBeta2SecEClass, PBETA2_SEC__ABETA2SEC);

		rBeta2DBEClass = createEClass(RBETA2_DB);
		createEReference(rBeta2DBEClass, RBETA2_DB__ABETA2DB);

		rBeta2SecEClass = createEClass(RBETA2_SEC);
		createEReference(rBeta2SecEClass, RBETA2_SEC__ABETA2SEC);

		rSec2BetaEClass = createEClass(RSEC2_BETA);
		createEReference(rSec2BetaEClass, RSEC2_BETA__ASEC2BETA);

		rdb2BetaEClass = createEClass(RDB2_BETA);
		createEReference(rdb2BetaEClass, RDB2_BETA__ADB2BETA);

		rConnect2AlphaEClass = createEClass(RCONNECT2_ALPHA);
		createEReference(rConnect2AlphaEClass, RCONNECT2_ALPHA__ACONNECT2ALPHA);

		rAlpha2SecEClass = createEClass(RALPHA2_SEC);
		createEReference(rAlpha2SecEClass, RALPHA2_SEC__AALPHA2SEC);

		rSec2AlphaEClass = createEClass(RSEC2_ALPHA);
		createEReference(rSec2AlphaEClass, RSEC2_ALPHA__ASEC2ALPHA);

		rAlpha2ConnectEClass = createEClass(RALPHA2_CONNECT);
		createEReference(rAlpha2ConnectEClass, RALPHA2_CONNECT__AALPHA2CONNECT);

		pConnect2GammaEClass = createEClass(PCONNECT2_GAMMA);
		createEReference(pConnect2GammaEClass, PCONNECT2_GAMMA__ACONNECT2GAMMA);

		pGamma2ConnectEClass = createEClass(PGAMMA2_CONNECT);
		createEReference(pGamma2ConnectEClass, PGAMMA2_CONNECT__AGAMMA2CONNECT);

		pdb2BetaEClass = createEClass(PDB2_BETA);
		createEReference(pdb2BetaEClass, PDB2_BETA__ADB2BETA);

		pBeta2DBEClass = createEClass(PBETA2_DB);
		createEReference(pBeta2DBEClass, PBETA2_DB__ABETA2DB);

		rGamma2DBEClass = createEClass(RGAMMA2_DB);
		createEReference(rGamma2DBEClass, RGAMMA2_DB__AGAMMA2DB);

		rdb2GammaEClass = createEClass(RDB2_GAMMA);
		createEReference(rdb2GammaEClass, RDB2_GAMMA__ADB2GAMMA);

		rGamma2ConnectEClass = createEClass(RGAMMA2_CONNECT);
		createEReference(rGamma2ConnectEClass, RGAMMA2_CONNECT__AGAMMA2CONNECT);

		rConnect2GammaEClass = createEClass(RCONNECT2_GAMMA);
		createEReference(rConnect2GammaEClass, RCONNECT2_GAMMA__ACONNECT2GAMMA);

		adb2GammaEClass = createEClass(ADB2_GAMMA);

		aConnect2GammaEClass = createEClass(ACONNECT2_GAMMA);

		aGamma2DBEClass = createEClass(AGAMMA2_DB);

		aGamma2ConnectEClass = createEClass(AGAMMA2_CONNECT);

		adb2BetaEClass = createEClass(ADB2_BETA);

		aBeta2DBEClass = createEClass(ABETA2_DB);

		aSec2BetaEClass = createEClass(ASEC2_BETA);

		aBeta2SecEClass = createEClass(ABETA2_SEC);

		aConnect2AlphaEClass = createEClass(ACONNECT2_ALPHA);

		aAlpha2ConnectEClass = createEClass(AALPHA2_CONNECT);

		aSec2AlphaEClass = createEClass(ASEC2_ALPHA);

		aAlpha2SecEClass = createEClass(AALPHA2_SEC);

		sys2ClientBindingEClass = createEClass(SYS2_CLIENT_BINDING);
		createEReference(sys2ClientBindingEClass, SYS2_CLIENT_BINDING__SYS2CLIENTSP);
		createEReference(sys2ClientBindingEClass, SYS2_CLIENT_BINDING__SYS2CLIENTCP);

		systemInterfaceEClass = createEClass(SYSTEM_INTERFACE);
		createEReference(systemInterfaceEClass, SYSTEM_INTERFACE__SYS2CLIENTSP);

		sys2ClientSPEClass = createEClass(SYS2_CLIENT_SP);
		createEReference(sys2ClientSPEClass, SYS2_CLIENT_SP__SYS2CLIENTBINDING);

		sys2ClientCPEClass = createEClass(SYS2_CLIENT_CP);
		createEReference(sys2ClientCPEClass, SYS2_CLIENT_CP__SYS2CLIENTBINDING);

		serv2ServBindingEClass = createEClass(SERV2_SERV_BINDING);
		createEReference(serv2ServBindingEClass, SERV2_SERV_BINDING__SERVCONF2SERVCOMPCONFP);
		createEReference(serv2ServBindingEClass, SERV2_SERV_BINDING__SERVCONF2SERVCOMPCOMPP);

		serverConfigInterfaceEClass = createEClass(SERVER_CONFIG_INTERFACE);
		createEReference(serverConfigInterfaceEClass, SERVER_CONFIG_INTERFACE__SERVCONF2SERVCOMPCONFP);
		createEReference(serverConfigInterfaceEClass, SERVER_CONFIG_INTERFACE__SERVCONF2CONNECTSERVP);

		servConf2ServCompConfPEClass = createEClass(SERV_CONF2_SERV_COMP_CONF_P);
		createEReference(servConf2ServCompConfPEClass, SERV_CONF2_SERV_COMP_CONF_P__SERV2SERVBINDING);

		servConf2ServCompCompPEClass = createEClass(SERV_CONF2_SERV_COMP_COMP_P);
		createEReference(servConf2ServCompCompPEClass, SERV_CONF2_SERV_COMP_COMP_P__SERV2SERVBINDING);

		servConf2ConnectServPEClass = createEClass(SERV_CONF2_CONNECT_SERV_P);
		createEReference(servConf2ConnectServPEClass, SERV_CONF2_CONNECT_SERV_P__SERVCONF2CONNECTBINDING);

		servConf2ConnectConnectPEClass = createEClass(SERV_CONF2_CONNECT_CONNECT_P);
		createEReference(servConf2ConnectConnectPEClass, SERV_CONF2_CONNECT_CONNECT_P__SERVCONF2CONNECTBINDING);

		servConf2ConnectBindingEClass = createEClass(SERV_CONF2_CONNECT_BINDING);
		createEReference(servConf2ConnectBindingEClass, SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTSERVP);
		createEReference(servConf2ConnectBindingEClass, SERV_CONF2_CONNECT_BINDING__SERVCONF2CONNECTCONNECTP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configEClass.getESuperTypes().add(this.getElemArchi());
		connectorEClass.getESuperTypes().add(this.getElemArchi());
		componentEClass.getESuperTypes().add(this.getElemArchi());
		attachmentsEClass.getESuperTypes().add(this.getLinks());
		bindingsEClass.getESuperTypes().add(this.getLinks());
		ppCompEClass.getESuperTypes().add(this.getPortsComponent());
		rpCompEClass.getESuperTypes().add(this.getPortsComponent());
		psCompEClass.getESuperTypes().add(this.getServicesComponent());
		rsCompEClass.getESuperTypes().add(this.getServicesComponent());
		ppConfEClass.getESuperTypes().add(this.getPortsConfig());
		rpConfEClass.getESuperTypes().add(this.getPortsConfig());
		psConfEClass.getESuperTypes().add(this.getServicesConfig());
		rsConfEClass.getESuperTypes().add(this.getServicesConfig());
		pbEClass.getESuperTypes().add(this.getBindings());
		rbEClass.getESuperTypes().add(this.getBindings());
		praEClass.getESuperTypes().add(this.getAttachments());
		rpaEClass.getESuperTypes().add(this.getAttachments());
		prEClass.getESuperTypes().add(this.getRole());
		rrEClass.getESuperTypes().add(this.getRole());
		serverEClass.getESuperTypes().add(this.getComponent());
		serverCompEClass.getESuperTypes().add(this.getComponent());
		systemEClass.getESuperTypes().add(this.getConfig());
		rpcEClass.getESuperTypes().add(this.getConnector());
		clientEClass.getESuperTypes().add(this.getComponent());
		serverConfigEClass.getESuperTypes().add(this.getConfig());
		connectionManagerEClass.getESuperTypes().add(this.getComponent());
		securityManagerEClass.getESuperTypes().add(this.getComponent());
		dbEClass.getESuperTypes().add(this.getComponent());
		attachmentCREClass.getESuperTypes().add(this.getPRA());
		attachmentRCEClass.getESuperTypes().add(this.getRPA());
		interfacesCEClass.getESuperTypes().add(this.getInterfaceComponent());
		portRCEClass.getESuperTypes().add(this.getRPComp());
		portPCEClass.getESuperTypes().add(this.getPPComp());
		interfaceRPCEClass.getESuperTypes().add(this.getInterfaceConnector());
		rRoleRPCClientEClass.getESuperTypes().add(this.getRR());
		pRoleRPCClientEClass.getESuperTypes().add(this.getPR());
		interfacesConnectEClass.getESuperTypes().add(this.getInterfaceComponent());
		interfacesServerEClass.getESuperTypes().add(this.getInterfaceComponent());
		portPSEClass.getESuperTypes().add(this.getPPComp());
		portRSEClass.getESuperTypes().add(this.getRPComp());
		rRoleRPCServerEClass.getESuperTypes().add(this.getRR());
		pRoleRPCSevEClass.getESuperTypes().add(this.getPR());
		attachementSRPCEClass.getESuperTypes().add(this.getPRA());
		attachementsRPCServEClass.getESuperTypes().add(this.getRPA());
		securityInterfaceEClass.getESuperTypes().add(this.getInterfaceComponent());
		dbInterfaceEClass.getESuperTypes().add(this.getInterfaceComponent());
		alphaEClass.getESuperTypes().add(this.getConnector());
		betaEClass.getESuperTypes().add(this.getConnector());
		gammaEClass.getESuperTypes().add(this.getConnector());
		pdb2GammaEClass.getESuperTypes().add(this.getPPComp());
		pSec2AlphaEClass.getESuperTypes().add(this.getPPComp());
		pConnect2AlphaEClass.getESuperTypes().add(this.getPPComp());
		pAlpha2SecEClass.getESuperTypes().add(this.getRPComp());
		pGamma2DBEClass.getESuperTypes().add(this.getRPComp());
		pAlpha2ConnectEClass.getESuperTypes().add(this.getRPComp());
		interfaceAlphaEClass.getESuperTypes().add(this.getInterfaceConnector());
		interfaceBetaEClass.getESuperTypes().add(this.getInterfaceConnector());
		interfaceGammaEClass.getESuperTypes().add(this.getInterfaceConnector());
		pSec2BetaEClass.getESuperTypes().add(this.getPPComp());
		pBeta2SecEClass.getESuperTypes().add(this.getRPComp());
		rBeta2DBEClass.getESuperTypes().add(this.getPR());
		rBeta2SecEClass.getESuperTypes().add(this.getPR());
		rSec2BetaEClass.getESuperTypes().add(this.getRR());
		rdb2BetaEClass.getESuperTypes().add(this.getRR());
		rConnect2AlphaEClass.getESuperTypes().add(this.getRR());
		rAlpha2SecEClass.getESuperTypes().add(this.getPR());
		rSec2AlphaEClass.getESuperTypes().add(this.getRR());
		rAlpha2ConnectEClass.getESuperTypes().add(this.getPR());
		pConnect2GammaEClass.getESuperTypes().add(this.getPPComp());
		pGamma2ConnectEClass.getESuperTypes().add(this.getRPComp());
		pdb2BetaEClass.getESuperTypes().add(this.getPPComp());
		pBeta2DBEClass.getESuperTypes().add(this.getRPComp());
		rGamma2DBEClass.getESuperTypes().add(this.getPR());
		rdb2GammaEClass.getESuperTypes().add(this.getRR());
		rGamma2ConnectEClass.getESuperTypes().add(this.getPR());
		rConnect2GammaEClass.getESuperTypes().add(this.getRR());
		adb2GammaEClass.getESuperTypes().add(this.getPRA());
		aConnect2GammaEClass.getESuperTypes().add(this.getPRA());
		aGamma2DBEClass.getESuperTypes().add(this.getRPA());
		aGamma2ConnectEClass.getESuperTypes().add(this.getRPA());
		adb2BetaEClass.getESuperTypes().add(this.getPRA());
		aBeta2DBEClass.getESuperTypes().add(this.getRPA());
		aSec2BetaEClass.getESuperTypes().add(this.getPRA());
		aBeta2SecEClass.getESuperTypes().add(this.getRPA());
		aConnect2AlphaEClass.getESuperTypes().add(this.getPRA());
		aAlpha2ConnectEClass.getESuperTypes().add(this.getRPA());
		aSec2AlphaEClass.getESuperTypes().add(this.getPRA());
		aAlpha2SecEClass.getESuperTypes().add(this.getRPA());
		sys2ClientBindingEClass.getESuperTypes().add(this.getPB());
		systemInterfaceEClass.getESuperTypes().add(this.getInterfaceConfig());
		sys2ClientSPEClass.getESuperTypes().add(this.getPPConf());
		sys2ClientCPEClass.getESuperTypes().add(this.getPPComp());
		serv2ServBindingEClass.getESuperTypes().add(this.getPB());
		serverConfigInterfaceEClass.getESuperTypes().add(this.getInterfaceConfig());
		servConf2ServCompConfPEClass.getESuperTypes().add(this.getPPConf());
		servConf2ServCompCompPEClass.getESuperTypes().add(this.getPPComp());
		servConf2ConnectBindingEClass.getESuperTypes().add(this.getPB());

		// Initialize classes, features, and operations; add parameters
		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfig_Component(), this.getComponent(), null, "component", null, 0, -1, Config.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Connector(), this.getConnector(), null, "connector", null, 0, 1, Config.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Interface(), this.getInterfaceConfig(), null, "interface", null, 0, 1, Config.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Links(), this.getLinks(), null, "links", null, 0, 1, Config.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Neweclass16(), this.getGlue(), null, "neweclass16", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Neweclass17(), this.getInterfaceConnector(), null, "neweclass17", null, 0, 1,
				Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Properties(), this.getProperties(), null, "properties", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Constraints(), this.getConstraints(), null, "constraints", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Interface(), this.getInterfaceComponent(), null, "interface", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elemArchiEClass, ElemArchi.class, "ElemArchi", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintsEClass, Constraints.class, "Constraints", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceComponentEClass, InterfaceComponent.class, "InterfaceComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceComponent_Ports(), this.getPortsComponent(), null, "ports", null, 0, 1,
				InterfaceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceComponent_Services(), this.getServicesComponent(), null, "services", null, 0, 1,
				InterfaceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portsComponentEClass, PortsComponent.class, "PortsComponent", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicesComponentEClass, ServicesComponent.class, "ServicesComponent", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConfigEClass, InterfaceConfig.class, "InterfaceConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConfig_Ports(), this.getPortsConfig(), null, "ports", null, 0, 1,
				InterfaceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConfig_Services(), this.getServicesConfig(), null, "services", null, 0, 1,
				InterfaceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linksEClass, Links.class, "Links", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portsConfigEClass, PortsConfig.class, "PortsConfig", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicesConfigEClass, ServicesConfig.class, "ServicesConfig", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachmentsEClass, Attachments.class, "Attachments", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingsEClass, Bindings.class, "Bindings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_Neweclass18(), this.getRole(), null, "neweclass18", null, 0, 1, Glue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConnectorEClass, InterfaceConnector.class, "InterfaceConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnector_Role(), this.getRole(), null, "role", null, 0, 1, InterfaceConnector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ppCompEClass, PPComp.class, "PPComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPComp_Pb(), this.getPB(), this.getPB_Pp(), "pb", null, 0, 1, PPComp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPPComp_Pra(), this.getPRA(), this.getPRA_Pp(), "pra", null, 0, 1, PPComp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rpCompEClass, RPComp.class, "RPComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPComp_Rb(), this.getRB(), this.getRB_Rp(), "rb", null, 0, 1, RPComp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRPComp_Rpa(), this.getRPA(), this.getRPA_Rp(), "rpa", null, 0, 1, RPComp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(psCompEClass, PSComp.class, "PSComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsCompEClass, RSComp.class, "RSComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ppConfEClass, PPConf.class, "PPConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPConf_Pb(), this.getPB(), this.getPB_Pp2(), "pb", null, 0, 1, PPConf.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rpConfEClass, RPConf.class, "RPConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPConf_Rb(), this.getRB(), this.getRB_Rp2(), "rb", null, 0, 1, RPConf.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(psConfEClass, PSConf.class, "PSConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsConfEClass, RSConf.class, "RSConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pbEClass, cCS.PB.class, "PB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPB_Pp(), this.getPPComp(), this.getPPComp_Pb(), "pp", null, 0, 1, cCS.PB.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPB_Pp2(), this.getPPConf(), this.getPPConf_Pb(), "pp2", null, 0, 1, cCS.PB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbEClass, cCS.RB.class, "RB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRB_Rp(), this.getRPComp(), this.getRPComp_Rb(), "rp", null, 0, 1, cCS.RB.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRB_Rp2(), this.getRPConf(), this.getRPConf_Rb(), "rp2", null, 0, 1, cCS.RB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(praEClass, cCS.PRA.class, "PRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPRA_Pp(), this.getPPComp(), this.getPPComp_Pra(), "pp", null, 0, 1, cCS.PRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPRA_Rr(), this.getRR(), this.getRR_Pra(), "rr", null, 0, 1, cCS.PRA.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rpaEClass, cCS.RPA.class, "RPA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPA_Rp(), this.getRPComp(), this.getRPComp_Rpa(), "rp", null, 0, 1, cCS.RPA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPA_Pr(), this.getPR(), this.getPR_Rpa(), "pr", null, 0, 1, cCS.RPA.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(prEClass, cCS.PR.class, "PR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPR_Rpa(), this.getRPA(), this.getRPA_Pr(), "rpa", null, 0, 1, cCS.PR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rrEClass, cCS.RR.class, "RR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRR_Pra(), this.getPRA(), this.getPRA_Rr(), "pra", null, 0, 1, cCS.RR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverCompEClass, ServerComp.class, "ServerComp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerComp_Serverconfig(), this.getServerConfig(), null, "serverconfig", null, 0, -1,
				ServerComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerComp_Interfacesserver(), this.getInterfacesServer(), null, "interfacesserver", null, 0,
				-1, ServerComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, cCS.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Server(), this.getServerComp(), null, "server", null, 0, -1, cCS.System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Rpc(), this.getRPC(), null, "rpc", null, 0, -1, cCS.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSystem_Client(), this.getClient(), null, "client", null, 0, -1, cCS.System.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Sys2clientbinding(), this.getSys2ClientBinding(), null, "sys2clientbinding", null, 0,
				-1, cCS.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Systeminterface(), this.getSystemInterface(), null, "systeminterface", null, 0, -1,
				cCS.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcEClass, cCS.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Interfacerpc(), this.getInterfaceRPC(), null, "interfacerpc", null, 0, -1, cCS.RPC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Interfacesc(), this.getinterfacesC(), null, "interfacesc", null, 0, -1, Client.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverConfigEClass, ServerConfig.class, "ServerConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerConfig_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager",
				null, 0, -1, ServerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Securitymanager(), this.getSecurityManager(), null, "securitymanager", null, 0,
				-1, ServerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Db(), this.getDB(), null, "db", null, 0, -1, ServerConfig.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getServerConfig_Connectdb(), this.getGamma(), null, "connectdb", null, 0, -1, ServerConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Secdb(), this.getBeta(), null, "secdb", null, 0, -1, ServerConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Connectsec(), this.getAlpha(), null, "connectsec", null, 0, -1,
				ServerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Serv2servbinding(), this.getServ2ServBinding(), null, "serv2servbinding", null,
				0, -1, ServerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfig_Serverconfiginterface(), this.getServerConfigInterface(), null,
				"serverconfiginterface", null, 0, -1, ServerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Interfacesconnect(), this.getInterfacesConnect(), null, "interfacesconnect",
				null, 0, -1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManagerEClass, cCS.SecurityManager.class, "SecurityManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Securityinterface(), this.getSecurityInterface(), null, "securityinterface",
				null, 0, -1, cCS.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbEClass, cCS.DB.class, "DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDB_Dbinterface(), this.getDBInterface(), null, "dbinterface", null, 0, -1, cCS.DB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentCREClass, AttachmentCR.class, "AttachmentCR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachmentRCEClass, AttachmentRC.class, "AttachmentRC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfacesCEClass, interfacesC.class, "interfacesC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getinterfacesC_Portrc(), this.getPortRC(), null, "portrc", null, 0, -1, interfacesC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfacesC_Portpc(), this.getPortPC(), null, "portpc", null, 0, -1, interfacesC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfacesC_Sys2clientcp(), this.getSys2ClientCP(), null, "sys2clientcp", null, 0, -1,
				interfacesC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRCEClass, PortRC.class, "PortRC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortRC_Attachmentrc(), this.getAttachmentRC(), null, "attachmentrc", null, 0, 1, PortRC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPCEClass, PortPC.class, "PortPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPC_Attachmentcr(), this.getAttachmentCR(), null, "attachmentcr", null, 0, 1, PortPC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceRPCEClass, InterfaceRPC.class, "InterfaceRPC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRPC_Prolerpc2(), this.getPRoleRPCClient(), null, "prolerpc2", null, 0, -1,
				InterfaceRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceRPC_Rrolerpc(), this.getRRoleRPCClient(), null, "rrolerpc", null, 0, -1,
				InterfaceRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceRPC_Rrolerpc2(), this.getRRoleRPCServer(), null, "rrolerpc2", null, 0, -1,
				InterfaceRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceRPC_Prolerpc(), this.getPRoleRPCSev(), null, "prolerpc", null, 0, -1,
				InterfaceRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rRoleRPCClientEClass, RRoleRPCClient.class, "RRoleRPCClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRRoleRPCClient_Attachmentcr(), this.getAttachmentCR(), null, "attachmentcr", null, 0, 1,
				RRoleRPCClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pRoleRPCClientEClass, PRoleRPCClient.class, "PRoleRPCClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPRoleRPCClient_Attachmentrc(), this.getAttachmentRC(), null, "attachmentrc", null, 0, 1,
				PRoleRPCClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacesConnectEClass, InterfacesConnect.class, "InterfacesConnect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacesConnect_Palpha2connect(), this.getPAlpha2Connect(), null, "palpha2connect", null, 0,
				-1, InterfacesConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesConnect_Pconnect2alpha(), this.getPConnect2Alpha(), null, "pconnect2alpha", null, 0,
				-1, InterfacesConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesConnect_Pconnect2gamma(), this.getPConnect2Gamma(), null, "pconnect2gamma", null, 0,
				-1, InterfacesConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesConnect_Pgamma2connect(), this.getPGamma2Connect(), null, "pgamma2connect", null, 0,
				-1, InterfacesConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesConnect_Servconf2connectconnectp(), this.getServConf2ConnectConnectP(), null,
				"servconf2connectconnectp", null, 0, -1, InterfacesConnect.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacesServerEClass, InterfacesServer.class, "InterfacesServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacesServer_Portps(), this.getPortPS(), null, "portps", null, 0, -1,
				InterfacesServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesServer_Portrs(), this.getPortRS(), null, "portrs", null, 0, -1,
				InterfacesServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacesServer_Servconf2servcompcompp(), this.getServConf2ServCompCompP(), null,
				"servconf2servcompcompp", null, 0, -1, InterfacesServer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPSEClass, PortPS.class, "PortPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPS_Attachementsrpc(), this.getAttachementSRPC(), null, "attachementsrpc", null, 0, 1,
				PortPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRSEClass, PortRS.class, "PortRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortRS_Attachementsrpcserv(), this.getAttachementsRPCServ(), null, "attachementsrpcserv",
				null, 0, 1, PortRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rRoleRPCServerEClass, RRoleRPCServer.class, "RRoleRPCServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRRoleRPCServer_Attachementsrpc(), this.getAttachementSRPC(), null, "attachementsrpc", null, 0,
				1, RRoleRPCServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pRoleRPCSevEClass, PRoleRPCSev.class, "PRoleRPCSev", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPRoleRPCSev_Attachementsrpcserv(), this.getAttachementsRPCServ(), null, "attachementsrpcserv",
				null, 0, 1, PRoleRPCSev.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementSRPCEClass, AttachementSRPC.class, "AttachementSRPC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachementsRPCServEClass, AttachementsRPCServ.class, "AttachementsRPCServ", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityInterfaceEClass, SecurityInterface.class, "SecurityInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityInterface_Psec2beta(), this.getPSec2Beta(), null, "psec2beta", null, 0, -1,
				SecurityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityInterface_Pbeta2sec(), this.getPBeta2Sec(), null, "pbeta2sec", null, 0, -1,
				SecurityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityInterface_Palpha2sec(), this.getPAlpha2Sec(), null, "palpha2sec", null, 0, -1,
				SecurityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityInterface_Psec2alpha(), this.getPSec2Alpha(), null, "psec2alpha", null, 0, -1,
				SecurityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbInterfaceEClass, DBInterface.class, "DBInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBInterface_Pdb2gamma(), this.getPDB2Gamma(), null, "pdb2gamma", null, 0, -1,
				DBInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBInterface_Pgamma2db(), this.getPGamma2DB(), null, "pgamma2db", null, 0, -1,
				DBInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBInterface_Pdb2beta(), this.getPDB2Beta(), null, "pdb2beta", null, 0, -1, DBInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBInterface_Pbeta2db(), this.getPBeta2DB(), null, "pbeta2db", null, 0, -1, DBInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alphaEClass, Alpha.class, "Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlpha_Interfacealpha(), this.getInterfaceAlpha(), null, "interfacealpha", null, 0, -1,
				Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betaEClass, Beta.class, "Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeta_Interfacebeta(), this.getInterfaceBeta(), null, "interfacebeta", null, 0, -1, Beta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gammaEClass, Gamma.class, "Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamma_Interfacegamma(), this.getInterfaceGamma(), null, "interfacegamma", null, 0, -1,
				Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdb2GammaEClass, PDB2Gamma.class, "PDB2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDB2Gamma_Adb2gamma(), this.getADB2Gamma(), null, "adb2gamma", null, 0, 1, PDB2Gamma.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pSec2AlphaEClass, PSec2Alpha.class, "PSec2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSec2Alpha_Asec2alpha(), this.getASec2Alpha(), null, "asec2alpha", null, 0, 1,
				PSec2Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pConnect2AlphaEClass, PConnect2Alpha.class, "PConnect2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPConnect2Alpha_Aconnect2alpha(), this.getAConnect2Alpha(), null, "aconnect2alpha", null, 0, 1,
				PConnect2Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAlpha2SecEClass, PAlpha2Sec.class, "PAlpha2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAlpha2Sec_Aalpha2sec(), this.getAAlpha2Sec(), null, "aalpha2sec", null, 0, 1,
				PAlpha2Sec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pGamma2DBEClass, PGamma2DB.class, "PGamma2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPGamma2DB_Agamma2db(), this.getAGamma2DB(), null, "agamma2db", null, 0, 1, PGamma2DB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pAlpha2ConnectEClass, PAlpha2Connect.class, "PAlpha2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAlpha2Connect_Aalpha2connect(), this.getAAlpha2Connect(), null, "aalpha2connect", null, 0, 1,
				PAlpha2Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceAlphaEClass, InterfaceAlpha.class, "InterfaceAlpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceAlpha_Rsec2alpha(), this.getRSec2Alpha(), null, "rsec2alpha", null, 0, -1,
				InterfaceAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAlpha_Ralpha2sec(), this.getRAlpha2Sec(), null, "ralpha2sec", null, 0, -1,
				InterfaceAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAlpha_Rconnect2alpha(), this.getRConnect2Alpha(), null, "rconnect2alpha", null, 0,
				-1, InterfaceAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAlpha_Ralpha2connect(), this.getRAlpha2Connect(), null, "ralpha2connect", null, 0,
				-1, InterfaceAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceBetaEClass, InterfaceBeta.class, "InterfaceBeta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceBeta_Rbeta2sec(), this.getRBeta2Sec(), null, "rbeta2sec", null, 0, -1,
				InterfaceBeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceBeta_Rsec2beta(), this.getRSec2Beta(), null, "rsec2beta", null, 0, -1,
				InterfaceBeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceBeta_Rbeta2db(), this.getRBeta2DB(), null, "rbeta2db", null, 0, -1,
				InterfaceBeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceBeta_Rdb2beta(), this.getRDB2Beta(), null, "rdb2beta", null, 0, -1,
				InterfaceBeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceGammaEClass, InterfaceGamma.class, "InterfaceGamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceGamma_Rconnect2gamma(), this.getRConnect2Gamma(), null, "rconnect2gamma", null, 0,
				-1, InterfaceGamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceGamma_Rgamma2connect(), this.getRGamma2Connect(), null, "rgamma2connect", null, 0,
				-1, InterfaceGamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceGamma_Rdb2gamma(), this.getRDB2Gamma(), null, "rdb2gamma", null, 0, -1,
				InterfaceGamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceGamma_Rgamma2db(), this.getRGamma2DB(), null, "rgamma2db", null, 0, -1,
				InterfaceGamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pSec2BetaEClass, PSec2Beta.class, "PSec2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSec2Beta_Asec2beta(), this.getASec2Beta(), null, "asec2beta", null, 0, 1, PSec2Beta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pBeta2SecEClass, PBeta2Sec.class, "PBeta2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPBeta2Sec_Abeta2sec(), this.getABeta2Sec(), null, "abeta2sec", null, 0, 1, PBeta2Sec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rBeta2DBEClass, RBeta2DB.class, "RBeta2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBeta2DB_Abeta2db(), this.getABeta2DB(), null, "abeta2db", null, 0, 1, RBeta2DB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rBeta2SecEClass, RBeta2Sec.class, "RBeta2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBeta2Sec_Abeta2sec(), this.getABeta2Sec(), null, "abeta2sec", null, 0, 1, RBeta2Sec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rSec2BetaEClass, RSec2Beta.class, "RSec2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRSec2Beta_Asec2beta(), this.getASec2Beta(), null, "asec2beta", null, 0, 1, RSec2Beta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdb2BetaEClass, RDB2Beta.class, "RDB2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDB2Beta_Adb2beta(), this.getADB2Beta(), null, "adb2beta", null, 0, 1, RDB2Beta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rConnect2AlphaEClass, RConnect2Alpha.class, "RConnect2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRConnect2Alpha_Aconnect2alpha(), this.getAConnect2Alpha(), null, "aconnect2alpha", null, 0, 1,
				RConnect2Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rAlpha2SecEClass, RAlpha2Sec.class, "RAlpha2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRAlpha2Sec_Aalpha2sec(), this.getAAlpha2Sec(), null, "aalpha2sec", null, 0, 1,
				RAlpha2Sec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rSec2AlphaEClass, RSec2Alpha.class, "RSec2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRSec2Alpha_Asec2alpha(), this.getASec2Alpha(), null, "asec2alpha", null, 0, 1,
				RSec2Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rAlpha2ConnectEClass, RAlpha2Connect.class, "RAlpha2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRAlpha2Connect_Aalpha2connect(), this.getAAlpha2Connect(), null, "aalpha2connect", null, 0, 1,
				RAlpha2Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pConnect2GammaEClass, PConnect2Gamma.class, "PConnect2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPConnect2Gamma_Aconnect2gamma(), this.getAConnect2Gamma(), null, "aconnect2gamma", null, 0, 1,
				PConnect2Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pGamma2ConnectEClass, PGamma2Connect.class, "PGamma2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPGamma2Connect_Agamma2connect(), this.getAGamma2Connect(), null, "agamma2connect", null, 0, 1,
				PGamma2Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdb2BetaEClass, PDB2Beta.class, "PDB2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDB2Beta_Adb2beta(), this.getADB2Beta(), null, "adb2beta", null, 0, 1, PDB2Beta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pBeta2DBEClass, PBeta2DB.class, "PBeta2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPBeta2DB_Abeta2db(), this.getABeta2DB(), null, "abeta2db", null, 0, 1, PBeta2DB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rGamma2DBEClass, RGamma2DB.class, "RGamma2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRGamma2DB_Agamma2db(), this.getAGamma2DB(), null, "agamma2db", null, 0, 1, RGamma2DB.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdb2GammaEClass, RDB2Gamma.class, "RDB2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDB2Gamma_Adb2gamma(), this.getADB2Gamma(), null, "adb2gamma", null, 0, 1, RDB2Gamma.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rGamma2ConnectEClass, RGamma2Connect.class, "RGamma2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRGamma2Connect_Agamma2connect(), this.getAGamma2Connect(), null, "agamma2connect", null, 0, 1,
				RGamma2Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rConnect2GammaEClass, RConnect2Gamma.class, "RConnect2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRConnect2Gamma_Aconnect2gamma(), this.getAConnect2Gamma(), null, "aconnect2gamma", null, 0, 1,
				RConnect2Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adb2GammaEClass, ADB2Gamma.class, "ADB2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aConnect2GammaEClass, AConnect2Gamma.class, "AConnect2Gamma", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aGamma2DBEClass, AGamma2DB.class, "AGamma2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aGamma2ConnectEClass, AGamma2Connect.class, "AGamma2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(adb2BetaEClass, ADB2Beta.class, "ADB2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aBeta2DBEClass, ABeta2DB.class, "ABeta2DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aSec2BetaEClass, ASec2Beta.class, "ASec2Beta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aBeta2SecEClass, ABeta2Sec.class, "ABeta2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aConnect2AlphaEClass, AConnect2Alpha.class, "AConnect2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aAlpha2ConnectEClass, AAlpha2Connect.class, "AAlpha2Connect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aSec2AlphaEClass, ASec2Alpha.class, "ASec2Alpha", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aAlpha2SecEClass, AAlpha2Sec.class, "AAlpha2Sec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sys2ClientBindingEClass, Sys2ClientBinding.class, "Sys2ClientBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSys2ClientBinding_Sys2clientsp(), this.getSys2ClientSP(),
				this.getSys2ClientSP_Sys2clientbinding(), "sys2clientsp", null, 0, 1, Sys2ClientBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSys2ClientBinding_Sys2clientcp(), this.getSys2ClientCP(),
				this.getSys2ClientCP_Sys2clientbinding(), "sys2clientcp", null, 0, 1, Sys2ClientBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemInterfaceEClass, SystemInterface.class, "SystemInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemInterface_Sys2clientsp(), this.getSys2ClientSP(), null, "sys2clientsp", null, 0, -1,
				SystemInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sys2ClientSPEClass, Sys2ClientSP.class, "Sys2ClientSP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSys2ClientSP_Sys2clientbinding(), this.getSys2ClientBinding(),
				this.getSys2ClientBinding_Sys2clientsp(), "sys2clientbinding", null, 0, 1, Sys2ClientSP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sys2ClientCPEClass, Sys2ClientCP.class, "Sys2ClientCP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSys2ClientCP_Sys2clientbinding(), this.getSys2ClientBinding(),
				this.getSys2ClientBinding_Sys2clientcp(), "sys2clientbinding", null, 0, 1, Sys2ClientCP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serv2ServBindingEClass, Serv2ServBinding.class, "Serv2ServBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServ2ServBinding_Servconf2servcompconfp(), this.getServConf2ServCompConfP(),
				this.getServConf2ServCompConfP_Serv2servbinding(), "servconf2servcompconfp", null, 0, 1,
				Serv2ServBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServ2ServBinding_Servconf2servcompcompp(), this.getServConf2ServCompCompP(),
				this.getServConf2ServCompCompP_Serv2servbinding(), "servconf2servcompcompp", null, 0, 1,
				Serv2ServBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverConfigInterfaceEClass, ServerConfigInterface.class, "ServerConfigInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerConfigInterface_Servconf2servcompconfp(), this.getServConf2ServCompConfP(), null,
				"servconf2servcompconfp", null, 0, -1, ServerConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfigInterface_Servconf2connectservp(), this.getServConf2ConnectServP(), null,
				"servconf2connectservp", null, 0, -1, ServerConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servConf2ServCompConfPEClass, ServConf2ServCompConfP.class, "ServConf2ServCompConfP", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServConf2ServCompConfP_Serv2servbinding(), this.getServ2ServBinding(),
				this.getServ2ServBinding_Servconf2servcompconfp(), "serv2servbinding", null, 0, 1,
				ServConf2ServCompConfP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servConf2ServCompCompPEClass, ServConf2ServCompCompP.class, "ServConf2ServCompCompP", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServConf2ServCompCompP_Serv2servbinding(), this.getServ2ServBinding(),
				this.getServ2ServBinding_Servconf2servcompcompp(), "serv2servbinding", null, 0, 1,
				ServConf2ServCompCompP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servConf2ConnectServPEClass, ServConf2ConnectServP.class, "ServConf2ConnectServP", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServConf2ConnectServP_Servconf2connectbinding(), this.getServConf2ConnectBinding(),
				this.getServConf2ConnectBinding_Servconf2connectservp(), "servconf2connectbinding", null, 0, 1,
				ServConf2ConnectServP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servConf2ConnectConnectPEClass, ServConf2ConnectConnectP.class, "ServConf2ConnectConnectP",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServConf2ConnectConnectP_Servconf2connectbinding(), this.getServConf2ConnectBinding(),
				this.getServConf2ConnectBinding_Servconf2connectconnectp(), "servconf2connectbinding", null, 0, 1,
				ServConf2ConnectConnectP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servConf2ConnectBindingEClass, ServConf2ConnectBinding.class, "ServConf2ConnectBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServConf2ConnectBinding_Servconf2connectservp(), this.getServConf2ConnectServP(),
				this.getServConf2ConnectServP_Servconf2connectbinding(), "servconf2connectservp", null, 0, 1,
				ServConf2ConnectBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServConf2ConnectBinding_Servconf2connectconnectp(), this.getServConf2ConnectConnectP(),
				this.getServConf2ConnectConnectP_Servconf2connectbinding(), "servconf2connectconnectp", null, 0, 1,
				ServConf2ConnectBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CCSPackageImpl
