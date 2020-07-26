package com.example.JPA_TEST.controller;


import com.example.JPA_TEST.model.member;
import com.example.JPA_TEST.model.subject;
import com.example.JPA_TEST.service.jpaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jpaTestController {

    @Autowired
    jpaTestService jpaService;


    @GetMapping("/member")
    public void callMember() {
        System.out.println("callMember called");

        if(jpaService.getMember() != null){
            for(member mem : jpaService.getMember()){
                System.out.println("getMember");
                System.out.println("Id : " + mem.getId());
                System.out.println("Name : " + mem.getName());
            }
        } else {
            System.out.println("no member");
        }

    }

    @GetMapping("/subject")
    public void callSubject() {
        System.out.println("callSubject called");

        if(jpaService.getSubject() != null){
            for(subject sub : jpaService.getSubject()){
                System.out.println("getMember");
                System.out.println("Sub_Id : " + sub.getSub_id());
                System.out.println("Stu_Id : " + sub.getStu_id());
                System.out.println("Sub_Name : " + sub.getSub_name());
            }
        } else {
            System.out.println("no subject");
        }
    }


}
