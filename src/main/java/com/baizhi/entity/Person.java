package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    @JSONField(serialize = false)
    private Integer id;
    private String name;
    private String email;
    private String city;
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
}
