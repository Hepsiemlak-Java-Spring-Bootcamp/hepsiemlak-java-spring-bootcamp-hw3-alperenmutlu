package emlakburada.config;


import emlakburada.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqConfig {

    @Autowired
    private EmailService emailService;

    @JmsListener(destination = "emlakburada.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message.toString());
        emailService.send(message.toString());
    }
}
