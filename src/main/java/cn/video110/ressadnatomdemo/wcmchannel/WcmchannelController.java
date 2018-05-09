package cn.video110.ressadnatomdemo.wcmchannel;

import cn.video110.ressadnatomdemo.wcmdocument.WcmdocumentService;
import com.rometools.rome.feed.rss.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WcmchannelController {
    @Autowired
    WcmchannelService wcmchannelService;
    @Autowired
    WcmdocumentService wcmdocumentService;

    @GetMapping("/wcmchannel/findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull")
    public List<WCMCHANNEL> findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull() {
        return wcmchannelService.findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(4, 0, 0);
    }

    @GetMapping("/wcmchannel/channel")
    public Channel rss(Integer docchannelId) {
        Channel channel = wcmchannelService.initChanl(docchannelId);
        channel.setItems(wcmdocumentService.initItems(docchannelId, 10));
        return channel;
    }
}