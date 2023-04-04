
package controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trinhdohocvan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trinhdohocvan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maTdhv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ngonngu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenTdhv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trinhdohocvan", propOrder = {
    "maTdhv",
    "ngonngu",
    "tenTdhv"
})
public class Trinhdohocvan {

    protected String maTdhv;
    protected String ngonngu;
    protected String tenTdhv;

    /**
     * Gets the value of the maTdhv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaTdhv() {
        return maTdhv;
    }

    /**
     * Sets the value of the maTdhv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaTdhv(String value) {
        this.maTdhv = value;
    }

    /**
     * Gets the value of the ngonngu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgonngu() {
        return ngonngu;
    }

    /**
     * Sets the value of the ngonngu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgonngu(String value) {
        this.ngonngu = value;
    }

    /**
     * Gets the value of the tenTdhv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenTdhv() {
        return tenTdhv;
    }

    /**
     * Sets the value of the tenTdhv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenTdhv(String value) {
        this.tenTdhv = value;
    }

}
