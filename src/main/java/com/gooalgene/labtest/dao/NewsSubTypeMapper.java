package com.gooalgene.labtest.dao;


import com.gooalgene.labtest.entity.News_SubType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsSubTypeMapper {
    List<News_SubType> findAll();

    List<News_SubType> findByType(@Param("ns_type_id") Integer ns_type_id);
    News_SubType findById(@Param("ns_id") Integer ns_id);
//    News_SubType findByName(@Param("ns_id") Integer ns_id)
}
