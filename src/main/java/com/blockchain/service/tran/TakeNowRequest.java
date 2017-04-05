package com.blockchain.service.tran;

import java.io.Serializable;
import java.util.Date;

public class TakeNowRequest implements Serializable {

  private static final long serialVersionUID = 5075778179119808658L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 业务单号（防重用） */
  private String serialNo;
  /** 交易所流水号 */
  private String tradeSerialNO;
  /** 订单号 */
  private String OrderId;
  /** 发起方编号，本接口写交易所编码 */
  private String systemCode;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 产品分类 */
  private String ProductType;
  /** 产品编码 */
  private String productCode;
  /** 业务类型 */
  private String BusiType;
  /** 会员编码 */
  private String MemCode;
  /** 资金账户（清算中心） */
  private String fundAccountClear;
  /** 币种编码 */
  private String moneyType;
  /** 订单总金额 */
  private Long orderAmt;
  /** 出金手续费 */
  private Long outPoundage;
  /** 银行产品代码 */
  private String bankProCode;
  /** 银行账户名 */
  private String accountName;
  /** 银行帐号 */
  private String bankAccount;
  /** 银行代码 */
  private String bankNO;
  /** 是否跨行 */
  private String crossFlag;
  /** 大额行号 */
  private String largeBankId;
  /** 联行号 */
  private String unionBankId;
  /** 付款账户银行名称 */
  private String outAcctIdBankName;
  /** 会员主体类型 */
  private String memberMainType;
  /** 会员全称 */
  private String fullName;
  /** 证件类型 */
  private String idKind;
  /** 证件号码 */
  private String idNo;

  /**
   * @return the requestTime
   */
  public Date getRequestTime() {
    return requestTime;
  }

  /**
   * @param requestTime
   *          the requestTime to set
   */
  public void setRequestTime(Date requestTime) {
    this.requestTime = requestTime;
  }

  /**
   * @return the requestId
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * @param requestId
   *          the requestId to set
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * @return the serialNo
   */
  public String getSerialNo() {
    return serialNo;
  }

  /**
   * @param serialNo
   *          the serialNo to set
   */
  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }

  /**
   * @return the tradeSerialNO
   */
  public String getTradeSerialNO() {
    return tradeSerialNO;
  }

  /**
   * @param tradeSerialNO
   *          the tradeSerialNO to set
   */
  public void setTradeSerialNO(String tradeSerialNO) {
    this.tradeSerialNO = tradeSerialNO;
  }

  /**
   * @return the orderId
   */
  public String getOrderId() {
    return OrderId;
  }

  /**
   * @param orderId
   *          the orderId to set
   */
  public void setOrderId(String orderId) {
    OrderId = orderId;
  }

  /**
   * @return the systemCode
   */
  public String getSystemCode() {
    return systemCode;
  }

  /**
   * @param systemCode
   *          the systemCode to set
   */
  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }

  /**
   * @return the busiDate
   */
  public String getBusiDate() {
    return busiDate;
  }

  /**
   * @param busiDate
   *          the busiDate to set
   */
  public void setBusiDate(String busiDate) {
    this.busiDate = busiDate;
  }

  /**
   * @return the busiTime
   */
  public String getBusiTime() {
    return busiTime;
  }

  /**
   * @param busiTime
   *          the busiTime to set
   */
  public void setBusiTime(String busiTime) {
    this.busiTime = busiTime;
  }

  /**
   * @return the productType
   */
  public String getProductType() {
    return ProductType;
  }

  /**
   * @param productType
   *          the productType to set
   */
  public void setProductType(String productType) {
    ProductType = productType;
  }

  /**
   * @return the productCode
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * @param productCode
   *          the productCode to set
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * @return the busiType
   */
  public String getBusiType() {
    return BusiType;
  }

  /**
   * @param busiType
   *          the busiType to set
   */
  public void setBusiType(String busiType) {
    BusiType = busiType;
  }

  /**
   * @return the memCode
   */
  public String getMemCode() {
    return MemCode;
  }

  /**
   * @param memCode
   *          the memCode to set
   */
  public void setMemCode(String memCode) {
    MemCode = memCode;
  }

  /**
   * @return the fundAccountClear
   */
  public String getFundAccountClear() {
    return fundAccountClear;
  }

  /**
   * @param fundAccountClear
   *          the fundAccountClear to set
   */
  public void setFundAccountClear(String fundAccountClear) {
    this.fundAccountClear = fundAccountClear;
  }

  /**
   * @return the moneyType
   */
  public String getMoneyType() {
    return moneyType;
  }

  /**
   * @param moneyType
   *          the moneyType to set
   */
  public void setMoneyType(String moneyType) {
    this.moneyType = moneyType;
  }

  /**
   * @return the orderAmt
   */
  public Long getOrderAmt() {
    return orderAmt;
  }

  /**
   * @param orderAmt
   *          the orderAmt to set
   */
  public void setOrderAmt(Long orderAmt) {
    this.orderAmt = orderAmt;
  }

  /**
   * @return the outPoundage
   */
  public Long getOutPoundage() {
    return outPoundage;
  }

  /**
   * @param outPoundage
   *          the outPoundage to set
   */
  public void setOutPoundage(Long outPoundage) {
    this.outPoundage = outPoundage;
  }

  /**
   * @return the bankProCode
   */
  public String getBankProCode() {
    return bankProCode;
  }

  /**
   * @param bankProCode
   *          the bankProCode to set
   */
  public void setBankProCode(String bankProCode) {
    this.bankProCode = bankProCode;
  }

  /**
   * @return the accountName
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * @param accountName
   *          the accountName to set
   */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * @return the bankAccount
   */
  public String getBankAccount() {
    return bankAccount;
  }

  /**
   * @param bankAccount
   *          the bankAccount to set
   */
  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * @return the bankNO
   */
  public String getBankNO() {
    return bankNO;
  }

  /**
   * @param bankNO
   *          the bankNO to set
   */
  public void setBankNO(String bankNO) {
    this.bankNO = bankNO;
  }

  /**
   * @return the crossFlag
   */
  public String getCrossFlag() {
    return crossFlag;
  }

  /**
   * @param crossFlag
   *          the crossFlag to set
   */
  public void setCrossFlag(String crossFlag) {
    this.crossFlag = crossFlag;
  }

  /**
   * @return the largeBankId
   */
  public String getLargeBankId() {
    return largeBankId;
  }

  /**
   * @param largeBankId
   *          the largeBankId to set
   */
  public void setLargeBankId(String largeBankId) {
    this.largeBankId = largeBankId;
  }

  /**
   * @return the unionBankId
   */
  public String getUnionBankId() {
    return unionBankId;
  }

  /**
   * @param unionBankId
   *          the unionBankId to set
   */
  public void setUnionBankId(String unionBankId) {
    this.unionBankId = unionBankId;
  }

  /**
   * @return the outAcctIdBankName
   */
  public String getOutAcctIdBankName() {
    return outAcctIdBankName;
  }

  /**
   * @param outAcctIdBankName
   *          the outAcctIdBankName to set
   */
  public void setOutAcctIdBankName(String outAcctIdBankName) {
    this.outAcctIdBankName = outAcctIdBankName;
  }

  /**
   * @return the memberMainType
   */
  public String getMemberMainType() {
    return memberMainType;
  }

  /**
   * @param memberMainType
   *          the memberMainType to set
   */
  public void setMemberMainType(String memberMainType) {
    this.memberMainType = memberMainType;
  }

  /**
   * @return the fullName
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * @param fullName
   *          the fullName to set
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * @return the idKind
   */
  public String getIdKind() {
    return idKind;
  }

  /**
   * @param idKind
   *          the idKind to set
   */
  public void setIdKind(String idKind) {
    this.idKind = idKind;
  }

  /**
   * @return the idNo
   */
  public String getIdNo() {
    return idNo;
  }

  /**
   * @param idNo
   *          the idNo to set
   */
  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "TakeNowRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", serialNo=" + serialNo
        + ", tradeSerialNO=" + tradeSerialNO + ", OrderId=" + OrderId + ", systemCode=" + systemCode + ", busiDate="
        + busiDate + ", busiTime=" + busiTime + ", ProductType=" + ProductType + ", productCode=" + productCode
        + ", BusiType=" + BusiType + ", MemCode=" + MemCode + ", fundAccountClear=" + fundAccountClear + ", moneyType="
        + moneyType + ", orderAmt=" + orderAmt + ", outPoundage=" + outPoundage + ", bankProCode=" + bankProCode
        + ", accountName=" + accountName + ", bankAccount=" + bankAccount + ", bankNO=" + bankNO + ", crossFlag="
        + crossFlag + ", largeBankId=" + largeBankId + ", unionBankId=" + unionBankId + ", outAcctIdBankName="
        + outAcctIdBankName + ", memberMainType=" + memberMainType + ", fullName=" + fullName + ", idKind=" + idKind
        + ", idNo=" + idNo + "]";
  }

}
