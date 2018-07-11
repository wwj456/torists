package com.example.torists.repositroy;

import com.example.torists.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GuestRepositroy {
    /**
     * 查询全部留言
     * @return
     */
    List<Guest> findAllGuest();

    /**
     * 修改留言
     * @param guest
     * @return
     */
    int updateGuest(@Param("g") Guest guest);

    /**
     * 添加留言
     * @param guest
     * @return
     */
    int addGuest(@Param("g")Guest guest);

    /**
     * 删除留言
     * @param guestid
     * @return
     */
    int deleteGuest(@Param("g")int guestid);
}
