package org.resort.service.impl;

import org.resort.dao.MemberDao;
import org.resort.entity.Member;
import org.resort.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 郭文虎
 *
 * 会员服务
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;


}
