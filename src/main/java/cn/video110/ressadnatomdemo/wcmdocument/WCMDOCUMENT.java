package cn.video110.ressadnatomdemo.wcmdocument;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * 文档
 */
@Data
@Entity
public class WCMDOCUMENT {
    /**
     * 编号
     */
    @Id
    private Integer DOCID;

    /**
     * 文档标题
     */
    private String DOCTITLE;

    /**
     * 文档状态
     */
    @Column(name = "DOCSTATUS")
    private Integer dOCSTATUS;

    /**
     * 所属栏目
     */
    @Column(name = "DOCCHANNEL")
    private Integer dOCCHANNEL;

    /**
     * 发布后的链接地址
     */
    private String DOCPUBURL;

    /**
     * 内容摘要
     */
    private String DOCABSTRACT;

    /**
     * 发布时间
     */
    private Timestamp DOCPUBTIME;

    /**
     * 对象创建者
     */
    private String CRUSER;

    /**
     * 对象创建时间
     */
    private Timestamp CRTIME;
}
