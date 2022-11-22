package num1;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private Comparator<Student> cmp;
    private Student[] idNumber;
    public Main(Comparator<Student> comp, Student[] s) {
        cmp=comp.reversed();
        idNumber =s;
    }

    public void setCmp(Comparator<Student> cmp) {
        this.cmp = cmp.reversed();
    }
    public void setArray(Student[] s){
        idNumber =s;
    }
    public void outArray(){
        for(Student s : idNumber)
            System.out.println(s);
    }
    private int partition(Student[] s, int left, int right){
        Student pivot = s[(left+right)/2];
        int i=left;
        int j=right;
        for(;;){
            while(cmp.compare(s[i], pivot)<0)
                i++;
            while(cmp.compare(pivot, s[j])<0)
                j--;
            if(i>=j) break;
            Student tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
        }
        return j;
    }
    private void _qsort(Student[] s, int left, int right){
        if(left<right) {
            int p = partition(s, left, right);
            _qsort(s, left, p);
            _qsort(s, p + 1, right);
        }
    }
    private void merge(Student[] s, Student[] a, Student[] b, int left, int right){
        int i=0, j=0, k=0;
        while(i<left && j<right){
            if(cmp.compare(a[i], b[j])<0)
                s[k++]=a[i++];
            else
                s[k++]=b[j++];
        }
        while(i<left)
            s[k++]=a[i++];
        while(j<right)
            s[k++]=b[j++];
    }
    private void msort(Student[] s, int n){
        if(n<2) return;
        int mid = n/2;

        Student[] left = new Student[mid];
        Student[] right = new Student[n-mid];

        for(int i=0;i<mid;++i)
            left[i]=s[i];
        for(int i=mid;i<n;++i)
            right[i-mid]=s[i];
        msort(left, mid);
        msort(right, n-mid);
        merge(s, left, right, mid, n-mid);
    }
    public void quicksort(){
        _qsort(idNumber, 0, idNumber.length-1);
    }
    public void mergeSort(){
        msort(idNumber, idNumber.length);
    }
    public void mergeAndSort(Student[] s1, Student[] s2){
        merge(new Student[s1.length+s2.length], s1, s2, s1.length, s2.length);
        mergeSort();
    }


    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0]=new Student("Никита", "Хворостин    ", "Тестировщик", 2, "ИВБО-04-21");
        students[1]=new Student("Платон", "Самохвалов", "Программист", 4, "ИВБО-04-19");
        students[2]=new Student("Антон ", "Маркин     ", "Инфобез    ", 5, "БСБО-05-18");
        students[3]=new Student("Иван  ", "Иванов     ", "Филолог    ", 3, "ИВБО-04-20");
        students[4]=new Student("Пётр  ", "Петров     ", "Историк    ", 1, "ИВБО-02-22");
        System.out.println("Выберите по какому полю сортировать:");
        System.out.println("1) имя\n2) Фамилия\n3) Специальность\n4) Курс\n5) Группа");
        Scanner scanner = new Scanner(System.in);

        Comparator<Student> cmp;
        while(true){
            int choice = scanner.nextInt();
            if(choice==1) {
                cmp = Comparator.comparing(Student::getFirstName);
                break;
            }else if(choice==2) {
                cmp = Comparator.comparing(Student::getLastName);
                break;
            }else if(choice==3) {
                cmp = Comparator.comparing(Student::getSpeciality);
                break;
            }else if(choice==4) {
                cmp = Comparator.comparing(Student::getGrade);
                break;
            }else if(choice==5) {
                cmp = Comparator.comparing(Student::getGroup);
                break;
            }else System.out.println("Нет такого варианта");
        }
        Main main = new Main(cmp, students);
        main.quicksort();
        //main.mergeSort();

        main.outArray();
    }
}