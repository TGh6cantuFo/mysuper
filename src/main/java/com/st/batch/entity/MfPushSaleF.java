package com.st.batch.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MfPushSaleF {
    private String integrationId;

    private String brandCode;

    private String billCode;

    private String saleType;

    private String ifProductId;

    private Integer quantity;

    private BigDecimal payPrice;

    private String mainCode;

    private String uniqueCode;

    private BigDecimal lineAmount;

    private String activityCode;

    private Boolean datasourceId;

    private Date createTime;

    private String etlProcId;

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId == null ? null : integrationId.trim();
    }

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

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getIfProductId() {
        return ifProductId;
    }

    public void setIfProductId(String ifProductId) {
        this.ifProductId = ifProductId == null ? null : ifProductId.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode == null ? null : mainCode.trim();
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode == null ? null : uniqueCode.trim();
    }

    public BigDecimal getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(BigDecimal lineAmount) {
        this.lineAmount = lineAmount;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode == null ? null : activityCode.trim();
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

    public String getEtlProcId() {
        return etlProcId;
    }

    public void setEtlProcId(String etlProcId) {
        this.etlProcId = etlProcId == null ? null : etlProcId.trim();
    }
}