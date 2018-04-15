package org.resort.controller;

import org.resort.entity.Member;
import org.resort.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/member")
@Controller
public class MemberController {
    @Autowired
    MemberService service;

    @RequestMapping("/getAllMember.html")
    public String getAllMember(Map<String,Object> map) {
        /*Map<String, Object> map = new HashMap<String, Object>();*/
        List<Member> memberList= service.getAllMember();
        for (Member member : memberList) {
            System.out.println("id:"+member.getId());
            System.out.println("account:"+member.getAccount());
        }
        map.put("member", memberList);
        return "member/show";
    }
}
