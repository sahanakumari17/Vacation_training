package number;

public class Thread2 implements Runnable{
public void run() {
for(int i=1;i<5;i++) {
try {
Thread.sleep(500);
}catch(InterruptedException e) {
System.out.print(e);
}
System.out.println(i);
}
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Thread2 t1=new Thread2();
Thread2 t2=new Thread2();
t1.start();
t2.start();

}

private void start() {
	// TODO Auto-generated method stub
	
}

}