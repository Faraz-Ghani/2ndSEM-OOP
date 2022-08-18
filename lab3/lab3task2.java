package pckg.lab3;

//Task#2: Print all characters from ascii value 0 to 256.

public class lab3task2 {
		public static void main(String[] args) {
			int count=0;
			for(char i=0;i<256;i++,count++) {
				System.out.print(i + " ");
				if(count>20) {
					System.out.println();
					count=0;
					}
				}
			}
		}


