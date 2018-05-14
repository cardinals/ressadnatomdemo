package cn.video110.ressadnatomdemo.wcmgrpuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WcmgrpuserServiceImpl implements WcmgrpuserService {
    @Autowired
    WcmgrpuserRepository wcmgrpuserRepository;
    @Override
    public List<WCMGRPUSER> findByGROUPID(Integer groupId) {
        return wcmgrpuserRepository.findByGROUPID(groupId);
    }
}
