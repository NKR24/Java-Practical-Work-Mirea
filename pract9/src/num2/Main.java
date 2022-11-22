package num2;
public class Main {
    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        students1[0] = new Student(11, 0);
        students1[1] = new Student(4, 75);
        students1[2] = new Student(6, 19);
        students1[3] = new Student(8, 50);
        students1[4] = new Student(10, 20);

        students2[0] = new Student(1, 1);
        students2[1] = new Student(3, 74);
        students2[2] = new Student(5, 20);
        students2[3] = new Student(7, 49);
        students2[4] = new Student(9, 21);
        for(Student s : MergeSort.mergeArrays(students1, students2))
            System.out.println(s);
    }
}