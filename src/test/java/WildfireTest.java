import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WildfireTest {
    @Test
    public void basicTest() {
        // Testing default constructor
        Wildfire wf = new Wildfire();
        assertEquals("T T T T T \nT T T T T \nT T T T T \nT T T T T \nT T T T T \n", wf.toString());
        // Testing StartFire with a map of all trees
        // Wrong coordinates
        wf.startFire(-1, 4);
        assertEquals("T T T T T \nT T T T T \nT T T T T \nT T T T T \nT T T T T \n", wf.toString());
        wf.startFire(0, 0);
        assertEquals("F F F F F \nF F F F F \nF F F F F \nF F F F F \nF F F F F \n", wf.toString());
    }

    @Test
    public void createCustomMapTest() {
        Wildfire wf;
        assertDoesNotThrow(() -> new Wildfire("map.txt"));
        wf = new Wildfire("map.txt");
        assertEquals("W W W W \nW T T W \nW T T W \nW W W W \nW T T W \n", wf.toString());
    }

    @Test
    public void startFireOnCustomMap() {
        Wildfire wf = new Wildfire("map.txt");
        wf.startFire(1, 1);
        assertEquals("W W W W \nW F F W \nW F F W \nW W W W \nW T T W \n", wf.toString());
        wf.startFire(4, 1);
        assertEquals("W W W W \nW F F W \nW F F W \nW W W W \nW F F W \n", wf.toString());
    }

    @Test
    public void startFireOnWaterCellTest() {
        Wildfire wf = new Wildfire("map.txt");
        wf.startFire(0, 0);
        assertEquals("W W W W \nW T T W \nW T T W \nW W W W \nW T T W \n", wf.toString());
    }
}