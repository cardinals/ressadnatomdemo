package cn.video110.ressadnatomdemo.wcmgrpuser;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户与用户组的关联关系
 */
@Data
@Entity
public class WCMGRPUSER {
    /**
     * 编号
     */
    @Id
    private Integer GRPUSERID;

    /**
     * 用户组编号
     */
    @Column(name = "GROUPID")
    private Integer gROUPID;

    /**
     * 用户编号
     */
    @Column(name = "USERID")
    private Integer uSERID;

    /**
     * 是否是组管理员
     */
    @Column(name = "ISADMINISTRATOR")
    private Integer iSADMINISTRATOR;
}
