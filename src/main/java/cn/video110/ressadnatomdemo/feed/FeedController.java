package cn.video110.ressadnatomdemo.feed;

import cn.video110.ressadnatomdemo.wcmchannel.WCMCHANNEL;
import cn.video110.ressadnatomdemo.wcmchannel.WcmChannelRepository;
import cn.video110.ressadnatomdemo.wcmdocument.WCMDOCUMENT;
import cn.video110.ressadnatomdemo.wcmdocument.WcmDocumentRepository;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Guid;
import com.rometools.rome.feed.rss.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FeedController {
    @Autowired
    WcmChannelRepository wcmChannelRepository;
    @Autowired
    WcmDocumentRepository wcmDocumentRepository;

    @GetMapping("/rssList")
    public List<WCMCHANNEL> rssList() {
        return wcmChannelRepository.findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(4,0,0);
    }

    @GetMapping("/rss")
    public Channel rss(Integer docchannel) {

        Optional<WCMCHANNEL> wcmchannel = wcmChannelRepository.findById(docchannel);
        Channel channel = new Channel();
        channel.setFeedType("rss_2.0");
        channel.setTitle(wcmchannel.get().getCHNLDESC());
        channel.setLink(wcmchannel.get().getCHNLDATAPATH());
        channel.setDescription(wcmchannel.get().getCHNLDESC());

        List<WCMDOCUMENT> WCMDOCUMENTList = wcmDocumentRepository.findByDOCCHANNEL(docchannel);
        List<Item> items = new ArrayList<Item>();
        WCMDOCUMENTList.stream()
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
        channel.setItems(items);


        return channel;
    }

}