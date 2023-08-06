package com.example.portfolio.global;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/*
* [참고]
* https://webcoding-start.tistory.com/53
* */
@Getter
/*
* Jpa Entity 클래스들이 해당 추상 클래스를 상속할 경우
* createDate, modifiedDate를 컬럼으로 인식
* */
@MappedSuperclass
/*
* 해당 클래스에 Auditing 기능을 포함
* */
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
