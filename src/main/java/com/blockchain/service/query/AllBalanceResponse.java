package com.blockchain.service.query;

import java.io.Serializable;
import java.util.List;

import com.blockchain.service.query.domain.Position;

public class AllBalanceResponse implements Serializable {

  private static final long serialVersionUID = 1237835025751227163L;
  /** 用户交易账号 */
  private String FundAccount;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 资产总余额 */
  private long AssetTotalBal;
  /** 可用金额 */
  private long AbleBal;
  /** 冻结金额 */
  private long FrozenBal;
  /** 可提余额 */
  private long advanceBal;
  /** 总市值 */
  private long MarketValue;
  /** 总盈亏 */
  private long ProfitAndLoss;
  /** 持仓情况 */
  private List<Position> position;

  /**
   * @return the fundAccount
   */
  public String getFundAccount() {
    return FundAccount;
  }

  /**
   * @param fundAccount
   *          the fundAccount to set
   */
  public void setFundAccount(String fundAccount) {
    FundAccount = fundAccount;
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
   * @return the assetTotalBal
   */
  public long getAssetTotalBal() {
    return AssetTotalBal;
  }

  /**
   * @param assetTotalBal
   *          the assetTotalBal to set
   */
  public void setAssetTotalBal(long assetTotalBal) {
    AssetTotalBal = assetTotalBal;
  }

  /**
   * @return the ableBal
   */
  public long getAbleBal() {
    return AbleBal;
  }

  /**
   * @param ableBal
   *          the ableBal to set
   */
  public void setAbleBal(long ableBal) {
    AbleBal = ableBal;
  }

  /**
   * @return the frozenBal
   */
  public long getFrozenBal() {
    return FrozenBal;
  }

  /**
   * @param frozenBal
   *          the frozenBal to set
   */
  public void setFrozenBal(long frozenBal) {
    FrozenBal = frozenBal;
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

  /**
   * @return the position
   */
  public List<Position> getPosition() {
    return position;
  }

  /**
   * @param position
   *          the position to set
   */
  public void setPosition(List<Position> position) {
    this.position = position;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "AllBalanceResponse [FundAccount=" + FundAccount + ", exchangeId=" + exchangeId + ", exchangeFundAccount="
        + exchangeFundAccount + ", AssetTotalBal=" + AssetTotalBal + ", AbleBal=" + AbleBal + ", FrozenBal=" + FrozenBal
        + ", advanceBal=" + advanceBal + ", MarketValue=" + MarketValue + ", ProfitAndLoss=" + ProfitAndLoss
        + ", position=" + position + "]";
  }

}
