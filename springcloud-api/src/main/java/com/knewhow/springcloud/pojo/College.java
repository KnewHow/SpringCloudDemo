package com.knewhow.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class College implements Serializable {
    private Long id;
    private String name;
    private int status;
    private String dbname;

    public College(String name) {
        this.name = name;
    }

//    public College() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public String getDbname() {
//        return dbname;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public void setDbname(String dbname) {
//        this.dbname = dbname;
//    }
//
//    @Override
//    public String toString() {
//        return "College{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", status=" + status +
//                ", dbname='" + dbname + '\'' +
//                '}';
//    }
}
