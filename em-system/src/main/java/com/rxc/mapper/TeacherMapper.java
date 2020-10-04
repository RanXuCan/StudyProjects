package com.rxc.mapper;

import com.rxc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher where tno = #{no}")
    Teacher getTeacherByTno(@Param("no") String no);
}
