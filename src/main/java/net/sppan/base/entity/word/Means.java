package net.sppan.base.entity.word;

import lombok.Data;
import net.sppan.base.entity.support.BaseEntity;

import javax.persistence.*;

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
    @Column(name = "ID")
    private Integer id;


    private String means;

}
