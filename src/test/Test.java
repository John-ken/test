package test;

public class Test {

	public static void main(String[] args) {
		// ��һ��
			person a = new person("С��");
			dog b = new dog ("����");
			a.work(b);
			//�ڶ���
			person c = new person("С��");
			shoe d = new shoe("��ɫ��","�ز��˶�Ь");
			place f = new place("����ƥ�˹�԰");
			c.fun(d, f);
			//������
			person g =new person("����ʦ");
			person h =new person("С��");
			place m = new place ("��̨��");
			g.teach(m);
			h.study();
			//������
			a = new person("�Ű���");
			c = new person("���");
			f = new place("��������");
			apple ap = new apple("�츻ʿ");
			a.buy(c, f, ap);
	}

}
