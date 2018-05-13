package Student;

import java.util.List;

public interface StudentDAO{
    public void insertStudent(Student student);
    public void deleteStudent(Student student);
    public Student queryStudentById(int no);
    public List<Student> queryAll();
}
