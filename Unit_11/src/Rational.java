//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator; 
	private int denominator;

	
public Rational()
{
	numerator=0;
	denominator=0;
}

public Rational(int numerator, int denominator)

{
setRational(numerator, denominator);
}

	//write a setRational method
	public void setRational(int numerator, int denominator)
	{
		if (denominator ==0)
		{
			denominator =1; 
		}
		
		this.numerator= numerator;
		this.denominator=denominator;
		
		reduce(); 
	}

	//write  a set method for numerator and denominator

	public void setNumDenom(int numerator, int denominator)
	{
		this.numerator = numerator; 
		this.denominator = denominator; 
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int number = (this.numerator*other.denominator) + (this.denominator*other.numerator);
		int den = this.denominator*other.denominator;

		numerator = number; 
		denominator = den; 

		reduce();
	}

	private void reduce()
	{
int commonnum = gcd(numerator,denominator);
this.numerator = this.numerator/commonnum;
this.denominator = this.denominator/commonnum;

if (denominator <0)
{
	out.print("The denominator must be bigger than 0");
}

	}

	private int gcd(int numOne, int numTwo)
	{


if (numTwo ==0)
	return numOne;

int b = numOne%numTwo; 
return gcd(numTwo, b);


	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{

double absval1 = (double) this.numerator/this.denominator;
double absval2 = (double) other.numerator/other.denominator;

if (absval1<absval2)
{
	return -1; 
}

if (absval1>absval2)
{
	return 1; 
}
if (absval1==absval2)
return 0;


return 0;
	
	}



	
	public String toString()
	{
		return numerator + "/" + denominator; 
	}
	
	
}