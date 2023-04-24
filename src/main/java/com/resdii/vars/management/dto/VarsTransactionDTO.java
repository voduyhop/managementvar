package com.resdii.vars.management.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class VarsTransactionDTO {
    private BigInteger transactionId;
    private String transactionContent;
    private Double actualVars;
    private String merchant;
    private String merchantReferId;
}
