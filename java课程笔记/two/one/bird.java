package one;
import java.util.Scanner;
class Animal{
	String name;
	double weight=3.14;
	public Animal(){
		System.out.println("示例化动物");
	}
	public void voice(){
		System.out.println("Animal voice");
	}
} 

public class bird extends Animal{
	public bird(){
		System.out.println("bird");
	}	
	public bird(String name){
		this();
	}
}



