import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		
		
		Primenum obj=new Primenum();
		obj.m4();
	}
		public void m4() {
		int num,i,temp;
		boolean flag=true;
		System.out.println("Enter number value: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			temp=num%i;
	
			if(temp==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
		}
		
		
		
	}



