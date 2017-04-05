package com.blockchain.service.tran;

import java.io.Serializable;
import java.util.Date;

public class PositionRequest implements Serializable {

  private static final long serialVersionUID = 4210289700643416761L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 业务单号,建议productCode+建仓单号 */
  private String BusiNo;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员编码 */
  private String memCode;
  /** 交易账号 */
  private String openTradeAccount;
  /** 商品合约编码，产品代码 */
  private String productCode;
  /** 产品类别ID */
  private String productCategoryId;
  /** 交易类型 */
  private String tradeType;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间，成交时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 买卖方向(1买2卖) */
  private String tradeDir;
  /** 成交类型(1开仓 2平仓) */
  private String dealType;
  /** 对手方成交类型 */
  private String oppDealType;
  /** 仓单/定金方式(0仓单 1定金) */
  private String depositWay;
  /** 成交价格 */
  private Long orderPrice;
  /** 持仓价格 */
  private Integer holdPrice;
  /** 成交数量 */
  private Integer orderQuantity;
  /** 剩余数量 */
  private String dealTotalPrice;
  /** 数量单位 */
  private String PresentUnit;
  /** 定金率 */
  private Double depositRate;
  /** 定金率是否比率(0-固定 1-比率) */
  private String depositRatioType;
  /** 定金收取方式(0-开仓价 1-持仓价) */
  private String depositType;
  /** 定金金额或履约准备金 */
  private String depositBalance;
  /** 手续费 */
  private String openPoundage;
  /** 平仓盈亏 */
  private String SquareLoss;
  /** 结算盈亏 */
  private String SettleLoss;
  /** 建仓单号 */
  private String depotOrderNo;
  /** 说明，备注 */
  private String requestDesc;

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
   * @return the busiNo
   */
  public String getBusiNo() {
    return BusiNo;
  }

  /**
   * @param busiNo
   *          the busiNo to set
   */
  public void setBusiNo(String busiNo) {
    BusiNo = busiNo;
  }

  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }

  /**
   * @param exchangeId
   *          the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * @return the memCode
   */
  public String getMemCode() {
    return memCode;
  }

  /**
   * @param memCode
   *          the memCode to set
   */
  public void setMemCode(String memCode) {
    this.memCode = memCode;
  }

  /**
   * @return the openTradeAccount
   */
  public String getOpenTradeAccount() {
    return openTradeAccount;
  }

  /**
   * @param openTradeAccount
   *          the openTradeAccount to set
   */
  public void setOpenTradeAccount(String openTradeAccount) {
    this.openTradeAccount = openTradeAccount;
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
   * @return the productCategoryId
   */
  public String getProductCategoryId() {
    return productCategoryId;
  }

  /**
   * @param productCategoryId
   *          the productCategoryId to set
   */
  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  /**
   * @return the tradeType
   */
  public String getTradeType() {
    return tradeType;
  }

  /**
   * @param tradeType
   *          the tradeType to set
   */
  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
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
   * @return the tradeDir
   */
  public String getTradeDir() {
    return tradeDir;
  }

  /**
   * @param tradeDir
   *          the tradeDir to set
   */
  public void setTradeDir(String tradeDir) {
    this.tradeDir = tradeDir;
  }

  /**
   * @return the dealType
   */
  public String getDealType() {
    return dealType;
  }

  /**
   * @param dealType
   *          the dealType to set
   */
  public void setDealType(String dealType) {
    this.dealType = dealType;
  }

  /**
   * @return the oppDealType
   */
  public String getOppDealType() {
    return oppDealType;
  }

  /**
   * @param oppDealType
   *          the oppDealType to set
   */
  public void setOppDealType(String oppDealType) {
    this.oppDealType = oppDealType;
  }

  /**
   * @return the depositWay
   */
  public String getDepositWay() {
    return depositWay;
  }

  /**
   * @param depositWay
   *          the depositWay to set
   */
  public void setDepositWay(String depositWay) {
    this.depositWay = depositWay;
  }

  /**
   * @return the orderPrice
   */
  public Long getOrderPrice() {
    return orderPrice;
  }

  /**
   * @param orderPrice
   *          the orderPrice to set
   */
  public void setOrderPrice(Long orderPrice) {
    this.orderPrice = orderPrice;
  }

  /**
   * @return the holdPrice
   */
  public Integer getHoldPrice() {
    return holdPrice;
  }

  /**
   * @param holdPrice
   *          the holdPrice to set
   */
  public void setHoldPrice(Integer holdPrice) {
    this.holdPrice = holdPrice;
  }

  /**
   * @return the orderQuantity
   */
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  /**
   * @param orderQuantity
   *          the orderQuantity to set
   */
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * @return the dealTotalPrice
   */
  public String getDealTotalPrice() {
    return dealTotalPrice;
  }

  /**
   * @param dealTotalPrice
   *          the dealTotalPrice to set
   */
  public void setDealTotalPrice(String dealTotalPrice) {
    this.dealTotalPrice = dealTotalPrice;
  }

  /**
   * @return the presentUnit
   */
  public String getPresentUnit() {
    return PresentUnit;
  }

  /**
   * @param presentUnit
   *          the presentUnit to set
   */
  public void setPresentUnit(String presentUnit) {
    PresentUnit = presentUnit;
  }

  /**
   * @return the depositRate
   */
  public Double getDepositRate() {
    return depositRate;
  }

  /**
   * @param depositRate
   *          the depositRate to set
   */
  public void setDepositRate(Double depositRate) {
    this.depositRate = depositRate;
  }

  /**
   * @return the depositRatioType
   */
  public String getDepositRatioType() {
    return depositRatioType;
  }

  /**
   * @param depositRatioType
   *          the depositRatioType to set
   */
  public void setDepositRatioType(String depositRatioType) {
    this.depositRatioType = depositRatioType;
  }

  /**
   * @return the depositType
   */
  public String getDepositType() {
    return depositType;
  }

  /**
   * @param depositType
   *          the depositType to set
   */
  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  /**
   * @return the depositBalance
   */
  public String getDepositBalance() {
    return depositBalance;
  }

  /**
   * @param depositBalance
   *          the depositBalance to set
   */
  public void setDepositBalance(String depositBalance) {
    this.depositBalance = depositBalance;
  }

  /**
   * @return the openPoundage
   */
  public String getOpenPoundage() {
    return openPoundage;
  }

  /**
   * @param openPoundage
   *          the openPoundage to set
   */
  public void setOpenPoundage(String openPoundage) {
    this.openPoundage = openPoundage;
  }

  /**
   * @return the squareLoss
   */
  public String getSquareLoss() {
    return SquareLoss;
  }

  /**
   * @param squareLoss
   *          the squareLoss to set
   */
  public void setSquareLoss(String squareLoss) {
    SquareLoss = squareLoss;
  }

  /**
   * @return the settleLoss
   */
  public String getSettleLoss() {
    return SettleLoss;
  }

  /**
   * @param settleLoss
   *          the settleLoss to set
   */
  public void setSettleLoss(String settleLoss) {
    SettleLoss = settleLoss;
  }

  /**
   * @return the depotOrderNo
   */
  public String getDepotOrderNo() {
    return depotOrderNo;
  }

  /**
   * @param depotOrderNo
   *          the depotOrderNo to set
   */
  public void setDepotOrderNo(String depotOrderNo) {
    this.depotOrderNo = depotOrderNo;
  }

  /**
   * @return the requestDesc
   */
  public String getRequestDesc() {
    return requestDesc;
  }

  /**
   * @param requestDesc
   *          the requestDesc to set
   */
  public void setRequestDesc(String requestDesc) {
    this.requestDesc = requestDesc;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "PositionRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", BusiNo=" + BusiNo
        + ", exchangeId=" + exchangeId + ", memCode=" + memCode + ", openTradeAccount=" + openTradeAccount
        + ", productCode=" + productCode + ", productCategoryId=" + productCategoryId + ", tradeType=" + tradeType
        + ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", tradeDir=" + tradeDir + ", dealType=" + dealType
        + ", oppDealType=" + oppDealType + ", depositWay=" + depositWay + ", orderPrice=" + orderPrice + ", holdPrice="
        + holdPrice + ", orderQuantity=" + orderQuantity + ", dealTotalPrice=" + dealTotalPrice + ", PresentUnit="
        + PresentUnit + ", depositRate=" + depositRate + ", depositRatioType=" + depositRatioType + ", depositType="
        + depositType + ", depositBalance=" + depositBalance + ", openPoundage=" + openPoundage + ", SquareLoss="
        + SquareLoss + ", SettleLoss=" + SettleLoss + ", depotOrderNo=" + depotOrderNo + ", requestDesc=" + requestDesc
        + "]";
  }

}
