package com.lai.service.impl;

import com.lai.dao.TypeInfoDao;
import com.lai.entity.TypeInfo;
import com.lai.service.TypeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TypeInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-01-15 19:36:06
 */
@Service("typeInfoService")
public class TypeInfoServiceImpl implements TypeInfoService {
    @Resource
    private TypeInfoDao typeInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public TypeInfo queryById(Integer tid) {
        return this.typeInfoDao.queryById(tid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TypeInfo> queryAllByLimit(int offset, int limit) {
        return this.typeInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param typeInfo 实例对象
     * @return 对象列表
     */
    @Override
    public List<TypeInfo> queryAll(TypeInfo typeInfo) {
        return this.typeInfoDao.queryAll(typeInfo);
    }


    /**
     * 新增数据
     *
     * @param typeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TypeInfo insert(TypeInfo typeInfo) {
        this.typeInfoDao.insert(typeInfo);
        return typeInfo;
    }

    /**
     * 修改数据
     *
     * @param typeInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TypeInfo update(TypeInfo typeInfo) {
        this.typeInfoDao.update(typeInfo);
        return this.queryById(typeInfo.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tid) {
        return this.typeInfoDao.deleteById(tid) > 0;
    }
}