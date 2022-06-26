package xyz;

	class Parent {
		
		void method1() {
			System.out.println("parent class method");
		}
	}
	
	class Child extends Parent {
		
		void method1() {
			System.out.println("child class method");
		}
	}
	
public class MethodOverriding {

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		p1.method1();
		
		Child c1 = (Child) p1;
		c1.method1();
	}

}
