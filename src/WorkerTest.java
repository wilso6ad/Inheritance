import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    @Test
    void calculateWeeklyPay() {
        Worker worker = new Worker("Bruce", "Wayne", "001", "Mr.", 1981, 30.0);
        assertEquals(1200, worker.calculateWeeklyPay(40));
        assertEquals(1650, worker.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay() {
        Worker worker = new Worker("Bruce", "Wayne", "001", "Mr.", 1981, 30.0);
        assertEquals("Weekly Pay: 1200.00", worker.displayWeeklyPay(40));
        assertEquals("Weekly Pay: 1650.00", worker.displayWeeklyPay(50));
    }
}