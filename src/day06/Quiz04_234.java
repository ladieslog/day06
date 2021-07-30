package day06;

public class Quiz04_234 {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		for (a=0;a<5;a++) {
			for(b=0;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(c=10;c>0;c--) {
			for(d=1;d<=c;d++) {
				System.out.print(d);
			}
			System.out.println();
		}
		
		for(e=2;e<=15;e++) {
			for(f=1;f<=15;f++) {
				System.out.print(String.format("%4d",e*f));
			}
			System.out.println();
		}
	}
}
