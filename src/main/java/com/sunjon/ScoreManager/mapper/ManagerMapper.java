package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ManagerMapper {
    List<Manager> findAllManagers();
}
