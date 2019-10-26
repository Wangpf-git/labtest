package com.gooalgene.labtest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News_SubType {
    private Integer ns_id;
    private String ns_name;
    private Integer ns_type_id;

    public News_SubType(Integer ns_id, String ns_name, Integer ns_type_id) {
        this.ns_id = ns_id;
        this.ns_name = ns_name;
        this.ns_type_id = ns_type_id;
    }

    public News_SubType() {
    }

    @Override
    public String toString() {
        return "News_SubType{" +
                "ns_id=" + ns_id +
                ", ns_name='" + ns_name + '\'' +
                ", ns_type_id=" + ns_type_id +
                '}';
    }
}
