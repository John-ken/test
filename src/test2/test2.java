package test2;

public class test2 {

	public static void main(String[] args) {
		Point a = new Point(1,3);
		Point b = new Point(2,5);
		Circle c = new Circle(a,3);
		double cir = c.Cir();
		System.out.println("圆的周长为"+cir);
		double s = c.Scir();
		System.out.println("圆的面积为"+s);
		c.panduan(b);
		
		Person li = new Person("李晓");
		Dog dog = new Dog("彩彩","黄色的宠物狗");
		place home = new place("家里");
		li.party(home);
		li.jieshao(dog);
		
		
		Person wang = new Person("王梅");
		Dog pig = new Dog("笨笨","荷兰宠物猪");
		wang.lost(pig);
		wang.find();
		
		
		Person zhang = new Person("张三","富二代");
		Person lisi = new Person("李四","女朋友");
		Car car = new Car("白色的","宾利");
		zhang.jieshao(lisi, car);
	}
}
