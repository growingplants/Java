package Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImp implements StudentDAO {
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void insertStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public void deleteStudent(Student student) {
        int temp = 0;
        for(int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equals(student)) {
                studentList.remove(i);
                temp = 1;
            }
        }
        if (temp == 0)
            System.out.println("没有该学生的信息！");
    }

    @Override
    public Student queryStudentById(int no) {
        for (Student e:studentList) {
            if(e.getNo() == no)
                return e;
        }
        return null;
    }

    @Override
    public List<Student> queryAll() {
        for(Student e:studentList)
            System.out.println(e.toString());
        return null;
    }
}
