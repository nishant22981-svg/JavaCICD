import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddition() {

        App obj = new App();

        assertEquals(30, obj.add(10, 20));
    }
}
