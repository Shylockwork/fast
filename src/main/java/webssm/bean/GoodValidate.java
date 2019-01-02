package webssm.bean;



import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class GoodValidate {
    //@Min(value=10, message="最小值为10")
    private Integer goodsId;

    @NotBlank(message="商品名不能为空")
    @Pattern(regexp = "^[0-9a-zA-Z\u4e00-\u9fa5]{3,30}$",message="商品名称不符合规则")
    private String goodsName;

    @NotNull(message="商品单价不能为空")
    private Double goodsPrice;
    @Length(max=20,message="最大长度不能超过20个字符")
    private String goodsIntr;
    @NotBlank(message="邮箱不能为空")
    @Email(message="请输入正确的邮箱格式")
    private String goodsDate;
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsIntr() {
        return goodsIntr;
    }

    public void setGoodsIntr(String goodsIntr) {
        this.goodsIntr = goodsIntr;
    }

    public String getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(String goodsDate) {
        this.goodsDate = goodsDate;
    }

}
