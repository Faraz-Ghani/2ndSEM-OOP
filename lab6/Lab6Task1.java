package pckg.lab6;
//01.	Write java code that takes a value at runtime and searches it in the array.
//if the value appears in the array then it prints the position of the value or else prints a message that value is not found.

public class Lab6Task1 {
public static void main(String[] args) {
int array[]= {1,2,4,5,7,8,10,22,11,15};
System.out.println("Please enter a number");
int size=array.length+1;
int input=Integer.parseInt(args[0]);  
for(int i=0;i<size;i++) {
	
	if (i==size-1){
		System.out.println("This number is not an element of the array");
		break;}
	
	
	else if(input==array[i]) {
	System.out.println("The index of this element "+array[i]+" in the array is "+i);
	break;
	}
    

}//loop close	
}//main close
}//class close

