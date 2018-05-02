package cn.video110.ressadnatomdemo.wcmdocument;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WcmDocumentRepository
        extends JpaRepository<WCMDOCUMENT, Integer> {
    List<WCMDOCUMENT> findByDOCCHANNEL(Integer docchannel);
}
