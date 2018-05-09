package cn.video110.ressadnatomdemo.wcmdocument;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WcmDocumentRepository extends JpaRepository<WCMDOCUMENT, Integer> {
    List<WCMDOCUMENT> findByDOCCHANNELAndDOCSTATUS(Integer docchannel, Integer docstatus);

    List<WCMDOCUMENT> findByDOCSTATUSIn(List<Integer> status);

    Long countByDOCSTATUS(Integer status);
}
