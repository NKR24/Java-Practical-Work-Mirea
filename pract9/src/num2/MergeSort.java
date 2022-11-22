package num2;
public class MergeSort {
    public static void merge(Student[] s, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j])<=0) {
                s[k++] = l[i++];
            } else {
                s[k++] = r[j++];
            }
        }
        while (i < left) {
            s[k++] = l[i++];
        }
        while (j < right) {
            s[k++] = r[j++];
        }
    }
    public static void mergeSort(Student[] s, int n){
        if(n<2) return;
        int mid=n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];

        for(int i=0;i<mid;++i)
            l[i]=s[i];
        for(int i=mid;i<n;++i)
            r[i-mid]=s[i];
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        merge(s, l , r, mid, n-mid);
    }
    public static Student[] mergeArrays(Student[] a, Student[] b){
        Student[] s = new Student[a.length+b.length];
        merge(s, a, b, a.length, b.length);
        mergeSort(s, s.length);
        return s;
    }
}