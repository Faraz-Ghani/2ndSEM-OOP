package pckg.FirstOOPtest;

import java.util.Scanner;
 class Genre{
	String Gname;

	public String getGname() {
		return Gname;
	}

	public void setGname(String gname) {
		this.Gname = gname;
	}
	
	Genre(String gname){
		Gname=gname;
	}
	
}

 class Director{
		String DName;
		
	    
		public String getDName() {
			return DName;
		}
	
		public void setAName(String Dname) {

			this.DName = Dname;
		}
	
	    
	   Director(String dName){
		DName=dName;
	
		
	   }
	}
 
class CameraMan{
	String CName;

	public String getCname() {

		return CName;
	}
	public void setCname(String cname) {

		this.CName = cname;
	}


	CameraMan(String Cname){
		CName=Cname;
	
	}
	
	
	
}
 
class Actor{
	String AName;
	
    
	public String getAName() {
		return AName;
	}

	public void setAName(String aName) {
		AName = aName;
	}

    
Actor(String Aname)    {
	AName=Aname;

}
}


class Movie{
	String Name;
	int ReleaseY;
	String Duration;
	
	public String getName() {
		return Name;
	}

	public int getReleaseY() {
		return ReleaseY;
	}

	public String getDuration() {
		return Duration;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setReleaseY(int releaseY) {
		ReleaseY = releaseY;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	Actor MovieActor;
	Genre MovieGenre;
	Director MovieDirector;
	CameraMan MovieCamera;
	
	void Shoot(){
		System.out.println("CameraPerson "+this.MovieCamera.getCname()+" Shot the movie under the direction of "+this.MovieDirector.getDName());
		System.out.println("The Actor in the "+this.getName()+" Movie of Genre "+this.MovieGenre.getGname()+" is "+this.MovieActor.getAName());

	}
	void TheatreRelease() {
		System.out.println("This movie was relesased in "+this.getReleaseY()+" in the theatres");
	}
	
	void PostP() {
		System.out.println("After shooting the movie was eidted and vfx were added under the direction of "+this.MovieDirector.getDName());
	}
	
	
	Movie(String name,String duration,int releaseY,String Cname,String Aname,String Dname,String Gname){
		Name=name;
		Duration=duration;
		ReleaseY=releaseY;
		MovieActor = new Actor(Aname);
		MovieGenre = new Genre(Gname);
		MovieDirector = new Director(Dname);
		MovieCamera=new CameraMan(Cname);
	}
}

public class MovieTask {

	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name,dur,act,dir,cam,gen;
	int year;
	System.out.println("Enter the name of the movie : ");
	name=sc.next();
	
	System.out.println("Enter the release date of the movie : ");
	year=sc.nextInt();
	
	System.out.println("Enter the name of the actor : ");
	act=sc.next();
	
	System.out.println("Enter the name of the director : ");
	dir=sc.next();
	
	System.out.println("Enter the name of the cameraperson : ");
	cam=sc.next();
	
	System.out.println("Enter the name of the genre : ");
	gen=sc.next();
	
	System.out.println("Enter the duration of the movie : ");
	dur=sc.next();
	
	
	
	
		
		Movie movie1 = new Movie(name,dur,year,cam,act,dir,gen);
        movie1.Shoot();
        movie1.PostP();
        movie1.TheatreRelease();
        sc.close();

	}
	

}
