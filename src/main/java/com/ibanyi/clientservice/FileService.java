package com.ibanyi.clientservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bykj003 on 2017/12/26.
 */
@FeignClient(value = "fileService")
public interface FileService {

    @RequestMapping(value = "/getFilePath")
    String getFilePath();
}
