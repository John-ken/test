package test2;

public class test2 {

	public static void main(String[] args) {
		Point a = new Point(1,3);
		Point b = new Point(2,5);
		Circle c = new Circle(a,3);
		double cir = c.Cir();
		System.out.println("Բ���ܳ�Ϊ"+cir);
		double s = c.Scir();
		System.out.println("Բ�����Ϊ"+s);
		c.panduan(b);
		
		Person li = new Person("����");
		Dog dog = new Dog("�ʲ�","��ɫ�ĳ��ﹷ");
		place home = new place("����");
		li.party(home);
		li.jieshao(dog);
		
		
		Person wang = new Person("��÷");
		Dog pig = new Dog("����","����������");
		wang.lost(pig);
		wang.find();
		
		
		Person zhang = new Person("����","������");
		Person lisi = new Person("����","Ů����");
		Car car = new Car("��ɫ��","����");
		zhang.jieshao(lisi, car);
	}
}
