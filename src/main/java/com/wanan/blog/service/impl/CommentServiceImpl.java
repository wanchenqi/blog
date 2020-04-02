package com.wanan.blog.service.impl;

import com.wanan.blog.entity.Comment;
import com.wanan.blog.mapper.CommentMapper;
import com.wanan.blog.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
