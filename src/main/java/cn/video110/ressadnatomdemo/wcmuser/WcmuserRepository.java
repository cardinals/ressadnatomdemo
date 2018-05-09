package cn.video110.ressadnatomdemo.wcmuser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WcmuserRepository
        extends JpaRepository<WCMUSER, Integer> {

    List<WCMUSER> findByUSERIDIn(List<Integer> userIdList);
}
