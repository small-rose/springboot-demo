{
"success": true,
"results": [
        <#list results as item >
                {
                "name": "${item.author_nickname}",
                "value": "${item.author_nickname}:${item.author_nickname_py}",
                "text":  "${item.author_nickname}:${item.author_nickname_py}"
                }
            <#if item_has_next>,</#if>
        </#list>
]
}
