package modelCCS;

public interface IRole {
	Boolean isTaken();
	void taken();
	void free();
	int getId();
	void passMessage(Message msg);
	Message receiveMessage(Message msg);
	public ILink getLink();
	public void setLink(ILink link);
}
