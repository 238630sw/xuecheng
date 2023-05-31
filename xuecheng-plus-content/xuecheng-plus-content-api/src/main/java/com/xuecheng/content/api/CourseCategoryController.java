package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2023-05-31 9:20
 * @describe 课程分类相关接口
 */
@RestController
public class CourseCategoryController {

    @GetMapping("/course-category/tree-nodes")
    public CourseCategoryTreeDto queryTreeNodes(){


        return null;
    }

}
