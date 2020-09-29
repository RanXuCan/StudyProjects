package com.rxc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/29 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String sno;
    String sname;
    int age;
}
