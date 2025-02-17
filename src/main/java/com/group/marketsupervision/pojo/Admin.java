package com.group.marketsupervision.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id;
    private String uname;
    private String pwd;
    private String phone;
    private LocalDateTime createdAt; // 推荐使用 LocalDateTime
}
