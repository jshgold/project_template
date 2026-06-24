package csh.back.domain.tem.entity;

import csh.back.global.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Template extends BaseEntity {
    private String tem;

    public static Template create() {
        Template template = new Template();
        template.tem = "template";
        return template;
    }
}
