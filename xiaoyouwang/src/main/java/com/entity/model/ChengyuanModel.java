package com.entity.model;

import com.entity.ChengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 分会成员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 分会名称
     */
    private Integer xiaoyoufenhuiId;


    /**
     * 成员名称
     */
    private String chengyuanName;


    /**
     * 成员头像
     */
    private String chengyuanPhoto;


    /**
     * 性别
     */
    private String sexTypes;


    /**
     * 联系方式
     */
    private String chengyuanPhone;


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
    public Integer getXiaoyoufenhuiId() {
        return xiaoyoufenhuiId;
    }


    /**
	 * 设置：分会名称
	 */
    public void setXiaoyoufenhuiId(Integer xiaoyoufenhuiId) {
        this.xiaoyoufenhuiId = xiaoyoufenhuiId;
    }
    /**
	 * 获取：成员名称
	 */
    public String getChengyuanName() {
        return chengyuanName;
    }


    /**
	 * 设置：成员名称
	 */
    public void setChengyuanName(String chengyuanName) {
        this.chengyuanName = chengyuanName;
    }
    /**
	 * 获取：成员头像
	 */
    public String getChengyuanPhoto() {
        return chengyuanPhoto;
    }


    /**
	 * 设置：成员头像
	 */
    public void setChengyuanPhoto(String chengyuanPhoto) {
        this.chengyuanPhoto = chengyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public String getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(String sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getChengyuanPhone() {
        return chengyuanPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setChengyuanPhone(String chengyuanPhone) {
        this.chengyuanPhone = chengyuanPhone;
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
