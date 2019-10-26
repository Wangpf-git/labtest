package com.gooalgene.labtest.controller;

import com.gooalgene.labtest.dto.Postgraduate;
import com.gooalgene.labtest.response.BaseResponse;
import com.gooalgene.labtest.service.impl.PostgraduateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postgraduate")
public class PostgraduateController {
    @Autowired
    private PostgraduateServiceImpl postgraduateService;

    @GetMapping("/getAllPostgraduate")
    public BaseResponse<List<Postgraduate>> getAllPostgraduate() {
        return postgraduateService.findAll();
    }

    @GetMapping("/getPostgraduate/{id}")
    public BaseResponse<Postgraduate> getPostgraduate(@PathVariable int id) {
        return postgraduateService.getPostgraduate(id);
    }

    @PostMapping("/insertPostgraduate")
    public BaseResponse<String> insertPostgraduate(@RequestBody Postgraduate postgraduate) {
        return postgraduateService.insertPostgraduate(postgraduate);
    }

    @DeleteMapping("/deletePostgraduate/{id}")
    public BaseResponse<String> deletePostgraduate(@PathVariable int id) {
        return postgraduateService.deletePostgraduate(id);
    }

    @GetMapping("/getAllType")
    public BaseResponse<List<String>> getAllType() {
        return postgraduateService.getAllType();
    }
}
