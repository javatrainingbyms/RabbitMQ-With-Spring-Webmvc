package in.serosoft;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private RabbitTemplate rt;
	
	
	@GetMapping("/test")
	public String testMessage() {
		rt.convertAndSend("my-exchange", "my", "test message : "+new java.util.Date());
		return "Test Message @ "+new java.util.Date();
	}
	@GetMapping("/exam")
	public String examMessage() {
		//rt.convertAndSend("sunshine-exchange", "exam", "message : "+new java.util.Date());
		rt.convertAndSend("exam","exam-message @ "+new java.util.Date());
		return "Exam Message @ "+new java.util.Date();
	}
	@GetMapping("/admission")
	public String admissionMessage() {
		//rt.convertAndSend("sunshine-exchange", "admission", "message : "+new java.util.Date());
		rt.convertAndSend("admission","admission-message @ "+new java.util.Date());
		return "Admission Message @ "+new java.util.Date();
	}
}
