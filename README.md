# 주酒총회
<br>

## 📌 목차
- [프로젝트 소개](#프로젝트-소개)
- [서비스 아키텍쳐](#서비스-아키텍쳐)
- [팀원 및 구현기능 소개](#팀원-및-구현기능-소개)
- [기술 스택](#기술-스택)
- [우리들의 약속](#우리들의-약속)
- [ERD](#ERD)
- [와이어프레임](#와이어프레임)
- [서비스 사이트](#서비스-사이트)
- [우리의 소통 흔적](#우리의-소통-흔적)


<p><br></p>

<h2 id="프로젝트-소개">✅ 프로젝트 소개</h2>
**한 줄 정리**: 다양한 종류의 술들을 검색하고, 평점과 리뷰를 통해 원하는 상품을 찾을 수 있도록 도와주는 웹 서비스

- 내용 :
    - 여러 카테고리의 주류 소개(설명, 생산지, 도수, 평점)
    - 주류에 대한 좋아요, 리뷰, 리뷰 추천
    - 관리자와의 **실시간 채팅**
    - 좋아요, 리뷰, 추천, 채팅에 대한 **실시한 알람**
    - 사용자의 새로운 주류 제보
    - 숨겨진 관리자 기능(상품,카테고리,회원 관리 및 고객과의 채팅)

![사진](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F83c75a39-3aba-4ba4-a792-7aefe4b07895%2F85d47b3b-e1d5-462a-8ae4-51caf0028c4e%2F%25E1%2584%258C%25E1%2585%25AE%25E1%2584%258C%25E1%2585%25AE%25E1%2584%258E%25E1%2585%25A9%25E1%2586%25BC%25E1%2584%2592%25E1%2585%25AC_%25E1%2584%2589%25E1%2585%25A9%25E1%2584%2580%25E1%2585%25A2%25E1%2584%2591%25E1%2585%25A6%25E1%2584%258B%25E1%2585%25B5%25E1%2584%258C%25E1%2585%25B5.png?table=block&id=cb466992-ee26-4b0a-b5c1-af941d0926fd&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&width=2000&userId=ca0c5ffb-e774-49d1-8001-e9462600093c&cache=v2)

<p><br></p>

<h2 id="서비스-아키텍쳐">📋 서비스 아키텍쳐</h2>
<img width="1020" alt="서비스 아키텍쳐" src="https://github.com/leeminju/JuJuAssembly/assets/146754105/9cc4d7a4-9952-41d2-b953-d08bb1596b56">

<p><br></p>

<h2 id="팀원-및-구현기능-소개">👥 팀원 및 구현기능 소개</h2>

| |이민주|김재현|오수식|박연우|정영도|
|-- |-----|----|----|----|-----|
|링크 |[블로그](https://velog.io/@leemj4090/posts), [GitHub](https://github.com/leeminju?tab=repositories)| [블로그](https://velog.io/@jeiho/posts), [GitHub](https://github.com/k-jaehyun)|[블로그](https://velog.io/@tntlr92), [GitHub](https://github.com/susik2023)|[블로그](https://studymode.tistory.com/), [GitHub](https://github.com/yeonwoopark20231003)|[블로그](https://velog.io/@yeong_do/posts), [GitHub](https://github.com/yeongdo99)|
|담당<br>기능 |- CI/CD 구축<br>- 도메인, HTTPS 적용<br>- 리뷰 기능<br>- Front 주도       |- [JWT 인증/인가](https://velog.io/@jeiho/240107) <br> - filter 및<br> Security<br>- [소셜로그인](https://velog.io/@jeiho/231128)<br>- [이메일 인증](https://velog.io/@jeiho/231221) | - 채팅 기능<br> (웹소켓) <br>- 주류 CRUD|- 주류 찜 기능<br>- 관리자 기능<br> - 리뷰/제보 이미지 수정 |- SSE 알림 기능<br>- 주류 CRUD |

<p><br></p>

<h2 id="기술-스택">🚦 기술 스택</h2>

### 버전 관리 시스템 (VCS)
- GitHub

### 백엔드
- 언어 및 프레임워크: **Java 17**, Spring Boot 3.2.1
    - Spring Web
    - Spring Security
    - Validation
    - Spring Data JPA
    - Thymeleaf
- IDE: IntelliJ IDEA
- **SDK: Java 17**
- 데이터베이스 (DB)
    - 관계형 데이터베이스: AWS RDS (MySQL), H2
    - 비관계형 데이터베이스: MongoDB Atlas, Redis
- 이미지 저장소
    - AWS S3
- 인프라 및 배포
    - 서버: AWS EC2
    - 도메인 관리: Route 53
    - 로드 밸런서: Elastic Load Balancer
    - SSL/TLS 관리: Certificate Manager
    - 실시간 통신: SSE, WebSocket, Stomp
    - CI/CD: GitHub Actions, Docker Hub, Docker-compose
    - 배포 도구 및 기술: AWS Code Deploy, EC2, S3

### 프론트엔드
- 기술 스택: HTML, CSS (Bootstrap 5), JavaScript (JQuery, AJAX)
- 템플릿 엔진: Thymeleaf
  
<p><br></p>

<h2 id="우리들의-약속">🤝 우리들의 약속</h2>

### Code Convention
1. [구글 코드 포매터](https://withhamit.tistory.com/411)
2. [구글 자바 스타일](https://google.github.io/styleguide/javaguide.html)

### Github Rules
**깃허브 규칙:**
 [Git-flow (우아한형제들)](https://techblog.woowahan.com/2553/)
1. **PR 전 코드리뷰 필수!!**<br>
**(승인 후 merge)**<br>

2. **Git branch 전략**<br>
main  : 제품으로 출시될 수 있는 브랜치<br>
dev : 다음 출시 버전을 개발하는 브랜치<br>
feature : 기능을 개발하는 브랜치<br>
release : 이번 출시 버전을 준비하는 브랜치<br>
hotfix : 출시 버전에서 발생한 버그를 수정 하는 브랜치<br> <br>
**feature로 각자 작업 후, dev에 merge!**

3. **Git commit message rule**<br>
<br>
**소통에 적극 활용**

| 작업 타입 | 작업내용 |
| --- | --- |
| ✨ update   | 해당 파일에 새로운 기능이 생김 |
| feat | 기능 구현 |
| 🎉 add | 없던 파일을 생성함, 초기 세팅 |
| 🐛 bugfix | 버그 수정 |
| ♻️ refactor | 코드 리팩토링 |
| 🩹 fix | 코드 수정 |
| 🚚 move | 파일 옮김/정리 |
| 🔥 del | 기능/파일을 삭제 |
| 🍻 test | 테스트 코드를 작성 |
| 💄 style | css |
| 🙈 gitfix | gitignore 수정 |
| 🔨script | package.json 변경(npm 설치 등)git issue 활용 |
    
<p><br></p>

## ERD
### [ERD Link](https://lucid.app/lucidchart/37bde9ab-3ac3-4b3e-9740-5d42376fa5ed/edit?viewport_loc=-2728%2C-1008%2C2986%2C1401%2C0_0&invitationId=inv_6caa1e84-b57d-4aff-affc-a1d22a2dda96)
![ERD](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F83c75a39-3aba-4ba4-a792-7aefe4b07895%2F02f4f7b9-a86e-4bbe-8a8a-1467fcac4587%2F%25EC%25A3%25BC%25EC%25A3%25BC%25EC%25B4%259D%25ED%259A%258C_-_%25EC%25B5%259C%25EC%25A2%2585_%25EB%25B0%259C%25ED%2591%259C_ERD.png?table=block&id=70a5c3c8-7a79-48ab-ad9f-87a6131a7c52&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&width=2000&userId=ca0c5ffb-e774-49d1-8001-e9462600093c&cache=v2)

## 와이어프레임
### [Figma Link](https://www.figma.com/file/j0LU5OYqxKP1qBBMyEDQSm/%EC%A3%BC%EC%A3%BC%EC%B4%9D%ED%9A%8C?type=design&node-id=0%3A1&mode=dev&t=itK72c3laMsPUbgp-1)
![figma](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F83c75a39-3aba-4ba4-a792-7aefe4b07895%2F8a76fcce-a33f-41e0-a140-2158c540fa19%2F%25EC%25A3%25BC%25EC%25A3%25BC%25EC%25B4%259D%25ED%259A%258C_%25EC%2599%2580%25EC%259D%25B4%25EC%2596%25B4_%25ED%2594%2584%25EB%25A0%2588%25EC%259E%2584.png?table=block&id=f1771ec4-dfe3-4364-b522-afd3b40a7806&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&width=2000&userId=ca0c5ffb-e774-49d1-8001-e9462600093c&cache=v2)
<p><br></p>

## API 명세서
[API명세서 Notion Page](https://www.notion.so/API-005bcc46971c4189933691d8f698b660?pvs=4)

## 서비스 사이트
https://jujuassembly.store/

## 우리의 소통 흔적
[Notion Page](https://chemical-mongoose-09b.notion.site/1c356dc298c44da08469a130b30058ac)
