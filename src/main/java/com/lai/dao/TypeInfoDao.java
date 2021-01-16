package com.lai.dao;

import com.lai.entity.TypeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TypeInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-15 19:36:06
 */
public interface TypeInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    TypeInfo queryById(Integer tid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TypeInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


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
     * @return 影响行数
     */
    int insert(TypeInfo typeInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TypeInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TypeInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TypeInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TypeInfo> entities);

    /**
     * 修改数据
     *
     * @param typeInfo 实例对象
     * @return 影响行数
     */
    int update(TypeInfo typeInfo);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(Integer tid);

}