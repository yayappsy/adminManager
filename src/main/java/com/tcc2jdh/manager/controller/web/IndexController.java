package com.tcc2jdh.manager.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.tcc2jdh.manager.controller.BaseController;
import com.tcc2jdh.manager.entity.word.Means;
import com.tcc2jdh.manager.service.sys.IUserService;
import com.tcc2jdh.manager.service.word.IMeansService;
import com.tcc2jdh.manager.service.word.IWordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tcc2jdh.manager.entity.word.Word;

@Controller
public class IndexController extends BaseController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IWordService wordService;

    @Autowired
    private IMeansService meansService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = {"/", "/api/index"})
    @ResponseBody
    public Object index() {
        String serverName = request.getServerName();
        System.out.println(serverName);
        String requestURL = request.getRequestURI();
        System.out.println(requestURL);

        Means means = meansService.find(1);
        Page<Word> query = wordService.query("get", null, 0, 10);
        Object o = JSONObject.toJSON(query);
        return o;
    }
}
