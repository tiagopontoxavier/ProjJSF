package io.altar.jsfproject.view;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
 
@ManagedBean
public class beanValidationView {
     
    @Size(min=2,max=5)
    private String name;
     
    @Min(10) @Max(20)
    private Integer Iva;
     
    @DecimalMax (value = "") //(value= "99.9", message = "Shold not exceed 99.9")
    private Double Preco;
     
    @Digits(integer=3,fraction=2)
    private Double amount2;
     
    @AssertTrue
    private boolean checked;
 
    @Past
    private Date pastDate;
     
    @Future
    private Date futureDate;
     
    @Pattern(regexp="^[-+]?\\d+$")
    private String pattern;

    //-----------------------------------------------------------------------------------------------//
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return Iva;
    }
    public void setAge(Integer Iva) {
        this.Iva = Iva;
    }
 
    public Double getAmount() {
        return Preco;
    }
    public void setAmount(Double Preco) {
        this.Preco = Preco;
    }
 
    public Double getAmount2() {
        return amount2;
    }
    public void setAmount2(Double amount2) {
        this.amount2 = amount2;
    }
 
    public Date getFutureDate() {
        return futureDate;
    }
    public void setFutureDate(Date futureDate) {
        this.futureDate = futureDate;
    }
 
    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}