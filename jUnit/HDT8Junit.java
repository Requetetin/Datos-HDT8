import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HDT8Junit {
	VectorHeap<String> a = new VectorHeap<String>();
	
	private void createVector() {
		a.add("C");
		a.add("Z");
		a.add("A");
		a.add("D");
	}
	
	@Test
	void testRemove() {
		createVector();
		assertEquals("A",a.remove());
	}
	
	@Test
	void testSize() {
		createVector();
		assertEquals(4, a.size());
	}

}
