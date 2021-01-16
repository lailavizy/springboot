package com.lai.service;

import com.lai.entity.TypeInfo;

import java.util.List;

/**
 * (TypeInfo)表服务接口
 *
 * @author makejava
 * @since 2021-01-15 19:36:06
 */
public interface TypeInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    TypeInfo queryById(Integer tid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TypeInfo> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param typeInfo 实例对象
     * @return 对象列表
     */
    List<TypeInfo> queryAll(TypeInfo typeInfo);


    /**
     * 新增数据
     *
     * @param typeInfo 实例对象
     * @return 实例对象
     */
    TypeInfo insert(TypeInfo typeInfo);

    /**
     * 修改数据
     *
     * @param typeInfo 实例对象
     * @return 实例对象
     */
    TypeInfo update(TypeInfo typeInfo);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tid);

}