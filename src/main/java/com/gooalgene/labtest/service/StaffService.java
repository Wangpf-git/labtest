package com.gooalgene.labtest.service;

import com.gooalgene.labtest.dto.Staff;

import java.util.List;

public interface StaffService {

    Staff Sel(int id);

    List<Staff> findAll();

    String Del(int id);

    String Insert(Staff staff);

    String Update(Staff staff);

    List<String> getAllType();

    String deleteType(int id);

    Staff getStaffInfo(int id);

    String updateStaffInfo(Staff staff);

}
