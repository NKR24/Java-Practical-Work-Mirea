package num1;
public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int grade;
    private String group;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String firstName, String lastName, String speciality, int grade, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.grade = grade;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                " firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", speciality = '" + speciality + '\'' +
                ", grade = " + grade +
                ", group = '" + group + '\'' +
                '}';
    }
}