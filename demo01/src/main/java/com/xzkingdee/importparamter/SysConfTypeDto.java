package com.xzkingdee.importparamter;

import lombok.Data;

/**
 * @author qy
 * @date Created in 2020/7/15
 **/
@Data
public class SysConfTypeDto {
    private String id;
    private String parentId;
    private String typeCode;
    private String routeCode;
    private String typeName;
    private String typeDesc;
    private String typeLevel;
    private String sortNum;
    private String delFlag;

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", typeCode='" + typeCode + '\'' +
                ", routeCode='" + routeCode + '\'' +
                ", typeLevel='" + typeLevel + '\'';
    }

    public String[] ofStringArr(SysConfTypeDto dto){
        return new String[]{dto.getId(),dto.getParentId(),dto.getTypeCode(),dto.getRouteCode(),
                dto.getTypeName(),dto.getTypeDesc(),dto.getTypeLevel(),dto.getSortNum(),dto.getDelFlag()};
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(String typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getSortNum() {
        return sortNum;
    }

    public void setSortNum(String sortNum) {
        this.sortNum = sortNum;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
