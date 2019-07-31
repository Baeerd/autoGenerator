package com.sgai.pro.entity;

import com.sgai.core.base.entity.AbstractEntity;

public class MesDeleteLoadingHis extends AbstractEntity {

    private String planNo;

    private String inMatNo;

    private Long matSeqNo;

    private Date deleteTime;

    private String deleteType;

    private String loadingFlag;


    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public String getInMatNo() {
        return inMatNo;
    }

    public void setInMatNo(String inMatNo) {
        this.inMatNo = inMatNo;
    }

    public Long getMatSeqNo() {
        return matSeqNo;
    }

    public void setMatSeqNo(Long matSeqNo) {
        this.matSeqNo = matSeqNo;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }

    public String getLoadingFlag() {
        return loadingFlag;
    }

    public void setLoadingFlag(String loadingFlag) {
        this.loadingFlag = loadingFlag;
    }

}