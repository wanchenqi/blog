package com.wanan.blog.service.impl;

import com.wanan.blog.entity.Type;
import com.wanan.blog.mapper.TypeMapper;
import com.wanan.blog.service.ITypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wancq
 * @since 2020-04-02
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
