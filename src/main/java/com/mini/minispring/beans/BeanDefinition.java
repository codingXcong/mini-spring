package com.mini.minispring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author codingxcong
 * @date 2023-06-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanDefinition {
   private String id;
   private String className;
}
