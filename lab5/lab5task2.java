package pckg.lab5;

//02. Create an example at your choice which demostrate  Constructor , mutators , accessors , static class members

class Laptop{
	static int Count=2312131;//static member
	
	private int IMEI;
	public void AssignIMEI() {
		Count++;
		this.IMEI=Count;	}
	private int Memory;
	private int Model;
	private String Name;
	private String Series;
	
	public void setMemory(int mem) {//mutators
		this.Memory=mem;
	}
	public int getMemory() {
		return this.Memory;
	}

	
	public void setModel(int model) {//accessors
		this.Model=model;
	}
	public int getModel() {
		return this.Model;
	}
	

	public void setName(String name) {
		this.Name=name;
	}
	public String getName() {
		return this.Name;
	}
	
	
	public void setSeries(String series) {
		this.Series=series;
	}
	public String getSeries() {
		return this.Series;
	}
	
	

	public int getIMEI() {
		return this.IMEI;
	}
	
	
	
	Laptop(){//constructor
		this.AssignIMEI();}}//laptop close

public class lab5task2{
public static void main (String[] args) {
    Laptop DellG15= new Laptop();
    DellG15.setMemory(18000);
    DellG15.setModel(15);
    DellG15.setName("SUSANOO");
    DellG15.setSeries("G Series");
  
System.out.println("Name = "+DellG15.getName()+"\nIMEI = "+DellG15.getIMEI()+"\nMemory(MBS) = "+DellG15.getMemory());
System.out.println("Model = "+DellG15.getModel()+"\nSeries = "+DellG15.getSeries());
	}}


