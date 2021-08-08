package ai.plantdata.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ai.plantdata.common.utils.PageUtils;
import ai.plantdata.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:33:37
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

