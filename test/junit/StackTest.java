// TP Partie 2 : Gestion de pile LIFO, Flobert JOHNSON 3eme Bachelor CDA option Full Stack
package junit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;


class StackTest {
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Test
	public void TestPush() {
		Stack test = new Stack();
		assertTrue(test.isEmpty());
		assertEquals(0, test.size());
		test.push(4); 
        test.push(23); 
        assertFalse(test.isEmpty());
	}
	
	@Test
	public void TestPop(){
		Stack tt = new Stack();
	 	tt.push(45);
        tt.push(68);
        tt.push(11);
        tt.push(79);
        assertEquals(4, tt.size());
        int top = tt.pop();
        assertEquals(79, top);
        assertEquals(68, tt.ValSuperieure());
        assertEquals(3, tt.size());
	}
	
	@Test
	public void TestPlusGrandNombre() {
		Stack tt = new Stack();
        tt.push(14);
        tt.push(4);
        tt.push(3);
        tt.push(9);

        System.out.print("size : "+tt.size());
        System.out.print("top : "+tt.top());
        
	    int GrandeValeur = tt.ValSuperieure();
	    System.out.print("Grandevaleur : "+GrandeValeur);
	    System.out.println("Taille de LinkedList = " + list.size());
	    assertEquals(14, GrandeValeur);
	}
	
	
	@Test
	public void TestNombreMelange() {
		Stack tt = new Stack();
		tt.push(4); 
        tt.push(23); 
        tt.push(7); 
        tt.push(1); 
        assertEquals(23, tt.ValSuperieure());
	}
	
	@Test
	public void TestNombreNegatif(){
	Stack list = new Stack();
		list.push(-4); 
        list.push(-9); 
        list.push(-1); 
        list.push(-7); 
        assertEquals(-1, list.ValSuperieure());
	}
	
	@Test
	public void TestDerniereValeurTop(){
		Stack tet = new Stack();
		tet.push(59); 
        tet.push(23); 
        tet.push(47);
        tet.push(82);
        assertEquals(82, tet.top());
        assertFalse(tet.isEmpty());
        tet.pop();
        assertEquals(47, tet.top());     
	}

	@Test
	public void TestSize(){
		Stack tt = new Stack(); 
		assertEquals(0, tt.size());
        tt.push(23); 
        tt.push(7); 
        tt.push(10); 
        tt.push(234); 
        tt.push(47);
        tt.pop();
        assertEquals(4, tt.size());
	}
	
	@Test
	public void TestIsEmpty() throws NullPointerException {	
			Stack tt = new Stack();	
//	        list.removeAll(list);  // Vider le tableau       
	        assertTrue(tt.isEmpty());
	        assertEquals(0, tt.size());
	        tt.push(23);
 	      	assertFalse(tt.isEmpty());  		   
	}

 	
	
/*	@Test
	public void TestNombreVirgule(){
	
	}

	@Test
	public void TestIsLettre() {
	  	try{
			list.add(4); 
	        list.add(9); 
	        list.add(7); 
	        list.add(1); 
	        
	        int GrandeValeur = test.ValSuperieure(list);
	        assertEquals(9, GrandeValeur);   
  		}
		catch(Exception e) {
    		System.out.print("Désolé la valeur saisie n'est pas un nombre.");
		}
	}
	
*/
}
