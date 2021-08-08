package ai.plantdata.product.service;

import ai.plantdata.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:04
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

