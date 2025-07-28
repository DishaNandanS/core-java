class Library1Runner {
public static void main(String[] args) {

int[] numberOfBooksDepartment = Library1.getNumberOfBooksDepartment();
System.out.println(numberOfBooksDepartment);
for (int i =0; i < numberOfBooksDepartment.length; i++) {
System.out.println(numberOfBooksDepartment[i]);
}

String[] booksDepartments = Library1.getBooksDepartments();
System.out.println(booksDepartments);
for (int j = 0; j < booksDepartments.length; j++) {
System.out.println(booksDepartments[j]);
}

float[] fineForDamage = Library1.getFineForDamage();
System.out.println(fineForDamage);
for (int k = 0; k < fineForDamage.length; k++) {
System.out.println(fineForDamage[k]);
}

char[] sectionsInLibrary = Library1.getSectionsInLibrary();
System.out.println(sectionsInLibrary);
for (int L = 0; L < sectionsInLibrary.length; L++) {
System.out.println(sectionsInLibrary[L]);
}

long[] totalVisitors = Library1.getTotalVisitors();
System.out.println(totalVisitors);
for (int m = 0; m < totalVisitors.length; m++) {
System.out.println(totalVisitors[m]);
}

double[] digitalStorage = Library1.getDigitalStorage();
System.out.println(digitalStorage);
for (int m = 0; m < digitalStorage.length; m++) {
System.out.println(digitalStorage[m]);
}
}
}