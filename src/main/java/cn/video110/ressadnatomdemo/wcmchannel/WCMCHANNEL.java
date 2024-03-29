package cn.video110.ressadnatomdemo.wcmchannel;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 栏目
 */
@Data
@Entity
public class WCMCHANNEL {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "CHANNELID")
    private Integer cHANNELID;

    /**
     * 站点主键
     */
    @Column(name = "SITEID")
    private Integer sITEID;

    /**
     * 栏目状态
     */
    @Column(name = "STATUS")
    private Integer sTATUS;

    /**
     * 父节点id
     */
    @Column(name = "PARENTID")
    private Integer pARENTID;

    /**
     * 栏目名
     */
    @Column(name = "CHNLDESC")
    private String cHNLDESC;

    /**
     * 链接
     */
    @Column(name = "CHNLDATAPATH")
    private String cHNLDATAPATH;
}
