public final class CampbellClass {
	private CampbellClass() {

	}
	
	public static String convertString(int a) {
		return String.valueOf(a);
	}

	
	public static String convertString(double a) {
		return String.valueOf(a);
	}

	
	public static String convertString(char a) {
		return String.valueOf(a);
	}
    

	public static String convertString(boolean a) {
		return String.valueOf(a);
	}

	
	public static int convertMetersToCenti(int meters) {
		return (int) meters * 100;
	}

	
	public static double convertMetersToCenti(double meters) {
		return meters * 100;
	}

	
	public static String removeNonAlpha(String str) {
		return str.replaceAll("[^a-zA-Z]", ""); 
	}

	
	public static String removeNonAlpha(String str, boolean isAlpha) {
		if (isAlpha == true) {
			return str.replaceAll("[^a-zA-Z]", "").toUpperCase();
		} else {
			return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		}
	}
}