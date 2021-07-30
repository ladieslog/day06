package day06;

import java.util.Scanner;

public class Quiz01_t1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int i,j, sum=0;
		while(true) {
			System.out.print("1~10 까지의 정수를 입력해주세요 : ");
			j=input.nextInt();
			if(j<=10&&j>=1) 
				break;
			System.out.println("잘못 입력 하셨습니다. 다시 입력 ");
		}
		for(i=1;i<=j;i++) {
			sum+=i;
		}
		System.out.println("총합계는 : "+sum);
		
		System.out.println("\n");
		
		
		sum=0;
		while(true) {
			System.out.print("1~20 까지의 정수를 입력해주세요 : ");
			j=input.nextInt();
			if(j<=20&&j>=1) 
				break;
			System.out.println("잘못 입력 하셨습니다. 다시 입력 ");
		}
		for(i=1;i<=j;i++) {
			sum+=i;
		}
		System.out.println("총합계는 : "+sum);
	}
}
