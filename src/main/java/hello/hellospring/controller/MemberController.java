package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
// memberController객체를 생성해서 Spring에 넣어둠
public class MemberController {

    private final MemberService memberService;

    @Autowired
    //생성자에 Autowired라고 되어 있으면 memberService를 Spring 컨테이너에 연결
    public MemberController(MemberService memberService) {

        this.memberService = memberService;
    }
}
