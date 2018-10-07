package dagger;

@Component(modules = MyModule.class)
public interface AppComponent {
    MyService service();
//    MessageWriter ghostwriter();
}
