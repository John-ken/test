package test;

public class person {
	String name;
	public person(){}
	public person(String i){
		name = i;
	}
	
	public void work(dog i){
		System.out.println(name+"�ڹ�԰��"+i.name);
	}
	
	public void fun(shoe i,place j){
		System.out.println(name+"����"+i.color+i.name+"��"+j.name+"�ܲ�");
	}
	
	public void teach(place i){
		System.out.print(name+"��"+i.name+"����,");
	}
	
	public void study(){
		System.out.println(name+"�����������ʼ�");
	}
	
	public void buy(person k,place i,apple j){
		System.out.println(name+"��"+k.name+"��"+i.name+"��"+j.name);
	}
}
