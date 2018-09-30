package net.sppan.base.controller.web;

import net.sppan.base.controller.BaseController;
import net.sppan.base.entity.word.Means;
import net.sppan.base.entity.word.Word;
import net.sppan.base.service.IUserService;
import net.sppan.base.service.word.IMeansService;
import net.sppan.base.service.word.IWordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController extends BaseController{
	
	@Autowired
	private IUserService userService;

	@Autowired
	private IWordService wordService;

	@Autowired
	private IMeansService meansService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = {"/", "/index"})
	@ResponseBody
	public Object index() {
		Means means = meansService.find(1);
		Page<Word> query = wordService.query("get", null);
		return query;
	}
}
