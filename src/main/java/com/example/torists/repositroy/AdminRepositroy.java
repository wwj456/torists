package com.example.torists.repositroy;

import com.example.torists.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminRepositroy {
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
    int addAdmin(@Param("admin") Admin admin);

    /**
     * 修改管理员
     * @param admin
     * @return
     */
    int updateAdmin(@Param("admin")Admin admin);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int deleteAdmin(@Param("admin")Integer id);

}
