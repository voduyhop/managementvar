//package com.resdii.vars.management.service.impl;
//
//import com.resdii.ms.common.category.NoodevConfig;
//import com.resdii.ms.common.category.PostFeeConfig;
//import com.resdii.ms.common.exception.InvalidRequestException;
//import com.resdii.ms.common.utils.DateUtils;
//import com.resdii.vars.management.service.FeeService;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import java.math.BigInteger;
//import java.util.List;
//
//@Service
//public class FeeServiceImpl extends BaseServiceImpl implements FeeService {
//    @Override
//    public FeeCalculateDTO calculatePostFee(FeeCalculateDTO info) {
//        PostFeeConfig feeConfig = NoodevConfig.getInstance().getPostFee(info.getPostPriority());
//        if(feeConfig == null || CollectionUtils.isEmpty(feeConfig.getFeeBlocks())){
//            throw new InvalidRequestException();
//        }
//        long durationDays = DateUtils.durationDays(info.getFromDate(), info.getToDate()) + 1;
//        long totalFee = 0l;
//        long amountBlocks;
//        PostFeeConfig.PostFeeBlock feeBlock;
//        List<PostFeeConfig.PostFeeBlock> feeBlocks = feeConfig.getFeeBlocks();
//        feeBlocks.sort((o1, o2) -> o2.getDayBlock().compareTo(o1.getDayBlock()));
//        info.setTotalDays(durationDays);
//        for(int i = 0; i < feeBlocks.size(); i++) {
//            feeBlock = feeBlocks.get(i);
//            amountBlocks = durationDays / feeBlock.getDayBlock();
//            if (amountBlocks == 0) {
//                continue;
//            }
//            totalFee += feeBlock.getFee() * amountBlocks;
//            durationDays -= feeBlock.getDayBlock() * amountBlocks;
//        }
//        info.setTotalFees(BigInteger.valueOf(totalFee));
//
//        // Neu duration sau khi tinh toan #0 => du lieu cau hinh khong dung
//        if(durationDays != 0){
//            throw new InvalidRequestException("Fee config is invalid");
//        }
//        return info;
//    }
//}
