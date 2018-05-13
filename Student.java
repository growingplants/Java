package Student;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String name;//姓名
    private LocalDate birthday;//出生日期
    private int no;//学号

    public Student(String name, LocalDate birthday, int no) {
        this.name = name;
        this.birthday = birthday;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", birthday=" + birthday +
                ", no=" + no +
                '}';
    }

    //重写方法equals以便比较对象
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name) &&
                Objects.equals(birthday, student.birthday);
    }
}
