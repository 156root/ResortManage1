package org.resort.controller;

import org.resort.entity.Member;
import org.resort.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 郭文虎
 */
@RequestMapping("/member")
@Controller
public class MemberController {
    @Autowired
    MemberService service;

    /**
     * 获取全部会员
     * @param map 存储对象
     * @return 全部会员
     */
    @RequestMapping("/getAllMember.html")
    public String getAllMember(Map<String,Object> map) {
        /*Map<String, Object> map = new HashMap<String, Object>();*/
        List<Member> memberList= service.getAllEntity();
        for (Member member : memberList) {
            System.out.println("id:"+member.getId());
            System.out.println("account:"+member.getAccount());
        }
        map.put("member", memberList);
        return "member/show";
    }
}
