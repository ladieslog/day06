package day06;

import java.util.Scanner;

public class Quiz03_t4 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a;
		String pass1="", id1="",pass2,id2;
		int b,c=0,d;
		while(true) {
			System.out.print("1.�α��� \n2.ȸ������ \n3.������\n ����: ");
			a=pulls.nextInt();
			if(a==2) {
				id1 =pulls.next();
				pass1=pulls.next();
			}else if(a==1) {
				id2 =pulls.next();
				pass2=pulls.next();
				if((id1.equals(id2))==true&&(pass1.equals(pass2))==true
						&&id1!=""&&pass1!=""){
					System.out.println("�α��� ����");
				}else {
					System.out.println("�α��� ����");
				}
			}else if(a==3) {
				System.out.println("�����մϴ�. ");
				break;
			}
			
		}
		System.out.println("\n");
		//Ŀ������
		System.out.println("��� �������ּ���");
		d=pulls.nextInt();
		while(true) {
			System.out.println("1. Ŀ��(200) 2.���ھ�(250) 3. ��Ȳ 4.���� \n�޴��� �����ϼ���>>> ");
			b=pulls.nextInt();
			
				if(b==1) {
					if(c<=(d-200)){
						c+=200;
					}else {
						System.out.println("���� �ݾ��� �ʰ��߽��ϴ�. ");
					}					
				}else if(b==2) {
					if(c<=(d-250)){
						c+=250;
					}else {
						System.out.println("���� �ݾ��� �ʰ��߽��ϴ�. ");
					}					
				}else if(b==3) {
					System.out.println((d-c)+"���� �����帮�ٽ��ϴ�.");break;
				}else if(b==4) {
					System.out.println(d +"���� �����帳�ϴ�."); break;
				}
		}
	
		
		
		
		
		
		
		
		
		
	}
}
