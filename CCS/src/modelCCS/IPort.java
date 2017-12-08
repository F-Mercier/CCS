package modelCCS;

public interface IPort {
	Boolean isTaken();
	void taken();
	void free();
	int getId();
	void passMessage(Message msg);
	Message receiveMessage(Message msg);
	ILink getLink();
	void setLink(ILink link);
}
