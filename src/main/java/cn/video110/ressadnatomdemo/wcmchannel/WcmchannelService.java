package cn.video110.ressadnatomdemo.wcmchannel;

import com.rometools.rome.feed.rss.Channel;

import java.util.List;

public interface WcmchannelService {
    public List<WCMCHANNEL> findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(Integer SITEID, Integer STATUS, Integer PARENTID);

    public Channel packageChanl(Integer id);
}
