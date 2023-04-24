package com.resdii.vars.management.mapper;

import com.resdii.ms.common.mapper.IMapper;
import com.resdii.ms.common.utils.StringUtils;
import org.mapstruct.Named;

import java.util.Arrays;
import java.util.List;

public interface IBaseMapper<S, D> extends IMapper<S, D> {

    @Named("mappingBooleanValue")
    default Integer mappingBooleanValue(Boolean value){
        return (value == null || !value) ? 0 : 1;
    }

    @Named("mappingStringToList")
    default List<String> mappingStringToList(String input){
        if(StringUtils.isNullOrEmpty(input)){
            return null;
        }
        return Arrays.asList(input.split(","));
    }

}
