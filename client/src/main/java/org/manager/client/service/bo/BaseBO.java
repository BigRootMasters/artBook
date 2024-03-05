package org.manager.client.service.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * desc 公共dao
 *
 * @author lk
 * {@code @date} 2024/3/4 01:04
 */
@Data
public class BaseBO implements Serializable {

    private static final long serialVersionUID = -1456954639140121695L;

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
