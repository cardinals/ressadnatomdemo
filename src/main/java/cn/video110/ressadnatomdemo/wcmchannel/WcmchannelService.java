package cn.video110.ressadnatomdemo.wcmchannel;

import com.rometools.rome.feed.rss.Channel;

import java.util.List;
import java.util.Optional;

public interface WcmchannelService {

    public List<WCMCHANNEL> findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(Integer SITEID, Integer STATUS, Integer PARENTID);

    public Optional<WCMCHANNEL> findById(Integer id);

    public Channel initChanl(Integer id);
}
