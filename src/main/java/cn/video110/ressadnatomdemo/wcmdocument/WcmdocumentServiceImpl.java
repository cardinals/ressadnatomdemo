package cn.video110.ressadnatomdemo.wcmdocument;

import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Guid;
import com.rometools.rome.feed.rss.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class WcmdocumentServiceImpl implements WcmdocumentService {
    @Autowired
    WcmDocumentRepository wcmDocumentRepository;

    @Override
    public List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus) {
        return wcmDocumentRepository.findByDOCCHANNELAndDOCSTATUS(docchannel, docstatus);
    }

    @Override
    public List<Item> packageItems(Integer docchannelId, Integer docstatus) {
        List<WCMDOCUMENT> wcmdocumentList = wcmDocumentRepository.findByDOCCHANNELAndDOCSTATUS(docchannelId, docstatus);
        List<Item> items = new ArrayList<Item>();
        wcmdocumentList.stream()
                .filter(s -> s != null)
                .forEach(doc -> {
                    Item item = new Item();
                    item.setTitle(doc.getDOCTITLE());
                    item.setLink(doc.getDOCPUBURL());

                    Description descr = new Description();
                    descr.setValue(doc.getDOCABSTRACT());
                    item.setDescription(descr);

                    item.setPubDate(doc.getDOCPUBTIME());

                    Guid guid = new Guid();
                    guid.setValue(doc.getDOCPUBURL());
                    item.setGuid(guid);

                    item.setAuthor(doc.getCRUSER());
                    items.add(item);
                });
        return items;
    }

    @Override
    public List<WCMDOCUMENT> findByCRUSERInAndDOCSTATUSInAndCRTIMEBetweenAndDOCCHANNELIn
            (List<String> userNameList, List<Integer> statusIdList, Timestamp startTime, Timestamp endTime, List<Integer> docChannelIdList) {
        return wcmDocumentRepository.findByCRUSERInAndDOCSTATUSInAndCRTIMEBetweenAndDOCCHANNELIn(userNameList, statusIdList, startTime, endTime, docChannelIdList);
    }
}
