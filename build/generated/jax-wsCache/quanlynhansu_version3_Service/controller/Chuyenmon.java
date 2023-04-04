
package controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chuyenmon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chuyenmon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maCm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenCm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chuyenmon", propOrder = {
    "maCm",
    "tenCm"
})
public class Chuyenmon {

    protected String maCm;
    protected String tenCm;

    /**
     * Gets the value of the maCm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaCm() {
        return maCm;
    }

    /**
     * Sets the value of the maCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaCm(String value) {
        this.maCm = value;
    }

    /**
     * Gets the value of the tenCm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenCm() {
        return tenCm;
    }

    /**
     * Sets the value of the tenCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenCm(String value) {
        this.tenCm = value;
    }

}
