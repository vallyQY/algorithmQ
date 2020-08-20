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
}
