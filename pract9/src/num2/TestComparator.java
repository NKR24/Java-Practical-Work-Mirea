package num2;
public class TestComparator {

    public static void main(String[] args) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student[] students = new Student[5];
        students[0] = new Student(4, 0);
        students[1] = new Student(5, 75);
        students[2] = new Student(3, 19);
        students[3] = new Student(2, 50);
        students[4] = new Student(1, 20);
        comparator.qsort(students, 0, students.length-1);
        for (Student s : students)
            System.out.println(s.getGPA());
    }
}