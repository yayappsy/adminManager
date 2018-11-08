package site.chenwenlong.manager.service.word.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.chenwenlong.manager.dao.support.IBaseDao;
import site.chenwenlong.manager.dao.word.IMeansDao;
import site.chenwenlong.manager.entity.word.Means;
import site.chenwenlong.manager.service.support.impl.BaseServiceImpl;
import site.chenwenlong.manager.service.word.IMeansService;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 16:43
 * @Description:
 */
@Service
public class MeansServiceImpl extends BaseServiceImpl<Means, Integer> implements IMeansService {

    @Autowired
    private IMeansDao meansDao;

    @Override
    public IBaseDao<Means, Integer> getBaseDao() {
        return this.meansDao;
    }
}
