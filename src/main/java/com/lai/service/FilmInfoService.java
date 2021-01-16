package com.lai.service;

import com.lai.entity.FilmInfo;

import java.util.List;

/**
 * (FilmInfo)表服务接口
 *
 * @author makejava
 * @since 2021-01-14 20:52:54
 */
public interface FilmInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */
    FilmInfo queryById(Integer fid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FilmInfo> queryAllByLimit(int offset, int limit);

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
     * @return 实例对象
     */
    FilmInfo insert(FilmInfo filmInfo);

    /**
     * 修改数据
     *
     * @param filmInfo 实例对象
     * @return 实例对象
     */
    FilmInfo update(FilmInfo filmInfo);

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer fid);

    int checkName(FilmInfo filmInfo);
}