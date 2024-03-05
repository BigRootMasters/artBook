package org.manager.client.mapper.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * desc 公共dao
 *
 * @author lk
 * {@code @date} 2024/3/4 01:04
 */
@Setter
@Getter
@ToString
public class BaseDO {


    /**
     * id主键
     */
    private Long id;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 修改时间
     */
    private Date gmtModified;
}
