package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
//@Embeddable
public class Id implements Serializable {

    private static final long serialVersionUID = -8150221031991256742L;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "sequence-generator")
//    @SequenceGenerator(name = "sequence-generator", sequenceName="YOUR_DB_SEQ", allocationSize=1)
//    @Column(name = "ID")
    private Integer id;

}
