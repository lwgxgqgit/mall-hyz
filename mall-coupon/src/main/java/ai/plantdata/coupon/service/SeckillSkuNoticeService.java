package ai.plantdata.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.common.utils.PageUtils;
import ai.plantdata.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:30:18
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

