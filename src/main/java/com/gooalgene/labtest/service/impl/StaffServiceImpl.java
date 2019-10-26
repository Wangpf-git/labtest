package com.gooalgene.labtest.service.impl;

import com.gooalgene.labtest.dao.StaffMapper;
import com.gooalgene.labtest.dto.Staff;
import com.gooalgene.labtest.entity.Staff_info;
import com.gooalgene.labtest.entity.Staff_list;
import com.gooalgene.labtest.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    public Staff Sel(int id) {
        Staff_list staff_list = staffMapper.Sel(id);
        String staff_type = staffMapper.SearchType(staff_list.getSl_type_id());
        Staff ret = new Staff(staff_list, staff_type);
        return ret;
    }

    public List<Staff> findAll() {
        List<Staff_list> list = staffMapper.findAll();
        List<Staff> ret = new ArrayList<>();
        for (Staff_list staff_list : list) {
            String staff_type = staffMapper.SearchType(staff_list.getSl_type_id());
            Staff staff = new Staff(staff_list, staff_type);
            ret.add(staff);
        }
        return ret;
    }

    public String Del(int id) {
        Staff_info staff_info = staffMapper.getStaffInfo(id);
        if (staff_info != null)
            staffMapper.deleteStaffInfo(id);
        staffMapper.Del(id);
        return "success!";
    }

    public String Insert(Staff staff) {
        if (staff.getId() != null) {
            staff.setId(null);
        }
        Staff_list staff_list = new Staff_list(staff);
        staffMapper.Insert(staff_list);
        return "success!";
    }

    public String Update(Staff staff) {
        Staff_list staff_list = new Staff_list(staff);
        staffMapper.Update(staff_list);
        return "success!";
    }

    public List<String> getAllType() {
        return staffMapper.getAllType();
    }

    public String deleteType(int id) {
        staffMapper.deleteType(id);
        return "success!";
    }

    public Staff getStaffInfo(int id) {
        Staff_list staff_list = staffMapper.Sel(id);
        String staff_type = staffMapper.SearchType(staff_list.getSl_type_id());
        Staff_info staff_info = staffMapper.getStaffInfo(id);
        Staff ret = new Staff(staff_list, staff_type, staff_info);
        return ret;
    }

    public String updateStaffInfo(Staff staff) {
        Integer id = staff.getId();
        Staff_list staff_list = staffMapper.Sel(id);
        if (staff_list == null)
            return "the staff doesn't exist!";
        else {
            Staff_info staff_info = staff.getInfo();
            if (!staff_info.getSi_uid().equals(id))
                staff_info.setSi_uid(id);
            if (staffMapper.getStaffInfo(id) != null) {
                staffMapper.updateStaffInfo(staff_info);
                return "update success!";
            } else {
                staffMapper.insertStaffInfo(staff_info);
                return "insertion success!";
            }
        }
    }

}
