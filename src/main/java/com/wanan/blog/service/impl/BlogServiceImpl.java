package com.wanan.blog.service.impl;

import com.wanan.blog.entity.Blog;
import com.wanan.blog.mapper.BlogMapper;
import com.wanan.blog.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
