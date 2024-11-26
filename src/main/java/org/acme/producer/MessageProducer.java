package org.acme.producer;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class MessageProducer {

    @Channel("words-out")
    Emitter<String> emitter;

    public void sendMessage(String message) {
        System.out.println(message);
        emitter.send(message);
    }

    public void sendMessage1(String message) {
        System.out.println(message);
        emitter.send(message);
    }
}