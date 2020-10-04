package com.rxc.mapper;

import com.rxc.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    int addCourse(@Param("course") Course course);

    int addCourseByBatch(@Param("courseList") List<Course> courseList);

    List<Course> getAllCourse();

    Course getCourseByCno(@Param("cno") String cno);

    List<Course> getCourseByCname(@Param("cname") String cname);
}
