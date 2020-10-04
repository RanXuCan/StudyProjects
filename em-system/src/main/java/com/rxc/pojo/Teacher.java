package com.rxc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/30 0:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    String tno;
    String tname;
    String tidentityNum;
    String tsex;
    String ttitle;
    String tphone;
    String tpassword;
}
