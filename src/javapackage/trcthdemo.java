package javapackage;

public class trcthdemo
{
	public static void main(String args[]) //throws InterruptedException
	{
		try{
			int a[]= new int[3];
			int i= a[4];
		}
		catch(Exception ex)
		{
			System.out.println("Display : - " +ex.getMessage());
		}
		finally
		{
			System.out.println("finally always will be executed");
		}
		//Thread.sleep(100);
}

}