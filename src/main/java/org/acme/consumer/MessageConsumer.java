package org.acme.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;


@ApplicationScoped
public class MessageConsumer {

    @Incoming("words-in")
    public void consume(String message) {
        System.out.println("Received message from Kafka: " + message);
    }
}