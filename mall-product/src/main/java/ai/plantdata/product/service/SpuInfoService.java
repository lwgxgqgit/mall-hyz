package ai.plantdata.product.service;

import ai.plantdata.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:04
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

