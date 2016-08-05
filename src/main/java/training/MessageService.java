package training;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by nimazahedi on 05/08/16.
 */
@Component
public class MessageService {

    public Message createMessage(Message message) {
        message.setId(UUID.randomUUID());
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        message.setPostedAt(format.format(new Date()));
        return message;
    }
}
