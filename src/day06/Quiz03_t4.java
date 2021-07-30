package day06;

import java.util.Scanner;

public class Quiz03_t4 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a;
		String pass1="", id1="",pass2,id2;
		int b,c=0,d;
		while(true) {
			System.out.print("1.로그인 \n2.회원가입 \n3.나가기\n 선택: ");
			a=pulls.nextInt();
			if(a==2) {
				id1 =pulls.next();
				pass1=pulls.next();
			}else if(a==1) {
				id2 =pulls.next();
				pass2=pulls.next();
				if((id1.equals(id2))==true&&(pass1.equals(pass2))==true
						&&id1!=""&&pass1!=""){
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else if(a==3) {
				System.out.println("종료합니다. ");
				break;
			}
			
		}
		System.out.println("\n");
		//커피자판
		System.out.println("요금 투입해주세요");
		d=pulls.nextInt();
		while(true) {
			System.out.println("1. 커피(200) 2.코코아(250) 3. 반황 4.종료 \n메뉴를 선택하세요>>> ");
			b=pulls.nextInt();
			
				if(b==1) {
					if(c<=(d-200)){
						c+=200;
					}else {
						System.out.println("내신 금액을 초과했습니다. ");
					}					
				}else if(b==2) {
					if(c<=(d-250)){
						c+=250;
					}else {
						System.out.println("내신 금액을 초과했습니다. ");
					}					
				}else if(b==3) {
					System.out.println((d-c)+"원을 돌려드리겟습니다.");break;
				}else if(b==4) {
					System.out.println(d +"원을 돌려드립니다."); break;
				}
		}
	
		
		
		
		
		
		
		
		
		
	}
}
