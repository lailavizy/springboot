package com.lai.controller;

import com.lai.entity.TypeInfo;
import com.lai.service.TypeInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TypeInfo)表控制层
 *
 * @author makejava
 * @since 2021-01-15 19:36:07
 */
@RestController
@RequestMapping("typeInfo")
public class TypeInfoController {
    /**
     * 服务对象
     */
    @Resource
    private TypeInfoService typeInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TypeInfo selectOne(Integer id) {
        return this.typeInfoService.queryById(id);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @GetMapping("queryAll")
    public List<TypeInfo> queryAll() {
        return this.typeInfoService.queryAll(null);
    }
}