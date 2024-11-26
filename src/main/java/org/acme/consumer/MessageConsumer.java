package org.acme.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.messages.Message;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class MessageConsumer {

    @Incoming("messages")
    public void consume(Message message) {
        System.out.println("Received message from Kafka: " + message);
    }
}