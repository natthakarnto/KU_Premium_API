package th.ac.ku.cakeAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Certificate {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID prodCertificateID;
    private String pID;
    private String prodCertificateName;

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public UUID getProdCertificateID() {
        return prodCertificateID;
    }

    public void setProdCertificateID(UUID prodCertificateID) {
        this.prodCertificateID = prodCertificateID;
    }

    public String getProdCertificateName() {
        return prodCertificateName;
    }

    public void setProdCertificateName(String prodCertificateName) {
        this.prodCertificateName = prodCertificateName;
    }
}
