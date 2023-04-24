package com.resdii.vars.management.config;

import com.resdii.ms.common.auth.NoodevSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class SecurityConfig extends NoodevSecurityConfig {

    /**
     * Cau hinh danh sach cac request khong yeu cau xac thuc
     */
    private void initWhiteListRequest(){
        // API danh sach du an noi bat man hinh trang chu
        addExcludeRequest(HttpMethod.GET, "/**/projects/top");

        // API danh sach du an gianh cho ban man hinh trang chu
        addExcludeRequest(HttpMethod.GET, "/**/projects/recommend");

        // API kham pha du an man hinh trang chu
        addExcludeRequest(HttpMethod.GET, "/**/projects/discovery");

        // API danh sach bat dong san gianh cho ban man hinh trang chu
        addExcludeRequest(HttpMethod.GET, "/**/re/recommend");

        // API kham pha bat dong san man hinh trang chu
        addExcludeRequest(HttpMethod.GET, "/**/re/discovery/city");

        // API tim kiem bai post cho nguoi dung tra cuu bat dong san
        addExcludeRequest(HttpMethod.GET, "/**/posts");

        // API chi tiet bai post cho nguoi dung tra cuu bat dong san
        addExcludeRequest(HttpMethod.GET, "/**/posts/{postId:\\d+}");

        // API danh sach du an lien quan
        addExcludeRequest(HttpMethod.GET, "/**/projects/related");

        // API tim kiem bat dong san theo polygon
        addExcludeRequest(HttpMethod.POST, "/**/posts/search/polygon");

        // API danh sach bat dong san lien quan
        addExcludeRequest(HttpMethod.GET, "/**/re/related");

        // API den so luong bai post theo khu vuc
        addExcludeRequest(HttpMethod.GET, "/**/posts/count/area");

    }

    @Override
    public void init() {
        super.init();
        initWhiteListRequest();
    }

}
