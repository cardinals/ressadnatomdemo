package cn.video110.ressadnatomdemo.wcmdocument;

import com.rometools.rome.feed.rss.Item;

import java.util.List;

public interface WcmdocumentService {

    List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus);

    List<Item> initItems(Integer docchannel, Integer docstatus);
}
