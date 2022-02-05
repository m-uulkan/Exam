package peaksoft.entity;

import javax.persistence.*;

@Entity
@Table(name="SocialMedia")

public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name="socal_media",nullable = false,unique = true)
    private String socialMedia;

    public SocialMedia() {
    }

    public SocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "id=" + id +
                ", socialMedia='" + socialMedia + '\'' +
                '}';
    }
}
