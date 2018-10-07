package dagger;

class App {

    public static void main(String[] args) {
        AppComponent component = DaggerAppComponent.create();
        MyService service = component.service();
        System.out.println(service.message());
    }
}