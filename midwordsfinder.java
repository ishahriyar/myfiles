import java.util.Scanner;
public class midwordsfinder {

	public static void main(String[] args) {
	
	System.out.print("Dude Enter your name:");
	String mystr= new String();
	Scanner sc=new Scanner(System.in);
	mystr=sc.nextLine();
	int a=mystr.length();
	int b=a/2;
	if(a%2==1){
	System.out.println("Middle letter in your name:"+mystr.charAt(b));
	}
	else{
	int d=b-1;
		
	System.out.print("Middle letters in your name:"+mystr.charAt(d)+mystr.charAt(b));
	}
	}
}
