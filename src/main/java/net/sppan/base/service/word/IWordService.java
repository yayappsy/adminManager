package net.sppan.base.service.word;

import net.sppan.base.entity.word.Word;
import net.sppan.base.service.support.IBaseService;
import org.springframework.data.domain.Page;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:43
 * @Description:
 */
public interface IWordService extends IBaseService<Word,Integer> {

    Word get(String word);

    Page<Word> query(final String word, final String means, Integer page, Integer size);
}
