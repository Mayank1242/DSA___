package Array;
import java.util.*;
public class Codeproces {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0) {
		String s=sc.next();
		
		for(int i=0;i<(s.length());i++) {
			
			for(int j=i+1;j<(s.length()-1);j++) {
				if(s.charAt(0)==s.charAt(i) && s.charAt(i+1)==s.charAt(j+1) ) {
					System.out.println("fALSE");
				   
				}
				if(s.charAt(0)==s.charAt(j) && s.charAt(i+1)!=s.charAt(j) ) {
					System.out.println("True");
				}
//				if(s.charAt(i+1)==s.charAt(j+1)) {
//					System.out.println("false");
//				}
			}
			
		}
		
		
		
		n--;
	}
}
}



