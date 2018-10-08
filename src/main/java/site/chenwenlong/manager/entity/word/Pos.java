package site.chenwenlong.manager.entity.word;

import lombok.Data;
import site.chenwenlong.manager.entity.support.BaseEntity;

import javax.persistence.*;

/**
 * @author: ChenWenLong
 * @Date: 2018/9/30/030 15:07
 * @Description:
 */
@Entity
@Data
@Table(name = "word_pos")
public class Pos extends BaseEntity {

    private static final long serialVersionUID = 2652101876620957384L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    private String name;

    private String means;


}
