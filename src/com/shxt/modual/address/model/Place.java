package com.shxt.modual.address.model;

/**
 * 地址
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:47:34
 * @description
 */
/**
 * @author
 * @ClassName: Address
 * @Version 1.0
 * @Copyright
 * @date  下午6:12:21
 * @description
 */
public class Place {
    private Integer p_id;
    private String name;
    private String province;
    public Integer getP_id() {
        return p_id;
    }
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    
}
