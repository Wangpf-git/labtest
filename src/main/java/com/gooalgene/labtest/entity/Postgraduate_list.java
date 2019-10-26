package com.gooalgene.labtest.entity;

import com.gooalgene.labtest.dto.Postgraduate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postgraduate_list {
    private Integer pl_id;
    private String pl_name;
    private String pl_title;
    private String pl_content;
    private String pl_date;
    private Integer pl_state;
    private String pl_url;
    private Integer pl_type_id;

    public Postgraduate_list() {

    }

    public Postgraduate_list(Postgraduate postgraduate) {
        pl_id = postgraduate.getId();
        pl_name = postgraduate.getName();
        pl_title = postgraduate.getTitle();
        pl_content = postgraduate.getContent();
        pl_date = postgraduate.getDate();
        pl_state = postgraduate.getState();
        pl_url = postgraduate.getUrl();
        pl_type_id = postgraduate.getTypeId();
    }

}
