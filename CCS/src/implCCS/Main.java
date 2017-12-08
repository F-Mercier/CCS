package implCCS;

import modelCCS.Message;

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
		
		int portTest = 100;
		Message m = new Message(portTest, "test", "azerty");
		//client.sendMessage(m);
		//system.detectMessage(client.getPort(portTest), m);
	}
}
