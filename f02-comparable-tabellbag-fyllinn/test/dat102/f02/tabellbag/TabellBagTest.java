package dat102.f02.tabellbag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellBagTest {

	@Test
	void test() {

        BagADT<String> pose = new TabellBag<>(3);
        assertTrue(pose.isEmpty());

        assertEquals(0,pose.getNumberOfEntries());

        pose.add("eple");
        pose.add("banan");

        assertFalse(pose.isEmpty());
        assertEquals(2,pose.getNumberOfEntries());

        pose.add("eple");   //Nå er posen full
        assertFalse(pose.add("banan"));

        assertEquals(3,pose.getNumberOfEntries());

        pose.clear();
        assertEquals(0,pose.getNumberOfEntries());
	}

}
