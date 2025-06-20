package com.entity.vo;

import com.entity.ChengyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 分会成员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengyuan")
public class ChengyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 分会名称
     */

    @TableField(value = "xiaoyoufenhui_id")
    private Integer xiaoyoufenhuiId;


    /**
     * 成员名称
     */

    @TableField(value = "chengyuan_name")
    private String chengyuanName;


    /**
     * 成员头像
     */

    @TableField(value = "chengyuan_photo")
    private String chengyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private String sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "chengyuan_phone")
    private String chengyuanPhone;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：分会名称
	 */
    public Integer getXiaoyoufenhuiId() {
        return xiaoyoufenhuiId;
    }


    /**
	 * 获取：分会名称
	 */

    public void setXiaoyoufenhuiId(Integer xiaoyoufenhuiId) {
        this.xiaoyoufenhuiId = xiaoyoufenhuiId;
    }
    /**
	 * 设置：成员名称
	 */
    public String getChengyuanName() {
        return chengyuanName;
    }


    /**
	 * 获取：成员名称
	 */

    public void setChengyuanName(String chengyuanName) {
        this.chengyuanName = chengyuanName;
    }
    /**
	 * 设置：成员头像
	 */
    public String getChengyuanPhoto() {
        return chengyuanPhoto;
    }


    /**
	 * 获取：成员头像
	 */

    public void setChengyuanPhoto(String chengyuanPhoto) {
        this.chengyuanPhoto = chengyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public String getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(String sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getChengyuanPhone() {
        return chengyuanPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setChengyuanPhone(String chengyuanPhone) {
        this.chengyuanPhone = chengyuanPhone;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
