package day06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int i,j, sum=0;
		while(true) {
			System.out.println("�� �Է� (1~100)");
			i=input.nextInt();
			if(i>=1 &&i<=100)
				break;
			System.out.println("�߸� �Է� �ٽ�");
		}
		for(j=1;j<=i;j++) {
			sum+=j;
		}
		System.out.println("�Է� ���� �������� �� :" +sum);
	}
	
}
