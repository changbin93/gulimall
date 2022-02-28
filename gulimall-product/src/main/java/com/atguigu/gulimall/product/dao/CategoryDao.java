package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laowang
 * @email wangchangbin1993@gmail.com
 * @date 2022-02-28 12:56:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
