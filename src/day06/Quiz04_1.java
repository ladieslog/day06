package day06;

import java.util.Arrays;

public class Quiz04_1 {
	public static void main(String[] args) {
		int i,j,n=0,sw=1,p,r=0,rot=5,c=-1;
		int[][] hey= new int[6][6];
		while(true) {
			for(p=0;p<rot;p++) {
				n++;
				c+=sw;
				hey[r][c] =n;
			}
			rot-=1;
			if(rot>0) {
				for(p=0;p<rot;p++) {
					n++;
					r+=sw;
					hey[r][c] =n;
				}
				sw*=(-1);
			}else {
				break;
			}
		}
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(String.format("%3d",hey[i][j]));
			}
			System.out.println();
		}
	}
}
