package cn.video110.ressadnatomdemo.wcmdocument;

import com.rometools.rome.feed.rss.Item;

import java.sql.Timestamp;
import java.util.List;

public interface WcmdocumentService {
    List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus);

    List<Item> packageItems(Integer docchannelId, Integer docstatus);
    List<WCMDOCUMENT> findByCRUSERInAndDOCSTATUSInAndCRTIMEBetweenAndDOCCHANNELIn
            (List<String> userNameList, List<Integer> statusIdList, Timestamp startTime, Timestamp endTime, List<Integer> docChannelIdList);
}
