package com.blockchain.service;

import com.blockchain.service.customer.AccountCloseRequest;
import com.blockchain.service.customer.AccountFrozenRequest;
import com.blockchain.service.customer.AccountFrozenResponse;
import com.blockchain.service.customer.BankInfoSyncRequest;
import com.blockchain.service.customer.GoodsInfoSyncRequest;
import com.blockchain.service.customer.UserInfoSyncRequest;
import com.blockchain.service.customer.CustomerResponse;

/**
 * 客户注册相关
 * @author qibo
 *
 */
public interface AccountService {
  /**
   * 用户信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncUserInfo(UserInfoSyncRequest request);

  /**
   * 账户冻结解冻
   * @param request
   * @return
   */
  public AccountFrozenResponse frozenAccount(AccountFrozenRequest request);

  /**
   * 关闭账户
   * @param request
   * @return
   */
  public CustomerResponse closeAccount(AccountCloseRequest request);

  /**
   * 商户信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncGoodsInfo(GoodsInfoSyncRequest request);

  /**
   * 银行机构信息同步
   * @param request
   * @return
   */
  public CustomerResponse syncBankInfo(BankInfoSyncRequest request);
}
