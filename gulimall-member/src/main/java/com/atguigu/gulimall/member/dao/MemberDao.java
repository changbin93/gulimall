package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author laowang
 * @email wangchangbin1993@gmail.com
 * @date 2022-02-28 13:49:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
