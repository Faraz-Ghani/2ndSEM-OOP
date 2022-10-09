package pckg.lab10;


public class lab10task2 
{
  public static void main(String[] args) 
  {
      Storage Store = new Storage();
	  Counter Count= new Counter(Store);
	  Printer Print= new Printer(Store);

	  Print.start();
	  Count.start();
      
  }
}
class Storage{
	int i=0;
	public synchronized void incI(int v) 
  {
	  i = v;
	}
  public synchronized int getI()
  {
    return i;
  }
}//storage class close

class Counter extends Thread{

    Storage Cstore;
    public Counter(Storage Cstore)
    {
      this.Cstore = Cstore;
    }
	  public void run()
	  {
	    for(int i=0;i<=20;i++)
      {
	      synchronized (Cstore) {
        Cstore.incI(i);
        Cstore.notify();
        try {
           Cstore.wait();
        }
        catch(InterruptedException ie) { System.out.println("Exception is caught in first thread");}
        }
      }
    }
}//counter class close
	  
class Printer extends Thread{
  Storage Pstore;
  public Printer(Storage Pstore)
  {
    this.Pstore = Pstore;
  }
	public void run() {
  int counter = 0;
  synchronized (Pstore) {
    while (counter <= 20) {
      try {
        Pstore.wait();
      }
      catch(InterruptedException ie) { System.out.println("Exception is caught in second thread"); }
      System.out.println(counter=Pstore.getI());
      Pstore.notify();
            }
          }
      }
}//printer class close