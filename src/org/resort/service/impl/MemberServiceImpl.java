package org.resort.service.impl;

import org.resort.dao.MemberDao;
import org.resort.entity.Member;
import org.resort.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao dao;

    @Override
    public List<Member> getAllMember() {
        List<Member> memberList = new ArrayList<Member>();
        memberList = dao.getAllEntity();
        return memberList;
    }
}
