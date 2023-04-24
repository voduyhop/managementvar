//package com.resdii.vars.management.mapper;
//
//import com.resdii.ms.common.utils.FileUtils;
//import com.resdii.ms.common.utils.JsonUtils;
//import com.resdii.ms.common.utils.NumberUtils;
//import com.resdii.ms.common.utils.StringUtils;
//import com.resdii.noodev.logs.AppLogService;
//import org.mapstruct.Mapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.util.CollectionUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static com.resdii.vars.management.utils.VarsManagementUtils.*;
//
//@Mapper(componentModel = "spring")
//public interface WpPostMapper extends IBaseMapper<WpPostDTO, PostInfoDTO> {
//    Logger LOGGER = LoggerFactory.getLogger(WpPostMapper.class);
//
//    default Map<String, Object> mappingBasicData(PostInfoDTO postInfo){
//        Map<String, Object> data = new HashMap<>();
//        data.put("input-formality", postInfo.getPostType().getCode());
//        data.put("input-type", postInfo.getTypeRealEstate().getCode());
//        data.put("input-title", postInfo.getTitle());
//        data.put("input-province", getProvinceName(postInfo.getProvince()));
//        data.put("input-district", getDistrictName(postInfo.getProvince(), postInfo.getDistrict()));
//        data.put("input_ward", getWardsName(postInfo.getProvince(), postInfo.getDistrict(), postInfo.getWards()));
//        data.put("input-street", postInfo.getStreet());
//        data.put("input-description", postInfo.getDescription());
//        data.put("input-area", postInfo.getSquare());
//        data.put("input-price", NumberUtils.toString(postInfo.getPrice()));
//        data.put("input-legal", StringUtils.safeCategoryCode(postInfo.getLegalDoc()));
//        data.put("input-bedroom", postInfo.getBedroom());
//        data.put("input-bathroom", postInfo.getBathroom());
//        data.put("input-location-lon", NumberUtils.toString(postInfo.getLng()));
//        data.put("input-location-lat", NumberUtils.toString(postInfo.getLat()));
//        data.put("input-floor", postInfo.getFloor());
//        data.put("input-direction", StringUtils.safeCategoryCode(postInfo.getDirection()));
//        data.put("input-entrance", StringUtils.safeCategoryCode(postInfo.getEntrance()));
//        data.put("input-facade", postInfo.getFrontWidth());
//        if(!CollectionUtils.isEmpty(postInfo.getFurniture())){
//            data.put("input-furniture", String.join(",", postInfo.getFurniture()));
//        }
//        data.put("input-poster", postInfo.getPostBy().getCode());
//        if(postInfo.getAuthor() != null){
//            data.put("input-name", postInfo.getAuthor().getName());
//            data.put("input-phone", postInfo.getAuthor().getPhone());
//            data.put("input-email", postInfo.getAuthor().getEmail());
//            data.put("input-address", postInfo.getAuthor().getAddress());
//        }
//        data.put("input-project_bds", StringUtils.safeCategoryCode(postInfo.getProject()));
//        data.put("video", postInfo.getVideoUrl());
//        data.put("post_author_user", postInfo.getPostAuthorUsername());
//        //data.put("input-unit", postInfo.getPriceUnit().getCode());
//        //data.put("input-location", postInfo.getAddress());
//        return data;
//    }
//
//    default Map<String, Object> mappingToNewPostForm(PostInfoDTO postInfo){
//        Map<String, Object> data = mappingBasicData(postInfo);
//        List<MultipartFile> files = new ArrayList<>();
//        if(postInfo.getThumbnail() != null){
//            files.add(postInfo.getThumbnail());
//        }
//        if(!CollectionUtils.isEmpty(postInfo.getImages())){
//            AppLogService.info(LOGGER, "Tong so hinh anh: " + postInfo.getImages().size());
//            files.addAll(postInfo.getImages());
//        }
//        data.put("file[]", files);
//
//        data.put("input-total-price", NumberUtils.toString(postInfo.getTotalFees()));
//        data.put("input-point", NumberUtils.toString(postInfo.getTotalFees()));
//        data.put("input-number-of-day", NumberUtils.toString(postInfo.getTotalDays()));
//        data.put("input-news-type", postInfo.getPriority().getMetadata());
//        data.put("input-priority-code", StringUtils.safeCategoryCode(postInfo.getPriority()));
//        data.put("input-start-day", postInfo.getStartDate());
//        if(!StringUtils.isNullOrEmpty(postInfo.getPostDate())){
//            data.put("input-create-day", postInfo.getPostDate());
//        }
//        AppLogService.info(LOGGER, "input-start-day: " + postInfo.getStartDate());
//        data.put("input-end-day", postInfo.getEndDate());
//        AppLogService.info(LOGGER, "input-end-day: " + postInfo.getEndDate());
//
//        data.put("input-enterprise-id", NumberUtils.toString(postInfo.getEnterpriseId()));
//
//        AppLogService.info(LOGGER, "-----DANG TIN----");
//        AppLogService.info(LOGGER, JsonUtils.mapToJson(data));
//        AppLogService.info(LOGGER, "-----------------");
//
//        return data;
//    }
//
//    default Map<String, Object> mappingToUpdatePostForm(BigInteger postId, UpdatePostRequestDTO postInfo) {
//        Map<String, Object> data = mappingBasicData(postInfo);
//        data.put("post_id", NumberUtils.toString(postId));
//        List<MultipartFile> files = new ArrayList<>();
//        if(postInfo.getThumbnail() != null){
//            files.add(postInfo.getThumbnail());
//        }else {
//            files.add(FileUtils.newMultipartFile(postInfo.getThumbnailUrl()));
//        }
//        if(!CollectionUtils.isEmpty(postInfo.getImageUrls())){
//            postInfo.getImageUrls().forEach(imageUrl->{
//                files.add(FileUtils.newMultipartFile(imageUrl));
//            });
//        }
//        if(!CollectionUtils.isEmpty(postInfo.getImages())){
//            files.addAll(postInfo.getImages());
//        }
//        data.put("file[]", files);
//
//        AppLogService.info(LOGGER, "-----CAP NHAT TIN----");
//        AppLogService.info(LOGGER, JsonUtils.mapToJson(data));
//        AppLogService.info(LOGGER, "-----------------");
//
//        return data;
//    }
//}
