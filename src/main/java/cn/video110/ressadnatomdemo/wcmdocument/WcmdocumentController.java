package cn.video110.ressadnatomdemo.wcmdocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class WcmdocumentController {
    @Autowired
    WcmdocumentService wcmdocumentService;

    @GetMapping("/wcmdocument/rankCustom")
    public Map<String, Map<Integer, Long>> rankCustom(List<String> userNameList, List<Integer> statusIdList, Timestamp startTime, Timestamp endTime, List<Integer> docChannelIdList) {
        Map<String, Map<Integer, Long>> result = new HashMap<String, Map<Integer, Long>>();

        wcmdocumentService
                .findByCRUSERInAndDOCSTATUSInAndCRTIMEBetweenAndDOCCHANNELIn(userNameList, statusIdList, startTime, endTime, docChannelIdList)
                .stream()
                .collect(Collectors.groupingBy(WCMDOCUMENT::getCRUSER))
                .forEach((k, v) -> result.put(k, v.stream().collect(Collectors.groupingBy(WCMDOCUMENT::getDOCSTATUS, Collectors.counting())))
                );

        return result;
    }
}