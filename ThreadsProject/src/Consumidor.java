
public class Consumidor implements Runnable {

	@Override
	public void run() {
		System.out.println("INICIANDO Consumidor...");
		int cont = 0;
		while(cont<EjemploThread.max) {
			if (EjemploThread.lista.size()<=0) {
				try {
					System.out.println("Consumidor durmiendo...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//catch
			}//if size<=0
			synchronized (EjemploThread.lista) {
			System.out.println("Consumidor: "+ EjemploThread.lista.remove(0));
			}//sync
			cont++;
			
		}//while
		System.out.println("FIN Consumidor...");
	}//run
	

}//Consumidor
