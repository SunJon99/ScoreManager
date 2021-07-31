package com.sunjon.ScoreManager.config;

import com.sunjon.ScoreManager.interceptor.AdminInterceptor;
import com.sunjon.ScoreManager.interceptor.StudentInterceptor;
import com.sunjon.ScoreManager.interceptor.TeacherInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class  WebConfig implements WebMvcConfigurer {

    private AdminInterceptor adminInterceptor;
    private TeacherInterceptor teacherInterceptor;
    private StudentInterceptor studentInterceptor;

    @Autowired
    public void setAdminInterceptor(AdminInterceptor adminInterceptor) {
        this.adminInterceptor = adminInterceptor;
    }

    @Autowired
    public void setStudentInterceptor(StudentInterceptor studentInterceptor) {
        this.studentInterceptor = studentInterceptor;
    }

    @Autowired
    public void setTeacherInterceptor(TeacherInterceptor teacherInterceptor) {
        this.teacherInterceptor = teacherInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> viewList = new ArrayList<>();
        viewList.add("/admin-index");
        viewList.add("/department-list");
        viewList.add("/department-detail");
        viewList.add("/department-add");
        viewList.add("/manager-edit");
        viewList.add("/teacher-list");
        viewList.add("/teacher-add");
        viewList.add("/teacher-edit");
        viewList.add("/class-list");
        viewList.add("/class-add");
        viewList.add("/class-edit");
        viewList.add("/lesson-list");
        viewList.add("/lesson-add");
        viewList.add("/student-list");
        viewList.add("/student-add");
        viewList.add("/student-edit");
        registry.addInterceptor(adminInterceptor)
                .addPathPatterns("/manager/**")
                .addPathPatterns("/class/**")
                .addPathPatterns("/lesson/**")
                .addPathPatterns("/department/**")
                .addPathPatterns("/student/**")
                .addPathPatterns(viewList);
    }
}
