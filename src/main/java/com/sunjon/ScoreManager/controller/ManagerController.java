package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Manager;
import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.mapper.ManagerMapper;
import com.sunjon.ScoreManager.service.impl.PwdServiceImpl;
import com.sunjon.ScoreManager.view.ManagerList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private ManagerMapper managerMapper;
    private PwdServiceImpl pwdService;


    @Autowired
    public void setPwdService(PwdServiceImpl pwdService) {
        this.pwdService = pwdService;
    }

    @Autowired
    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    @RequestMapping("/getAllManagers")
    public ManagerList getAllManagers(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                      @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = managerMapper.countManagers();
        List<Manager> list = managerMapper.findManagersByPage(start,limit);
        ManagerList data = new ManagerList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/searchByName")
    public ManagerList searchByName(@RequestParam(name = "name",required = true)String name,
                                    @RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                    @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        List<Manager> list = managerMapper.findManagersByName(name,start,limit);
        Integer count = list.size();
        ManagerList data = new ManagerList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/addManager")
    public Success addManager(Manager manager){
        PassWord passWord = pwdService.Generate("111111");
        Integer dpID = Integer.valueOf(manager.getOrganization());//前端传过来的是department 的 id
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name",manager.getName());
        map.put("email",manager.getEmail());
        map.put("pwd",passWord.getHashPwd());
        map.put("salt",passWord.getSalt());
        map.put("dpID",dpID);
        try{
            managerMapper.addManager(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/editManager")
    public Success editManager(Manager manager){
        try{
            managerMapper.updateManager(manager);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();

    }

    @RequestMapping("/deleteManager")
    public Success deleteManager(Manager manager){
        try{
            managerMapper.deleteManager(manager);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

}
