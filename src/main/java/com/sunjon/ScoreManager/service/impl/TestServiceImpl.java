package com.sunjon.ScoreManager.service.impl;

import com.sunjon.ScoreManager.bean.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl {

    public List<Test> getData(Integer lessonId){
        Test test1 = new Test();
        test1.setId(4);
        test1.setName("测试一");
        test1.setTtName("线上测试");
        test1.setGoalName("目标一");
        test1.setTotalScore(100.0f);
        Test test2 = new Test();
	    test2.setId(5);
	    test2.setName("测试二");
	    test2.setTtName("线上测试");
	    test2.setGoalName("目标一");
	    test2.setTotalScore(100f);
	    Test test3 = new Test();
	    test3.setId(6);
	    test3.setName("期中测试");
	    test3.setTtName("线下测试");
	    test3.setGoalName("目标二");
	    test3.setTotalScore(100f);


	    List<Test> data = new ArrayList<>(3);
	    data.add(test1);
	    data.add(test2);
	    data.add(test3);
	    return data;
    }

}
