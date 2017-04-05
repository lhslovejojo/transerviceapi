package com.blockchain.service.query.domain;

import java.io.Serializable;

public class Position implements Serializable {

  private static final long serialVersionUID = -5868700716327223325L;
  /** 会员账号（清算中心） */
  private String memCodeClear;
  /** 资金账户（清算中心） */
  private String fundAccountClear;
  /** 持仓产品 */
  private String productCode;
  /** 持仓数量 */
  private int holdQuantity;
  /** 持仓成本 */
  private long holdPrice;
  /** 市值 */
  private long MarketValue;
  /** 市场单价 */
  private long MarketPrice;
  /** 盈亏 */
  private long ProfitAndLoss;

  /**
   * @return the memCodeClear
   */
  public String getMemCodeClear() {
    return memCodeClear;
  }

  /**
   * @param memCodeClear
   *          the memCodeClear to set
   */
  public void setMemCodeClear(String memCodeClear) {
    this.memCodeClear = memCodeClear;
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
   * @return the holdQuantity
   */
  public int getHoldQuantity() {
    return holdQuantity;
  }

  /**
   * @param holdQuantity
   *          the holdQuantity to set
   */
  public void setHoldQuantity(int holdQuantity) {
    this.holdQuantity = holdQuantity;
  }

  /**
   * @return the holdPrice
   */
  public long getHoldPrice() {
    return holdPrice;
  }

  /**
   * @param holdPrice
   *          the holdPrice to set
   */
  public void setHoldPrice(long holdPrice) {
    this.holdPrice = holdPrice;
  }

  /**
   * @return the marketValue
   */
  public long getMarketValue() {
    return MarketValue;
  }

  /**
   * @param marketValue
   *          the marketValue to set
   */
  public void setMarketValue(long marketValue) {
    MarketValue = marketValue;
  }

  /**
   * @return the marketPrice
   */
  public long getMarketPrice() {
    return MarketPrice;
  }

  /**
   * @param marketPrice
   *          the marketPrice to set
   */
  public void setMarketPrice(long marketPrice) {
    MarketPrice = marketPrice;
  }

  /**
   * @return the profitAndLoss
   */
  public long getProfitAndLoss() {
    return ProfitAndLoss;
  }

  /**
   * @param profitAndLoss
   *          the profitAndLoss to set
   */
  public void setProfitAndLoss(long profitAndLoss) {
    ProfitAndLoss = profitAndLoss;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Position [memCodeClear=" + memCodeClear + ", fundAccountClear=" + fundAccountClear + ", productCode="
        + productCode + ", holdQuantity=" + holdQuantity + ", holdPrice=" + holdPrice + ", MarketValue=" + MarketValue
        + ", MarketPrice=" + MarketPrice + ", ProfitAndLoss=" + ProfitAndLoss + "]";
  }

}
