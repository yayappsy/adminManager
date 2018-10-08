package net.sppan.base.service.impl.word;

import net.sppan.base.dao.support.IBaseDao;
import net.sppan.base.dao.word.IMeansDao;
import net.sppan.base.entity.word.Means;
import net.sppan.base.service.support.impl.BaseServiceImpl;
import net.sppan.base.service.word.IMeansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 16:43
 * @Description:
 */
@Service
public class MeansServiceImpl extends BaseServiceImpl<Means,Integer> implements IMeansService {

    @Autowired
    private IMeansDao meansDao;
    @Override
    public IBaseDao<Means, Integer> getBaseDao() {
        return this.meansDao;
    }
}
