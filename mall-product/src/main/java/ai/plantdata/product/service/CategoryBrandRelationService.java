package ai.plantdata.product.service;

import ai.plantdata.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:05
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

