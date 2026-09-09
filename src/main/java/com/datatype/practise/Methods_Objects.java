package com.datatype.practise;

public class Methods_Objects {

	public static void main(String[] args) {
		Methods_Objects s = new Methods_Objects();
		StringsPractise obj=new StringsPractise();
		obj.Secondclass(); // Method Present in another class
		s.getData();

	}
	
    //Never create method inside main block , only call methods from main block as its only for execution
	//We need to created Object to access method in case the Method is non static . IF method is static one can directly access method without creating object
	public  void getData() {
		System.out.println("Hello");
		
	}


}
