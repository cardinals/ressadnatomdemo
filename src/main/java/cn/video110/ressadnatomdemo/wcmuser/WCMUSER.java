package cn.video110.ressadnatomdemo.wcmuser;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户
 */
@Data
@Entity
public class WCMUSER {

    /**
     * 编号
     */
    @Id
    private Integer USERID;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private Integer sTATUS;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nICKNAME;

    /**
     * 真实名称
     */
    @Column(name = "TRUENAME")
    private String tRUENAME;

    /**
     * 是否已删除
     */
    @Column(name = "ISDELETED")
    private Integer iSDELETED;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String uSERNAME;
}
