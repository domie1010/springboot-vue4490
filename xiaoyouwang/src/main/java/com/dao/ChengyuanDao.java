package com.dao;

import com.entity.ChengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyuanView;

/**
 * 分会成员 Dao 接口
 *
 * @author 
 */
public interface ChengyuanDao extends BaseMapper<ChengyuanEntity> {

   List<ChengyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
