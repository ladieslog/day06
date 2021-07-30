package day06;

public class Quiz02_t2 {
	public static void main(String[] args) {
		int a,b=1,c,d=0,e,f=0;
		for(a=1;a<=30;a++) {
			b*=2;
		}
		System.out.println("30일째 예금액 : "+ b/2);
		System.out.println("\n");
		
		for(c=1;c<=1000;c++) {
			if(c%3==0) {
				
			}else
				d+=c;
			if(c%15==0) 
				d+=c;	
		}
		System.out.println("1 ~1000 까지의 합 : "+d);
		System.out.println("\n");
		
		
		for(e=1;f<10000;e+=2) {
			f+=e;	
		}
		System.out.println("1부터 홀수의 합이 10000을 넘지 않는 수: "+ (e-4));
		
		
	}
}
