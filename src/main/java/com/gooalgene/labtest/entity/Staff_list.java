package com.gooalgene.labtest.entity;

import com.gooalgene.labtest.dto.Staff;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff_list {
    private Integer sl_id;
    private String sl_name;
    private Integer sl_type_id;

    public Staff_list() {

    }

    public Staff_list(Staff staff) {
        sl_id = staff.getId();
        sl_name = staff.getName();
        sl_type_id = staff.getType_id();
    }

}
