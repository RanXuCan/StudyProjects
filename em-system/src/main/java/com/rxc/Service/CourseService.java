package com.rxc.Service;

import com.rxc.mapper.CourseMapper;
import com.rxc.pojo.Course;
import com.rxc.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/10/4 18:33
 */
@Service
public class CourseService {
    SqlSession sqlSession;
    CourseMapper courseMapper;

    List<Course> getCourseByCname(String cname) {
        sqlSession = MybatisUtil.getSqlSession();
        courseMapper = sqlSession.getMapper(CourseMapper.class);
        cname = (cname == null || "".equals(cname.trim())) ? "" : cname;
        return courseMapper.getCourseByCname(cname);
    }

    List<Course> getAllCourse() {
        return null;
    }
}
