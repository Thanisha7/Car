import org.testng.annotations.Test;

public class CarTests {
    @Test
    public void shouldStartEngine(){
        new Car().start();
    }
    @Test
    public void shouldStopEngine(){
        new Car().stop();
    }

}
