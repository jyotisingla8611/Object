 /*Create a class Complex with real and imaginary parts as it�s data members.  Create a member function called Display()
 to display the complex number properly. 
Example : real part = 2 and imaginary part = 5, then the function should show 2+5i.*/


package Assignment5;
import java.util.Scanner;

public class Complex_Number {
	int real;
	int imag;
	public void setReal(int real) {
		this.real = real;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public void display()
	{
		if(imag>=0)
		{
			System.out.println("Complex Number is : "+real+"+"+imag+"i");
		}
		else
		{
			System.out.println("Complex Number is : "+real+imag+"i");
		}
	}
	@SuppressWarnings("resource")
	public static void main(String...ar)
	{
		Complex_Number comp=new Complex_Number();
		int r,i;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter real and imaginary part ");
		r=obj1.nextInt();
		i=obj1.nextInt();
		comp.setReal(r);
		comp.setImag(i);
		comp.display();
		
	}
}
