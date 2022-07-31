<!--    搜索结果-->
<#--<div class="ui divided selection list">-->
    <#list results as item>
        <div class="item" onclick="openVersion('${item.item.groupId}','${item.item.artifactId}')">
            <div class="content">
                <div class="text">
                    ${item.highlightText?split(":")[0]}
                </div>
                <div class="description"  style="color: rgba(0,0,0,.4)">
                    ${item.highlightText?split(":")[1]}
                </div>
            </div>
        </div>
    </#list>
    <#--<#if results?size==0>
        <div class="error message">没有找到任何记录</div>
    </#if>-->
<#--
</div>-->
