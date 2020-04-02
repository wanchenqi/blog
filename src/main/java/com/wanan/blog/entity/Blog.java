package com.wanan.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wancq
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_blog")
@ApiModel(value="Blog对象", description="")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "博客标题")
    private String title;

    @ApiModelProperty(value = "博客内容")
    private String content;

    @ApiModelProperty(value = "首图展示")
    @TableField("firstPicture")
    private String firstPicture;

    @ApiModelProperty(value = "标记")
    private String flag;

    @ApiModelProperty(value = "浏览次数")
    private Integer views;

    @ApiModelProperty(value = "赞赏开启")
    private Boolean appreciation;

    @ApiModelProperty(value = "版权开启")
    @TableField("shareStatement")
    private Boolean shareStatement;

    @ApiModelProperty(value = "评论开启")
    private Boolean commentabled;

    @ApiModelProperty(value = "发布")
    private Boolean published;

    @ApiModelProperty(value = "推荐")
    private Boolean recommend;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;


}
