package FirstOOPtest;
import java.util.ArrayList;
class youtube{
	String title;
	String UploadD;
	int Views;
	int dislikes;
	int likes;
	String Duration;
	ArrayList<String> arraylist=new ArrayList<String>();
	void play() {
		System.out.println("Video started playing");
	}
	void forward_10_secs() {
		System.out.println("Video is fast forwarded by 10 seconds");
	}
	void rewind_10_secs() {
		System.out.println("Video is rewinded by 10 seconds");
	}
	void addComments(String x) {
	arraylist.add(x);
	}
	void display() {
		System.out.println("The video name is "+this.title+" uploaded on "+this.UploadD+" with "+this.Views+" views , "+this.likes+
				" likes,"+this.dislikes+" likes having "+this.Duration+" duration");
	}
	 youtube(String title, String uploadD, int views, int dislikes, int likes, String duration) {
		this.title = title;
		UploadD = uploadD;
		Views = views;
		this.dislikes = dislikes;
		this.likes = likes;
		Duration = duration;
	}
	
	
}

public class YoutubeTest {
public static void main(String[] args) {
	youtube montage = new youtube("Montage","20 feb 2003",20000,1500,3000,"30 minutes");
	montage.display();
	montage.addComments("very nice video");
	System.out.println("The comments are:");
	System.out.println(montage.arraylist.get(0));
     System.out.println("");
	
	youtube music = new youtube("Eazy e","29 feb 2018",100000,300,10000,"6 minutes");
	music.display();
	
	youtube muet = new youtube("Welcome to muet","14 september 2021",15000,15,1000," 20 minutes");
	muet.display();
	
	
}
}