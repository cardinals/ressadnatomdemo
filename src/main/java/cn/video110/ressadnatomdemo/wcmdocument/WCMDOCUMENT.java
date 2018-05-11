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
    @Column(name = "DOCTITLE")
    private String dOCTITLE;

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
    @Column(name = "DOCPUBURL")
    private String dOCPUBURL;

    /**
     * 内容摘要
     */
    @Column(name = "DOCABSTRACT")
    private String dOCABSTRACT;

    /**
     * 发布时间
     */
    @Column(name = "DOCPUBTIME")
    private Timestamp dOCPUBTIME;

    /**
     * 对象创建者
     */
    @Column(name = "CRUSER")
    private String cRUSER;

    /**
     * 对象创建时间
     */
    @Column(name = "CRTIME")
    private Timestamp cRTIME;
}
