package net.sppan.base.entity.word;

import lombok.Data;
import net.sppan.base.entity.support.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    @Column(name = "ID")
    private Integer id;

    private String word;

    private String exchange;

    private String voice;

    private Integer times;

    @ManyToMany(cascade = { CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinTable(name = "word_means", joinColumns = { @JoinColumn(name = "wordID") }, inverseJoinColumns = { @JoinColumn(name = "posID") })
    private Set<Pos> posList;

    @OneToMany(cascade = { CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "wordID")
    private List<Means> means;

}
