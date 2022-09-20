package Demo;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student("Hoan", 22, "02 Điện Biên Phủ", 8.0f, "Hai Bà Trưng");
        Student s2 = new Student("Luyn", 24, "30 Điện Biên Phủ", 10.0f, "Quốc Học");
        Student s3 = new Student("Cuong", 29, "07 Điện Biên Phủ", 8.0f, "Nguyễn Huệ");
        Student s4 = new Student("Dung", 29, "100 Điện Biên Phủ", 7.0f, "Nguyễn Huệ");
        Student s5 = new Student("Duy", 23, "26 Điện Biên Phủ", 9.0f, "Quốc Học");
        Student s6 = new Student("Loi", 24, "18 Điện Biên Phủ", 7.0f, "Hai Bà Trưng");

        Student[] students = {s1, s2, s3, s4, s5, s6};
//        Student s = searchStudentByPoint(10f, students);
//        System.out.println(s.showInfo());
//        searchThereStudentByPoint(students);
//        showStudent(students);

        System.out.println(AvgPoint(students,"Nguyễn Huệ"));

    }

    public static int searchStudentIndexByPoint(float point, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() == point) {
                return i;
            }
        }
        return -1;
    }

    public static Student searchStudentByPoint(float point, Student[] students) {
        int i = 0;
        for (Student item : students) {
            if (item.getPoint() == point) {
                System.out.println("Index: " + i);
                return item;
            }

        }
        return null;
    }

    public static Student searchMathByPoint(Student[] students){
        double max = students[0].getPoint();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() > max) {
                max = students[i].getPoint();
                index = i;
            }
        }
        return students[index];
    }

    public static void searchThereStudentByPoint(Student[] students){
        Student temp = students[0];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0 + i; j < students.length; j++) {
                if (students[i].getPoint() < students[j].getPoint()){
                    temp = students[i];
                    students[i]= students[j];
                    students[j]= temp;
                }
            }

        }
    }
    public static void showStudent(Student[] students){
        System.out.println(students[0].showInfo());
        System.out.println(students[1].showInfo());
        System.out.println(students[2].showInfo());
    }

    public static double AvgPoint(Student[] students, String sch){
        double sum = 0;
        double avg = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getSchool().equalsIgnoreCase(sch)){
            sum = sum + students[i].getPoint();
            count++;}
        }
        if (count > 0){
            avg = sum / count;
        }
        return avg;
    }
}

