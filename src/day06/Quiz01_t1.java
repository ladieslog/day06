package day06;

import java.util.Scanner;

public class Quiz01_t1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int i,j, sum=0;
		while(true) {
			System.out.print("1~10 ������ ������ �Է����ּ��� : ");
			j=input.nextInt();
			if(j<=10&&j>=1) 
				break;
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է� ");
		}
		for(i=1;i<=j;i++) {
			sum+=i;
		}
		System.out.println("���հ�� : "+sum);
		
		System.out.println("\n");
		
		
		sum=0;
		while(true) {
			System.out.print("1~20 ������ ������ �Է����ּ��� : ");
			j=input.nextInt();
			if(j<=20&&j>=1) 
				break;
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է� ");
		}
		for(i=1;i<=j;i++) {
			sum+=i;
		}
		System.out.println("���հ�� : "+sum);
	}
}
