package com.sunjon.ScoreManager.mapper;


import com.sunjon.ScoreManager.bean.Authority;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AuthorityMapper {
    List<Authority> getAll();
}
