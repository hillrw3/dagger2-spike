package dagger;

@Module
public class MyModule {

    @Provides
    public MessageWriter provideGhostWriter(MyClock clock) {
        return new MessageWriter(clock);
    }

    @Provides
    public MyClock provideClock() {
        return new MyClock();
    }
}
