<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>Maven搜索-最快捷的Maven搜索-由源码阅读网提供技术服务</title>
    <link href="/css/semantic.min.css" rel="stylesheet">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/semantic.min.js"></script>
</head>

<body>
<div class="ui container text basic segment">
<table class="ui basic table">
    <thead>
    <tr>
        <th>项目</th>
        <th></th>
        <th>点击次数</th>
    </tr>
    </thead>
    <tbody>
    <#list items as item>
        <tr>
            <td>${item.groupId}:${item.artifactId}</td>
            <#if item.haveDocDone==true  >
                <td>G:\product\artifact-doc\${item.groupId}\${item.artifactId}</td>
            <#else>
                <td><a onclick="window.location='/mkdir/${item.groupId}/${item.artifactId}';">创建目录</a></td>
            </#if>


            <td>${item.hot}</td>
        </tr>
    </#list>
    </tbody>
</table>
总数:${total} <a href="/list?page=${upPage}">上一页</a> ${page}   <a href="/list?page=${nextPage}">下一页</a>
</div>
<script type="application/javascript">
    function openFileIIs(filename){
        try{
            var obj=new ActiveXObject("wscript.shell");
            if(obj){
                obj.Run("\""+filename+"\"", 1, false );
                //obj.run("osk");/*打开屏幕键盘*/
                //obj.Run('"'+filename+'"');
                obj=null;
            }
        }catch(e){
            alert("请确定是否存在该盘符或文件");
        }

    }
</script>
</body>
</html>


