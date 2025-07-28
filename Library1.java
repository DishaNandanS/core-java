//homework
//3. Create 4 class in each class declaring all datatypes arrays
//print the values by calling static method 

class Library1 {
static int[] numberOfBooksDepartment = {100, 200, 300, 400, 500}; 
static String[] booksDepartments = {"Social", "Technical", "Geology", "Scientific", "Novels"};
static float[] fineForDamage = {2.2f, 3.4f, 4.5f, 6.7f, 8.9f};
static char[] sectionsInLibrary = {'D', 'E', 'F', 'G', 'H', 'I'};
static long[] totalVisitors = {19944988746L, 8373553738L, 83632992L, 223434445L, 3755272826L};
static double[] digitalStorage = {76.88d, 88.99d, 22.56d, 76.98d, 928.99d};

public static int[] getNumberOfBooksDepartment() {
return numberOfBooksDepartment;
}
public static String[] getBooksDepartments() {
return booksDepartments;
}
public static float[] getFineForDamage() {
return fineForDamage;
}
public static char[] getSectionsInLibrary() {
return sectionsInLibrary;
}
public static long[] getTotalVisitors() {
return totalVisitors;
}
public static double[] getDigitalStorage() {
return digitalStorage;
}
}

