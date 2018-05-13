package Student;

import java.time.LocalDate;

public class Test {
    public static void main (String[] args) {
        StudentDAOImp test = new StudentDAOImp();
        //添加十个学生的信息
        for (int i = 0; i < 10; i++) {
            test.insertStudent(new Student("学生" + (i + 1),
                                            LocalDate.of(1998, 1, 10 + i),
                                            i+1));
        }

        //显示所有学生的信息
        System.out.println("当前所有学生的信息：");
        test.queryAll();
        System.out.println();

        //插入某个学生于列表最后
        test.insertStudent(new Student("熊超",
                                        LocalDate.of(1998,2,12),
                                        11));
        System.out.println("添加该学生后，所有学生的信息：");
        test.queryAll();
        System.out.println();

        //删除某个学生的信息
        test.deleteStudent(new Student("学生" + 3,
                                        LocalDate.of(1998, 1, 12),
                                        3));
        System.out.println("删除该学生后，所有学生的信息：");
        test.queryAll();
        System.out.println();

        //查找某位学生的信息
        System.out.println("你所查找的学生的信息为：");
        System.out.println(test.queryStudentById(4));
    }
}
