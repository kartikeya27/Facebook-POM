package test.encapsulation;

public class test {
    
	//encapsulation one object inside another object 
	//Inheritance one class extending another class
	
	public static void main(String[] args) {
		
		Room r = new Room();
		r.setSpace(1000);
		School s = new School(r);
		s.tech();
		System.out.println(s.r.getSpace());//encapsulation
		
	}

}
