package day06;

public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name,int rollNumber,double[] marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public double calculateAverage(){
        double sum=0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum /marks.length;
    }
    public double getHighestMark(){
        double highest=marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]>highest){
                highest= marks[i];
            }
        }
        return highest;
    }
    public double getLowestMark(){
        double lowest=marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]<lowest){
                lowest= marks[i];
            }
        }
        return lowest;
    }

    public String getGrade(){
        double average=calculateAverage();
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "Fail";
    }
    public void printReport() {
        System.out.println("==============================");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks      : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": " + marks[i]);
            if (i < marks.length - 1) System.out.print(" | ");
        }
        System.out.println();
        System.out.println("Average    : " + calculateAverage());
        System.out.println("Highest    : " + getHighestMark());
        System.out.println("Lowest     : " + getLowestMark());
        System.out.println("Grade      : " + getGrade());
        System.out.println("==============================");
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber +
                ", average=" + calculateAverage() + ", grade=" + getGrade() + "}";
    }
    public String getName() {
        return name;
    }


}
