package com.gooalgene.labtest.service;

import com.gooalgene.labtest.entity.News_List;

import java.util.List;

public interface NoticeService {

    List<News_List> findNotice();

    News_List findById(Integer nl_id);

    void insertNotice(News_List news_list);

    void deleteNotices(Integer noticeIds);

    void updateNotice(News_List news_list);

}
