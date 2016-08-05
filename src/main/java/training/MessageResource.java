package training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by nimazahedi on 05/08/16.
 */
@Path("/messages")
@Component
public class MessageResource {

    @Autowired
    private MessageService messageService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void message() {
        System.out.print("dsfa");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response message(final Message message) {
        System.out.print(this.messageService.createMessage(message));
        return Response.ok(this.messageService.createMessage(message)).build();
    }

}
