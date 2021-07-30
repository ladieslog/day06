package day06;

public class Ex02 {
	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");
	}
}
