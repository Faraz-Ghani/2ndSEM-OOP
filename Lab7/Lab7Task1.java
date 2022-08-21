package Lab7;

class print extends Thread{
	int i=0;

		
	public void run() {
		try {
		for(int j=0;j<=50;j++) {
			
		
		if(i==32) {
			print.sleep(5000);
		}
			System.out.println(i);
			i+=2;
		
		}
		}
		catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}	
		
      
	}

}

public class Lab7Task1 {

	public static void main(String[] args) {
		print even = new print();
even.start();
	}
}
