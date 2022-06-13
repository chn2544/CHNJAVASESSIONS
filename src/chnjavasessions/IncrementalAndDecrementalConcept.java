package chnjavasessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//++ and --
		
				//1. post increment:
				int a = 1;
				int b = a++;
				System.out.println(a);//2
				System.out.println(b);//1
				
				int m = -99;
				int n = m++;
				System.out.println(m);//-98
				System.out.println(n);//-99
				
				//2. pre increment:
				int c = 1;
				int d = ++c;
				System.out.println(c);//2
				System.out.println(d);//2
				
				int p = -101;
				int q = ++p;
				System.out.println(p);//-100
				System.out.println(q);//-100
				System.out.println(p+q);
				
				//3. post decrement:
				int h = 2;
				int g = h--;
				System.out.println(h);//1
				System.out.println(g);//2
				
				int l = -49;
				int u = l--;
				System.out.println(l);//-50
				System.out.println(u);//-49
				
				//4. pre decrement:
				int v = 2;
				int z = --v;
				System.out.println(v);//1
				System.out.println(z);//1
				
				int t = 2;
				System.out.println(t++);
				System.out.println(t);
				
				int o = 3;
				System.out.println(++o);
				System.out.println(o);
				
				int k = 2;
				System.out.println(100 + (k++));
				System.out.println(k);
	}

}
