package dagger;

public class MessageWriter {

    private MyClock clock;

    public MessageWriter(MyClock clock) {
        this.clock = clock;
    }

    public String message() {
        return "This program was run at " + clock.now();
    }
}
