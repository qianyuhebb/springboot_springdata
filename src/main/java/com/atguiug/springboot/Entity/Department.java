package com.atguiug.springboot.Entity;


import javax.persistence.*;

@Entity   //告诉就jpa这是一个实体类（要和表映射）
@Table(name = "department2")
public class Department {

  @Id //标注这是主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Integer id;
  @Column(name = "departmentname",length = 50) //如果不写name,默认属性名和和字段名一样
  private String departmentName;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

}
