import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void fullName() {
        Person person = new Person("Bruce", "Wayne", "001", "Mr.", 1981);
        assertEquals("Bruce Wayne", person.fullName());
    }

    @Test
    void formalName() {
        Person person = new Person("Bruce", "Wayne", "001", "Mr.", 1981);
        assertEquals("Mr. Bruce Wayne", person.formalName());
    }

    @Test
    void getAge() {
        Person person = new Person("Bruce", "Wayne", "001", "Mr.", 1981);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear - 1981, person.getAge());
    }

    @Test
    void getAgeForYear() {
        Person person = new Person("Bruce", "Wayne", "001", "Mr.", 1981);
        assertEquals(29, person.getAge(2010));
    }
}