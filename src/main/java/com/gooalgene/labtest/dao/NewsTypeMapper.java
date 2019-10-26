package com.gooalgene.labtest.dao;


import com.gooalgene.labtest.entity.News_Type;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsTypeMapper {
    List<News_Type> findAll();

    News_Type findById(@Param("nt_id") Integer nt_id);

    News_Type findByName(@Param("nt_name") String nl_name);
    void insert(String name);
}
