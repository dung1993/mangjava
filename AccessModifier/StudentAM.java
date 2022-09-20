package AccessModifier;

public class StudentAM {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Mike");
        student.setClasses("K45");
        System.out.println(student.name+ " "+student.classes);
    }
    public static class Student{
        private String name="Jonh";
        private String classes="K42";
        public Student(){
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}

