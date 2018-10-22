import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	Item[] vector1 = new Item[] {new Item(100), new Item(200), new Item(300), new Item(400), new Item(500)};
	
	//Node coverage and edge coverage test case 1
	
	@SuppressWarnings("static-access")
	@Test
	public void testingBubbleSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
		algos.bubbleSort(vector2);
		
		assertTrue(vector1[0].key == vector2[0].key);
		assertTrue(vector1[1].key == vector2[1].key);
		assertTrue(vector1[2].key == vector2[2].key);
		assertTrue(vector1[3].key == vector2[3].key);
		assertTrue(vector1[4].key == vector2[4].key);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void bubbleSort_AlreadySortedItems() {
		SortAlgos sortAlgos = new SortAlgos();
		
		Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
		sortAlgos.bubbleSort(vector2);
	
		assertTrue(vector1[0].key == vector2[0].key);
		assertTrue(vector1[1].key == vector2[1].key);
		assertTrue(vector1[2].key == vector2[2].key);
		assertTrue(vector1[3].key == vector2[3].key);
		assertTrue(vector1[4].key == vector2[4].key);
		
	}
	
	//Edge Condition coverage test 1
	@SuppressWarnings("static-access")
	@Test
	public void bubblesort_whenTrowsException() {
		SortAlgos sa = new SortAlgos();
		
		try {
			sa.bubbleSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}
		
		//Edge Condition coverage test 2
		@SuppressWarnings("static-access")
		@Test
		public void bubbleSort_whenOnlyOnceInput() {

			SortAlgos sa = new SortAlgos();
			
			Item[] vector2 = new Item[]{new Item(5)};
			sa.bubbleSort(vector2);
		
			assertTrue(5 == vector2[0].key);
					
	}
	
		@SuppressWarnings("static-access")
		@Test
		public void testingSelectionSort() {
			SortAlgos algos = new SortAlgos();
			
			Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
			algos.selectionSort(vector2);
			
			assertTrue(vector1[0].key == vector2[0].key);
			assertTrue(vector1[1].key == vector2[1].key);
			assertTrue(vector1[2].key == vector2[2].key);
			assertTrue(vector1[3].key == vector2[3].key);
			assertTrue(vector1[4].key == vector2[4].key);
		}
		
		@SuppressWarnings("static-access")
		@Test
		public void selectionSort_AlreadySortedItems() {
			SortAlgos sortAlgos = new SortAlgos();
			
			Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
			sortAlgos.selectionSort(vector2);
		
			assertTrue(vector1[0].key == vector2[0].key);
			assertTrue(vector1[1].key == vector2[1].key);
			assertTrue(vector1[2].key == vector2[2].key);
			assertTrue(vector1[3].key == vector2[3].key);
			assertTrue(vector1[4].key == vector2[4].key);
			
		}
		
		//Edge Condition coverage test 1
		@SuppressWarnings("static-access")
		@Test
		public void selectionSortwhenTrowsException() {
			SortAlgos sa = new SortAlgos();
			
			try {
				sa.insertionSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
			
		}
			
			//Edge Condition coverage test 2
			@SuppressWarnings("static-access")
			@Test
			public void selectionSortwhenOnlyOnceInput() {

				SortAlgos sa = new SortAlgos();
				
				Item[] vector2 = new Item[]{new Item(500)};
				sa.selectionSort(vector2);
			
				assertTrue(500 == vector2[0].key);
						
		}
			
			@SuppressWarnings("static-access")
			@Test
			public void testinginsertionSort() {
				SortAlgos algos = new SortAlgos();
				
				Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
				algos.insertionSort(vector2);
				
				assertTrue(vector1[0].key == vector2[0].key);
				assertTrue(vector1[1].key == vector2[1].key);
				assertTrue(vector1[2].key == vector2[2].key);
				assertTrue(vector1[3].key == vector2[3].key);
				assertTrue(vector1[4].key == vector2[4].key);
			}
			
			@SuppressWarnings("static-access")
			@Test
			public void insertionSort_AlreadySortedItems() {
				SortAlgos sortAlgos = new SortAlgos();
				
				Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
				sortAlgos.insertionSort(vector2);
			
				assertTrue(vector1[0].key == vector2[0].key);
				assertTrue(vector1[1].key == vector2[1].key);
				assertTrue(vector1[2].key == vector2[2].key);
				assertTrue(vector1[3].key == vector2[3].key);
				assertTrue(vector1[4].key == vector2[4].key);
				
			}
			
			//Edge Condition coverage test 1
			@SuppressWarnings("static-access")
			@Test
			public void insertionSortwhenTrowsException() {
				SortAlgos sa = new SortAlgos();
				
				try {
					sa.insertionSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
				}
				
			}
			
			//Edge Condition coverage test 2
			@SuppressWarnings("static-access")
			@Test
			public void insertionSortwhenOnlyOnceInput() {

				SortAlgos sa = new SortAlgos();
				
				Item[] vector2 = new Item[]{new Item(500)};
				sa.selectionSort(vector2);
			
				assertTrue(500 == vector2[0].key);
						
		}	
		
			@SuppressWarnings("static-access")
			@Test
			public void testingmergeSort() {
				SortAlgos algos = new SortAlgos();
				
				Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
				algos.mergeSort(vector2);
				
				assertTrue(vector1[0].key == vector2[0].key);
				assertTrue(vector1[1].key == vector2[1].key);
				assertTrue(vector1[2].key == vector2[2].key);
				assertTrue(vector1[3].key == vector2[3].key);
				assertTrue(vector1[4].key == vector2[4].key);
			}
			
			@SuppressWarnings("static-access")
			@Test
			public void mergeSort_AlreadySortedItems() {
				SortAlgos sortAlgos = new SortAlgos();
				
				Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
				sortAlgos.mergeSort(vector2);
			
				assertTrue(vector1[0].key == vector2[0].key);
				assertTrue(vector1[1].key == vector2[1].key);
				assertTrue(vector1[2].key == vector2[2].key);
				assertTrue(vector1[3].key == vector2[3].key);
				assertTrue(vector1[4].key == vector2[4].key);
				
			}
			
			//Edge Condition coverage test 1
			@SuppressWarnings("static-access")
			@Test
			public void mergeSortwhenTrowsException() {
				SortAlgos sa = new SortAlgos();
				
				try {
					sa.mergeSort(null);
				} catch (NullPointerException e) {
					assertNull(e.getMessage());
				}
				
			}
				
				//Edge Condition coverage test 2
				@SuppressWarnings("static-access")
				@Test
				public void mergeSortwhenOnlyOnceInput() {

					SortAlgos sa = new SortAlgos();
					
					Item[] vector2 = new Item[]{new Item(500)};
					sa.mergeSort(vector2);
				
					assertTrue(500 == vector2[0].key);
							
			}
				@SuppressWarnings("static-access")
				@Test
				public void testingquickSort() {
					SortAlgos algos = new SortAlgos();
					
					Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
					algos.quickSort(vector2);
					
					assertTrue(vector1[0].key == vector2[0].key);
					assertTrue(vector1[1].key == vector2[1].key);
					assertTrue(vector1[2].key == vector2[2].key);
					assertTrue(vector1[3].key == vector2[3].key);
					assertTrue(vector1[4].key == vector2[4].key);
				}
				
				@SuppressWarnings("static-access")
				@Test
				public void quickSort_AlreadySortedItems() {
					SortAlgos sortAlgos = new SortAlgos();
					
					Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
					sortAlgos.quickSort(vector2);
				
					assertTrue(vector1[0].key == vector2[0].key);
					assertTrue(vector1[1].key == vector2[1].key);
					assertTrue(vector1[2].key == vector2[2].key);
					assertTrue(vector1[3].key == vector2[3].key);
					assertTrue(vector1[4].key == vector2[4].key);
					
				}
				
				//Edge Condition coverage test 1
				@SuppressWarnings("static-access")
				@Test
				public void quickSortwhenTrowsException() {
					SortAlgos sa = new SortAlgos();
					
					try {
						sa.quickSort(null);
					} catch (NullPointerException e) {
						assertNull(e.getMessage());
					}
					
				}
					
					//Edge Condition coverage test 2
					@SuppressWarnings("static-access")
					@Test
					public void quickSortwhenOnlyOnceInput() {

						SortAlgos sa = new SortAlgos();
						
						Item[] vector2 = new Item[]{new Item(500)};
						sa.quickSort(vector2);
					
						assertTrue(500 == vector2[0].key);
								
				}
					
					@SuppressWarnings("static-access")
					@Test
					public void testingheapSort() {
						SortAlgos algos = new SortAlgos();
						
						Item[] vector2 = new Item[] {new Item(500), new Item(400), new Item(300), new Item(200), new Item(100)};
						algos.heapSort(vector2);
						
						assertTrue(vector1[0].key == vector2[0].key);
						assertTrue(vector1[1].key == vector2[1].key);
						assertTrue(vector1[2].key == vector2[2].key);
						assertTrue(vector1[3].key == vector2[3].key);
						assertTrue(vector1[4].key == vector2[4].key);
					}
					
					@SuppressWarnings("static-access")
					@Test
					public void heapSort_AlreadySortedItems() {
						SortAlgos sortAlgos = new SortAlgos();
						
						Item[] vector2 = new Item[]{new Item(100),new Item(200),new Item(300),new Item(400),new Item(500)};
						sortAlgos.heapSort(vector2);
					
						assertTrue(vector1[0].key == vector2[0].key);
						assertTrue(vector1[1].key == vector2[1].key);
						assertTrue(vector1[2].key == vector2[2].key);
						assertTrue(vector1[3].key == vector2[3].key);
						assertTrue(vector1[4].key == vector2[4].key);
						
					}
					
					//Edge Condition coverage test 1
					@SuppressWarnings("static-access")
					@Test
					public void heapSortwhenTrowsException() {
						SortAlgos sa = new SortAlgos();
						
						try {
							sa.heapSort(null);
						} catch (NullPointerException e) {
							assertNull(e.getMessage());
						}
						
					}
						
						//Edge Condition coverage test 2
						@SuppressWarnings("static-access")
						@Test
						public void heapSortwhenOnlyOnceInput() {

							SortAlgos sa = new SortAlgos();
							
							Item[] vector2 = new Item[]{new Item(500)};
							sa.heapSort(vector2);
						
							assertTrue(500 == vector2[0].key);
									
					}
				
}


