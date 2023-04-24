package com.resdii.vars.management.utils;

import com.resdii.ms.common.category.AddressItem;
import com.resdii.ms.common.category.Category;
import com.resdii.ms.common.utils.AddressUtils;
import com.resdii.ms.common.utils.BeanUtils;
import com.resdii.ms.common.utils.StringUtils;
import com.resdii.vars.management.config.ApplicationConfig;
import com.resdii.vars.management.constant.GlobalConstant;

import static com.resdii.ms.common.utils.StringUtils.isNullOrEmpty;

public class VarsManagementUtils {
    private VarsManagementUtils(){
        // Disable Constructor
    }

    public static String getProvinceName(Category provinceCat){
        if(provinceCat == null || isNullOrEmpty(provinceCat.getCode())){
            return null;
        }
        AddressItem province = AddressUtils.getProvince(provinceCat.getCode());
        return province != null ? province.getName() : null;
    }

    public static String getDistrictName(Category provinceCat, Category districtCat){
        if(provinceCat == null || isNullOrEmpty(provinceCat.getCode())
                || districtCat == null || isNullOrEmpty(districtCat.getCode())){
            return null;
        }
        AddressItem district = AddressUtils.getDistrict(provinceCat.getCode(), districtCat.getCode());
        return district != null ? district.getName() : null;
    }

    public static String getWardsName(Category provinceCat, Category districtCat, Category wardsCat){
        if(provinceCat == null || isNullOrEmpty(provinceCat.getCode())
                || districtCat == null || isNullOrEmpty(districtCat.getCode())
                || wardsCat == null || isNullOrEmpty(wardsCat.getCode())){
            return null;
        }
        AddressItem wards = AddressUtils.getWards(provinceCat.getCode(), districtCat.getCode(), wardsCat.getCode());
        return wards != null ? wards.getName() : null;
    }

    public static String convertImageUrl(String imagePath){
        if(StringUtils.isNullOrEmpty(imagePath)){
            return GlobalConstant.NO_IMAGE_URL;
        }
        if(imagePath.contains("/")){
            String[] splits = imagePath.split("/");
            imagePath = splits[splits.length - 1];
        }
        ApplicationConfig applicationConfig = BeanUtils.getBean(ApplicationConfig.class);
        StringBuilder sb = new StringBuilder(applicationConfig.getMediaServerURL());
        if(!imagePath.startsWith("/")){
            sb.append("/");
        }
        sb.append(imagePath);
        return sb.toString();
    }
}
