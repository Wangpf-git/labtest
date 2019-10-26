package com.gooalgene.labtest.dto;


import com.gooalgene.labtest.entity.Staff_info;
import com.gooalgene.labtest.entity.Staff_list;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Staff {
    private Integer id;
    private String name;
    private Integer type_id;
    private String type;
    private Staff_info info;

    public Staff() {

    }

    public Staff(Staff_list staff_list) {
        id = staff_list.getSl_id();
        name = staff_list.getSl_name();
        type_id = staff_list.getSl_type_id();
    }

    public Staff(Staff_list staff_list, String type) {
        id = staff_list.getSl_id();
        name = staff_list.getSl_name();
        type_id = staff_list.getSl_type_id();
        this.type = type;
    }

    public Staff(Staff_list staff_list, String staff_type, Staff_info staff_info) {
        id = staff_list.getSl_id();
        name = staff_list.getSl_name();
        type_id = staff_list.getSl_type_id();
        this.type = staff_type;
        info = staff_info;
    }
}
