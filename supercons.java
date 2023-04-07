package Super;





class Shape2 {//patent class
	//default constructor of parent class
	Shape2()
	{
		System.out.println("Hello");
	}
}
class Size2 extends Shape2{// child class
	//Default constrctor of the child class
	Size2(){
		//invoke immediate patent class constructor line no 7
		//super();
		System.out.println("Hi");
		
	}
}
public class supercons {
public static void main (String args[]) {
	Size2 obj=new Size2();// creating obj of child class
}
}
