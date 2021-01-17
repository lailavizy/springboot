package com.lai.controller;

import com.lai.entity.FilmInfo;
import com.lai.service.FilmInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("checkName")
    public int checkName(@RequestBody FilmInfo filmInfo){
       return this.filmInfoService.checkName(filmInfo);
    }

    @PostMapping("add")
    public FilmInfo add(@RequestBody FilmInfo filmInfo){
        return this.filmInfoService.insert(filmInfo);
    }

    @PostMapping("update")
    public FilmInfo update(@RequestBody FilmInfo filmInfo){
        return this.filmInfoService.update(filmInfo);
    }
    /**
     * 根据ID删除
     * @param fid
     * @return
     */
    @GetMapping("deleteById")
    // @RequestMapping(method = RequestMethod.DELETE)
    public boolean deleteById(Integer fid) {
        return this.filmInfoService.deleteById(fid);
    }

}