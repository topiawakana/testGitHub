package code16_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		
		Integer i1 = 10;
		int i2 = i1;
	}

}
