package com.st.batch.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MfPushSaleFs {
    private String brandCode;

    private String billCode;

    private Date businessDate;

    private Date billCreateTime;

    private String billType;

    private String operatorCode;

    private Integer quantity;

    private BigDecimal originalAmount;

    private BigDecimal discount;

    private BigDecimal discountedAmount;

    private BigDecimal decreaseAmount;

    private BigDecimal payAmount;

    private String relateBillCode;

    private String memberId;

    private String memberCode;

    private String departCode;

    private String comment;

    private Boolean datasourceId;

    private Date createTime;

    private String integrationId;

    private String etlProcId;

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public Date getBillCreateTime() {
        return billCreateTime;
    }

    public void setBillCreateTime(Date billCreateTime) {
        this.billCreateTime = billCreateTime;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(BigDecimal discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public BigDecimal getDecreaseAmount() {
        return decreaseAmount;
    }

    public void setDecreaseAmount(BigDecimal decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getRelateBillCode() {
        return relateBillCode;
    }

    public void setRelateBillCode(String relateBillCode) {
        this.relateBillCode = relateBillCode == null ? null : relateBillCode.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Boolean getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(Boolean datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId == null ? null : integrationId.trim();
    }

    public String getEtlProcId() {
        return etlProcId;
    }

    public void setEtlProcId(String etlProcId) {
        this.etlProcId = etlProcId == null ? null : etlProcId.trim();
    }
}