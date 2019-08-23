package com.senoops.dao;

import java.util.List;

import com.senoops.model.Selectedcourse;

public interface SelectedcourseMapper{
    Integer insert(Selectedcourse record);
    List<Selectedcourse> selectcourseById(Integer userid);
    Integer delete(Selectedcourse record);
    Integer insertSelective(Selectedcourse record);
}