package cn.video110.ressadnatomdemo;

import cn.video110.ressadnatomdemo.wcmchannel.WcmChannelRepository;
import cn.video110.ressadnatomdemo.wcmdocument.WCMDOCUMENT;
import cn.video110.ressadnatomdemo.wcmdocument.WcmDocumentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                .stream()
                .collect(Collectors.groupingBy(WCMDOCUMENT::getDOCAUTHOR))
                .forEach((x, y) -> System.out.printf("\n" + x + "=======" + y.size() + "\n"));
    }

    @Test
    public void test() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(10);
        testList.add(1);
        testList.add(-1);
        System.out.printf("\n" + wcmDocumentRepository.countByDOCSTATUS(1) + "\n");
        String a = "";
    }

}
