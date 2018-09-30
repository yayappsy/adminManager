package net.sppan.base.entity;

import lombok.Data;
import net.sppan.base.entity.support.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 10:57
 * @Description:
 */
@Entity
@Data
@Table(name = "word_means")
public class Means extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;
    /**
     * wordid
     */
    private int wordid;

    /**
     * posid
     */
    private int posid;

    /**
     * means
     */
    private String means;
}
