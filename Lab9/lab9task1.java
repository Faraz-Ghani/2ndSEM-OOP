package pckg.Lab9;
//this code has errors because the question itself was wrong and i am trying my best to follow the guidelines
//while avoiding apologies.
interface vehicle{
	private String color;
	private String model;
	private String weight;

	public String getColor();
	public String getModel();
	public String getWeight();
	public void setColor(String color) ;
	public void setModel(String model) ;
	public void setWeight(String weight);
	public void accelerate();
	
	public void decelerate();
}

interface Bus extends vehicle{
final int wheels=8; 
}


interface Truck extends vehicle{
final int wheels=6;
}

interface Car extends vehicle{
final int wheels=4;
}

class SchoolBus implements Bus{
	private String color= "yellow";
	private String model="2003";
	private String weight="7 tons";
	
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public String getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void accelerate() {
		System.out.println("Accelerating 10km/h");
	}
	public void decelerate() {
		System.out.println("Decelerating 10km/h");	
	}
}


class Vigotruck implements Truck{
	
	private String color= "Black";
	private String model="2021";
	private String weight="2 tons";
	
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public String getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void accelerate() {
		System.out.println("Accelerating 30km/h");
	}
	public void decelerate() {
		System.out.println("Decelerating 30km/h");	
	}
}


class HondaCar implements Car{
	private String color= "White";
	private String model="2007";
	private String weight="1 tons";
	
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public String getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void accelerate() {
		System.out.println("Accelerating 40km/h");
	}
	public void decelerate() {
		System.out.println("Decelerating 40km/h");	
	}
}

public class lab9task1 {

}
