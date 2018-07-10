package service.Impl;

import com.example.torists.bean.Articletype;
import com.example.torists.repositroy.ArticletypeRepositroy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticltypeServiceImpl implements ArticletypeRepositroy {

    @Autowired
    ArticletypeRepositroy articletypeRepositroy;
    @Override
    public List<Articletype> findAllArticletype() {
        return articletypeRepositroy.findAllArticletype();
    }
}
