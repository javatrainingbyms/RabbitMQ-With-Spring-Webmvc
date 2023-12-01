package in.serosoft.listeners;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class MyQueueListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		String msg=new String(message.getBody());
		System.out.println("My-Queue-Message : "+msg);
		
	}

}
