package com.wang;

import com.wang.spider.Cet4WordPipeline;
import com.wang.spider.WordPageProcessor;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.scheduler.BloomFilterDuplicateRemover;
import us.codecraft.webmagic.scheduler.QueueScheduler;

public class MainApplication {
    public static void main(String[] args) {

//        QueueScheduler scheduler = new QueueScheduler();
//        scheduler.setDuplicateRemover(new BloomFilterDuplicateRemover(10000000));

        Spider.create(new WordPageProcessor())
                .addUrl("http://word.iciba.com/?action=words&class=11&course=201")
                .addPipeline(new Cet4WordPipeline())
//                .setScheduler(scheduler)
//                .thread(5)
                .start();
    }
}
