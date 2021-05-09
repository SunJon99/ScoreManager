package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User findAdminByEmail(String email);
    User findTeacherByEmail(String email);
    User findStudentByEmail(String email);
}
