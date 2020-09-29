package com.rxc.dao;

import com.rxc.Utils.MyBatisUtils;
import com.rxc.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/29 16:22
 */
public class StudentTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = mapper.getAllStudent();
        for (Student student : allStudent) {
            System.out.println(student);
        }
        System.out.println("**************test1 finished********************");
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student stu = mapper.getStudentBySno("10051");
        System.out.println(stu);
        System.out.println("**************test2 finished********************");
        sqlSession.close();
    }

   /* @Test
    public void test3() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        int i = mapper.addStudent(new Student("201706062001", "冉旭灿", 22));
        System.out.println(i);
        sqlSession.commit();
        System.out.println("**************test3 finished********************");
        sqlSession.close();
    }*/
}
