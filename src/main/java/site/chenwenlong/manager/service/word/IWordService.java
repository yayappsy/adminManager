package site.chenwenlong.manager.service.word;

import org.springframework.data.domain.Page;
import site.chenwenlong.manager.entity.word.Word;
import site.chenwenlong.manager.service.support.IBaseService;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:43
 * @Description:
 */
public interface IWordService extends IBaseService<Word, Integer> {

    Word get(String word);

    Page<Word> query(final String word, final String means, Integer page, Integer size);
}
