package domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter//클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor//기본 생성자 자동 추가
@Entity//테이블과 링크될 클래스임을 나타냄
public class Posts {
    @Id //기본키(PK)필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)//PK의 생성규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//해당 클래스의 빌더 패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
