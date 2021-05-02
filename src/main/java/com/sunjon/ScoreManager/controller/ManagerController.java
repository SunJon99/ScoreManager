package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Manager;
import com.sunjon.ScoreManager.mapper.ManagerMapper;
import com.sunjon.ScoreManager.view.ManagerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private ManagerMapper managerMapper;

    @Autowired
    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    @RequestMapping("/getAllManagers")
    public ManagerList getAllManagers(@RequestParam(name = "curr",required = false)Integer curr,
                                      @RequestParam(name = "limit",required = false)Integer limit){
        if(curr == null && limit == null) {
            List<Manager> list = managerMapper.findAllManagers();
            ManagerList data = new ManagerList(0, list);
            return data;
        }else{
            ArrayList<Manager> list = new ArrayList<>();
            list.add(new Manager());
            list.add(new Manager());
            System.out.println("curr:"+curr+",limit:"+limit);
            return new ManagerList(0,list);
        }

    }

}
