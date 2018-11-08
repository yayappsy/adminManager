package site.chenwenlong.manager.dao.word;

import org.springframework.stereotype.Repository;
import site.chenwenlong.manager.dao.support.IBaseDao;
import site.chenwenlong.manager.entity.word.Word;

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
