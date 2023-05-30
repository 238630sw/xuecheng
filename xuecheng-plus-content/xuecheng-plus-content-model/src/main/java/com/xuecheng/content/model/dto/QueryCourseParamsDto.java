package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @create 2023-05-29 19:50
 * @describe 课程查询条件模型类
 */
@Data
@ToString
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;

    //课程名称
    private String courseName;

    //发布状态
    private String publishStatus;

}
