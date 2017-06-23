package com.es.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/6/23
 */
@Data
@AllArgsConstructor
@Document(indexName = "index_emp",type = "type_emp")
public class Emp {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private Float salary;
    private Date hireDate;
}
