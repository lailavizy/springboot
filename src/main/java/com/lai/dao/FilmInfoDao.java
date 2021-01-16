package com.lai.dao;

import com.lai.entity.FilmInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FilmInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-14 20:52:54
 */
public interface FilmInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */
    FilmInfo queryById(Integer fid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FilmInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param filmInfo 实例对象
     * @return 对象列表
     */
    List<FilmInfo> queryAll(FilmInfo filmInfo);

    /**
     * 新增数据
     *
     * @param filmInfo 实例对象
     * @return 影响行数
     */
    int insert(FilmInfo filmInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FilmInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FilmInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FilmInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FilmInfo> entities);

    /**
     * 修改数据
     *
     * @param filmInfo 实例对象
     * @return 影响行数
     */
    int update(FilmInfo filmInfo);

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 影响行数
     */
    int deleteById(Integer fid);

    String checkName(@Param("fname") String fname,@Param("fid") Integer fid);
}