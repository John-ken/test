package test2;

public class Dog {
	String name ;
	String color ;
	public Dog(){}
	public Dog(String i,String j){
		name = i;
		color = j;
	}
	public void fun(Dog i){
		System.out.println(i.color+i.name+"两条腿走路的特异功能");
	}
}
