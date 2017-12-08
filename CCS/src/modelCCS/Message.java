package modelCCS;

public class Message {
	int port;
	String msg;
	String pw;
	public Message(int port, String msg, String pw) {
		super();
		this.port = port;
		this.msg = msg;
		this.pw = pw;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
