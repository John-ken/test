package test2;

public class Circle {
	Point po;
	double r;
	public Circle(){}
	public Circle(Point i,double j){
		po=i;
		r=j;
	}

		public double Cir(){
			double c = 2*Math.PI*r;
			return c;
		}
		public double Scir(){
			double d = Math.PI*r*r;
			return d;
		}
		
		public void panduan(Point i){
			double a = Math.sqrt((i.x-po.x)*(i.x-po.x)-(i.y-po.y)*(i.y-po.y));
			if (a<r){
				System.out.println("点在圆内");
			}else if (a==r){
				System.out.println("点在圆上");
			}
			else {
				System.out.println("点在圆外");
			}
		}
}
