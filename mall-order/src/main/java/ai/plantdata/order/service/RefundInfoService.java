package ai.plantdata.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.common.utils.PageUtils;
import ai.plantdata.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:27:29
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

