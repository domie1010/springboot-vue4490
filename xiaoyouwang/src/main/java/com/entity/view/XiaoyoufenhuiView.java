package com.entity.view;

import com.entity.XiaoyoufenhuiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 校友分会
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiaoyoufenhui")
public class XiaoyoufenhuiView extends XiaoyoufenhuiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 分会类型的值
		*/
		private String xiaoyoufenhuiValue;



	public XiaoyoufenhuiView() {

	}

	public XiaoyoufenhuiView(XiaoyoufenhuiEntity xiaoyoufenhuiEntity) {
		try {
			BeanUtils.copyProperties(this, xiaoyoufenhuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 分会类型的值
			*/
			public String getXiaoyoufenhuiValue() {
				return xiaoyoufenhuiValue;
			}
			/**
			* 设置： 分会类型的值
			*/
			public void setXiaoyoufenhuiValue(String xiaoyoufenhuiValue) {
				this.xiaoyoufenhuiValue = xiaoyoufenhuiValue;
			}












}
