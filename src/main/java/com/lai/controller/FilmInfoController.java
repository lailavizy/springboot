package com.lai.controller;

import com.lai.entity.FilmInfo;
import com.lai.service.FilmInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FilmInfo)表控制层
 *
 * @author makejava
 * @since 2021-01-14 20:52:54
 */
@RestController
@RequestMapping("filmInfo")
public class FilmInfoController {
    /**
     * 服务对象
     */
    @Resource
    private FilmInfoService filmInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FilmInfo selectOne(Integer id) {
        return this.filmInfoService.queryById(id);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @GetMapping("queryAll")
    public List<FilmInfo> queryAll(Integer tid) {
        FilmInfo filmInfo = new FilmInfo();
        System.out.println(tid);
        if(tid!=null){
            filmInfo.setType(tid);
        }
        return this.filmInfoService.queryAll(filmInfo);
    }
}