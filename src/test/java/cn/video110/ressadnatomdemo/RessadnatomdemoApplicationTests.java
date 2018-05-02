package cn.video110.ressadnatomdemo;

import cn.video110.ressadnatomdemo.wcmchannel.WCMCHANNEL;
import cn.video110.ressadnatomdemo.wcmchannel.WcmChannelRepository;
import cn.video110.ressadnatomdemo.wcmdocument.WCMDOCUMENT;
import cn.video110.ressadnatomdemo.wcmdocument.WcmDocumentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RessadnatomdemoApplicationTests {
    @Autowired
    WcmDocumentRepository wcmDocumentRepository;
    @Autowired
    WcmChannelRepository wcmChannelRepository;

    @Test
    public void wcmChannelRepository() {
        List<WCMCHANNEL> all = wcmChannelRepository.findAll();
        System.out.println("=================>" + all.size());
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }
    @Test
    public void contextLoads() {
        List<WCMDOCUMENT> all = wcmDocumentRepository.findAll();
        System.out.println("=================>" + all.size());
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }


}
