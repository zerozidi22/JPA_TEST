package com.example.JPA_TEST.service;

import com.example.JPA_TEST.model.member;
import com.example.JPA_TEST.model.subject;
import com.example.JPA_TEST.repository.memberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA_TEST.repository.subjectRepository;

import java.util.List;

@Service
public class jpaTestService {

    @Autowired
    private memberRepository memberRepository;

    @Autowired
    private subjectRepository subjectRepository;


    /* member */

    public List<member> getMember(){
        return memberRepository.findAll();
    }

    public member insertMember(member mem){
        return memberRepository.save(mem);
    }




    /* subject */

    public List<subject> getSubject(){
        return subjectRepository.findAll();
    }


}
