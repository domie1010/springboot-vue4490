package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyuanEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 分会成员 服务类
 */
public interface ChengyuanService extends IService<ChengyuanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}