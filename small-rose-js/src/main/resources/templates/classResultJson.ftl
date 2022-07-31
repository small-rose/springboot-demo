{
"success": true,
"results": [
        <#list results as item >
                {
                "author_nickname": "${item.author_nickname}",
                "slug": "${item.slug}",
                "rank_date": "${item.rank_date}",
                "author_avatar": "${item.author_avatar}",
                "fp": "${item.fp}",
                "author_fp":  "${item.author_fp}",
                "voter_fp":  "${item.voter_fp}"
                }
            <#if item_has_next>,</#if>
        </#list>
]
}