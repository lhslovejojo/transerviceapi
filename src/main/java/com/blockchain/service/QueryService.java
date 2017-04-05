package com.blockchain.service;

import com.blockchain.service.query.AllBalanceResponse;
import com.blockchain.service.query.BalanceResponse;
import com.blockchain.service.query.DepositHisRequest;
import com.blockchain.service.query.DepositHisResponse;
import com.blockchain.service.query.FundChangeRequest;
import com.blockchain.service.query.FundChangeResponse;
import com.blockchain.service.query.TradeRequest;
import com.blockchain.service.query.TradeResponse;

/**
 * 客户注册相关
 * 
 * @author qibo
 *
 */
public interface QueryService {
  /**
   * 交易凭证查询
   * 
   * @param request
   * @return
   */
  public TradeResponse queryTrade(TradeRequest request);

  /**
   * 资金账户余额查询
   * 
   * @param request
   * @return
   */
  public BalanceResponse queryBal(String exchangeId, String memCode);

  /**
   * 余额变动历史查询
   * 
   * @param request
   * @return
   */
  public FundChangeResponse queryFund(FundChangeRequest request);

  /**
   * 总资产查询
   * 
   * @param request
   * @return
   */
  public AllBalanceResponse queryAllBal(String exchangeId, String memCode);

  /**
   * 持仓历史查询
   * 
   * @param request
   * @return
   */
  public DepositHisResponse syncBankInfo(DepositHisRequest request);
}
