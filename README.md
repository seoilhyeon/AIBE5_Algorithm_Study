# 🚀 PCCP 대비 알고리즘 스터디

본 저장소는 프로그래머스 Lv2~3 안정 도달을 목표로 하는 알고리즘 스터디 학습 기록 저장소입니다.

본업에 부담을 주지 않는 선에서 자율적으로, 하지만 꾸준하게 성장을 지향합니다. 😁

## 📅 스터디 일정

- 전체 기간: 2026.03.02(월) ~ 2026.05.17(일)
- 공식 시작일: 2026년 3월 2일 (1주차)
- 진행 방식: 주 1회 자율 진도 학습 및 블로그/GitHub 기록

## 💻 환경 구성 가이드 (중요)

본 저장소는 각자의 로컬 Java 프로젝트 내에서 학습 환경을 유지할 수 있도록 **소스 루트(Classpath Root)**에 연결하는 방식을 권장합니다.

### 1. 저장소 연결 (최초 1회)

1.  본인이 사용 중인 Java 프로젝트의 **src 폴더(또는 소스 루트)**로 이동합니다.
2.  해당 위치에서 터미널을 열고 아래 명령어를 순차적으로 입력합니다.

```bash
git init
git remote add origin https://github.com/seoilhyeon/AIBE5_Algorithm_Study.git
git pull origin main
```

_(이미 프로젝트가 Git으로 관리 중이라면 remote add 후 진행해 주세요.)_

### 2. 패키지 경로 준수 (중요)

폴더 구조가 week01/영문이름 형식이므로, IDE에서 컴파일 에러를 방지하기 위해 반드시 파일 최상단에 패키지 선언을 포함해야 합니다.

- **예시**: week01/ilhyeon/Solution.java 파일인 경우

  ```java
  package week01.ilhyeon; // 이 경로가 누락되면 에러가 발생합니다.

  public class Solution { ... }
  ```

## 📂 저장소 구조 및 명명 규칙

### 1. 폴더 구조

`주차(week00) / 영문이름` 구조로 관리합니다.

```Plaintext
src/ (Classpath Root)
├── week01/
│   ├── ilhyeon/
│   │   └── Solution_PG_타겟넘버.java
│   └── junwoo/
│       └── Solution_BOJ_1234.java
└── week02/
```

### 2. 파일 명명 규칙 (Naming Convention)

- `플랫폼_문제이름.확장자`
- 예시: `PG_타겟넘버.java`, `BOJ_1234.java`, `SWEA_문제이름.java`

### 3. 과제 제출 방식 (PR)

1. 본인 성함의 브랜치를 생성합니다. (예: member/ilhyeon)
2. 해당 주차 폴더에 풀이한 코드를 업로드(push)합니다.
3. `main` 브랜치로 **Pull Request(PR)**를 날립니다.
   - PR 제목: [0주차] 이름 문제 풀이 제출 (예: [1주차] seoilhyun 제출)
   - PR 내용: (선택사항) 핵심 로직 설명이나 궁금한 점 작성
4. 코드 리뷰 및 소통 (선택과 집중)
   - **코드 관련 질문/리뷰:** 가급적 **GitHub PR의 'Files changed' 탭**에서 해당 코드 줄에 직접 댓글을 남겨주세요. (가장 정확한 소통이 가능합니다! 🚀)
   - **전반적인 소감/응원:** 블로그를 방문해 따뜻한 댓글이나 공감을 남겨주셔도 좋습니다.
   - **최소 1개 이상의 피드백 권장:** 질문이나 응원 등 무엇이든 좋으니 서로의 성장을 위해 가볍게 소통해 주세요!

### 4. 주차별 브랜치 동기화 (Sync) - 매주 월요일 권장

새로운 주차 문제를 풀기 전, `main`에 머지된 최신 상태를 본인 브랜치에 반영해야 합니다. 이 과정을 거쳐야 **이번 주차 PR에 지난주 커밋이 중복되어 뜨지 않습니다.**

1. **메인 업데이트:** `git checkout main` -> `git pull origin main`
2. **브랜치 합치기:** `git checkout member/본인이름` -> `git merge main`
3. **결과 반영:** `git push origin member/본인이름`
   - 이제 새로운 문제를 풀고 `push`하면 이번 주차 커밋만 깔끔하게 PR에 담깁니다.

## 🔗 스터디원 및 블로그

| 이름       | GitHub                                                           | 블로그 / 기록장                          |
| :--------- | :--------------------------------------------------------------- | :--------------------------------------- |
| **서일현** | [@seoilhyeon](https://github.com/seoilhyeon)                     | [Velog](https://velog.io/@ilhyeon/posts) |
| **김준우** | [@yakjun01](https://github.com/yakjun01)                         | -                                        |
| **노윤희** | [@sdg3729](https://github.com/sdg3729)                           | -                                        |
| **안현**   | [@slyhyun](https://github.com/slyhyun)                           | -                                        |
| **장성재** | [@jjang0617](https://github.com/jjang0617)                       | -                                        |
| **류태우** | [@taeaeuu](https://github.com/taeaeuu)                           | [Tistory](https://taeaeuu.tistory.com/)  |
| **손주현** | [@0cha-0cha](https://github.com/0cha-0cha)                       | -                                        |
| **이석민** | [@seokminseok](https://github.com/seokminseok)                   | -                                        |
| **이효연** | [@yeona-lee-researcher](https://github.com/yeona-lee-researcher) | [Tistory](https://hyleeyou.tistory.com/) |
| **형성빈** | [@hsb4225](https://github.com/hsb4225)                           | -                                        |

## 🛠️ 환경 설정 (Environment)

- Language: Java
- IDE: IntelliJ, Eclipse, VS Code 등 자율
- Git Ignore: IDE 설정 파일 및 빌드 결과물은 포함하지 않습니다.

## 💡 주의사항

- 본 스터디는 자율성을 존중합니다. 개인 사정으로 참여가 어려울 경우 슬랙 스레드에 미리 말씀 부탁드립니다.
- 완주하는 그날까지 모두 파이팅입니다! 🔥
