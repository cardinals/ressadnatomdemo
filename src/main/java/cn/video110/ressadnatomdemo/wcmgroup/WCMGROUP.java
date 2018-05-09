package cn.video110.ressadnatomdemo.wcmgroup;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户组
 */
@Data
@Entity
public class WCMGROUP {
    /**
     * 编号
     */
    @Id
    private Integer GROUPID;

    /**
     * 父组编号
     */
    @Column(name = "PARENTID")
    private Integer pARENTID;

    /**
     * 名称
     */
    private String GNAME;

    /**
     * 说明描述
     */
    @Column(name = "GDESC")
    private Integer gDESC;
}
