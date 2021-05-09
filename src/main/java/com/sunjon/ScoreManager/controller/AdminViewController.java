package com.sunjon.ScoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminViewController {

    @RequestMapping("/admin-index")
    public String adminIndex(){
        return "admin/admin-index";
    }

    @RequestMapping("/department-list")
    public String departmentList(){
        return "admin/department-list";
    }

    @RequestMapping("/department-detail")
    public String departmentDetail(){
        return "admin/department-detail";
    }

    @RequestMapping("/department-add")
    public String departmentAdd(){
        return "admin/department-add";
    }

    @RequestMapping("/manager-list")
    public String managerList(){
        return "admin/manager-list";
    }

    @RequestMapping("/manager-add")
    public String managerAdd(){
        return "admin/manager-add";
    }

    @RequestMapping("/manager-edit")
    public String managerEdit(){
        return "admin/manager-edit";
    }

    @RequestMapping("/teacher-list")
    public String teacherList(){
        return "admin/teacher-list";
    }

    @RequestMapping("/teacher-add")
    public String teacherAdd(){
        return "admin/teacher-add";
    }

    @RequestMapping("/teacher-edit")
    public String teacherEdit(){
        return "admin/teacher-edit";
    }

    @RequestMapping("/class-list")
    public String classList(){
        return "admin/class-list";
    }

    @RequestMapping("/class-add")
    public String classAdd(){
        return "admin/class-add";
    }

    @RequestMapping("/class-edit")
    public String classEdit(){
        return "admin/class-edit";
    }

    @RequestMapping("/lesson-list")
    public String lessonList(){
        return "admin/lesson-list";
    }

    @RequestMapping("/lesson-add")
    public String lessonAdd(){
        return "admin/lesson-add";
    }
}
