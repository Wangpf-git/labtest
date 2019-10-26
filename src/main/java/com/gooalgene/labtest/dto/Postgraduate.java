package com.gooalgene.labtest.dto;

import com.gooalgene.labtest.entity.Postgraduate_list;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postgraduate {
    private Integer id;
    private String name;
    private String title;
    private String content;
    private String date;
    private Integer state;
    private String url;
    private Integer typeId;
    private String type;

    public Postgraduate() {

    }

    public Postgraduate(Postgraduate_list postgraduate_list) {
        id = postgraduate_list.getPl_id();
        name = postgraduate_list.getPl_name();
        title = postgraduate_list.getPl_title();
        content = postgraduate_list.getPl_content();
        date = postgraduate_list.getPl_date();
        state = postgraduate_list.getPl_state();
        url = postgraduate_list.getPl_url();
        typeId = postgraduate_list.getPl_type_id();
        type = "未知";
    }

    public Postgraduate(Postgraduate_list postgraduate_list, String type) {
        id = postgraduate_list.getPl_id();
        name = postgraduate_list.getPl_name();
        title = postgraduate_list.getPl_title();
        content = postgraduate_list.getPl_content();
        date = postgraduate_list.getPl_date();
        state = postgraduate_list.getPl_state();
        url = postgraduate_list.getPl_url();
        typeId = postgraduate_list.getPl_type_id();
        this.type = type;
    }
}
