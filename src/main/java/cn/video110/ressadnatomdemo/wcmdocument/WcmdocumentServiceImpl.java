package cn.video110.ressadnatomdemo.wcmdocument;

import cn.video110.ressadnatomdemo.wcmchannel.WcmChannelRepository;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Guid;
import com.rometools.rome.feed.rss.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WcmdocumentServiceImpl implements WcmdocumentService {

    @Autowired
    WcmChannelRepository wcmChannelRepository;
    @Autowired
    WcmDocumentRepository wcmDocumentRepository;

    @Override
    public List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus) {
        return wcmDocumentRepository.findByDOCCHANNELAndDOCSTATUS(docchannel, docstatus);
    }

    @Override
    public List<Item> initItems(Integer docchannelId, Integer docstatus) {
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

                    item.setAuthor(doc.getDOCAUTHOR());
                    items.add(item);
                });
        return items;
    }
}
