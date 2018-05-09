package cn.video110.ressadnatomdemo.wcmdocument;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface WcmDocumentRepository extends JpaRepository<WCMDOCUMENT, Integer> {
    List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus);

    List<WCMDOCUMENT> findByDOCSTATUSIn(List<Integer> status);

    List<WCMDOCUMENT> findByCRUSERInAndDOCSTATUSInAndCRTIMEBetweenAndDOCCHANNELIn
            (List<String> userNameList, List<Integer> statusIdList, Timestamp startTime, Timestamp endTime, List<Integer> docChannelIdList);

    Long countByDOCSTATUS(Integer status);
}
