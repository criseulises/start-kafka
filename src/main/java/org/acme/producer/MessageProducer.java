package org.acme.producer;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.messages.Message;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class MessageProducer {

    @Channel("messages-out")
    Emitter<Message> emitter;

    public void sendMessage(Message message) {
        emitter.send(message);
        System.out.println("Sent message to Kafka: " + message);
    }
}