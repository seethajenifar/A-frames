package org.frame;
public class Encasulation2 {
	public static void main(String[] args) {
	
	Encasulation2 e = new Encasulation2();
	
	e.setid(1212);
	e.setname("seetha");
	e.setphone(123456789);
	
	int id = e.getid();
	
	System.out.println(id);
	System.out.println(e.getname);
	System.out.println(e.getphone);
	
	Encasulation2 e1 = new Encasulation2();
	
	e1.setid(1212);
	e1.setname("seetha");
	e1.setphone(123456789);
	System.out.println(e1.getid);
	System.out.println(e1.getname);
	System.out.println(e1.getphone);
	
	Encasulation2 e2 = new Encasulation2();
	
	e2.setid(1212);
	e2.setname("seetha");
	e2.setphone(123456789);
	System.out.println(e2.getid);
	System.out.println(e2.getname);
	System.out.println(e2.getphone);
		
}
}
