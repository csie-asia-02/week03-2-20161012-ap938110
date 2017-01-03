package hw;

import java.util.Scanner;
public class hw02_103021087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("性別(1:男生,2:女生):");
		int genda=scn.nextInt();
		System.out.print("身高");
		int h = scn.nextInt();
		if(genda==1){
			System.out.println("體重為"+((h-80)*0.7));	
		}else{
	    if(genda==2){
	    	System.out.println("體重為"+((h-70)*0.6));
	    }else{
	    	System.out.println("性別錯誤");
}
		}
	}
}
