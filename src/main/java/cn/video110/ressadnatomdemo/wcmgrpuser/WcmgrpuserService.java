package cn.video110.ressadnatomdemo.wcmgrpuser;

import java.util.List;

public interface WcmgrpuserService {
    List<WCMGRPUSER> findByGROUPID(Integer groupId);
}
