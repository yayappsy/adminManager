package net.sppan.base.dao.word;

import net.sppan.base.dao.support.IBaseDao;
import net.sppan.base.entity.word.Word;
import org.springframework.stereotype.Repository;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:38
 * @Description:
 */
@Repository
public interface IWordDao extends IBaseDao<Word,Integer> {
    /**
     * 单词查询
     * @param word
     * @return
     */
    Word findByWord(String word);
}
