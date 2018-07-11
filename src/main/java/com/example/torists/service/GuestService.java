package com.example.torists.service;

import com.example.torists.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GuestService {
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
        int updateGuest(Guest guest);

        /**
         * 添加留言
         * @param guest
         * @return
         */
        int addGuest(Guest guest);

        /**
         * 删除留言
         * @param guestid
         * @return
         */
        int deleteGuest(int guestid);
}
