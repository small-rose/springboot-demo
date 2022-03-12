package com.xiaocai.mybatis.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyCommentGenerator ] 说明：实现生成实体类
 * @Function :  功能说明：  extends DefaultCommentGenerator   or  implements CommentGenerator
 * @Date ：2022/3/10 17:17
 * @Version ： 1.0
 **/
public class MyCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;
    private String author;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        String strsuppressDate= properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE);
        suppressDate = "true".equals(strsuppressDate);
        String strsuppressAllComments= properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS);
        suppressAllComments = "true".equals(strsuppressAllComments);
        author = "zzy";
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if(suppressAllComments){
            return;
        }
        // 添加class注释
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * ");
        topLevelClass.addJavaDocLine(" * @Table : "+introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(" * @description : " + introspectedTable.getRemarks());
        topLevelClass.addJavaDocLine(" * @author : " + author);
        topLevelClass.addJavaDocLine(" * @date : " + currentDateStr);
        topLevelClass.addJavaDocLine(" * @modify : " );
        topLevelClass.addJavaDocLine(" */");
    }



    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }

        // 添加class注释
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * addClassComment 2 params");
        innerClass.addJavaDocLine(" * @Table : "+introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(" * @description : " + introspectedTable.getRemarks());
        innerClass.addJavaDocLine(" * @author : " + author);
        innerClass.addJavaDocLine(" * @date : " + currentDateStr);
        innerClass.addJavaDocLine(" * @modify : " );

        //      addJavadocTag(innerClass, markAsDoNotDelete);
        innerClass.addJavaDocLine(" */");


     }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {
        if(suppressAllComments){
            return;
        }
        // 添加字段注释
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * addClassComment 3 params");
        innerClass.addJavaDocLine(" * @Table : "+introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(" * @description : " + introspectedTable.getRemarks());
        innerClass.addJavaDocLine(" * @author : " + author);
        innerClass.addJavaDocLine(" * @date : " + currentDateStr);
        innerClass.addJavaDocLine(" * @modify : " );
        innerClass.addJavaDocLine(" */");
    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if(suppressAllComments){
            return;
        }
        // 添加字段注释
        innerEnum.addJavaDocLine("/**");
        innerEnum.addJavaDocLine(" * addEnumComment 2 params");
        innerEnum.addJavaDocLine(" * @Table : "+introspectedTable.getFullyQualifiedTable());
        innerEnum.addJavaDocLine(" * @description : " + introspectedTable.getRemarks());
        innerEnum.addJavaDocLine(" * @author : " + author);
        innerEnum.addJavaDocLine(" * @date : " + currentDateStr);
        innerEnum.addJavaDocLine(" * @modify : " );
        innerEnum.addJavaDocLine(" */");
    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");
        method.addJavaDocLine("* "+introspectedTable.getRemarks());
        method.addJavaDocLine("* @return "+method.getName());

        //      addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }


        method.addJavaDocLine("/**");
        method.addJavaDocLine("* "+introspectedTable.getRemarks());
        Parameter parameter=method.getParameters().get(0);
        method.addJavaDocLine("* @param "+parameter.getName());

        method.addJavaDocLine(" */");
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if(suppressAllComments){
            return;
        }
        // 添加方法注释
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * ");
        //method.addJavaDocLine(""+method.getName());
        String methodName = method.getName();
        String desc = "";
        switch (methodName){
            case "insert":
                desc = "正常的insert全部的属性"; break;
            case "insertSelective":
                desc = "仅insert有值的属性"; break;
            case "deleteByPrimaryKey":
                desc = "根据主键删除"; break;
            case "deleteByExample":
                desc = "根据复杂条件判断删除"; break;
            case "updateByPrimaryKey":
                desc = "根据主键更新对象全部属性"; break;
            case "updateByPrimaryKeyWithBLOBs":
                desc = "根据主键更新对象全部属性（含大字段）"; break;

            case "updateByPrimaryKeySelective":
                desc = "根据主键更新对象参数有值的属性"; break;
            case "updateByExample":
                desc = "根据复杂条件更新参数有值的属性"; break;
            case "updateByExampleWithBLOBs":
                desc = "根据复杂条件更新参数有值的属性（含大字段）"; break;

            case "selectByPrimaryKey":
                desc = "根据主键条件查询对象"; break;
            case "selectByExample":
                desc = "根据复杂条件查询对象列表"; break;
        }


        method.addJavaDocLine(" * @description : " + desc);
        method.addJavaDocLine(" * @author : " + author);
        method.addJavaDocLine(" * @date : " + currentDateStr);
        List<Parameter> parameters = method.getParameters();
        for (Parameter parameter : parameters) {

            if (parameter.getAnnotations().contains("Param")){
                method.addJavaDocLine(" * @param : " + parameter.getType() +"  "+ parameter.getName()+" , XML 参数绑定" );
            }else{
                method.addJavaDocLine(" * @param : " + parameter.getType() +"  "+ parameter.getName());
            }
        }
        method.addJavaDocLine(" * @modified by : " );
        method.addJavaDocLine(" * @last-modify : " );
        method.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        // add no file level comments by default
        return;
    }

    /**
     * Adds a suitable comment to warn users that the element was generated, and
     * when it was generated.
     */
    @Override
    public void addComment(XmlElement xmlElement) {
        return;
    }
    @Override
    public void addRootComment(XmlElement rootElement) {
        // add no document level comments by default
        return;
    }

    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }

    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

    }

    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }

    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

    }

    @Override
    public void addClassAnnotation(org.mybatis.generator.api.dom.java.InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }
}
