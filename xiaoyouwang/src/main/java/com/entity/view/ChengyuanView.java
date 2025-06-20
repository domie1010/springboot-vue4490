package com.entity.view;

import com.entity.ChengyuanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 分会成员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chengyuan")
public class ChengyuanView extends ChengyuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;



		//级联表 xiaoyoufenhui
			/**
			* 分会名称
			*/
			private String xiaoyoufenhuiName;
			/**
			* 分会类型
			*/
			private Integer xiaoyoufenhuiTypes;
				/**
				* 分会类型的值
				*/
				private String xiaoyoufenhuiValue;
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

	public ChengyuanView() {

	}

	public ChengyuanView(ChengyuanEntity chengyuanEntity) {
		try {
			BeanUtils.copyProperties(this, chengyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
















				//级联表的get和set xiaoyoufenhui

					/**
					* 获取： 分会名称
					*/
					public String getXiaoyoufenhuiName() {
						return xiaoyoufenhuiName;
					}
					/**
					* 设置： 分会名称
					*/
					public void setXiaoyoufenhuiName(String xiaoyoufenhuiName) {
						this.xiaoyoufenhuiName = xiaoyoufenhuiName;
					}

					/**
					* 获取： 分会类型
					*/
					public Integer getXiaoyoufenhuiTypes() {
						return xiaoyoufenhuiTypes;
					}
					/**
					* 设置： 分会类型
					*/
					public void setXiaoyoufenhuiTypes(Integer xiaoyoufenhuiTypes) {
						this.xiaoyoufenhuiTypes = xiaoyoufenhuiTypes;
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

					/**
					* 获取： 分会封面
					*/
					public String getXiaoyoufenhuiPhoto() {
						return xiaoyoufenhuiPhoto;
					}
					/**
					* 设置： 分会封面
					*/
					public void setXiaoyoufenhuiPhoto(String xiaoyoufenhuiPhoto) {
						this.xiaoyoufenhuiPhoto = xiaoyoufenhuiPhoto;
					}

					/**
					* 获取： 负责人
					*/
					public String getXiaoyoufenhuiFuzheren() {
						return xiaoyoufenhuiFuzheren;
					}
					/**
					* 设置： 负责人
					*/
					public void setXiaoyoufenhuiFuzheren(String xiaoyoufenhuiFuzheren) {
						this.xiaoyoufenhuiFuzheren = xiaoyoufenhuiFuzheren;
					}

					/**
					* 获取： 分会地点
					*/
					public String getXiaoyoufenhuiAddress() {
						return xiaoyoufenhuiAddress;
					}
					/**
					* 设置： 分会地点
					*/
					public void setXiaoyoufenhuiAddress(String xiaoyoufenhuiAddress) {
						this.xiaoyoufenhuiAddress = xiaoyoufenhuiAddress;
					}

					/**
					* 获取： 分会简介
					*/
					public String getXiaoyoufenhuiContent() {
						return xiaoyoufenhuiContent;
					}
					/**
					* 设置： 分会简介
					*/
					public void setXiaoyoufenhuiContent(String xiaoyoufenhuiContent) {
						this.xiaoyoufenhuiContent = xiaoyoufenhuiContent;
					}






}
