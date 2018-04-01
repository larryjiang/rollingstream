package com.rs.rollingstream.model;
import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Car {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
}