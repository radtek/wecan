package com.gofirst.scenecollection.evidence.model;

import net.tsz.afinal.annotation.sqlite.Table;

import java.util.List;

/**
 * COMMON_TEMPLATE_DETAIL 实体类
 * Wed May 18 09:05:40 CST 2016 taofa
 */

@Table(name = "CommonTemplateDetail")
public class CommonTemplateDetail {

    private String id;
    private String tableName;
    private String sceneName;
    private String templateId;
    private String templateType;
    private String positionSort;
    private String templateLevel;	//模板等级 0:根模板 1:一级模板 2:二级模板
    private String templateUpName;	//上级表名 仅模板等级为2时有效


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private List<CommonExtField> tableField;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public List<CommonExtField> getTableField() {
        return tableField;
    }

    public void setTableField(List<CommonExtField> tableField) {
        this.tableField = tableField;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getPositionSort() {
        return positionSort;
    }

    public void setPositionSort(String positionSort) {
        this.positionSort = positionSort;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getTemplateLevel() {
        return templateLevel;
    }

    public void setTemplateLevel(String templateLevel) {
        this.templateLevel = templateLevel;
    }

    public String getTemplateUpName() {
        return templateUpName;
    }

    public void setTemplateUpName(String templateUpName) {
        this.templateUpName = templateUpName;
    }
}

