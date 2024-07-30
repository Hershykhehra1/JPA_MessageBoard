package cs3220;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cs3220.model.MessageEntry;

@Component
public class MessageComponent {
	private List<MessageEntry> messages;
	public MessageComponent() {
		this.messages = new ArrayList<MessageEntry>();
	}
	
	public List<MessageEntry> getMessage(){
		return messages;
	}
	public void setMessage(List<MessageEntry> messages) {
		this.messages = messages;
	}
	
	public MessageEntry getMessageById(int id) {
		for(MessageEntry message : this.messages) {
			if(message.getId() == id) {
				return message;
			} else {
				continue;
			}
		}
		return null;
	}
	
	public void removeMessage(MessageEntry message) {
		this.messages.remove(message);
	}
	
}
