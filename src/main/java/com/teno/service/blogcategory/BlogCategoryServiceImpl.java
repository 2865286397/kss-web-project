package com.teno.service.blogcategory;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teno.entity.BlogCategory;
import com.teno.mapper.BlogCategoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: Teno
 * Version: 1.0
 * Create Date Time: 2021 12/11/2021 上午 11:52
 * Update Date Time:
 */
@Service
@Slf4j
public class BlogCategoryServiceImpl extends ServiceImpl<BlogCategoryMapper, BlogCategory> implements BlogCategoryService {
}
