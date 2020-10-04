package com.rxc.Service;

import com.rxc.mapper.CourseMapper;
import com.rxc.mapper.TeacherMapper;
import com.rxc.pojo.Course;
import com.rxc.pojo.Teacher;
import com.rxc.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/10/4 18:33
 */
@Service
@SessionAttributes(names = {"teacher", "courseList"})
public class TeacherService {
    SqlSession sqlSession;
    TeacherMapper teacherMapper;
    CourseMapper courseMapper;

    public boolean teacherLogin(String no, String password, Model model) {
        sqlSession = MybatisUtil.getSqlSession();
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherByTno(no);
        sqlSession.close();
        model.addAttribute("teacher", teacher);
        return null != teacher && teacher.getTpassword().equals(password);
    }

    public void teacherChooseCourse(Model model) {
        sqlSession = MybatisUtil.getSqlSession();
        courseMapper = sqlSession.getMapper(CourseMapper.class);
        List<Course> courseList = courseMapper.getAllCourse();
        model.addAttribute("courseList", courseList);
    }
}
