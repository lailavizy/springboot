package com.lai.service.impl;

import com.lai.dao.FilmInfoDao;
import com.lai.entity.FilmInfo;
import com.lai.service.FilmInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-01-14 20:52:54
 */
@Service("filmInfoService")
public class FilmInfoServiceImpl implements FilmInfoService {
    @Resource
    private FilmInfoDao filmInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param fid 主键
     * @return 实例对象
     */
    @Override
    public FilmInfo queryById(Integer fid) {
        return this.filmInfoDao.queryById(fid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FilmInfo> queryAllByLimit(int offset, int limit) {
        return this.filmInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param filmInfo 实例对象
     * @return 对象列表
     */
    @Override
    public List<FilmInfo> queryAll(FilmInfo filmInfo) {
        return this.filmInfoDao.queryAll(filmInfo);
    }


    /**
     * 新增数据
     *
     * @param filmInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FilmInfo insert(FilmInfo filmInfo) {
        this.filmInfoDao.insert(filmInfo);
        return filmInfo;
    }

    /**
     * 修改数据
     *
     * @param filmInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FilmInfo update(FilmInfo filmInfo) {
        this.filmInfoDao.update(filmInfo);
        return this.queryById(filmInfo.getFid());
    }

    /**
     * 通过主键删除数据
     *
     * @param fid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer fid) {
        return this.filmInfoDao.deleteById(fid) > 0;
    }
}