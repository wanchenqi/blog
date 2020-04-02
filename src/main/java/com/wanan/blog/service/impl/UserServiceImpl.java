package com.wanan.blog.service.impl;

import com.wanan.blog.entity.User;
import com.wanan.blog.mapper.UserMapper;
import com.wanan.blog.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
