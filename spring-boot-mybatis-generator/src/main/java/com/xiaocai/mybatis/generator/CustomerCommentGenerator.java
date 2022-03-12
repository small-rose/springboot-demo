package com.xiaocai.mybatis.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomerCommentGenerator ] 说明：实现生成实体类
 * @Function :  功能说明：  extends DefaultCommentGenerator   or  implements CommentGenerator
 * @Date ：2022/3/10 17:17
 * @Version ： 1.0
 **/
public class CustomerCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;
    private String author;

    public CustomerCommentGenerator() {
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
        author = StringUtils.hasText(properties.getProperty("author")) ? properties.getProperty("author") :"mbg";
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        // entity 类属性注释
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(" * "+sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }
        // 生成 xxxExample 类属性的注释
        /*
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        IntrospectedColumn column = introspectedTable.getColumn(field.getName());
        sb.append(column.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" *\/");
        */
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if(suppressAllComments){
            return;
        }
        // 添加 entity class 类注释
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" *  ");
        topLevelClass.addJavaDocLine(" * @Table : "+introspectedTable.getFullyQualifiedTable());
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

        // 添加 entity 头部注释   xxxExample 类 GeneratedCriteria 的类注释

        innerClass.addJavaDocLine("/**");
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
        // 添加class注释
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * addClassComment by 3 params : ");
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
        innerEnum.addJavaDocLine(" * @description : " );
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
        // get 方法注释
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 获取-"+introspectedColumn.getRemarks());
        method.addJavaDocLine("* @return "+introspectedColumn.getJavaProperty());

        //      addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // TODO Auto-generated method stub
        if (suppressAllComments) {
            return;
        }
        // set 方法注释
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 设置-"+introspectedColumn.getRemarks());
        Parameter parameter = method.getParameters().get(0);
        method.addJavaDocLine("* @paramType "+parameter.getType() );
        method.addJavaDocLine("* @param "+parameter.getName() + " - " +introspectedColumn.getRemarks());
        method.addJavaDocLine(" */");
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if(suppressAllComments){
            return;
        }
        // 添加 xxxMapper 接口的 方法注释
        method.addJavaDocLine("/**");
        //method.addJavaDocLine(" * ");
        //method.addJavaDocLine(""+method.getName());
        String methodName = method.getName();
        String desc = getMethodCommentByName(methodName);

        method.addJavaDocLine(" * @description : " + desc);
        method.addJavaDocLine(" * @author : " + author);
        method.addJavaDocLine(" * @date : " + currentDateStr);
        List<Parameter> parameters = method.getParameters();
        for (Parameter parameter : parameters) {

            if (parameter.getAnnotations().contains("Param")){
                method.addJavaDocLine(" * @param : " + parameter.getType().getShortName() +"  "+ parameter.getName()+" , XML 参数绑定" );
            }else{
                method.addJavaDocLine(" * @param : " + parameter.getName() +"  "+ parameter.getType().getShortName());
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
        if (suppressAllComments) {
            return;
        }
        //ms id 方法名称
        String value = xmlElement.getAttributes().get(0).getValue();

        xmlElement.addElement(new TextElement("<!--")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append("  WARNING - "); //$NON-NLS-1$
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        xmlElement.addElement(new TextElement(sb.toString()));
        xmlElement.addElement(new TextElement("  说明: " +getMethodCommentByName(value)+".")); //$NON-NLS-1$


        for (Attribute attribute : xmlElement.getAttributes()){
            if ("useGeneratedKeys".equalsIgnoreCase(attribute.getName())){
                xmlElement.addElement(new TextElement("是否返回主键: " + ("true".equalsIgnoreCase(attribute.getValue()) ? "是" : "否:") + ".")); //$NON-NLS-1$
            }
        }


        String s = getDateString();
        if (s != null) {
            sb.setLength(0);
            sb.append("  This element was generated on "); //$NON-NLS-1$
            sb.append(s);
            sb.append('.');
            xmlElement.addElement(new TextElement(sb.toString()));
        }

        xmlElement.addElement(new TextElement("-->")); //$NON-NLS-1$
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



    private String getMethodCommentByName(String methodName){
        String comment = "";
        switch (methodName){
            case "insert":
                comment = "正常的insert全部的属性"; break;
            case "insertSelective":
                comment = "仅insert有值的属性"; break;

            case "deleteByPrimaryKey":
                comment = "根据主键删除"; break;
            case "deleteByExample":
                comment = "根据自定义Example条件判断删除"; break;

            case "updateByPrimaryKey":
                comment = "根据主键更新对象全部属性"; break;
            case "updateByPrimaryKeyWithBLOBs":
                comment = "根据主键更新对象全部属性（含大字段）"; break;
            case "updateByPrimaryKeySelective":
                comment = "根据主键更新对象参数有值的属性"; break;

            case "updateByExample":
                comment = "根据自定义Example条件更新全部属性"; break;
            case "updateByExampleSelective":
                comment = "根据自定义Example条件对象参数有值的属性"; break;
            case "updateByExampleWithBLOBs":
                comment = "根据自定义Example条件更新参数有值的属性（含大字段）"; break;

            case "countByExample":
                comment = "根据自定义Example条件查询总条数"; break;
            case "selectByPrimaryKey":
                comment = "根据主键条件查询对象"; break;
            case "selectByExample":
                comment = "根据自定义Example条件查询对象列表"; break;
            case "selectByExampleWithBLOBs":
                comment = "根据自定义Example条件查询对象列表（含大字段）"; break;

        }
        return comment ;
    }
}
