package cn.video110.ressadnatomdemo.feed;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Guid;
import com.rometools.rome.feed.rss.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;

@RestController
public class FeedController {

    @GetMapping("/rss")
    public Channel rss() {
        Channel channel = new Channel();
        channel.setFeedType("rss_2.0");
        channel.setTitle("栏目标题");
        channel.setLink("栏目链接");
        channel.setDescription("栏目描述");

        Item item = new Item();
        item.setTitle("项目标题");
        item.setLink("http://www.***.com/*/*.html");

        Description descr = new Description();
        descr.setValue("项目描述");
        item.setDescription(descr);

        item.setPubDate(new Date());

        Guid guid = new Guid();
        guid.setValue("http://www.***.com");
        item.setGuid(guid);

        item.setAuthor("Leftso");

        channel.setItems(Collections.singletonList(item));
        return channel;
    }

}