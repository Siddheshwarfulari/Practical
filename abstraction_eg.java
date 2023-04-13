package Abstraction;

abstract class Parentabs{
	Parentabs(){
		System.out.println("No-args Cons");
	}
	abstract void show();
	void run() {
		System.out.println("non abstracr Method");
	}
}

class Childabs extends Parentabs{
 void show() {
		System.out.println("Parent class abstracrt method");
	}
}
public class abstraction_eg {
 public static void main(String args[]) {
	 Parentabs object = new Childabs();
	 object.show();
	 object.run();
 }
}
