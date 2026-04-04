import day06.Student;

public class Main {
    public static void main(String[] args) {

        // Create 4 students
        Student s1 = new Student("Rahul",  101, new double[]{85, 90, 78, 92, 88});
        Student s2 = new Student("Priya",  102, new double[]{95, 98, 92, 97, 99});
        Student s3 = new Student("Aryan",  103, new double[]{60, 55, 70, 65, 58});
        Student s4 = new Student("Sneha",  104, new double[]{45, 50, 40, 55, 48});

        // Print report for each
        s1.printReport();
        s2.printReport();
        s3.printReport();
        s4.printReport();

        // Find and print topper
        Student[] students = {s1, s2, s3, s4};
        Student topper = findTopper(students);
        System.out.println("Topper: " + topper.getName() +
                " with average: " + topper.calculateAverage());
    }

    // Static method to find topper
    public static Student findTopper(Student[] students) {
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateAverage() > topper.calculateAverage()) {
                topper = students[i];
            }
        }
        return topper;
    }
}