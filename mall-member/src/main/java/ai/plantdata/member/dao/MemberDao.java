package ai.plantdata.member.dao;

import ai.plantdata.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 15:33:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
