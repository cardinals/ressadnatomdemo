package cn.video110.ressadnatomdemo;

import cn.video110.ressadnatomdemo.wcmchannel.WcmChannelRepository;
import cn.video110.ressadnatomdemo.wcmdocument.WcmDocumentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
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
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(10);
        testList.add(2);
        wcmDocumentRepository
                .findByDOCSTATUSIn(testList)
                .forEach(s -> System.out.printf(s.toString()));
    }

}
