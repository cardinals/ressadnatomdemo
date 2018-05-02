package cn.video110.ressadnatomdemo.wcmchannel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WcmChannelRepository
        extends JpaRepository<WCMCHANNEL, Integer> {
    List<WCMCHANNEL> findBySITEIDAndSTATUSAndPARENTIDAndCHNLDATAPATHIsNotNull(Integer SITEID, Integer STATUS, Integer PARENTID);
}
