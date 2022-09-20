package pckg.Lab9;
class mother{
	public void display() {
		System.out.println("original display method");
	}
}

class daughter extends mother{
	public void display() {
		System.out.println("Over riding method ");
	}
}
public class lab9task2 {
public static void main(String[] args) {
	daughter xyz = new daughter();
	xyz.display();
}
}
