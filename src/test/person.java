package test;

public class person {
	String name;
	public person(){}
	public person(String i){
		name = i;
	}
	
	public void work(dog i){
		System.out.println(name+"在公园溜"+i.name);
	}
	
	public void fun(shoe i,place j){
		System.out.println(name+"穿着"+i.color+i.name+"在"+j.name+"跑步");
	}
	
	public void teach(place i){
		System.out.print(name+"在"+i.name+"讲课,");
	}
	
	public void study(){
		System.out.println(name+"认真听课做笔记");
	}
	
	public void buy(person k,place i,apple j){
		System.out.println(name+"和"+k.name+"在"+i.name+"买"+j.name);
	}
}
