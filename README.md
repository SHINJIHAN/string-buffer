## 프로젝트 개요

이 프로젝트는 [인프런 - 스프링 부트와 JPA 활용 1](https://www.inflearn.com/ja/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1) 및
[인프런 - 스프링 부트와 JPA API 개발 성능 최적화](https://www.inflearn.com/ja/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-API%EA%B0%9C%EB%B0%9C-%EC%84%B1%EB%8A%A5%EC%B5%9C%EC%A0%81%ED%99%94) 강좌를 기반으로 작성되었다.<br>
실습을 통해 **Spring Boot + JPA**의 기본 동작부터 API 개발, 성능 최적화 기법까지 구현하였다.

---

## 학습 및 실무 적용 포인트

* **JPA 기본기**: 엔티티 매핑, 연관관계 설정, 지연 로딩(Lazy Loading) 이해
* **API 설계**: RESTful API 구현, DTO 패턴 활용
* **성능 최적화**: N+1 문제 해결, 페이징 처리, 쿼리 최적화
* **실무 활용**:

  * 유지보수성과 확장성을 고려한 계층형 아키텍처
  * 데이터베이스 트래픽 최소화를 위한 쿼리 튜닝 전략
  * 테스트 코드로 기능 검증 및 회귀 방지

---

## 기술 스택

* **백엔드**: Java 17, Spring Boot, Spring Data JPA
* **데이터베이스**: H2, MySQL (환경에 맞게 선택 가능)
* **빌드 툴**: Gradle
* **기타**: Lombok, Hibernate

---

## 프로젝트 구조

```plaintext
jpashop
├── build.gradle
├── settings.gradle
├── src
│ ├── main
│ │ ├── java
│ │ │ └── jpashop
│ │ │ ├── domain
│ │ │ ├── repository
│ │ │ ├── service
│ │ │ └── controller
│ │ └── resources
│ │ └── application.yml
│ └── test
│ └── java
│ └── jpashop
└── README.md
```

---

## 실행 방법

1. 저장소 클론

```bash
git clone https://github.com/SHINJIHAN/string-buffer.git
```

2. 프로젝트 디렉토리 이동

```bash
cd jpashop
```

3. 애플리케이션 실행

```bash
./gradlew bootRun
```

---

