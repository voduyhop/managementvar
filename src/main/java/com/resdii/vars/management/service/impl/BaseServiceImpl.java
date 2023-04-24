//package com.resdii.vars.management.service.impl;
//
//import com.resdii.ms.common.rest.AbstractServiceImpl;
//import com.resdii.vars.management.config.ApplicationConfig;
//import com.resdii.vars.management.mapper.WpPostMapper;
//import com.resdii.vars.management.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.math.BigInteger;
//
//public class BaseServiceImpl extends AbstractServiceImpl {
//
//    protected ApplicationConfig appConfig;
//    protected WpPostMapper wpPostMapper;
//    protected WpPostRepository wpPostRepository;
//    protected VarsCmsRepository varsCmsRepository;
//    protected PostRepository postRepository;
//    protected PostFavoriteRepository postFavoriteRepository;
//    protected UserRepository userRepository;
//    protected PostMapper postMapper;
//    protected PostFavoriteMapper postFavoriteMapper;
//
//    protected UserInfoDTO getUserInfo(BigInteger userId){
//        return varsCmsRepository.getUserById(userId).getData();
//    }
//
//    @Autowired
//    public void setAppConfig(ApplicationConfig appConfig) {
//        this.appConfig = appConfig;
//    }
//
//    @Autowired
//    public void setWpPostMapper(WpPostMapper wpPostMapper) {
//        this.wpPostMapper = wpPostMapper;
//    }
//
//    @Autowired
//    public void setPostRepository(WpPostRepository wpPostRepository) {
//        this.wpPostRepository = wpPostRepository;
//    }
//
//    @Autowired
//    public void setVarsCmsRepository(VarsCmsRepository varsCmsRepository) {
//        this.varsCmsRepository = varsCmsRepository;
//    }
//
//    @Autowired
//    public void setMyPostRepository(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//    @Autowired
//    public void setPostMapper(PostMapper postMapper) {
//        this.postMapper = postMapper;
//    }
//
//    @Autowired
//    public void setPostFavoriteRepository(PostFavoriteRepository postFavoriteRepository) {
//        this.postFavoriteRepository = postFavoriteRepository;
//    }
//
//    @Autowired
//    public void setPostFavoriteMapper(PostFavoriteMapper postFavoriteMapper) {
//        this.postFavoriteMapper = postFavoriteMapper;
//    }
//
//    @Autowired
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//}
//
