package com.tcc2jdh.manager.service.word.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tcc2jdh.manager.dao.support.IBaseDao;
import com.tcc2jdh.manager.dao.word.IWordDao;
import com.tcc2jdh.manager.entity.word.Word;
import com.tcc2jdh.manager.service.support.impl.BaseServiceImpl;
import com.tcc2jdh.manager.service.word.IWordService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:44
 * @Description:
 */
@Service
@Transactional
public class WordServiceImpl extends BaseServiceImpl<Word, Integer> implements IWordService {

    @Autowired
    private IWordDao wordDao;

    @Override
    public IBaseDao<Word, Integer> getBaseDao() {
        return this.wordDao;
    }


    @Override
    public Word get(String word) {
        return wordDao.findByWord(word);
    }

    @Override
    public Page<Word> query(final String word, final String means, Integer page, Integer size) {
        return wordDao.findAll(new Specification<Word>() {
            @Override
            public Predicate toPredicate(Root<Word> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<>();
                if (StringUtils.isNoneBlank(means)) {
                    list.add(cb.like(root.get("means").as(String.class), means));
                }
                if (StringUtils.isNoneBlank(word)) {
                    list.add(cb.equal(root.get("word").as(String.class), word));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        }, new PageRequest(page, size));
    }
}
