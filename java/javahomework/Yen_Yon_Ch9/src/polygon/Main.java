package polygon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<RegularPolygon> array = new ArrayList<RegularPolygon>();

		Square squar1 = new Square(0);
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);

		array.add(squar1);
		array.add(equilateralTriangle);
		System.out.println("NumSides of RegularPolygon is :" + RegularPolygon.getTotalSides(array));
	}

}