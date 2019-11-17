package java課題2;

interface communication {
	public void greet();
}

class Greet implements communication {
	public void greet() {
		System.out.println("おはようございます。");
	}
}

public class Main {
	public static void main(String[] args) {
		communication cm = new Greet();
		cm.greet();

	}
}
