package com.baizhi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    private Integer  id;
    private String code;
    private String name;
    private String citycode;
}
