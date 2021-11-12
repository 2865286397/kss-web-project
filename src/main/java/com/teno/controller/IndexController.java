package com.teno.controller;

import com.teno.entity.BlogCategory;
import com.teno.service.blogcategory.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Description: 首页
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 11:45
 * Update Date Time:
 *
 * @see
 */
@Controller
public class IndexController {

    @Autowired
    private BlogCategoryService blogCategoryService;

    /**
     * Description: 
     * @date 12/11/2021
     * @param 
     * @return 
     * @throws Exception
     */
    @GetMapping(value = {"/", "/index"})
    public String indexController(ModelMap modelMap){
        List<BlogCategory> blogCategoryList = blogCategoryService.list();
        if (null == blogCategoryList){
            throw new RuntimeException("无法查询到数据");
        }
        modelMap.addAttribute("blogCategoryList",blogCategoryList);
        return "index";
    }
}
