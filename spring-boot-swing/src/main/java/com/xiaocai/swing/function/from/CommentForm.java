package com.xiaocai.swing.function.from;

public abstract class CommentForm {
    
    protected void init(){
        initComponent();
        initUi();
    }

    protected abstract void initUi();

    protected abstract void initComponent();


}
