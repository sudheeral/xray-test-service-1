package com.pearson.xraytestservice.employee;

import com.pearson.xraytestservice.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class SampleController {
  @Autowired
  private RestService service;

  @GetMapping("/sample")
  public String getSample() {
    return "sample";
  }

  @GetMapping("/remote-sample")
  public String getRemoteSample() {
    return service.getRemoteSample();
  }
}