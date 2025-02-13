import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String emp1 = "";
	    String emp2 ="";
	    for(int i=str.length()-1;i>=0;i--){
	        if(i>= str.length()/2)
	           emp1 = emp1+str.charAt(i);
	        else if ( i<str.length()/2)
	           emp2 = emp2+str.charAt(i);
	           
	         }
	         System.out.print(emp2+" "+emp1);
	         
	    
	}
}

//output
input : sarath
output : ras hta
