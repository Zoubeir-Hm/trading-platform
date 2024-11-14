package com.zhm.service;

import com.zhm.model.TwoFactorAuth;
import com.zhm.model.TwoFactorOTP;
import com.zhm.model.User;

public interface TwoFactorOtpService {
    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);
    TwoFactorOTP findByUser(Long userId);
    TwoFactorOTP findById(String id);
    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);
    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
