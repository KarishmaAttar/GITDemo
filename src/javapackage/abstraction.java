package javapackage;

abstract class Bank
{
	abstract int RateOfInterest();

@SuppressWarnings("unused")
class PNB extends Bank
{
	 int RateOfInterest()
	{
		return 8;
	}
}
}

class abstraction 
{
	public static void main(String args[])
	{
		Bank b;
		b=new SBI();
		System.out.println("RateOfInterest:" +b.RateOfInterest() +"%");
		
		b=new PNB();
		System.out.println("RateOfInterest:" +b.RateOfInterest() +"%");
		

	}
}
