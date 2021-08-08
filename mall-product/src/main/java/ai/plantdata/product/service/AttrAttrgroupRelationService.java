package ai.plantdata.product.service;

import ai.plantdata.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:05
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

