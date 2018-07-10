package service;

import com.example.torists.bean.Articletype;

import java.util.List;

public interface ArticletypeService {
    /**
     * 查询全部新闻类型
     * @return
     */
    List<Articletype> findAllArticletype();
}
