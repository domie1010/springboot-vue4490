
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 分会成员
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chengyuan")
public class ChengyuanController {
    private static final Logger logger = LoggerFactory.getLogger(ChengyuanController.class);

    @Autowired
    private ChengyuanService chengyuanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private XiaoyoufenhuiService xiaoyoufenhuiService;

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("校友".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = chengyuanService.queryPage(params);

        //字典表数据转换
        List<ChengyuanView> list =(List<ChengyuanView>)page.getList();
        for(ChengyuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChengyuanEntity chengyuan = chengyuanService.selectById(id);
        if(chengyuan !=null){
            //entity转view
            ChengyuanView view = new ChengyuanView();
            BeanUtils.copyProperties( chengyuan , view );//把实体数据重构到view中

                //级联表
                XiaoyoufenhuiEntity xiaoyoufenhui = xiaoyoufenhuiService.selectById(chengyuan.getXiaoyoufenhuiId());
                if(xiaoyoufenhui != null){
                    BeanUtils.copyProperties( xiaoyoufenhui , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiaoyoufenhuiId(xiaoyoufenhui.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChengyuanEntity chengyuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chengyuan:{}",this.getClass().getName(),chengyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChengyuanEntity> queryWrapper = new EntityWrapper<ChengyuanEntity>()
            .eq("xiaoyoufenhui_id", chengyuan.getXiaoyoufenhuiId())
            .eq("chengyuan_name", chengyuan.getChengyuanName())
            .eq("sex_types", chengyuan.getSexTypes())
            .eq("chengyuan_phone", chengyuan.getChengyuanPhone())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuanEntity chengyuanEntity = chengyuanService.selectOne(queryWrapper);
        if(chengyuanEntity==null){
            chengyuan.setCreateTime(new Date());
            chengyuanService.insert(chengyuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChengyuanEntity chengyuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chengyuan:{}",this.getClass().getName(),chengyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ChengyuanEntity> queryWrapper = new EntityWrapper<ChengyuanEntity>()
            .notIn("id",chengyuan.getId())
            .andNew()
            .eq("xiaoyoufenhui_id", chengyuan.getXiaoyoufenhuiId())
            .eq("chengyuan_name", chengyuan.getChengyuanName())
            .eq("sex_types", chengyuan.getSexTypes())
            .eq("chengyuan_phone", chengyuan.getChengyuanPhone())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuanEntity chengyuanEntity = chengyuanService.selectOne(queryWrapper);
        if("".equals(chengyuan.getChengyuanPhoto()) || "null".equals(chengyuan.getChengyuanPhoto())){
                chengyuan.setChengyuanPhoto(null);
        }
        if(chengyuanEntity==null){
            chengyuanService.updateById(chengyuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        chengyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ChengyuanEntity> chengyuanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChengyuanEntity chengyuanEntity = new ChengyuanEntity();
//                            chengyuanEntity.setXiaoyoufenhuiId(Integer.valueOf(data.get(0)));   //分会名称 要改的
//                            chengyuanEntity.setChengyuanName(data.get(0));                    //成员名称 要改的
//                            chengyuanEntity.setChengyuanPhoto("");//详情和图片
//                            chengyuanEntity.setSexTypes(data.get(0));                    //性别 要改的
//                            chengyuanEntity.setChengyuanPhone(data.get(0));                    //联系方式 要改的
//                            chengyuanEntity.setCreateTime(date);//时间
                            chengyuanList.add(chengyuanEntity);


                            //把要查询是否重复的字段放入map中
                                //联系方式
                                if(seachFields.containsKey("chengyuanPhone")){
                                    List<String> chengyuanPhone = seachFields.get("chengyuanPhone");
                                    chengyuanPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> chengyuanPhone = new ArrayList<>();
                                    chengyuanPhone.add(data.get(0));//要改的
                                    seachFields.put("chengyuanPhone",chengyuanPhone);
                                }
                        }

                        //查询是否重复
                         //联系方式
                        List<ChengyuanEntity> chengyuanEntities_chengyuanPhone = chengyuanService.selectList(new EntityWrapper<ChengyuanEntity>().in("chengyuan_phone", seachFields.get("chengyuanPhone")));
                        if(chengyuanEntities_chengyuanPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChengyuanEntity s:chengyuanEntities_chengyuanPhone){
                                repeatFields.add(s.getChengyuanPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        chengyuanService.insertBatch(chengyuanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = chengyuanService.queryPage(params);

        //字典表数据转换
        List<ChengyuanView> list =(List<ChengyuanView>)page.getList();
        for(ChengyuanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChengyuanEntity chengyuan = chengyuanService.selectById(id);
            if(chengyuan !=null){


                //entity转view
                ChengyuanView view = new ChengyuanView();
                BeanUtils.copyProperties( chengyuan , view );//把实体数据重构到view中

                //级联表
                    XiaoyoufenhuiEntity xiaoyoufenhui = xiaoyoufenhuiService.selectById(chengyuan.getXiaoyoufenhuiId());
                if(xiaoyoufenhui != null){
                    BeanUtils.copyProperties( xiaoyoufenhui , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXiaoyoufenhuiId(xiaoyoufenhui.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ChengyuanEntity chengyuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chengyuan:{}",this.getClass().getName(),chengyuan.toString());
        Wrapper<ChengyuanEntity> queryWrapper = new EntityWrapper<ChengyuanEntity>()
            .eq("xiaoyoufenhui_id", chengyuan.getXiaoyoufenhuiId())
            .eq("chengyuan_name", chengyuan.getChengyuanName())
            .eq("sex_types", chengyuan.getSexTypes())
            .eq("chengyuan_phone", chengyuan.getChengyuanPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuanEntity chengyuanEntity = chengyuanService.selectOne(queryWrapper);
        if(chengyuanEntity==null){
            chengyuan.setCreateTime(new Date());
        chengyuanService.insert(chengyuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
