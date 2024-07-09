package ex5_4;

public class Main {

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
//		double triangleArea = calcTriangleArea(bottom, height);
//		System.out.println("三角形の底辺の長さが" + bottom + "cm、"
//				+ "高さが" + height + "cmの場合、"
//				+ "面積は" + triangleArea + "平方cm");
		System.out.println("三角形の底辺の長さが" + bottom + "cm、"
				+ "高さが" + height + "cmの場合、"
				+ "面積は" + calcTriangleArea(bottom, height) + "平方cm");
		
		double radius = 5.0;
		double circleArea = calcCircleArea(radius);
		System.out.println("円の半径が" + radius + "cmの場合、"
				+ "面積は" + circleArea + "平方cm");
	}
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	public static double calcCircleArea(double radius) {
//		return radius * radius * 3.14;
		return Math.pow(radius, 2) * Math.PI;
	}

}
