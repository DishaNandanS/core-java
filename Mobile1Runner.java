class Mobile1Runner {
public static void main(String[] args) {

int[] mobileIds = Mobile1.getMobileIds();
System.out.println(mobileIds);
for (int i = 0; i < mobileIds.length; i++) {
System.out.println(mobileIds[i]);
}

String[] mobileBrands = Mobile1.getMobileBrands();
System.out.println(mobileBrands);
for (int j = 0; j < mobileBrands.length; j++) {
System.out.println(mobileBrands[j]);
}

float[] screenSizes = Mobile1.getScreenSizes();
System.out.println(screenSizes);
for (int k = 0; k < screenSizes.length; k++) {
System.out.println(screenSizes[k]);
}

char[] mobileSeries = Mobile1.getMobileSeries();
System.out.println(mobileSeries);
for (int l = 0; l < mobileSeries.length; l++) {
System.out.println(mobileSeries[l]);
}

long[] modelNumbers = Mobile1.getModelNumbers();
System.out.println(modelNumbers);
for (int m = 0; m < modelNumbers.length; m++) {
System.out.println(modelNumbers[m]);
}

double[] prices = Mobile1.getPrices();
System.out.println(prices);
for (int n = 0; n < prices.length; n++) {
System.out.println(prices[n]);
}
}
}
