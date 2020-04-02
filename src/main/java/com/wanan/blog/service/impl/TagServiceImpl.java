package com.wanan.blog.service.impl;

import com.wanan.blog.entity.Tag;
import com.wanan.blog.mapper.TagMapper;
import com.wanan.blog.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
