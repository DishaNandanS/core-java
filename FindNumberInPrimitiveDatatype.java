//homework
//1. Create a class each all primitve datatype array using new
//keyword and initialize array then find a number in a array

class FindNumberInPrimitiveDatatype {
    public static void main(String[] args) {

byte[] byteArray = new byte[] {10, 20, 30};// 1.byte
byte byteValue = 20;
for (int i = 0; i < byteArray.length; i++) {
System.out.println(byteArray[i]);
}
for (int i = 0; i < byteArray.length; i++) {
if (byteArray[i] == byteValue) {
System.out.println(byteValue);
}
}

short[] shortArray = new short[] {1000, 2000, 3000};// 2.short
short shortValue = 2000;
for (int i = 0; i < shortArray.length; i++) {
System.out.println(shortArray[i]);
}
for (int i = 0; i < shortArray.length; i++) {
if (shortArray[i] == shortValue) {
System.out.println(shortValue);
}
}

int[] intArray = new int[] {98, 43, 21, 10, 67};//3.int
int intValue = 21;
for (int i = 0; i < intArray.length; i++) {
System.out.println(intArray[i]);
}
for (int i = 0; i < intArray.length; i++) {
if (intArray[i] == intValue) {
System.out.println(intValue);
}
}

long[] longArray = new long[] {100000L, 200000L};//4.long
long longValue = 200000L;
for (int i = 0; i < longArray.length; i++) {
System.out.println(longArray[i]);
}
for (int i = 0; i < longArray.length; i++) {
if (longArray[i] == longValue) {
System.out.println(longValue);
}
}

float[] floatArray = new float[] {3.4f, 5.6f};// 5.float
float floatValue = 5.6f;
for (int i = 0; i < floatArray.length; i++) {
System.out.println(floatArray[i]);
}
for (int i = 0; i < floatArray.length; i++) {
if (floatArray[i] == floatValue) {
System.out.println(floatValue);
}
}

double[] doubleArray = new double[] {1.234, 5.678};//6double
double doubleValue = 5.678;
for (int i = 0; i < doubleArray.length; i++) {
System.out.println(doubleArray[i]);
}
for (int i = 0; i < doubleArray.length; i++) {
if (doubleArray[i] == doubleValue) {
System.out.println(doubleValue);
}
}

char[] charArray = new char[] {'A', 'B', 'C'};//7 char
char charValue = 'B';
for (int i = 0; i < charArray.length; i++) {
System.out.println(charArray[i]);
}
for (int i = 0; i < charArray.length; i++) {
if (charArray[i] == charValue) {
System.out.println(charValue);
}
}

boolean[] booleanArray = new boolean[] {true, false};//8boolean
boolean booleanValue = true;
for (int i = 0; i < booleanArray.length; i++) {
System.out.println(booleanArray[i]);
}
for (int i = 0; i < booleanArray.length; i++) {
if (booleanArray[i] == booleanValue) {
System.out.println(booleanValue);
}
}
}
}


