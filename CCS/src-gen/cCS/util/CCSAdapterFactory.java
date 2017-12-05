/**
 */
package cCS.util;

import cCS.*;

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
