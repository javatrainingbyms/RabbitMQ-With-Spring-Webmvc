package in.serosoft.listeners;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class YourQueueListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		String msg=new String(message.getBody());
		System.out.println("Your-Queue-Message : "+msg);
		
	}

}
