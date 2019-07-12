package io.choerodon.hap.iam.infra.mapper;

import io.choerodon.hap.iam.infra.dto.PermissionDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author wuguokai
 */
public interface PermissionMapper extends Mapper<PermissionDTO> {
    Set<String> checkPermission(@Param("member_id") Long memberId, @Param("source_type") String sourceType,
                                @Param("source_id") Long sourceId, @Param("codes") Set<String> codes);
    List<PermissionDTO> selectByRoleId(@Param("roleId") Long roleId,
                                       @Param("params") String params);

}