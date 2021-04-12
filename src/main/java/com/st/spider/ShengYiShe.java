package com.st.spider;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import org.jsoup.nodes.Document;

/**
 * Crawling news from hfut news
 *
 * @author hu
 */
public class ShengYiShe extends BreadthCrawler {


    public ShengYiShe(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
        /*start page*/
        this.addSeed("http://www.100ppi.com/forecast/list-15-11-1.html");

        /*fetch url like http://news.hfut.edu.cn/show-xxxxxxhtml*/
        this.addRegex("http://www.100ppi.com/forecast/detail-.*html");
        /*do not fetch jpg|png|gif*/
        this.addRegex("-.*\\.(jpg|png|gif).*");
        /*do not fetch url contains #*/
        this.addRegex("-.*#.*");
    }

    @Override
    public void visit(Page page, CrawlDatums next) {
        /*if page is news page*/
        if (page.matchUrl("http://www.100ppi.com/forecast/detail-.*html")) {
            /*we use jsoup to parse page*/
            Document doc = page.doc();
            /*extract title and content of news by css selector*/
            String title = page.select("div[class=news-detail]>h1").first().text();
            String content = page.select("div.nd-c", 0).text();

            System.out.println("URL:\n" + page.getUrl());
            System.out.println("title:\n" + title);
            System.out.println("content:\n" + content);

            /*If you want to add urls to crawl,add them to nextLink*/
            /*WebCollector automatically filters links that have been fetched before*/
            /*If autoParse is true and the link you add to nextLinks does not match the regex rules,the link will also been filtered.*/
            //next.add("http://xxxxxx.com");
        }
    }

    public static void main(String[] args) throws Exception {
        ShengYiShe crawler = new ShengYiShe("craw2", true);
        crawler.setThreads(5);
        crawler.setTopN(10);
        //crawler.setResumable(true);
        /*start crawl with depth of 4*/
        crawler.setResumable(true);
        crawler.start(4);
    }

}
