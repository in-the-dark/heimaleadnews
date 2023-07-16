package com.heima.common.constants;


/**
 * 关于文章article的一些常量设置
 */
public class ArticleConstants {
    public static final Short LOADTYPE_LOAD_MORE = 1;//加载更多
    public static final Short LOADTYPE_LOAD_NEW = 2;//加载最新
    public static final String DEFAULT_TAG = "__all__";//默认tag

    public static final String ARTICLE_ES_SYNC_TOPIC = "article.es.sync.topic";//文章ES同步主题

    public static final Integer HOT_ARTICLE_LIKE_WEIGHT = 3;//文章点赞的权重
    public static final Integer HOT_ARTICLE_COMMENT_WEIGHT = 5;//文章评论的权重
    public static final Integer HOT_ARTICLE_COLLECTION_WEIGHT = 8;//文章收藏的权重

    public static final String HOT_ARTICLE_FIRST_PAGE = "hot_article_first_page_";//热门文章的第一页
}