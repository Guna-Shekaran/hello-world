
public class Test {
	
	public static void main(String args[]) {
		char ch;
		int n;
		for(int i=1;i<=10;i++) {
			n=(int)(Math.random()*9)+1;
//			n=(int)(Math.random()*10);
//			System.out.println(n);
			ch = (char)(n+64);
			System.out.println("number-->"+n+ "    Character-->"+ch);
		}
	}

}
