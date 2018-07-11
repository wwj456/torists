package com.example.torists.service.Impl;

import com.example.torists.bean.Guest;
import com.example.torists.repositroy.GuestRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.GuestService;

import java.util.List;

public class GuestServiceImpl implements GuestService {

    @Autowired
    GuestRepositroy guestRepositroy;
    @Override
    public List<Guest> findAllGuest() {
        return guestRepositroy.findAllGuest();
    }

    @Override
    public int updateGuest(Guest guest) {
        return guestRepositroy.updateGuest(guest);
    }

    @Override
    public int addGuest(Guest guest) {
        return guestRepositroy.addGuest(guest);
    }

    @Override
    public int deleteGuest(int guestid) {
        return guestRepositroy.deleteGuest(guestid);
    }
}
