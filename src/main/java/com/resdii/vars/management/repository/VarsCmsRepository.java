package com.resdii.vars.management.repository;

import com.resdii.ms.common.rest.ResponseDTO;
import com.resdii.vars.management.config.FeignConfig;
import com.resdii.vars.management.dto.VarsTransactionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@FeignClient(url = "${microservice.vars-cms-service.url:}", name = "VarsCmsService", configuration = FeignConfig.class)
public interface VarsCmsRepository {

    /**
     * Tao giao dich tru tien trong vi
     * @param token
     * @param walletId
     * @param transaction
     * @return
     */
    @PostMapping(value = "/wallets/me/{walletId}/transactions/consumption")
    ResponseDTO<VarsTransactionDTO> createConsumptionTransaction(@RequestHeader("Authorization") String token,
                                             @PathVariable("walletId") BigInteger walletId,
                                             @RequestBody VarsTransactionDTO transaction);

    /**
     * Hoan tra lai tien
     * @param transactionId
     * @return
     */
    @PostMapping(value = "/internal/transactions/{transactionId}/rollback")
    ResponseDTO<VarsTransactionDTO> rollbackTransaction(@PathVariable("transactionId") BigInteger transactionId);

}
