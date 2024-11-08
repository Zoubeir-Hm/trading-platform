package com.zhm.model;

import com.zhm.domain.VerificationType;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;

@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
