package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.Course;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {
    @Results({
            @Result(column = "course_id", property = "courseId"),
            @Result(column = "course_name", property = "courseName"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "course_class", property = "courseClass"),
            @Result(column = "cover", property = "cover"),
            @Result(column = "course_code", property = "courseCode"),
            @Result(column = "finished", property = "finished")
    })
    @Select("SELECT * FROM t_course ")
    List<Course> selectAll();



}
