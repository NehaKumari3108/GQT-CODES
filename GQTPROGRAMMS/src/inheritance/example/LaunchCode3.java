package inheritance.example;
//abstract class
abstract class Animal{
	abstract void eat();
	void sleep() {
	   System.out.println("Animal sleeps");
    }
}
 class Elephant extends Animal
  {
	//@override
	void eat() {
		System.out.println("Elephant eats fruit and vegetables");
	   }
	}
 class Tiger extends Animal{
	 // @override
	  void eat() {
		  System.out.println("Tiger eat fresh meat");
	  }
  }
class Monkey extends Animal{
	  // @override
	   void eat() {
		   System.out.println("Monkey eats fruits and vegetables");
	   }
   }
     class Forest {
	   void allowAnimal(Animal a) {
		   a.eat();
		   a.sleep();
	      }
     }
 public class LaunchCode3{
       public static void main(String[] args) {
		 Elephant e=new Elephant();
		 Tiger t=new Tiger();
		 Monkey m=new Monkey();
		 
		 Forest f=new Forest();
		 f.allowAnimal(e);
		 f.allowAnimal(t);
		 f.allowAnimal(m);
    	}
   }



