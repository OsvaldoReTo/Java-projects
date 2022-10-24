import java.util.Random;

public class CicloThread extends Thread{
	private int max =0;
	private Random random;
	
	public CicloThread(int max, String name) {
		super();
		this.max = max;
		setName(name);
		random = new Random();
	}//constructor
	
	@Override
	public void run() {
		//super.run();
		int cont =0;
		while(cont<max) {
			System.out.println(getName()+": "+cont++);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//while
	}// run

	public int getMax() {
		return max;
	}//getMax

	public void setMax(int max) {
		this.max = max;
	}//setMax

	public static void main(String[] args) {
		CicloThread t1 = new CicloThread(15, "Thread 1");
		CicloThread t2 = new CicloThread(10, "Thread 2");
		CicloThread t3 = new CicloThread(15, "Thread 3");
		CicloThread t4 = new CicloThread(12, "Thread 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}//main

}//class CicloThread
