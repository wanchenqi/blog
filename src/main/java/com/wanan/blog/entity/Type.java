package com.wanan.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("t_type")
@ApiModel(value="Type对象", description="")
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类名称")
    private String name;


}
