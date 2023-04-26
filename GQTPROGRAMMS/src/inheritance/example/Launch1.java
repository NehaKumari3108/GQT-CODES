package inheritance.example;
abstract class Calculator1{
	abstract void add();
	abstract void sub();
}

public class Launch1 {

	public static void main(String[] args) {
        Calculator1 c1=new Calculator1() {
        	//@override
        	void add() {
        		System.out.println("add");
        	}
        	//@override
        	void sub() {
        		System.out.println("sub");
        	}
        };
        System.out.println(c1);
	}

}
