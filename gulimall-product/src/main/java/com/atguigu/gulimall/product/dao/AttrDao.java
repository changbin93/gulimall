package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author laowang
 * @email wangchangbin1993@gmail.com
 * @date 2022-02-28 12:56:08
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
