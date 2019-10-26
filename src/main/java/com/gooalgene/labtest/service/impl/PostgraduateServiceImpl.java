package com.gooalgene.labtest.service.impl;

import com.gooalgene.labtest.dao.PostgraduateMapper;
import com.gooalgene.labtest.dto.Postgraduate;
import com.gooalgene.labtest.entity.Postgraduate_list;
import com.gooalgene.labtest.response.BaseResponse;
import com.gooalgene.labtest.service.PostgraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostgraduateServiceImpl implements PostgraduateService {
    @Autowired
    PostgraduateMapper postgraduateMapper;

    public BaseResponse<List<Postgraduate>> findAll() {
        List<Postgraduate_list> list = postgraduateMapper.findAll();
        List<Postgraduate> ret_list = new ArrayList<>();
        for (Postgraduate_list postgraduate_list : list) {
            String postgraduate_type = postgraduateMapper.getType(postgraduate_list.getPl_type_id());
            ret_list.add(new Postgraduate(postgraduate_list, postgraduate_type));
        }
        return new BaseResponse<>(ret_list);
    }

    public BaseResponse<Postgraduate> getPostgraduate(int id) {
        Postgraduate_list postgraduate_list = postgraduateMapper.getPostgraduate(id);
        String postgraduate_type = postgraduateMapper.getType(postgraduate_list.getPl_type_id());
        Postgraduate ret = new Postgraduate(postgraduate_list, postgraduate_type);
        return new BaseResponse<>(ret);
    }

    public BaseResponse<String> insertPostgraduate(Postgraduate postgraduate) {
        Integer id = postgraduate.getId();
        if (postgraduateMapper.getPostgraduate(id) != null) {
            postgraduateMapper.updatePostgraduate(new Postgraduate_list(postgraduate));
            return new BaseResponse<>("success!");
        } else {
            postgraduateMapper.insertPostgraduate(new Postgraduate_list(postgraduate));
            return new BaseResponse<>("success!");
        }
    }

    public BaseResponse<String> deletePostgraduate(int id) {
        postgraduateMapper.deletePostgraduate(id);
        return new BaseResponse<>("success!");
    }

    public BaseResponse<List<String>> getAllType() {
        return new BaseResponse<>(postgraduateMapper.getAlltype());
    }
}
