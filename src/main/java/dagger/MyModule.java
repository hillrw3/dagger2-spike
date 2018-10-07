package dagger;

@Module
public class MyModule {

    @Provides
    public MessageWriter provideGhostWriter() {
        return new MessageWriter();
    }

    @Provides
    public MyClock provideClock() {
        return new MyClock();
    }
}
