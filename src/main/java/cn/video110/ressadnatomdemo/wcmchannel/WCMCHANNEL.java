package cn.video110.ressadnatomdemo.wcmchannel;

import cn.video110.ressadnatomdemo.wcmdocument.WCMDOCUMENT;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

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
    private Integer CHANNELID;

    /**
     * 栏目名
     */
    private String CHNLDESC;

    /**
     * 链接
     */
    private String CHNLDATAPATH;

    /**
     * 栏目下文档列表
     */
    @OneToMany
    private List<WCMDOCUMENT> WCMDOCUMENTList;

}
