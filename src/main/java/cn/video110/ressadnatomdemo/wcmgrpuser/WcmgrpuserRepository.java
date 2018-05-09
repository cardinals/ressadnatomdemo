package cn.video110.ressadnatomdemo.wcmgrpuser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WcmgrpuserRepository extends JpaRepository<WCMGRPUSER, Integer> {
    List<WCMGRPUSER> findByGROUPID(Integer groupId);
}
