package com.entity.model;

import com.entity.XiaoyoufenhuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 校友分会
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoyoufenhuiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 分会名称
     */
    private String xiaoyoufenhuiName;


    /**
     * 分会类型
     */
    private Integer xiaoyoufenhuiTypes;


    /**
     * 分会封面
     */
    private String xiaoyoufenhuiPhoto;


    /**
     * 负责人
     */
    private String xiaoyoufenhuiFuzheren;


    /**
     * 分会地点
     */
    private String xiaoyoufenhuiAddress;


    /**
     * 分会简介
     */
    private String xiaoyoufenhuiContent;


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
	 * 获取：分会名称
	 */
    public String getXiaoyoufenhuiName() {
        return xiaoyoufenhuiName;
    }


    /**
	 * 设置：分会名称
	 */
    public void setXiaoyoufenhuiName(String xiaoyoufenhuiName) {
        this.xiaoyoufenhuiName = xiaoyoufenhuiName;
    }
    /**
	 * 获取：分会类型
	 */
    public Integer getXiaoyoufenhuiTypes() {
        return xiaoyoufenhuiTypes;
    }


    /**
	 * 设置：分会类型
	 */
    public void setXiaoyoufenhuiTypes(Integer xiaoyoufenhuiTypes) {
        this.xiaoyoufenhuiTypes = xiaoyoufenhuiTypes;
    }
    /**
	 * 获取：分会封面
	 */
    public String getXiaoyoufenhuiPhoto() {
        return xiaoyoufenhuiPhoto;
    }


    /**
	 * 设置：分会封面
	 */
    public void setXiaoyoufenhuiPhoto(String xiaoyoufenhuiPhoto) {
        this.xiaoyoufenhuiPhoto = xiaoyoufenhuiPhoto;
    }
    /**
	 * 获取：负责人
	 */
    public String getXiaoyoufenhuiFuzheren() {
        return xiaoyoufenhuiFuzheren;
    }


    /**
	 * 设置：负责人
	 */
    public void setXiaoyoufenhuiFuzheren(String xiaoyoufenhuiFuzheren) {
        this.xiaoyoufenhuiFuzheren = xiaoyoufenhuiFuzheren;
    }
    /**
	 * 获取：分会地点
	 */
    public String getXiaoyoufenhuiAddress() {
        return xiaoyoufenhuiAddress;
    }


    /**
	 * 设置：分会地点
	 */
    public void setXiaoyoufenhuiAddress(String xiaoyoufenhuiAddress) {
        this.xiaoyoufenhuiAddress = xiaoyoufenhuiAddress;
    }
    /**
	 * 获取：分会简介
	 */
    public String getXiaoyoufenhuiContent() {
        return xiaoyoufenhuiContent;
    }


    /**
	 * 设置：分会简介
	 */
    public void setXiaoyoufenhuiContent(String xiaoyoufenhuiContent) {
        this.xiaoyoufenhuiContent = xiaoyoufenhuiContent;
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
