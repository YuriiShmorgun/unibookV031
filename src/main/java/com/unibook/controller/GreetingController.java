package com.unibook.controller;

import com.unibook.model.entity.Message;
import com.unibook.model.repository.IMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    IMessageRepo messageRepo;

    @GetMapping("/list")
    public String list (
        Map<String, Object> model){
        Iterable<Message> messageList = messageRepo.findAll();
        model.put("messages", messageList);
        return "list";
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
            Map <String, Object> model
    ){
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
