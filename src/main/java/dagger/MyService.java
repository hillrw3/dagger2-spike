package dagger;

import javax.inject.Inject;
import java.time.Instant;

public class MyService {
    MessageWriter writer;
    MyClock clock;

    @Inject
    public MyService(MessageWriter ghostWriter, MyClock clock) {
        this.writer = ghostWriter;
        this.clock = clock;
    }

    public String message() {
        return writer.message() + " at " + clock.now();
    }

}
