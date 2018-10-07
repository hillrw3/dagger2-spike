package dagger;

import javax.inject.Inject;

public class MyService {
    MessageWriter writer;

    @Inject
    public MyService(MessageWriter ghostWriter) {
        this.writer = ghostWriter;
    }

    public String message() {
        return writer.message();
    }

}
