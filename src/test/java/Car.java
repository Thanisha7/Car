import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheelList;
    Car() {
        engine=new Engine();
    }
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();

    }
}
