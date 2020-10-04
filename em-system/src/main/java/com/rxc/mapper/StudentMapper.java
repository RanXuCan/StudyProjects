package com.rxc.mapper;

import com.rxc.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    @Select("select * from student;")
    List<Student> getAllStudent();

    List<Student> getAllStudentByLimit(Map<String, Integer> map);

    @Select("select * from student where sname like \"%\"#{name}\"%\";")
    List<Student> getStudentByName(@Param("name") String sname);

    @Select("select * from student where sno = #{sno};")
    Student getStudentBySno(@Param("sno") String sno);

    int addStudent(@Param("student") Student student);

}
