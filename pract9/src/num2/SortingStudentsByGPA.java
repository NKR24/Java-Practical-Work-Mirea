package num2;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGPA()==o2.getGPA())
            return 0;
        else if(o1.getGPA()>o2.getGPA())
            return 1;
        else
            return -1;
    }

    public int partition(Student[] students, int beg, int end){
        Student piv = students[(beg+end)/2];
        int i=beg;
        int j=end;
        for(;;){
            while(this.compare(students[i], piv)<0)
                i++;
            while(this.compare(students[j], piv)>0)
                j--;
            if(i>=j) return j;
            Student tmp=students[i];
            students[i]=students[j];
            students[j]=tmp;
        }
    }
    public void qsort(Student[] students, int beg, int end){
        if(beg<end){
            int p = partition(students, beg, end);
            qsort(students, beg, p);
            qsort(students, p+1, end);
        }
    }
}