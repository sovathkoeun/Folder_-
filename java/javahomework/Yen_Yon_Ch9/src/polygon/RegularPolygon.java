package polygon;

import java.util.ArrayList;

public interface RegularPolygon {
	public int getNumSides();

	public int getSideLength();

	public static int getTotalSides(ArrayList<RegularPolygon> array) {
		int sum = 0;
		for (RegularPolygon regularPolygon : array) {
			sum += regularPolygon.getNumSides();
		}
		return sum;
	}
}
