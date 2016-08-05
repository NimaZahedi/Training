package training;

import java.util.UUID;

/**
 * Created by nimazahedi on 05/08/16.
 */
public class Message {

    private UUID id;
    private String user;
    private String message;
    private String postedAt;

    public Message() {
    }

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostedAt() {
        return this.postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    @Override
    public String toString() {
        return "Message { id: " + id + ", user: " + user + ", message: " + message + ", postedAt: " + postedAt + "}";
    }
}
