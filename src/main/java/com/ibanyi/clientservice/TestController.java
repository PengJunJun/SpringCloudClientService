package com.ibanyi.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bykj003 on 2017/12/26.
 */
@RestController
public class TestController {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/app/filePath", method = RequestMethod.GET)
    public String test() {
        return fileService.getFilePath();
    }

    @RequestMapping(value = "/fileClient", method = RequestMethod.GET)
    public String getClient() {
        return "hello test clientservice";
    }
}
