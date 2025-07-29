//homwork
//2. Create a class each all primitve datatype array using new
//keyword and initialize array then copy into another array
//print the array

class CopyArrayInPrimitiveDatatype {
public static void main(String[] args) {

byte[] byteArray = new byte[]{10, 20, 30};
byte[] byteCopy = new byte[byteArray.length];
System.out.println("Before copying byte array:");
for(int i=0;i<byteArray.length;i++){
System.out.println(byteArray[i]);
}
System.out.println("After copying byte array:");
for(int i=0;i<byteArray.length;i++){
byteCopy[i]=byteArray[i];
System.out.println(byteCopy[i]);
}

short[] shortArray = new short[]{1000, 2000, 3000};
short[] shortCopy = new short[shortArray.length];
System.out.println("Before copying short array:");
for(int i=0;i<shortArray.length;i++){
System.out.println(shortArray[i]);
}
System.out.println("After copying short array:");
for(int i=0;i<shortArray.length;i++){
shortCopy[i]=shortArray[i];
System.out.println(shortCopy[i]);
}

int[] intArray = new int[]{98, 43, 21, 10, 67};
int[] intCopy = new int[intArray.length];
System.out.println("Before copying int array:");
for(int i=0;i<intArray.length;i++){
System.out.println(intArray[i]);
}
System.out.println("After copying int array:");
for(int i=0;i<intArray.length;i++){
intCopy[i]=intArray[i];
System.out.println(intCopy[i]);
}

long[] longArray = new long[]{100000L, 200000L};
long[] longCopy = new long[longArray.length];
System.out.println("Before copying long array:");
for(int i=0;i<longArray.length;i++){
System.out.println(longArray[i]);
}
System.out.println("After copying long array:");
for(int i=0;i<longArray.length;i++){
longCopy[i]=longArray[i];
System.out.println(longCopy[i]);
}

float[] floatArray = new float[]{3.4f, 5.6f};
float[] floatCopy = new float[floatArray.length];
System.out.println("Before copying float array:");
for(int i=0;i<floatArray.length;i++){
System.out.println(floatArray[i]);
}
System.out.println("After copying float array:");
for(int i=0;i<floatArray.length;i++){
floatCopy[i]=floatArray[i];
System.out.println(floatCopy[i]);
}

double[] doubleArray = new double[]{1.234, 5.678};
double[] doubleCopy = new double[doubleArray.length];
System.out.println("Before copying double array:");
for(int i=0;i<doubleArray.length;i++){
System.out.println(doubleArray[i]);
}
System.out.println("After copying double array:");
for(int i=0;i<doubleArray.length;i++){
doubleCopy[i]=doubleArray[i];
System.out.println(doubleCopy[i]);
}

char[] charArray = new char[]{'A', 'B', 'C'};
char[] charCopy = new char[charArray.length];
System.out.println("Before copying char array:");
for(int i=0;i<charArray.length;i++){
System.out.println(charArray[i]);
}
System.out.println("After copying char array:");
for(int i=0;i<charArray.length;i++){
charCopy[i]=charArray[i];
System.out.println(charCopy[i]);
}

boolean[] booleanArray = new boolean[]{true, false};
boolean[] booleanCopy = new boolean[booleanArray.length];
System.out.println("Before copying boolean array:");
for(int i=0;i<booleanArray.length;i++){
System.out.println(booleanArray[i]);
}
System.out.println("After copying boolean array:");
for(int i=0;i<booleanArray.length;i++){
booleanCopy[i]=booleanArray[i];
System.out.println(booleanCopy[i]);
}
}
}

