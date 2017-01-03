package hw;

import java.util.Scanner;
public class hw01_103021087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入每月通畫時間(分鐘)");
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		if (v1 < 600) {
			System.out.println("電話費(元))" + (v1 * 05));
		} else if (600 <= v1 && v1 <= 1200) {
			System.out.println("電話費(元))" + (v1 * 05 * 0.9));
		} else if (v1 > 1200) {
			System.out.println("電話費(元))" + (v1 * 05 * 0.79));
		}}}
