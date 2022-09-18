package pckg.Lab9;
class mother{
	public void display() {
		System.out.println("Mother class display");
	}
}

class daughter extends mother{
	public void display() {
		System.out.println("Daughter class display");
	}
}
public class lab9task2 {
public static void main(String[] args) {
	daughter xyz = new daughter();
	xyz.display();
}
}
