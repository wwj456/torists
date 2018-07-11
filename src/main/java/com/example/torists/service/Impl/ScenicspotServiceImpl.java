package com.example.torists.service.Impl;

import com.example.torists.bean.Scenicspot;
import com.example.torists.repositroy.ScenicspotRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScenicspotServiceImpl implements ScenicspotRepositroy {

    @Autowired
    ScenicspotRepositroy scenicspotRepositroy;
    @Override
    public List<Scenicspot> findAllScenicspot() {
        return scenicspotRepositroy.findAllScenicspot();
    }

    @Override
    public int addScenicspot(Scenicspot scenicspot) {
        return scenicspotRepositroy.addScenicspot(scenicspot);
    }

    @Override
    public int updateScenicspot(Scenicspot scenicspot) {
        return scenicspotRepositroy.updateScenicspot(scenicspot);
    }

    @Override
    public int deleteScenicspot(int scenicspot_id) {
        return scenicspotRepositroy.deleteScenicspot(scenicspot_id);
    }
}
