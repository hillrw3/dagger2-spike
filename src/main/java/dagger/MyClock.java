package dagger;

import java.time.Instant;

public class MyClock {

    public Instant now() {
        return Instant.now();
    }
}
