package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
/**
 * 操作组织表
 */
public interface OrganizationMapper {
    /**
     * 组织信息查询
     */
    List<Organization> findAllOrganizations();
    List<Organization> findOrganizations(Organization conditions);
    /**
     * 组织信息修改
     */
    void updateOrganization(Organization organization);
    /**
     * 组织信息删除
     */
    void deleteOrganization(Organization organization);
    /**
     * 组织信息添加
     */
    void addOrganization(Organization organization);
}
