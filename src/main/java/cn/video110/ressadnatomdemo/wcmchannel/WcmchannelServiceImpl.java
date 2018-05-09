package cn.video110.ressadnatomdemo.wcmchannel;

import com.rometools.rome.feed.rss.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WcmchannelServiceImpl implements WcmchannelService {
    @Autowired
    WcmChannelRepository wcmChannelRepository;

    public List<WCMCHANNEL> findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(Integer SITEID, Integer STATUS, Integer PARENTID) {
        return wcmChannelRepository.findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(SITEID, STATUS, PARENTID);
    }

    @Override
    public Channel packageChanl(Integer id) {
        Optional<WCMCHANNEL> wcmchannel = wcmChannelRepository.findById(id);
        Channel channel = new Channel();
        channel.setFeedType("rss_2.0");
        channel.setTitle(wcmchannel.get().getCHNLDESC());
        channel.setLink(wcmchannel.get().getCHNLDATAPATH());
        channel.setDescription(wcmchannel.get().getCHNLDESC());
        return channel;
    }
}
