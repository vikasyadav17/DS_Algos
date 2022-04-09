package oops;

public class ComplexNumbers {
	
	int real;
	int temperory;
	
	public ComplexNumbers() {
		// TODO Auto-generated constructor stub
	}

	ComplexNumbers(int real,int temporary){
		this.real = real;
		this.temperory = temporary;
	}
	
	public void plus(ComplexNumbers c2) {
		
		this.real = this.real + c2.real;
		this.temperory  = this.temperory + c2.temperory;
		
	}
	

	public void multiply(ComplexNumbers c2) {
		int real=0,temporary=0;
		real = this.real * c2.real - this.temperory*c2.temperory;
		temporary = this.temperory*c2.real + this.real*c2.temperory;
		this.real=real;
		this.temperory=temporary;
	}
	
	public void print() {
		
		System.out.println(this.real + " + " +  "i" + this.temperory );  
	}
	
}
