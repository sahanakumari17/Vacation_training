package vacation;

public class TestSleepMethod3 {
	public static void main(String args[]) throws InterruptedException
	{
		try
		{
			for(int j=0;j<5;j++)
			{
				Thread.sleep(-100);
				System.out.println();
			}
		}
		catch(Exception expn) {
			System.out.println(expn);
		}
	}

}
