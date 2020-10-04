package com.rxc.Service;

import com.rxc.mapper.StudentMapper;
import com.rxc.pojo.Student;
import com.rxc.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/30 16:06
 */
@Service
public class StudentService {
    StudentMapper studentMapper;
    SqlSession sqlSession;

    public boolean studentLogin(String no, String password, Model model) {
        sqlSession = MybatisUtil.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentBySno(no);
        sqlSession.close();
        model.addAttribute("student", student);
        return null != student && student.getSpassword().equals(password);
    }

    public void addStudent(Student student, Model model) {
        sqlSession = MybatisUtil.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        int result = studentMapper.addStudent(student);
        sqlSession.commit();
        sqlSession.close();
        if (result > 0) {
            model.addAttribute("message", "添加成功");
        } else {
            model.addAttribute("message", "添加失败，学号已存在");
        }
    }
}
