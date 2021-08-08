package ai.plantdata.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.common.utils.PageUtils;
import ai.plantdata.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:30:19
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

