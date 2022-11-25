//TP Partie 2 : Gestion pile LIFO, Flobert JOHNSON 3eme Bachelor CDA option Full Stack
package junit;
import java.util.LinkedList;

	public class Stack {

		int top=0;
		LinkedList<Integer> tableau = new LinkedList<Integer>();
		public void push(int elem) {
			tableau.add(elem);
			//tableau.set(top, elem);
			top++;
		}

		public int pop() {
			int elem;
			top--;
			elem = tableau.get(top);
			tableau.set(top, 0);	
			return elem;
		}

		public int ValSuperieure() {
			int max = 0;
			if(top != 0) {
				max = Integer.MIN_VALUE;
				for(int i=0; i<top; i++) {
					if(tableau.get(i) > max) {
						max = tableau.get(i);
					}
				}	
			}
			return max;
		}
		
		
		public boolean isEmpty() {
			if(top == 0)	return true;
			else return false;		
		}
		
		public void show() {
			for(int i=0; i<top; i++) {
				System.out.print(tableau.get(i)+" ");
			}
		}
		
		public int size() {
			return top;
		}
		
		public int top() {
			return tableau.get(top-1);
		}

}
