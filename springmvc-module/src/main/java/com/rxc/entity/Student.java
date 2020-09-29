package com.rxc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/28 17:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    String sex;
    String no;
    String password;
}
