package com.resdii.vars.management.controller;

import com.resdii.ms.common.rest.BaseRestController;
import com.resdii.ms.common.utils.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/internal")
public class InternalController extends BaseRestController {


    /**
     * Xoa bai post theo thong tin request
     * @param
     * @return
     */
    @GetMapping("/posts")
    public ResponseEntity testController() {
        return RestUtils.responseOk();
    }

}
