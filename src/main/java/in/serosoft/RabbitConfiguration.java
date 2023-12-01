package in.serosoft;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;

//@Configuration
//@EnableRabbit
public class RabbitConfiguration {
	DirectExchange dc;
	Queue q;
	RabbitAdmin ra;
	//Binding bnd
	DestinationType dt;
	void tesT() {
		//Binding binding=new Binding(null, dt, null, null, null)
	}
}
