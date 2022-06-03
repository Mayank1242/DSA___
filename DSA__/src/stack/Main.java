package stack;

public class Main {
	public static void main(String args[]) {
		stack s=new stack();
		s.push(10);
		s.push(12);
		s.pop();
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		
	}
}
