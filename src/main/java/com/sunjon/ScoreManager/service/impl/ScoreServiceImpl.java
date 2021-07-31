package com.sunjon.ScoreManager.service.impl;

import com.sunjon.ScoreManager.bean.Score;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreServiceImpl {

    public List<Score> getData(Integer classId, Integer testId){
        List<Score> list = new ArrayList<>(20);
        list.add(new Score(1,"sunjon",53.0f));
        list.add(new Score(2,"xiaohua",99f));
        list.add(new Score(3,"xiaoqing",79f));
        list.add(new Score(4,"xiaoming",34f));
        list.add(new Score(5,"xis",88f));
        list.add(new Score(6,"dfaasdgfa",98f));
        list.add(new Score(7,"dfadfag",67f));
        list.add(new Score(8,"dfadgcx",98f));
        list.add(new Score(9,"rushi",45f));
        list.add(new Score(10,"aimi",80f));
        list.add(new Score(11,"dimi",77f));
        list.add(new Score(12,"xiaoguang",67f));
        list.add(new Score(13,"huaguagn",45f));
        list.add(new Score(14,"mimim",74.5f));
        list.add(new Score(15,"xiaoxin",87.5f));
        list.add(new Score(16,"xingmin",57.6f));
        list.add(new Score(17,"huahua",99.5f));
        list.add(new Score(18,"xixi",77.5f));
        list.add(new Score(19,"huaxaing",90f));
        list.add(new Score(20,"xiaoduing",78f));
        return list;
    }

}
