package com.entity.model;

import com.entity.XiaoyoufengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 校友风采
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoyoufengcaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 校友
     */
    private Integer yonghuId;


    /**
     * 标题
     */
    private String xiaoyoufengcaiName;


    /**
     * 奖项类型
     */
    private Integer xiaoyoufengcaiTypes;


    /**
     * 封面
     */
    private String xiaoyoufengcaiPhoto;


    /**
     * 所得奖项
     */
    private String xiaoyoufengcaiJiango;


    /**
     * 详情
     */
    private String xiaoyoufengcaiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：校友
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：校友
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：标题
	 */
    public String getXiaoyoufengcaiName() {
        return xiaoyoufengcaiName;
    }


    /**
	 * 设置：标题
	 */
    public void setXiaoyoufengcaiName(String xiaoyoufengcaiName) {
        this.xiaoyoufengcaiName = xiaoyoufengcaiName;
    }
    /**
	 * 获取：奖项类型
	 */
    public Integer getXiaoyoufengcaiTypes() {
        return xiaoyoufengcaiTypes;
    }


    /**
	 * 设置：奖项类型
	 */
    public void setXiaoyoufengcaiTypes(Integer xiaoyoufengcaiTypes) {
        this.xiaoyoufengcaiTypes = xiaoyoufengcaiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getXiaoyoufengcaiPhoto() {
        return xiaoyoufengcaiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setXiaoyoufengcaiPhoto(String xiaoyoufengcaiPhoto) {
        this.xiaoyoufengcaiPhoto = xiaoyoufengcaiPhoto;
    }
    /**
	 * 获取：所得奖项
	 */
    public String getXiaoyoufengcaiJiango() {
        return xiaoyoufengcaiJiango;
    }


    /**
	 * 设置：所得奖项
	 */
    public void setXiaoyoufengcaiJiango(String xiaoyoufengcaiJiango) {
        this.xiaoyoufengcaiJiango = xiaoyoufengcaiJiango;
    }
    /**
	 * 获取：详情
	 */
    public String getXiaoyoufengcaiContent() {
        return xiaoyoufengcaiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setXiaoyoufengcaiContent(String xiaoyoufengcaiContent) {
        this.xiaoyoufengcaiContent = xiaoyoufengcaiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
