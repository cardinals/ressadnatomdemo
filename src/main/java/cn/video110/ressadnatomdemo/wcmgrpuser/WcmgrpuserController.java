package cn.video110.ressadnatomdemo.wcmgrpuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WcmgrpuserController {
    @Autowired
    WcmgrpuserRepository wcmgrpuserRepository;

    @GetMapping("/wcmgroup/findByGROUPID")
    public List<WCMGRPUSER> findByGROUPID(Integer groupId) {
        return wcmgrpuserRepository.findByGROUPID(groupId);
    }
}