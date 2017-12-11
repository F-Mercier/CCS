package modelCCS;

import implCCS.Message;

public interface IPort {
	Boolean isTaken();
	void taken();
	void free();
	int getId();
	Message passMessage(Message msg);
	Message receiveMessage(Message msg);
	ILink getLink();
	void setLink(ILink link);
}
