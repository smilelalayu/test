package com.hm.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	public final static String PAGE_INDEX = "page_index";
	
	/**
	 * 主页
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "page/index")
	public String index() throws Exception {
		return PAGE_INDEX;
	}
}
