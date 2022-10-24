
public class Productor extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("INICIO del Productor...");
		int cont=0;
		while(cont<EjemploThread.max) {
			Integer num = Integer.valueOf((int)(Math.random()*500));
			synchronized (EjemploThread.lista) {
			EjemploThread.lista.add(num);
			}//sync
			System.out.println("Productor "+ EjemploThread.lista.size()+": "+num);
			try {
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
			cont++;	
		}//while
		System.out.println("FIN del Productor...");
	}//run
	
}//class Productor
