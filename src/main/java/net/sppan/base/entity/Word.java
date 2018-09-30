package net.sppan.base.entity;

import lombok.Data;
import net.sppan.base.entity.support.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 11:08
 * @Description:
 */
@Data
@Entity
@Table(name = "word_words")
public class Word extends BaseEntity {

    private static final long serialVersionUID = -4662869479549539037L;

    @Id
    @GeneratedValue
    /**
     * id
     */
    private int id;

    /**
     * word
     */
    private String word;

    /**
     * exchange
     */
    private String exchange;

    /**
     * voice
     */
    private String voice;

    /**
     * times
     */
    private int times;

}
