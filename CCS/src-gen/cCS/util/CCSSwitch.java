/**
 */
package cCS.util;

import cCS.*;

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
