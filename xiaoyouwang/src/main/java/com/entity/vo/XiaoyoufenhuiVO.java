package com.entity.vo;

import com.entity.XiaoyoufenhuiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 校友分会
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaoyoufenhui")
public class XiaoyoufenhuiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 分会名称
     */

    @TableField(value = "xiaoyoufenhui_name")
    private String xiaoyoufenhuiName;


    /**
     * 分会类型
     */

    @TableField(value = "xiaoyoufenhui_types")
    private Integer xiaoyoufenhuiTypes;


    /**
     * 分会封面
     */

    @TableField(value = "xiaoyoufenhui_photo")
    private String xiaoyoufenhuiPhoto;


    /**
     * 负责人
     */

    @TableField(value = "xiaoyoufenhui_fuzheren")
    private String xiaoyoufenhuiFuzheren;


    /**
     * 分会地点
     */

    @TableField(value = "xiaoyoufenhui_address")
    private String xiaoyoufenhuiAddress;


    /**
     * 分会简介
     */

    @TableField(value = "xiaoyoufenhui_content")
    private String xiaoyoufenhuiContent;


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
    public String getXiaoyoufenhuiName() {
        return xiaoyoufenhuiName;
    }


    /**
	 * 获取：分会名称
	 */

    public void setXiaoyoufenhuiName(String xiaoyoufenhuiName) {
        this.xiaoyoufenhuiName = xiaoyoufenhuiName;
    }
    /**
	 * 设置：分会类型
	 */
    public Integer getXiaoyoufenhuiTypes() {
        return xiaoyoufenhuiTypes;
    }


    /**
	 * 获取：分会类型
	 */

    public void setXiaoyoufenhuiTypes(Integer xiaoyoufenhuiTypes) {
        this.xiaoyoufenhuiTypes = xiaoyoufenhuiTypes;
    }
    /**
	 * 设置：分会封面
	 */
    public String getXiaoyoufenhuiPhoto() {
        return xiaoyoufenhuiPhoto;
    }


    /**
	 * 获取：分会封面
	 */

    public void setXiaoyoufenhuiPhoto(String xiaoyoufenhuiPhoto) {
        this.xiaoyoufenhuiPhoto = xiaoyoufenhuiPhoto;
    }
    /**
	 * 设置：负责人
	 */
    public String getXiaoyoufenhuiFuzheren() {
        return xiaoyoufenhuiFuzheren;
    }


    /**
	 * 获取：负责人
	 */

    public void setXiaoyoufenhuiFuzheren(String xiaoyoufenhuiFuzheren) {
        this.xiaoyoufenhuiFuzheren = xiaoyoufenhuiFuzheren;
    }
    /**
	 * 设置：分会地点
	 */
    public String getXiaoyoufenhuiAddress() {
        return xiaoyoufenhuiAddress;
    }


    /**
	 * 获取：分会地点
	 */

    public void setXiaoyoufenhuiAddress(String xiaoyoufenhuiAddress) {
        this.xiaoyoufenhuiAddress = xiaoyoufenhuiAddress;
    }
    /**
	 * 设置：分会简介
	 */
    public String getXiaoyoufenhuiContent() {
        return xiaoyoufenhuiContent;
    }


    /**
	 * 获取：分会简介
	 */

    public void setXiaoyoufenhuiContent(String xiaoyoufenhuiContent) {
        this.xiaoyoufenhuiContent = xiaoyoufenhuiContent;
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
