import java.util.Scanner;
public class Arithmetics {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter two numbers.\nMost preferably first number should be greater than second one.\nThis is not the case if you are finding a quotient or remainder though.");
		int n1, n2;
		int ad,sb,ml=0;
		double qo,rem=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		sc.close();
		ad=n1+n2;
		sb=n1-n2;
		ml=n1*n2;
		qo=(double)n1/n2;
		rem=(double)n1%n2;
		System.out.print("The sum is:"+ad);
		System.out.print("\nThe difference is:"+sb);
		System.out.print("\nThe product is:"+ml);
		System.out.print("\nThe quotient is:"+qo);
		System.out.print("\nThe remainder is:"+rem);
	}
	
	

}