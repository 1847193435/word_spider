package com.wang.spider;

import com.wang.entity.Cet4Word;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordPageProcessor implements PageProcessor {
    public void process(Page page) {
        Html html = page.getHtml();
        if (html.css("#word_list_1 > li") == null){
            System.out.println("爬虫结束");
        }
        List<Cet4Word> words = new ArrayList<Cet4Word>();
        //第一页
        List<Selectable> nodes_1 = html.css("#word_list_1 > li").nodes();
        for (int i= 0;i<nodes_1.size();i++){
            String word = html.css("#word_list_2 > li:nth-child(" + (i + 1) + ") > div.word_main_list_w > span", "text").get();
            String pronounce = html.css("#word_list_2 > li:nth-child(" + (i + 1) + ") > div.word_main_list_y > strong", "text").get();
            String paraphrase = html.css("#word_list_2 > li:nth-child(" + (i + 1) + ") > div.word_main_list_s > span", "text").get();
            Cet4Word cet4Word = new Cet4Word(word, pronounce, paraphrase);
            words.add(cet4Word);
        }
        //第二页
        List<Selectable> nodes_2 = html.css("#word_list_2 > li").nodes();
        for (int i= 0;i<nodes_2.size();i++){
            String word = html.css("#word_list_1 > li:nth-child(" + (i + 1) + ") > div.word_main_list_w > span", "text").get();
            String pronounce = html.css("#word_list_1 > li:nth-child(" + (i + 1) + ") > div.word_main_list_y > strong", "text").get();
            String paraphrase = html.css("#word_list_1 > li:nth-child(" + (i + 1) + ") > div.word_main_list_s > span", "text").get();
            Cet4Word cet4Word = new Cet4Word(word, pronounce, paraphrase);
            words.add(cet4Word);
        }
        page.putField("words",words);
        String urlTemplate = page.getUrl().get().split("\\d+$")[0];
        int i = Integer.parseInt(page.getUrl().get().substring(urlTemplate.length()));
        System.out.println(i);
        page.addTargetRequest(urlTemplate+(i+1));

    }

    public Site getSite() {
        return Site.me()
                .setTimeOut(3000)
                .setRetryTimes(3)
                .setCycleRetryTimes(3)
                .setCharset("utf-8");
    }

}
