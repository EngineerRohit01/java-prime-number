import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
	Scanner input  = new Scanner(System.in);
	
	System.out.print("Enter the no: ");
	int num = input.nextInt();
	
	boolean isprime = isprime(num);
	if(isprime){
	System.out.print("no is prime");
	}
	else{
	System.out.print("no is not prime");
	}
	}
	
	public static boolean isprime(int num){
	int i = 2;
	while(i<num){
	if(num%i==0){
	return false;
	}
	i++;
	}
	return true;
	}
}