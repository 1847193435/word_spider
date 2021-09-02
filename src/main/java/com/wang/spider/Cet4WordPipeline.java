package com.wang.spider;

import com.wang.Utils.Cet4WordUtil;
import com.wang.entity.Cet4Word;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

public class Cet4WordPipeline implements Pipeline {
    public void process(ResultItems resultItems, Task task) {
        List<Cet4Word> cet4Words = (List<Cet4Word>)resultItems.get("words");
        for (Cet4Word word:cet4Words){
            Cet4WordUtil.addCet4Word(word);
        }
    }
}
