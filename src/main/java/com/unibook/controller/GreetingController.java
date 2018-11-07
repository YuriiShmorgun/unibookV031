package com.unibook.controller;

import com.unibook.model.entity.Message;
import com.unibook.model.entity.Person;
import com.unibook.model.entity.SubjectType;
import com.unibook.model.repository.IMessageRepo;
import com.unibook.model.repository.IPersonRepo;
import com.unibook.model.repository.ISubjectTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private IMessageRepo messageRepo;
    @Autowired
    private IPersonRepo personRepo;
    @Autowired
    private ISubjectTypeRepo subjectTypeRepo;

    @GetMapping
    public String index(Map<String, Object> model){
        return "index";
    }

    @GetMapping("/list")
    public String list (
        Map<String, Object> model){
        Iterable<Message> messageList = messageRepo.findAll();
        model.put("messages", messageList);
        return "list";
    }


    @GetMapping("/personList")
    public String personList (
            Map<String, Object> model){
        Iterable<Person> list = personRepo.findAll();
        model.put("personList", list);
        return "personList";
    }

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name", required=false, defaultValue="World")
        String name,
        Map <String, Object> model) {
            model.put("name", name);
            return "greeting";
    }

    @GetMapping("/administrator")
    public String administrator (
        Map <String, Object> model){
            Iterable<SubjectType> subjectTypeList = subjectTypeRepo.findAll();
            model.put("subjectTypeList", subjectTypeList);
            return "administrator";
    }
    @PostMapping ("/administrator")
    public String addSubjectType(
            @RequestParam String subjectTypeNameUa,
            @RequestParam String subjectTypeNameEng,
            @RequestParam String subjectTypeNameShortUa,
            @RequestParam String subjectTypeNameShortEng,
            Map<String, Object> model){
                SubjectType subjectType = new SubjectType(
                        subjectTypeNameUa,
                        subjectTypeNameEng,
                        subjectTypeNameShortUa,
                        subjectTypeNameShortEng);
                subjectTypeRepo.save(subjectType);
        Iterable<SubjectType> subjectTypeList = subjectTypeRepo.findAll();
        model.put("subjectTypeList", subjectTypeList);
        return "administrator";
    }

    @PostMapping ("filter_subject_type")
    public String filter_subject_type (@RequestParam String filter_subject_type, Map<String, Object> model){
        List<SubjectType> subjectTypeList = subjectTypeRepo.findBySubjectTypeNameUa(filter_subject_type);
        model.put("subjectTypeList", subjectTypeList);
        return "administrator";
    }


    @PostMapping
    public String add (
        @RequestParam String text,
        @RequestParam String tag,
        Map <String, Object> model){
            Message message = new Message(text, tag);
            messageRepo.save(message);
            Iterable<Message> messageList = messageRepo.findAll();
            model.put("messages", messageList);
        return "list";
    }

}
