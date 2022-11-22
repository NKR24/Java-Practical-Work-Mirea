package num2;
public class Student implements Comparable<Student>{
    private int idNumber;
    private int GPA;
    public int getGPA(){ return GPA; }
    public int getIdNumber() { return idNumber; }

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }
    public Student(int idNumber, int GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(idNumber, o.idNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(idNumber);
        //return "Student with id " + idNumber;
    }

    static void sort(Student[] students){
        for(int i=1;i<students.length;++i){
            for(int j=i;j>=1;--j){
                if(students[j-1].compareTo(students[j])>0){
                    Student tmp = students[j-1];
                    students[j-1]=students[j];
                    students[j]=tmp;
                }else break;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(4);
        students[1] = new Student(5);
        students[2] = new Student(3);
        students[3] = new Student(2);
        students[4] = new Student( 1);
        sort(students);
        for(Student s : students){
            System.out.println(s);
        }
    }
}