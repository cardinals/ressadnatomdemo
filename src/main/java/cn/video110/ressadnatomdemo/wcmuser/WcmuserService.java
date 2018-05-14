package cn.video110.ressadnatomdemo.wcmuser;

import java.util.List;

public interface WcmuserService {
    List<WCMUSER> findByUSERIDIn(List<Integer> userIdList);
}
