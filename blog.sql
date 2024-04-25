create table article
(
    article_id     int auto_increment comment '文章id'
        primary key,
    comment_number int          null comment '文章评论数',
    article_title  varchar(50)  null comment '文章标题',
    author_id      int          not null comment '文章作者的id',
    article_time   date         null comment '文章创建时间',
    tag_id         int          null comment '标签id',
    article_cover  varchar(100) null comment '文章封面',
    like_Number    int          null comment '点赞数'
);

create table article_content
(
    comtemt_id int auto_increment comment '内容id'
        primary key,
    article_id int  null comment '内容绑定的文章的id',
    content    text null comment '内容'
)
    comment '文章内容';

create table comment
(
    id         int auto_increment comment '评论id'
        primary key,
    content    varchar(1000) not null comment '评论内容',
    time       datetime      null comment '评论时间 ',
    article_id int           null,
    userName   varchar(50)   not null,
    mail       varchar(50)   null,
    wechat     varchar(50)   null,
    avatar     varchar(100)  null,
    comment_id int           null
)
    comment '文章评论';

create table netease
(
    cloud_id int auto_increment comment '热评id'
        primary key,
    content  varchar(50) null comment '热评内容',
    source   varchar(50) null comment '来源'
)
    comment '网易云热评';

create table tag
(
    tag_id   int auto_increment comment '标签id'
        primary key,
    tag_name varchar(10)  null comment '标签名',
    tag_url  varchar(500) null
)
    comment '文章标签';

create table user
(
    id            int auto_increment comment '用户id'
        primary key,
    userName      varchar(50)   not null comment '用户名',
    login_name    varchar(50)   not null comment '登录用名',
    password      varchar(500)  not null comment '登录密码',
    status        int           not null comment '状态，1位正常0为冻结',
    register_time datetime      null comment '注册时间',
    user_emil     varchar(50)   null comment '邮箱',
    user_avatar   varchar(1000) null comment '头像',
    wechat        varchar(20)   null
);


