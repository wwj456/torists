package service.Impl;

import com.example.torists.bean.Hotel_ding;
import com.example.torists.repositroy.Hotel_dingRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import service.Hotel_dingService;

import java.util.List;

public class Hotel_dingServiceImpl implements Hotel_dingService {

    @Autowired
    Hotel_dingRepositroy hotel_dingRepositroy;
    @Override
    public List<Hotel_ding> findAllHotel_ding() {
        return hotel_dingRepositroy.findAllHotel_ding();
    }

    @Override
    public int addHootel_ding(Hotel_ding hotel_ding) {
        return hotel_dingRepositroy.addHootel_ding(hotel_ding);
    }

    @Override
    public int updateHotel_ding(Hotel_ding hotel_ding) {
        return hotel_dingRepositroy.updateHotel_ding(hotel_ding);
    }

    @Override
    public int deleteHotel_ding(int hoteldd_id) {
        return hotel_dingRepositroy.deleteHotel_ding(hoteldd_id);
    }
}
