package CHALLENGE1;

public class Main {

	public static void main(String[] args) {
		MiniVan miniVan1 = new MiniVan("XXXXXX", 145f, 10);
		System.out.println(miniVan1 + " speed is " + miniVan1.getMaximalSpeed());

		TucTuc tuctuc = new TucTuc("YYYYYYY", 45f, 3);
		System.out.println(tuctuc + " speed is " + tuctuc.getMaximalSpeed());

		BatMobile batman = new BatMobile("ZZZZZZZ", 75f, false);
		System.out.println(batman + " speed is " + batman.getMaximalSpeed());
	}
}