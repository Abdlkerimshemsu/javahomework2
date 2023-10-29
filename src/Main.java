public class Main {
    public static void main(String[] args) {
        // Create objects of Student, Teacher, and College
        Student student1 = new Student("Zulkif", 659, new int[]{90, 95});
        Student student2 = new Student("Amir", 256, new int[]{80, 90});
        Teacher teacher1 = new Teacher("Mr.Benawi", "OOP lab");
        Teacher teacher2 = new Teacher("Mrs.Ermiyas", "OOP lec");
        College college = new College("Computing & informatics");

        // Set values for attributes
        college.getStudents().add(student1);
        college.getStudents().add(student2);
        college.getTeachers().add(teacher1);
        college.getTeachers().add(teacher2);

        // Print out details
        System.out.println("College name: " + college.getName());

        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grades: " + java.util.Arrays.toString(student.getGrades()));
            System.out.println();
        }

        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();
        }
    }
}