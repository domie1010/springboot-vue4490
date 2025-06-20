package com.entity.vo;

import com.entity.XiaoyoufengcaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 校友风采
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaoyoufengcai")
public class XiaoyoufengcaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 校友
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 标题
     */

    @TableField(value = "xiaoyoufengcai_name")
    private String xiaoyoufengcaiName;


    /**
     * 奖项类型
     */

    @TableField(value = "xiaoyoufengcai_types")
    private Integer xiaoyoufengcaiTypes;


    /**
     * 封面
     */

    @TableField(value = "xiaoyoufengcai_photo")
    private String xiaoyoufengcaiPhoto;


    /**
     * 所得奖项
     */

    @TableField(value = "xiaoyoufengcai_jiango")
    private String xiaoyoufengcaiJiango;


    /**
     * 详情
     */

    @TableField(value = "xiaoyoufengcai_content")
    private String xiaoyoufengcaiContent;


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
	 * 设置：校友
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：校友
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：标题
	 */
    public String getXiaoyoufengcaiName() {
        return xiaoyoufengcaiName;
    }


    /**
	 * 获取：标题
	 */

    public void setXiaoyoufengcaiName(String xiaoyoufengcaiName) {
        this.xiaoyoufengcaiName = xiaoyoufengcaiName;
    }
    /**
	 * 设置：奖项类型
	 */
    public Integer getXiaoyoufengcaiTypes() {
        return xiaoyoufengcaiTypes;
    }


    /**
	 * 获取：奖项类型
	 */

    public void setXiaoyoufengcaiTypes(Integer xiaoyoufengcaiTypes) {
        this.xiaoyoufengcaiTypes = xiaoyoufengcaiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getXiaoyoufengcaiPhoto() {
        return xiaoyoufengcaiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setXiaoyoufengcaiPhoto(String xiaoyoufengcaiPhoto) {
        this.xiaoyoufengcaiPhoto = xiaoyoufengcaiPhoto;
    }
    /**
	 * 设置：所得奖项
	 */
    public String getXiaoyoufengcaiJiango() {
        return xiaoyoufengcaiJiango;
    }


    /**
	 * 获取：所得奖项
	 */

    public void setXiaoyoufengcaiJiango(String xiaoyoufengcaiJiango) {
        this.xiaoyoufengcaiJiango = xiaoyoufengcaiJiango;
    }
    /**
	 * 设置：详情
	 */
    public String getXiaoyoufengcaiContent() {
        return xiaoyoufengcaiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXiaoyoufengcaiContent(String xiaoyoufengcaiContent) {
        this.xiaoyoufengcaiContent = xiaoyoufengcaiContent;
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
