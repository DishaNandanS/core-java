class Student89Runner {
public static void main(String[] args) {

int[] studentIds = Student89.getStudentIds();
System.out.println(studentIds);
for (int i = 0; i < studentIds.length; i++) {
System.out.println(studentIds[i]);
}

String[] studentNames = Student89.getStudentNames();
System.out.println(studentNames);
for (int j = 0; j < studentNames.length; j++) {
System.out.println(studentNames[j]);
}

float[] studentGrades = Student89.getStudentGrades();
System.out.println(studentGrades);
for (int k = 0; k < studentGrades.length; k++) {
System.out.println(studentGrades[k]);
}

char[] studentSections = Student89.getStudentSections();
System.out.println(studentSections);
for (int l = 0; l < studentSections.length; l++) {
System.out.println(studentSections[l]);
        }

long[] phoneNumbers = Student89.getPhoneNumbers();
System.out.println(phoneNumbers);
for (int m = 0; m < phoneNumbers.length; m++) {
System.out.println(phoneNumbers[m]);
}

double[] scholarshipAmounts = Student89.getScholarshipAmounts();
System.out.println(scholarshipAmounts);
for (int n = 0; n < scholarshipAmounts.length; n++) {
System.out.println(scholarshipAmounts[n]);
}
    }
}
