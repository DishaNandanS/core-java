class Mobile1 {
static int[] mobileIds = {301, 302, 303, 304, 305};
static String[] mobileBrands = {"Samsung", "Apple", "OnePlus", "Vivo", "Realme"};
static float[] screenSizes = {6.1f, 6.5f, 6.7f, 6.2f, 6.3f};
static char[] mobileSeries = {'S', 'X', 'N', 'Y', 'Z'};
static long[] modelNumbers = {9876543211L, 8765432102L, 7654321093L, 6543210984L, 5432109875L};
static double[] prices = {59999.99d, 89999.99d, 49999.50d, 29999.00d, 19999.25d};

public static int[] getMobileIds() {
return mobileIds;
}
public static String[] getMobileBrands() {
return mobileBrands;
    }
public static float[] getScreenSizes() {
return screenSizes;
}
public static char[] getMobileSeries() {
return mobileSeries;
}
public static long[] getModelNumbers() {
return modelNumbers;
}
public static double[] getPrices() {
return prices;
}
}
