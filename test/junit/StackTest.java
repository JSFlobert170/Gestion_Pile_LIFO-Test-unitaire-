// TP Partie 2 : Gestion de pile LIFO, Flobert JOHNSON 3eme Bachelor CDA option Full Stack
package junit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import Junit.Queue;


class StackTest {
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Test
	public void TestPush() {
		Stack test = new Stack();
		assertTrue(test.isEmpty());
		assertEquals(0, test.size());		// verifier que la liste est vide
		test.push(4); 						// Ajouter une valeur cette liste
        test.push(23); 
        test.push(23); 
        assertFalse(test.isEmpty());		// Verifier que la valeur a bien été ajouté dans la liste
	}
	
	@Test
	public void TestPop(){
		Stack tt = new Stack();						// Ajout des valeurs
	 	tt.push(45);
        tt.push(11);
        tt.push(79);
        assertEquals(79, tt.pop());					// On verifie que la valeur a supprimer est bien la derniere valeur(LIFO)qui est bien 79
        assertEquals(2, tt.size());      
        assertEquals(11, tt.pop());		
        assertEquals(1, tt.size());	
	}
	
	@Test
	public void TestSize(){
		Stack tt = new Stack(); 
		assertEquals(0, tt.size());				// Tableau vide la taille est a 0
        tt.push(23); 							// Ajout valeur
        tt.push(7); 
        tt.push(70); 
        assertEquals(3, tt.size());				// Donc on a bien la taille a 3
	}
	
	@Test
	public void TestPlusGrandNombre() {
		Stack tt = new Stack();
        tt.push(14);
        tt.push(4);
        tt.push(3);
        tt.push(9);
	    assertEquals(14, tt.ValSuperieure());		// On verfie que le programme trouve bien la plus grande valeur 4
	}
	
	
	@Test
	public void TestNombreMelange() {
		Stack tt = new Stack();
		tt.push(4); 
        tt.push(23); 
        tt.push(7); 
        assertEquals(23, tt.ValSuperieure());
	}
	
	@Test
	public void TestNombreNegatif(){
	Stack list = new Stack();
		list.push(-4);  
        list.push(-1); 
        list.push(-7); 
        assertEquals(-1, list.ValSuperieure());
	}
	
	@Test
	public void TestDerniereValeurTop(){
		Stack test = new Stack();
		test.push(59); 
        test.push(23); 
        test.push(47);
        test.push(82);
        assertEquals(82, test.top());
        test.pop();
        assertEquals(47, test.top());     
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
	
	@Test
	public void TestValeurNull(){
		Stack test = new Stack();
		assertThrows(RuntimeException.class, () -> {
			test.push((Integer) null);
		});
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
