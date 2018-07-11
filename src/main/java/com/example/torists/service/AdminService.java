package com.example.torists.service;

import com.example.torists.bean.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdminService {
    /**
     * 查询全部管理员
     * @return
     */
    List<Admin> findAllAdmin();

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);

    /**
     * 修改管理员
     * @param admin
     * @return
     */
    int updateAdmin(Admin admin);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int deleteAdmin(Integer id);

}
