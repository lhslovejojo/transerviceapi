package com.blockchain.service.query;

import java.io.Serializable;

public class BalanceResponse implements Serializable {

  private static final long serialVersionUID = -6873918138570467454L;
  /** 用户交易账号 */
  private String fundAccount;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 资金总余额 */
  private long totalBal;
  /** 可用金额 */
  private long ableBal;
  /** 冻结金额 */
  private long frozenBal;
  /** 可提余额 */
  private long advanceBal;

  /**
   * @return the fundAccount
   */
  public String getFundAccount() {
    return fundAccount;
  }

  /**
   * @param fundAccount
   *          the fundAccount to set
   */
  public void setFundAccount(String fundAccount) {
    this.fundAccount = fundAccount;
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
   * @return the exchangeFundAccount
   */
  public String getExchangeFundAccount() {
    return exchangeFundAccount;
  }

  /**
   * @param exchangeFundAccount
   *          the exchangeFundAccount to set
   */
  public void setExchangeFundAccount(String exchangeFundAccount) {
    this.exchangeFundAccount = exchangeFundAccount;
  }

  /**
   * @return the totalBal
   */
  public long getTotalBal() {
    return totalBal;
  }

  /**
   * @param totalBal
   *          the totalBal to set
   */
  public void setTotalBal(long totalBal) {
    this.totalBal = totalBal;
  }

  /**
   * @return the ableBal
   */
  public long getAbleBal() {
    return ableBal;
  }

  /**
   * @param ableBal
   *          the ableBal to set
   */
  public void setAbleBal(long ableBal) {
    this.ableBal = ableBal;
  }

  /**
   * @return the frozenBal
   */
  public long getFrozenBal() {
    return frozenBal;
  }

  /**
   * @param frozenBal
   *          the frozenBal to set
   */
  public void setFrozenBal(long frozenBal) {
    this.frozenBal = frozenBal;
  }

  /**
   * @return the advanceBal
   */
  public long getAdvanceBal() {
    return advanceBal;
  }

  /**
   * @param advanceBal
   *          the advanceBal to set
   */
  public void setAdvanceBal(long advanceBal) {
    this.advanceBal = advanceBal;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "BalanceResponse [fundAccount=" + fundAccount + ", exchangeId=" + exchangeId + ", exchangeFundAccount="
        + exchangeFundAccount + ", totalBal=" + totalBal + ", ableBal=" + ableBal + ", frozenBal=" + frozenBal
        + ", advanceBal=" + advanceBal + "]";
  }

}
