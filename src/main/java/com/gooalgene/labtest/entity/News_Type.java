package com.gooalgene.labtest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News_Type {
    private Integer nt_id;
    private String nt_name;

    public News_Type(Integer nt_id, String nt_name) {
        this.nt_id = nt_id;
        this.nt_name = nt_name;
    }
    public News_Type() {
    }

    @Override
    public String toString() {
        return "News_Type{" +
                "nt_id=" + nt_id +
                ", nt_name='" + nt_name + '\'' +
                '}';
    }
}
