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
		System.out.print(name+"�����ѽ��ܼ����");
		a.fun(a);
	}
	public void party(place i){
		System.out.println(name+"��"+i.name+"��party");
	}
	public void lost(Dog i){
		System.out.print(name+"�ҵ�"+i.color+i.name+"����,");
	}
	public void find(){
		System.out.println(name+"������Ѱ����ʾ");
	}
	public void jieshao(Person i, Car j){
		System.out.print(fu+name+"��"+i.fu+i.name+"�����Լ������ܳ���"+j.color+j.name);
	}
}
