import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int count=0;
	    for(int i = 2 ;i<a;i++){
	        if(a%i==0){
	            count++;
	            break;
	        }
      	        
	    }
	    
	    if (count == 0){
	        System.out.print("prime");
	    }
	    else{
	        system.out.print("not a prime ");
	    }
	}
}
