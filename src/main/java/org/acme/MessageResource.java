package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.messages.Message;
import org.acme.producer.MessageProducer;

@Path("/messages")
public class MessageResource {

    @Inject
    MessageProducer producer;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendMessage(Message message) {
        producer.sendMessage(message);
        return Response.ok("Message sent: " + message).build();
    }
}