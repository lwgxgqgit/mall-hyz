package ai.plantdata.product.service;

import ai.plantdata.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:04
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

