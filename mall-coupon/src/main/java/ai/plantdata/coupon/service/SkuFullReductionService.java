package ai.plantdata.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.common.utils.PageUtils;
import ai.plantdata.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:30:18
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

