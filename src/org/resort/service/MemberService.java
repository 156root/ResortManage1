package org.resort.service;

import org.resort.entity.Member;

import java.util.List;

public interface MemberService {
    /**
     * 获取所有会员
     * @return 所有会员集合
     */
    List<Member> getAllMember();
}
