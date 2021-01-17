package com.lai.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (FilmInfo)实体类
 *
 * @author makejava
 * @since 2021-01-14 20:52:54
 */
@Data
public class FilmInfo implements Serializable {
    private static final long serialVersionUID = -34067135587032669L;
    /**
     * 电影编号
     */
    private Integer fid;
    /**
     * 名称
     */
    private String fname;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 时长
     */
    private Integer duration;
    /**
     * 备注
     */
    private String remark;
    /**
     * 上映时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date releasedate;

    private String tname;

}