//package com.resdii.vars.management.schedule;
//
//import com.resdii.noodev.logs.AppLogService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
///**
// * Tien trinh cap nhat trang thai bai post het han
// */
//@Component
//public class SyncPostStatusSchedule extends BaseSchedule{
//    private static final Logger LOGGER = LoggerFactory.getLogger(SyncPostStatusSchedule.class);
//
//    @Value("${schedule.sync-post-status.enabled:false}")
//    private boolean enabled;
//    private PostRepository postRepository;
//
//    @Override
//    @Scheduled(cron = "${schedule.sync-post-status.cron}")
//    public void run() {
//        if(!enabled){
//            return;
//        }
//        try{
//            postRepository.updatePostStatus(null);
//        }catch (Exception ex){
//            AppLogService.error(LOGGER, ex);
//        }
//    }
//
//    @Autowired
//    public void setPostRepository(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//}
