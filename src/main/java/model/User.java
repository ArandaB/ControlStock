package model;

import jakarta.persistence.*;

import lombok.*;
import org.springframework.stereotype.Repository;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="user")
public class User {
    private long id;
}

