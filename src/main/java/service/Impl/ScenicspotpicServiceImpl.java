package service.Impl;

import com.example.torists.bean.scenicspotpic;
import com.example.torists.repositroy.ScenicspotpicRepositroy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScenicspotpicServiceImpl implements ScenicspotpicRepositroy {

    @Autowired
    ScenicspotpicRepositroy scenicspotpicRepositroy;
    @Override
    public List<scenicspotpic> findAllScenicspotpic(int scenicspot_id) {
        return scenicspotpicRepositroy.findAllScenicspotpic(scenicspot_id);
    }

    @Override
    public int addScenicspotpic(scenicspotpic scenicspotpic) {
        return scenicspotpicRepositroy.addScenicspotpic(scenicspotpic);
    }

    @Override
    public int updateScenicspotpic(scenicspotpic scenicspotpic) {
        return scenicspotpicRepositroy.updateScenicspotpic(scenicspotpic);
    }

    @Override
    public int deleteScenicspotpic(int pic_id) {
        return scenicspotpicRepositroy.deleteScenicspotpic(pic_id);
    }
}
