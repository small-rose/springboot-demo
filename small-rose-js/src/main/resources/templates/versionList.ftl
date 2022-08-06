<div class="ui large breadcrumb" style="margin-top: 20px;margin-bottom: 15px;">
    <a class="section" onclick="fillSearchText('${groupId}')">${groupId}</a>
    <div class="divider"> /</div>
    <#--<a class="section" onclick="fillSearchText('${artifactId}')">${artifactId}</a>
    <div class="divider"> /</div>-->
    <div class="active section">上榜详情</div>
</div>

<#if docHtml??>
    <div class="ui ">
        <div class="doc tips">
        </div>
        <div class="doc full" style="display: none">
            ${docHtml}
        </div>
        <div  class="ui    small button unfold" onclick="showDocFull();" tabindex="0">
            <i class="angle double down  icon"></i><span class="text">展开显示更多案例...</span>
        </div>
        <script>
            $(function () {
                let docHtml = $(".doc.full").text();
                let docTips=docHtml.slice(0,Math.min(100,docHtml.length))
                $(".doc.tips").text(docTips+"....");
                // code 渲染

                $(".doc.full pre>code").each(function(){
                    hljs.highlightBlock(this);
                })
                if (clickDocButton) {
                    showDocFull();
                    clickDocButton=false;
                }
            });
        </script>
    </div>
</#if>
<#if artifact??>
    <div class="ui message">
        <div class="ui  link large horizontal celled list">
            <#setting url_escaping_charset='utf-8'>

            <#if artifact??>
                <span class="item filtered">累计上榜</span>
            </#if>

        </div>
        <div style="color: rgba(0,0,0,.6);line-height: 1.6;">简书用户【 ${groupId} 】累计上榜 ${artifact} 次</div>
    </div>
</#if>
<!--
<div class="ui segment">
    <div class="field">
        <div class="ui toggle checkbox">
            <input type="checkbox" name="gift" tabindex="0" class="hidden">
            <label id="showLabel">卡片</label>
        </div>
    </div>
</div>
-->
<table class="ui version selectable table">
  <#--  <thead>

    </thead>-->
    <tbody>
    <tr>
        <td class="center aligned ">作者</td>
        <td class="center aligned">上榜日期</td>
        <td class="center aligned">名次</td>
        <td class="left aligned">文章</td>
    </tr>
    <#list items as item>
    <tr onclick="doFold($(this))">
        <td class="center aligned user">
            <img class="download link grey icon" src="${item.author_avatar}" style="z-index: 1000;"/>${item.author_nickname}
        </td>
        <td class="center aligned">${item.rank_date}</td>
        <td class="center aligned">${item.rank_no}</td>
        <td class="left aligned"> <a target="_blank" href="https://www.jianshu.com/p/${item.slug}">${item.title }</a></td>
    </tr>
    <tr class="content" style="display: none">

    </tr>
    </#list>
    <#if items?size==0>
        <div class="error message">没有找到任何记录</div>
    </#if>
    </tbody>
</table>

<style>

</style>
<script>
    $(function () {

        initVersionUI();
        // download icon
        $('.download,.icon').click(function (event) {
            if ( event && event.stopPropagation )
                event.stopPropagation();
            else
                window.event.cancelBubble = true;

            var attr = $(this).attr("data-url");
            var data=attr.split('/');
            var url ="https://repo1.maven.org/maven2/";
            url+=data[0].replaceAll('.','/')+'/';
            url+=data[1];
            url+='/';
            url+=data[2]+'/'+data[1]+'-'+data[2]+'.jar';
            window.location=url;

        });
    })

    function showDocFull() {
        $(".doc.full").toggle();
        $(".doc.tips").toggle();
        if ($(".doc.full").is(":hidden")) {
            // 是否可空
            $(".button.unfold span.text").text("展开显示更多案例...")
        }else {
            $(".button.unfold span.text").text("收起")
        }
    }


    function download(e) {
          //如果提供了事件对象，则这是一个非IE浏览器
        if ( e && e.stopPropagation )
            e.stopPropagation();        //因此它支持W3C的stopPropagation()方法
        else
            window.event.cancelBubble = true;        //否则，我们需要使用IE的方式来取消事件冒泡
    }
</script>
<style>
    @media only screen and (max-width:476px){
        .user img{display: none !important;}
        .ui.table{font-size: 0.78em;}
    }
    @media only screen and (max-width:347px){
        .ui.table.user img{display: none !important;}
        .ui.table{font-size: 0.58em;}

    }



    .user img{
        width: 24px;
        height: 24px;
        border-radius: 12px;
        vertical-align: middle;
    }
</style>