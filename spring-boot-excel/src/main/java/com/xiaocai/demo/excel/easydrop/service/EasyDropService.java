package com.xiaocai.demo.excel.easydrop.service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface EasyDropService {


    public void exportDetailListTemplate(HttpServletResponse response) throws IOException;
}
