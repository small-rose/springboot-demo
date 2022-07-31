<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>简书用户上榜搜索系统</title>
    <link href="/css/semantic.min.css" rel="stylesheet">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/semantic.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/highlight.js/11.2.0/highlight.min.js"></script>
    <link href="https://cdn.bootcdn.net/ajax/libs/highlight.js/11.2.0/styles/default.min.css" rel="stylesheet">
    <script>
        var _hmt = _hmt || [];
        (function () {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?a72d5ad7299fcb34413fa527c74b5775";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>

</head>
<style>
    #searchInput {
        margin-top: 100px !important;
        z-index: 2;
    }

    #searchInput .search .menu > .item.selected em {
        color: red;
    }

    #searchInput .search .menu > .item {
        font-size: 1em;
    }

    #searchInput .search .menu > .item span.group.description {
        display: block;
        float: unset;
        margin-left: 0px;
        padding-top: 5px;
    }

    #classSearch .group.description{
        color: cadetblue;
    }
    #classSearch .package.description{
        float: unset;
        margin-left: 5px;
    }

    #searchInput .search .menu > .item span.lastTime.description {
        font-size: 0.9em;
        padding-top: 11px;

    }

    #searchInput .search .menu > .item.selected span.description em {
        color: rgba(255, 0, 0, 0.5);
    }

    #searchResult em {
        color: red;
    }

    #resourceTree .list {
        display: none;
    }

    #resourceTree > .list {
        display: unset;
    }

    #resourceTree .item {
        margin-left: 7px;
    }

    #resourceTree .item .content.file {
        /*color: rgba(0,0,0,0.7);*/
    }
    #searchResult {
        padding: 0;
        margin: 0;
    }
    #searchResult .content .description {
        line-height: 1.6;
    }

    #searchResult .content .description em {
        color: rgba(255, 0, 0, 0.5);
    }


    #searchInput .menu {
        margin-top: -5px;
        background: white;
    }

    #searchInput .menu.transition.visible {
        max-height: calc(100vh - 150px);
    }

    .version.table .tab.segment {
        border: none;
        padding-left: 0;
        padding-right: 0;
        margin-bottom: 0
    }

    .version.table tr {
        cursor: pointer;
    }

    .version.table {
        color: rgba(0, 0, 0, 0.6);
    }

    .version.table .tab.segment textarea::selection {
        background-color: #cce2ff;
    }


</style>
<style type="text/css">
    table.gridtable {
        font-family: verdana,arial,sans-serif;
        font-size:12px;
        color:#333333;
        border-width: 1px;
        border-color: #666666;
        border-collapse: collapse;
    }
    table.gridtable th {
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #666666;
        background-color: #dedede;
    }
    table.gridtable td {
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #666666;
        background-color: #ffffff;
    }
</style>
<body>
<div class="ui text container">
    <div id="searchInput">
    <div class="ui  pointing secondary big menu">
        <a class="active item" data-tab="jar">
            简书排名搜索
        </a>
        <!--
        <a class="item" data-tab="class">
            class
            <div class="mini floating basic ui orange label" style="
                    font-size: 4px; margin-left: -14px !important">beta</div>
        </a>
        -->
    </div>
    <div class="ui active tab " data-tab="jar">
        <div id="jarSearch"  class="ui fluid search selection dropdown">
            <i class="search icon"></i>
            <div class="default text">输入简书昵称进行搜索</div>
            <div class="menu " style="max-height: calc(100vh - 100px)">
            </div>
        </div>
    </div>
        <!--
        <div class="ui tab " data-tab="class">
            <div id="classSearch"  class="ui fluid search selection dropdown">
                <i class="search icon"></i>
                <div class="default text">输入类名或完整类名，区分大小写</div>
                <div class="menu " style="max-height: calc(100vh - 100px)">
                </div>
            </div>
        </div>
        -->
    </div>


    <div id="searchResult" class="ui basic segment"> <#--loading-->
        <div class="ui  small  message" style="margin-top: 50px;opacity: 0.7">
            <div class="content">
                <div class="header" style="">
                    最快捷的简书用户上榜搜索
                </div>
                <ul class="list small">
                    <li>每日自动抓取前一日排名。</li>
                    <li>支持拼音搜索。</li>
                    <li>搜索结果显示最近30天的上榜记录。</li>
                    <li>累计上榜统计数据自2022年7月1日开始</li>
                    <li>Copyright ©2022 残阳丹落枫 | 心有玲兮 All Rights Reserved.</li>
                </ul>
            </div>
        </div>

        <!--
        <div class="ui icon small   message" style="opacity: 0.7;">

            <i class="plug icon"></i>
            <div class="content">
                <div class="header">
                    IDEA 插件
                </div>
                <ul class="list small">
                    <li>在IDEA 插件市场 搜索 <a href="https://plugins.jetbrains.com/plugin/17170-maven-search"><b>Maven Search</b></a>
                    <li>兼容2017.1 - 最新版本</li>
                    <li>打开菜单： <b>Tools</b>/<b>Maven Search</b></li>
                    <li>你的IDEA需要能访问mvn.coderead.cn外网</li>
                </ul>
            </div>
        </div>
        -->
        <div class="ui  message" style="opacity: 0.7;">
            <div class="ui relaxed small horizontal list">
                <div class="item">
                    <div class="content">
                        <div class="header">同步时间：</div>
                        <div class="description" style="margin-top: 5px">${lastModify}</div>
                    </div>
                </div>
                <div class="item">
                    <div class="content">
                        <div class="header">同步数目：</div>
                        <div class="description" style="margin-top: 5px"> ${count}</div>
                    </div>
                </div>
                <div class="item">
                    <div class="content">
                        <div class="header">
                            数据来源：
                        </div>
                        <div class="description" style="margin-top: 5px"> ${addressUrl}</div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>

<script>

    $(function () {
        initSearchInput();
        initClassSearchInput();
        $(".menu>.item[data-tab]").tab({
            onVisible: function (tapPath) {
                $(this).find("input").focus();
            }
        });
        $("#jarSearch input").focus();

    });

    // 初始化搜索框
    function initSearchInput() {
        $('#jarSearch.search.dropdown').dropdown({
            minCharacters: 1, // 自定义搜索
            forceSelection: false, // 强制选择
            selectOnKeydown: false,//基于方向键 强制选择
            action: function (text, value, element) {
                $(this).dropdown('hide');
                $(this).dropdown('clear');
                // $("#searchInput>.menu").empty();
                /* $(this).dropdown('set selected', value);*/
                openVersion(value.split(":")[0], value.split(":")[1]);
                $("#searchResult").show();
            },
            /*onLabelCreate: function (value, text, $dom) { //添加标签
                console.log(text);
                console.log(value);
            },*/
            apiSettings: {
                url: '/search?keyword={query}',
                dataType: 'json',
                /* beforeSend: function (settings) {
                     settings.data = {
                         groupId: 'group',
                         artifactId: 'artifact'
                     };
                     return settings;
                 },*/
                cache: true
            },
            saveRemoteData: false,
            message: {
                noResults: '啥也没找到'
            }
        });
    }

    function initClassSearchInput() {
        $('#classSearch.search.dropdown').dropdown({
            minCharacters: 2, // 自定义搜索
            forceSelection: false, // 强制选择
            selectOnKeydown: false,//基于方向键 强制选择
            action: function (text, value, element) {
                $(this).dropdown('hide');
                $(this).dropdown('clear');
                openVersion(value.split(":")[0], value.split(":")[1]);
                $("#searchResult").show();
            },

            apiSettings: {
                url: '/search/class?keyword={query}',
                dataType: 'json',
                cache: true
            },
            saveRemoteData: false,
            message: {
                noResults: '该用户最近没有上榜记录'
            }
        });
    }

    function fillSearchText(text) {
        $("#searchInput .item[data-tab]").tab("change tab","jar");
        $("#jarSearch input").val(text);
        $("#jarSearch input").focus();
        $("#jarSearch input").click();
        $("#jarSearch .default.text").addClass('filtered');
    }

    function addGroupId(groupId) {
        // $("#searchInput").
        let v = '<a class="ui label transition visible" data-value="com.alibaba:dubbo" style="display: inline-block !important;">com.alibaba:dubbo<i class="delete icon"></i></a>';
    }
    var clickDocButton=false;

    function openVersion(groupId, artifactId) {
        var checkbox ;
        groupId = encodeURIComponent(groupId);
        artifactId = encodeURIComponent(artifactId);
        // 清空原内容
        $("#searchResult").empty();
        $("#searchResult").addClass("loading");
        $("#searchResult")
            .load("/version?groupId=" + groupId + "&artifactId=" + artifactId,
                null,
                function (response, status, xhr) {
                    $("#searchResult").removeClass("loading");

                });
        //统计组件使用信息
        /*let countHref = "/count/artifact?" + 'groupId=' + groupId + '&' + 'artifactId=' + artifactId;
        $.get(countHref);*/


    }


    function initVersionUI() {

        $('.version.ui.accordion').accordion();
        $('.tabular.menu .item').tab({
            /*onVisible: function (tapPath) {
                $(this).children("textarea").focus();
            }*/
        });

        checkbox = $('.ui.checkbox').checkbox({
            onChange: function() {
                var lbContent = $('#showLabel').text();
                if ('卡片'== lbContent){
                    $('#showLabel').text('表格');
                    $('.ui.table  tr').css({"display": " none !important;"});
                    $('.ui.table td').css({"display" :" none !important;"});
                }else {
                    $('#showLabel').text('卡片');
                    $('.ui.table  tr').css({"display": " block !important;"});
                    $('.ui.table tr > td').css({"display": " block !important;"});
                }

            }
        });
    }

    function areaOnfocus(area, g, a, v) {
        area.select();
        g = encodeURIComponent(g);
        a = encodeURIComponent(a);
        v = encodeURIComponent(v);
        let href = '/count/version?groupId=' + g + '&' + 'artifactId=' + a + '&' + 'versionId=' + v;
        $.get(href);//统计版本信息
    }

    function doFold($tr) {
        $tr.next().toggle();
        $('.version.table tr.content').each(function (index, item) {
            if (item != $tr.next()[0]) {
                $(item).hide();
            }
        })



    }
</script>
