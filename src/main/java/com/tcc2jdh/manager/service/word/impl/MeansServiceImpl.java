package com.tcc2jdh.manager.service.word.impl;

import com.tcc2jdh.manager.entity.word.Means;
import com.tcc2jdh.manager.service.word.IMeansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcc2jdh.manager.dao.support.IBaseDao;
import com.tcc2jdh.manager.dao.word.IMeansDao;
import com.tcc2jdh.manager.service.support.impl.BaseServiceImpl;

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
