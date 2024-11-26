package org.acme;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;
import org.acme.messages.Message;

public class MessageDeserializer extends ObjectMapperDeserializer<Message> {
    public MessageDeserializer() {
        super(Message.class);
    }
}