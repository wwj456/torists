package com.example.torists.service.Impl;

import com.example.torists.bean.Tourists;
import com.example.torists.repositroy.TouristsReposictroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.TouristsService;

import java.util.List;

public class TouristsServiceImpl implements TouristsService {

    @Autowired
    TouristsReposictroy touristsReposictroy;
    @Override
    public List<Tourists> findAlltourists() {
        return touristsReposictroy.findAlltourists();
    }

    @Override
    public int addTourists(Tourists tourists) {
        return touristsReposictroy.addTourists(tourists);
    }

    @Override
    public int updateTourists(Tourists tourists) {
        return touristsReposictroy.updateTourists(tourists);
    }

    @Override
    public int deleteTourists(int t_id) {
        return touristsReposictroy.deleteTourists(t_id);
    }
}
