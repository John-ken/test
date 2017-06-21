package test;

public class Test {

	public static void main(String[] args) {
		// 第一题
			person a = new person("小美");
			dog b = new dog ("旺财");
			a.work(b);
			//第二题
			person c = new person("小明");
			shoe d = new shoe("白色的","特步运动鞋");
			place f = new place("奥林匹克公园");
			c.fun(d, f);
			//第三题
			person g =new person("赵老师");
			person h =new person("小刚");
			place m = new place ("讲台上");
			g.teach(m);
			h.study();
			//第四题
			a = new person("张阿姨");
			c = new person("李阿姨");
			f = new place("物美超市");
			apple ap = new apple("红富士");
			a.buy(c, f, ap);
	}

}
