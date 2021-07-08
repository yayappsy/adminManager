package com.tcc2jdh.manager.dao.word;

import com.tcc2jdh.manager.dao.support.IBaseDao;
import com.tcc2jdh.manager.entity.word.Word;
import org.springframework.stereotype.Repository;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:38
 * @Description:
 */
@Repository
public interface IWordDao extends IBaseDao<Word, Integer> {
    /**
     * 单词查询
     *
     * @param word
     * @return
     */
    Word findByWord(String word);
}
