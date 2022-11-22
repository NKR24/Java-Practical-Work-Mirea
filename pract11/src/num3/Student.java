package num3;
import java.text.DateFormat;
import java.util.Date;

public class Student
{
    private String name;
    private int course;
    private Date birth;

    public Student(String name, int course, Date birth) {
        this.name = name;
        this.course = course;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String toString(int format) {
        String birthStr;
        DateFormat df;
        switch (format) {
            case (1):
                df = DateFormat.getDateInstance(DateFormat.SHORT);
                break;
            case(2):
                df = DateFormat.getDateInstance(DateFormat.MEDIUM);
                break;
            default:
                df = DateFormat.getDateInstance(DateFormat.LONG);

        }
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", birth=" + df.format(this.birth) +
                '}';
    }

}
