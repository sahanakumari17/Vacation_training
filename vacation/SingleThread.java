package vacation;

public class SingleThread extends Thread{
	public void run() {
		System.out.println("thread is running..");
	}
	public static void main(String args[])
	{
		SingleThread t1= new SingleThread();
		t1.start();
	}

}
