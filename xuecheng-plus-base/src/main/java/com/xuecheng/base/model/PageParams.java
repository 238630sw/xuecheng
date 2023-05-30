package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @create 2023-05-29 19:44
 * @describe 分页查询分页参数
 */
@Data
@ToString
public class PageParams {


    //当前页码
    private Long pageNo = 1L;

    //每页显示记录数
    private Long pageSize = 30L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
