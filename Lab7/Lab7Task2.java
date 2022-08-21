package Lab7;
//synchronized keyword makes sure the threads dont intervene with eachother while working on the same object
class Storage{
	int i=0;
	public synchronized void incI(int v) 
{
	  i = v;
	}//setters
public synchronized int getI()
{
  return i;
}//getter
}//storage class close

class Counter extends Thread{

  Storage Cstore;//create object of storage
  public Counter(Storage Cstore)
  {
    this.Cstore = Cstore;//constructor that sets the storage object same as the storage obj in psvm
  }
	  public void run()
	  {
	    for(int i=0;i<=20;i++)//20 loops
    {
	      synchronized (Cstore) {
      Cstore.incI(i);//increase value of i
      Cstore.notify();//this thread calls the object cstore 
      try {
         Cstore.wait();//wait until another thread calls cstore
      }
      catch(InterruptedException ie) { System.out.println("Exception is caught in first thread");}
      }//exception
    }
  }
}//counter class close
	  
class Printer extends Thread{
Storage Pstore;//Storage object for printer class
public Printer(Storage Pstore)
{
  this.Pstore = Pstore;//constructor that sets the storage object same as the storage obj in psvm
}
	public void run() {
int counter = 0;//counter value set as 0
synchronized (Pstore) {
  while (counter <= 20) {
    try {
      Pstore.wait();//puts pstore to wait until called
    }
    catch(InterruptedException ie) { System.out.println("Exception is caught in second thread"); }
    System.out.println(counter=Pstore.getI());//prints the value of i
    Pstore.notify();//calls pstore
          }
        }
    }
}//printer class close

class Lab7Task2 
{
public static void main(String[] args) 
{
	  //objs created
  Storage Store = new Storage();
	  Counter Count= new Counter(Store);
	  Printer Print= new Printer(Store);
//threads started
	  Print.start();
	  Count.start();
    
}
}