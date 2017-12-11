package implCCS;

public class Main {

	public static void main(String[] args) {
		SystemCS system = new SystemCS();

		Client client = new Client();
		system.addComponent(client);
		system.addBinding(client);
		
		RPC rpc = new RPC();
		system.addConnector(rpc);
		
		system.addAttachment(client, rpc);
		system.addAttachment(system.getComponents().get(0), rpc);

		system.checkState();
		
		/*
		 * Test envoi message
		 */
		/*
		int portTest = 101;
		Message m = new Message(portTest, "test", "azerty");
		m = client.sendMessage(m);
		System.out.println(m.getMsg());
		*/
	}
}
