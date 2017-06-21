package test2;

public class Person {
	String name;
	String fu;
	public Person(){}
	public Person(String i){
		name = i;
	}
	public Person(String i,String j){
		name = i;
		fu=j;
	}
	public void jieshao(Dog a){
		System.out.print(name+"向朋友介绍家里的");
		a.fun(a);
	}
	public void party(place i){
		System.out.println(name+"在"+i.name+"开party");
	}
	public void lost(Dog i){
		System.out.print(name+"家的"+i.color+i.name+"丢了,");
	}
	public void find(){
		System.out.println(name+"哭着贴寻猪启示");
	}
	public void jieshao(Person i, Car j){
		System.out.print(fu+name+"向"+i.fu+i.name+"介绍自己的新跑车："+j.color+j.name);
	}
}
