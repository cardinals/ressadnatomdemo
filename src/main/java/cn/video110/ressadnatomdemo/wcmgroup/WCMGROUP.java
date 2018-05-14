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
    @Column(name = "GROUPID")
    private Integer gROUPID;

    /**
     * 父组编号
     */
    @Column(name = "PARENTID")
    private Integer pARENTID;

    /**
     * 名称
     */
    @Column(name = "GNAME")
    private String gNAME;

    /**
     * 说明描述
     */
    @Column(name = "GDESC")
    private String gDESC;
}
