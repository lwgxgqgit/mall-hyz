package ai.plantdata.product.dao;

import ai.plantdata.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-08-08 14:47:05
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
