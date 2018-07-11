package com.example.torists.service.Impl;

import com.example.torists.bean.Admin;
import com.example.torists.repositroy.AdminRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepositroy adminRepositroy;
    @Override
    public List<Admin> findAllAdmin() {
        return adminRepositroy.findAllAdmin();
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminRepositroy.addAdmin(admin);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminRepositroy.updateAdmin(admin);
    }

    @Override
    public int deleteAdmin(Integer id) {
        return adminRepositroy.deleteAdmin(id);
    }
}
