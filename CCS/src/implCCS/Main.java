package implCCS;

public class Main {

	public static void main(String[] args) {
		SystemCS system = new SystemCS();

		Client client = new Client();
		system.addComponent(client);
		system.addBinding(client);
		
		RPC rpc = new RPC();
		system.addConnector(rpc);
		
		system.checkState();
		client.checkState();
		rpc.checkState();
	}

}
