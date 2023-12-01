package in.serosoft.listeners;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//@Service
//@EnableRabbit
public class SampleListener {
	@RabbitListener(queues = "exam-queue")
	public void messageReaderExam(String message) {
		System.out.println("Exam Message Received : "+message);
	}
	@RabbitListener(queues = "admission-queue")
	public void messageReaderAdmission(String message) {
		System.out.println("Admission Received : "+message);
	}
	@RabbitListener(queues = "ms-queue-exam")
	public void messageReaderExamMS(String message) {
		System.out.println("MS Exam Message Received : "+message);
	}
	@RabbitListener(queues = "ms-queue-admission")
	public void messageReaderAdmissionMS(String message) {
		System.out.println("MS Admission Received : "+message);
	}
}
