package FirstOOPtest;
class Calculator{
	double x;//attributes
	double y;

	double add() {//add method
		return this.x+this.y;
	}
	
	double sub() {//subtraction method
		return this.x-this.y;
	}
	
	double mult() {//multiplication method
		return this.x*this.y;
	}
	double div() {//division method
		return this.x/this.y;
	}
	
	Calculator(double a,double b){//constructor that sets the values of attributes
		this.x=a;
		this.y=b;
	}
}

public class Calculatortest {
public static void main(String[] args) {//main function
	int a=10;//value for parameter of contructors
	int b=20;

	Calculator add = new Calculator(a,b);//new object wiht values of a and b
	System.out.println("Add method   "+add.add());//adding method used

	System.out.println("subtraction method   " +add.sub());//subtraction method used
	
	int x=10;//value of parameter of contructors for second obeject
	int y=2;
	Calculator div = new Calculator(x,y);//second objects created with values of x and y
	System.out.println("Divison method   "+div.div());//divison method used
	System.out.println("multiplication method  "+div.mult());//,multiplication method used
	//names of objects are add and div respectively

}
	
}