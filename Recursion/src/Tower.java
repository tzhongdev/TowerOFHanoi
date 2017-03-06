import java.util.Stack;

public class Tower {

	public static void main(String[] args) {
		
		// number of discs 
		int n = 4;
		
		Stack<Integer> beg = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		Stack<Integer> end = new Stack<>();
		
		beg.push(4);
		beg.push(3);
		beg.push(2);
		beg.push(1);
		
		//before
		System.out.println("Begin \n" + beg);
		System.out.println("Aux \n"+ aux);
		System.out.println("End \n" + end);
		hanoi(n, beg, aux, end);
		// after
		System.out.println("Begin \n" + beg);
		System.out.println("Aux \n"+ aux);
		System.out.println("End \n" + end);
	

	}

	private static void hanoi(int n, Stack<Integer> beg, Stack<Integer> aux, Stack<Integer> end) {
		
		if(n > 1) {
			// case 1
			hanoi(n-1, beg, end, aux);			
			// case2
			hanoi(1, beg, aux, end);
			// case3
			hanoi(n-1, aux, beg, end);
			
		}
		else {
			// move
			end.push(beg.pop());
		}

	}


}
